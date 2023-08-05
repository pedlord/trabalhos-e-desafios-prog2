import java.util.ArrayList;

public class ListaGeral {
	private static ListaGeral Alista;
	private ArrayList<Filme> ListadeFilmes = new ArrayList<Filme>();  
	private ArrayList<Serie> ListadeSeries = new ArrayList<Serie>();
	
	private ArrayList<Cliente> contaCliente = new ArrayList<Cliente>();
	private ArrayList<Funcionario> contasFuncionario = new ArrayList<Funcionario>();
	
	
	public static ListaGeral instanciaListaGeral() {
		if (Alista == null) {
			Alista = new ListaGeral();
		}
		return Alista;
	}
	
	public ArrayList<Filme> getListadeFilmes() {
		return ListadeFilmes;
	}
	public void adicionaraListadeFilmes(Filme filme) {
		ListadeFilmes.add(filme);
	}
	public ArrayList<Serie> getListadeSeries() {
		return ListadeSeries;
	}
	public void adicionaraListadeSeries(Serie serie) {
		ListadeSeries.add(serie);
	}
	
	public ArrayList<Cliente> getContaCliente() {
		return contaCliente;
	}

	public ArrayList<Funcionario> getContasFuncionario() {
		return contasFuncionario;
	}

	void addContaCliente(Cliente conta) {
		contaCliente.add(conta);
	}
	
	void removeConta(Cliente conta) {
		contaCliente.remove(conta);
	}
	void addContaFuncionario(Funcionario conta) {
		contasFuncionario.add(conta);
	}
	
	void removeContaFuncionario(Funcionario conta) {
		contasFuncionario.remove(conta);
	}
	
}
