
public class Principal {
	public static void main(String args[]) {
		/*System.out.println("bem vindo ao sistem RHTec");
		System.out.println("adicionar funcionario:");
		//Funcionario func = new Funcionario();
		Empresa Carateca = new Empresa();
		Contrato Cara = new Contrato();
		Cara.adicionaFuncionario(Cara);*/
		/*
		MarcasEnum hp = MarcasEnum.HP;
		MarcasEnum samsung = MarcasEnum. SAMSUNG;
		System.out.println("Nome da Marca = "+hp.name());
		System.out.println("Nome da Marca = "+samsung.name());
		System.out.println("Nome da Marca3 = "+MarcasEnum.HP);
		System.out.println("Nome do setor4 = "+ Setor.TESTE.name());
		
		System.out.println("teste".equals(Setor.TESTE.getDescricao()));
		System.out.println(Setor.TESTE.getDescricao());
		System.out.println(Setor.TESTE.name());
		System.out.println("Nome do setor5 = "+ Setor.RECURSOS_HUMANOS.name());
		*/
		Funcionario func = new Funcionario("p", "i", "jardim", 22, "M", "151-6", "pp@", "911");
		Setor t = Setor.TESTE;
		Contrato cont = new Contrato(func, t, 137, 3000, "chefe");
		//Empresa vale = new Empresa("vale", "brumadinho", "191", "666-6", "v@", "satan");
		Empresa vale = new Empresa();
		vale.setNome("vale");
		vale.adicionaFuncionario(cont);
		vale.listaFuncionarios();
		System.out.println(vale.consultarFuncionario("p").getFuncionario().getNome());
		Funcionario fuc = new Funcionario("A", "C", "jardim", 22, "F", "151-6", "pp@", "911");
		Contrato cot = new Contrato(fuc, t, 137, 4000, "colaborador");
		vale.adicionaFuncionario(cot);
		vale.maiorMenorsalario();
		vale.listaFuncionarios();
		vale.demitirFuncionarioC("p");
		System.out.println();
		vale.listaFuncionarios();
		
		
	}
}
