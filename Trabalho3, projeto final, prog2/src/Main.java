import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Main{
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Funcionario usandoFuncionario = null;
		Cliente usandoCliente = null;
		ListaGeral listaContas = ListaGeral.instanciaListaGeral();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			// inicio da Main
			System.out.println("[1]sign-in\n[2]log-in");
			int entrar = sc.nextInt();
			// escolha de signin
			if(entrar == 1) {
				// criando uma nova conta
				System.out.println("Digite o primeiro e último nome separadamente");
				String nome = sc.next();
				String sobrenome = sc.next();
				
				System.out.println("Digite seu email:");
				String email = sc.next();
				
				System.out.println("Digite sua senha:");
				String senha = sc.next();
				
				System.out.println("A conta será do tipo: [1]Funcionário;[2]Cliente");
				int type = sc.nextInt();
				
				if(type == 1) {
					Funcionario funcionario = new Funcionario(nome,sobrenome,email,senha);
					listaContas.addContaFuncionario(funcionario);
				}else {
					System.out.println("Digite o seu ano de nascimento:");
					int ano = sc.nextInt();
					Cliente cliente = new Cliente(nome,sobrenome,email,senha,ano);
					listaContas.addContaCliente(cliente);
				}
			}
			//escolha de login
			else if(entrar == 2) {
				// autenticação
				boolean autenticado = false;
				int tipo;
				while(true) {
					
					System.out.println("Digite seu email e sua senha separadamente");
					String email = sc.next();
					String senha = sc.next();
					
					System.out.println("tipo da conta: [1]Funcionario;[2]Cliente");
					tipo = sc.nextInt();
					if(tipo == 1) {
						for(Funcionario i : listaContas.getContasFuncionario()) {
							if(i.getEmail().equals(email)) {
								if(i.getSenha().equals(senha)) {
									usandoFuncionario = i;
									System.out.printf("Entrando na conta de %s%n",i.getNome());
									autenticado = true;
								}
							}
						}
					}else {
						for(Cliente i: listaContas.getContaCliente()){
							if(i.getEmail().equals(email)) {
								if(i.getSenha().equals(senha)) {
									usandoCliente = i;
									System.out.printf("Entrando na conta de %s%n",i.getNome());
									autenticado = true;
								}
							}
						}
					}
					if(usandoCliente == null && usandoFuncionario == null) {
						System.out.println("Email, senha ou tipo de conta incorretos");
						System.out.println("tentar novamente? s/n");
						String continuar = sc.next();
						if(continuar.equals("s")) {
							continue;
						}else {
							break;
						}
						
					}else {break;}
				}
				// inicio da tela de clientes e funcionários
				if(autenticado) {
					while(true) {
						if(tipo == 1) {
							Tela.TelaFuncionario(usandoFuncionario, sc, br);
							usandoFuncionario = null;
							break;
						}else {
							Tela.TelaCliente(usandoCliente, sc, br);
							usandoCliente = null;
							break;
						}
					}
				}
			}
			else {
				System.out.println("Comando inválido");
			}
		}
	}
}