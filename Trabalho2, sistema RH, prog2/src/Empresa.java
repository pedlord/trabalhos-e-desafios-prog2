import java.util.ArrayList;
import java.util.List;

public class Empresa {
	private String nome;
	private String endereco;
	private String telefone;
	private String cnpj;
	private String email;
	private String dono;
	
	private static List<Contrato> contratos = new ArrayList<Contrato>();
	

	public void adicionaFuncionario(Contrato contratado) {
		if (contratos.size() == 0) {
			contratos.add(contratado);
		}
		else {
			if (contratado.getCargo() == "chefe") {
				int chefe = 0;
				for (int i = 0; i < contratos.size(); i++) {
					if (contratos.get(i).getSetor().name() == contratado.getSetor().name() & contratos.get(i).getCargo() == "chefe") {
						chefe += 1;
					}
				}
				if(chefe == 0) {
					contratos.add(contratado);
				}
				else {
					System.out.println("Esse setor já possui alguém no cargo de chefe");
				}
			}
			else {
				contratos.add(contratado);
			}
		}
	}
	public void atualizarDadosPessoais(Contrato contr, String nome, String sobrenome, String endereço,
			int idade, String sexo, String cpf, String email, String telefone) {
			contr.getFuncionario().setNome(nome);
			contr.getFuncionario().setSobrenome(sobrenome);
			contr.getFuncionario().setEndereco(endereço);
			contr.getFuncionario().setIdade(idade);
			contr.getFuncionario().setSexo(sexo);
			contr.getFuncionario().setCpf(cpf);
			contr.getFuncionario().setEmail(email);
			contr.getFuncionario().setTelefone(telefone);
	}
	
	public void atualizarDadosPessoais(Contrato contr, Setor setor, int identificacao_numerica,
			double salario, String cargo ) {
		contr.setSetor(setor);
		contr.setIdentificacao_numerica(identificacao_numerica);
		contr.setSalario(salario);
		contr.setCargo(cargo);
	}
	
	public String demitirFuncionarioC(String nomecpf) {
		for (int i = 0; i < contratos.size(); i++) {
			if (contratos.get(i).getFuncionario().getNome() == nomecpf || contratos.get(i).getFuncionario().getCpf() == nomecpf) {
				contratos.remove(i);
				return "Esse funcionario foi demitido da empresa";
				// não precisa de lista de funcionarios? 
				//contratos.get(i).removerFuncionario(i);
			}
		}
		return "Esse funcionario não se encontra na lista de funcionarios";
	}
	public void listaFuncionarios() {
		for (int i = 0; i < contratos.size(); i++) {
			Contrato contrat = contratos.get(i);
			System.out.printf("nome: %s, sobrenome: %s%n", contrat.getFuncionario().getNome(),
					contrat.getFuncionario().getSobrenome());
		}
	}
	// -- tem que retornar dados pessoas e contratuais: --
	public Contrato consultarFuncionario(String nomecpf) {
		List<String> te = new ArrayList<String>();
		for (int i = 0; i < contratos.size(); i++) { 
			Contrato contrat = contratos.get(i);
			te.add(contratos.get(i).getFuncionario().getNome());
			//te.add(teste.getFuncionario().getNome());
			if (contrat.getFuncionario().getNome() == nomecpf || contrat.getFuncionario().getCpf() == nomecpf ) {
				return contrat;
				/*System.out.printf("nome: %s, sobrenome: %s, endereco: %s, idade: %d, sexo: %s, cpf: %s, email: %s, telefone: %s%n", contrat.getFuncionario().getNome(),
						contrat.getFuncionario().getSobrenome(), contrat.getFuncionario().getEndereco(), contrat.getFuncionario().getIdade(), contrat.getFuncionario().getSexo(),
						contrat.getFuncionario().getCpf(), contrat.getFuncionario().getEmail(), contrat.getFuncionario().getTelefone());
				System.out.printf("setor: %s, identificacao numerica: %s, salario: %s, cargo: %s", contrat.getSetor().name(), contrat.getIdentificacao_numerica(),
						contrat.getSalario(), contrat.getCargo());
				break;*/
			}
		}
		System.out.printf("Esse nome/cpf não se encontra na lista de funcionarios");
		return null;
	}
	public void maiorMenorsalario() {
		List<Contrato> sal = new ArrayList<Contrato>();
		for (int i = 0; i < contratos.size(); i++) { 
			sal.add(contratos.get(i));
		}
		double maior = sal.get(0).getSalario();
		String maiorFunc = sal.get(0).getFuncionario().getNome();
		double menor = sal.get(0).getSalario();
		String menorFunc = sal.get(0).getFuncionario().getNome();
		double total = sal.get(0).getSalario();
		for (int i = 1; i < sal.size(); i++) {
			total += sal.get(i).getSalario();
			if(maior < sal.get(i).getSalario()) {
				maior = sal.get(i).getSalario();
				maiorFunc = sal.get(i).getFuncionario().getNome();
			}
			if(menor > sal.get(i).getSalario()) {
				menor = sal.get(i).getSalario();
				menorFunc = sal.get(i).getFuncionario().getNome();
			}
		}
		/*for (int i = 1; i < sal.size(); i++) {
			if(menor > sal.get(i).getSalario()) {
				System.out.println("rodou???");
				menor = sal.get(i).getSalario();
				menorFunc = sal.get(i).getFuncionario().getNome();
			}
		}*/
		System.out.printf("total de gasto com salario: %.2f%n"
				+ "funcionario com maior salario: %s com R$ %.2f%n"
				+ "funcionario com menor salario: %s com R$ %.2f%n", total, maiorFunc, maior, menorFunc, menor );
	}
	// -- tem que retornar dados pessoas e contratuais: --
	/*public static void consultarFuncionarioCPF(String cpf) {
		List<String> te = new ArrayList<String>();
		for (int i = 0; i < contratos.size(); i++) { 
			Contrato contrat = contratos.get(i);
			te.add(contratos.get(i).getFuncionario().getCpf());
			//te.add(teste.getFuncionario().getCpf());
			if (te.get(i) == cpf) {
				System.out.printf("nome: %s, sobrenome: %s, endereco: %s, idade: %d, sexo: %s, cpf: %s, email: %s, telefone: %s%n", contrat.getFuncionario().getNome(),
						contrat.getFuncionario().getSobrenome(), contrat.getFuncionario().getEndereco(), contrat.getFuncionario().getIdade(), contrat.getFuncionario().getSexo(),
						contrat.getFuncionario().getCpf(), contrat.getFuncionario().getEmail(), contrat.getFuncionario().getTelefone());
				System.out.printf("setor: %s, identificacao_numerica: %s, salario: %s, cargo: %s", contrat.getSetor().name(), contrat.getIdentificacao_numerica(),
						contrat.getSalario(), contrat.getCargo());
				break;
			}
		}
	}*/
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDono() {
		return dono;
	}
	public void setDono(String dono) {
		this.dono = dono;
	}
	
}
