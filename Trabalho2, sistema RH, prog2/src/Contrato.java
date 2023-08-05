/*import java.util.ArrayList;
import java.util.List;*/

public class Contrato {
	private Funcionario funcionario;
	private Setor setor;
	private int identificacao_numerica;
	private double salario;
	private String cargo;
	
	//private static List<Contrato> empregados = new ArrayList<Contrato>();
	
	
	// não precisa de lista de funcionarios? 
	//private static List<Funcionario> funcionarios = new ArrayList<Funcionario>();
	
	public Contrato(Funcionario funcionario, Setor setor, int identificacao_numerica, double salario, String cargo) {
		this.funcionario = funcionario;
		this.setor = setor;
		this.identificacao_numerica = identificacao_numerica;
		this.salario = salario;
		this.cargo = cargo;
	}
	/*
	// não precisa de lista de funcionarios? 
	public void adicionaFuncionario(Funcionario funcionario) {
		funcionarios.add(funcionario);
	}
	// não precisa de lista de funcionarios? 
	public void removerFuncionario(int index) {
		for (int i = 0; i < funcionarios.size(); i++) {
			if (i == index) {
				funcionarios.remove(i);
			}
		}
	}*/
	/*
	// -- tem que retornar dados pessoas e contratuais: --
	public static String consultarFuncionarioNOME(String nome) {
		List<String> te = new ArrayList<String>();
		for (int i = 0; i < empregados.size(); i++) { 
			//Contrato teste = empregados.get(i);
			te.add(empregados.get(i).getFuncionario().getNome());
			//te.add(teste.getFuncionario().getNome());
			if (te.get(i) == nome) {
				return te.get(i);
			}
		}
		return "não encontrado";
	}
	// -- tem que retornar dados pessoas e contratuais: --
	public static String consultarFuncionarioCPF(String cpf) {
		List<String> te = new ArrayList<String>();
		for (int i = 0; i < empregados.size(); i++) { 
			//Contrato teste = empregados.get(i);
			te.add(empregados.get(i).getFuncionario().getCpf());
			//te.add(teste.getFuncionario().getCpf());
			if (te.get(i) == cpf) {
				return te.get(i);
			}
		}
		return "não encontrado";
	}
	*/
	/*
	public static void listaFuncionarios() {
		for (int i = 0; i < funcionarios.size(); i++) {
			System.out.printf("nome: %s, sobrenome: %s, endereco: %s, idade: %d, sexo: %s, cpf: %s, email: %s, telefone: %s%n", funcionarios.get(i).getNome(),
					funcionarios.get(i).getSobrenome(), funcionarios.get(i).getEndereco(), funcionarios.get(i).getIdade(), funcionarios.get(i).getSexo(),
					funcionarios.get(i).getCpf(), funcionarios.get(i).getEmail(), funcionarios.get(i).getTelefone());
		}
	}
	*/
	
	
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	public Setor getSetor() {
		return setor;
	}
	public void setSetor(Setor setor) {
		this.setor = setor;
	}
	public int getIdentificacao_numerica() {
		return identificacao_numerica;
	}
	public void setIdentificacao_numerica(int identificacao_numerica) {
		this.identificacao_numerica = identificacao_numerica;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
}
