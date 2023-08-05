public class Funcionario extends Conta{

	public Funcionario(String nome, String sobrenome,String email, String senha) {
		super(nome, sobrenome, email, senha, "funcionario");
	}
	
	void AddFilme(String titulo,int duracao,int idadeMinima,Categoria categoria) {
		Filme filme = new Filme(titulo,duracao,idadeMinima,categoria);
		ListaGeral.instanciaListaGeral().adicionaraListadeFilmes(filme);
		System.out.printf("Filme %s adicionado com sucesso%n",filme.getTitulo());
		
	}
	
	void RemoveFilme(String titulo) {
		Filme remove = null;
		for(Filme i : ListaGeral.instanciaListaGeral().getListadeFilmes()) {
			if(i.getTitulo().equals(titulo)) {
				remove = i;
			}
		}if(remove != null) {
			ListaGeral.instanciaListaGeral().getListadeFilmes().remove(remove);
			System.out.printf("Filme %s removido com sucesso%n",remove.getTitulo());
		}else {
			System.out.printf("Nehum filme com o título %s encontrado%n",titulo);
		}
	}
	
	void AddSerie(String titulo,int idadeMinima,int Qepisodios, int Qtemporadas) {
		Serie serie = new Serie(titulo,idadeMinima, Qepisodios,Qtemporadas);
		ListaGeral.instanciaListaGeral().adicionaraListadeSeries(serie);
		System.out.printf("Série %s adicionada com sucesso%n",serie.getTitulo());
	}
	
	void RemoveSerie(String titulo) {
		Serie remove = null;
		for(Serie i : ListaGeral.instanciaListaGeral().getListadeSeries()) {
			if(i.getTitulo().equals(titulo)) {
				remove = i;
			}
		}if(remove != null) {
			ListaGeral.instanciaListaGeral().getListadeSeries().remove(remove);
			System.out.printf("Série %s removida com sucesso%n",remove.getTitulo());
		}else {
			System.out.printf("Nehuma série com o título %s encontrada%n",titulo);
		}
	}
	
	void AddFilmeLancamento(String titulo) {
		Lancamentos lancamentos = Lancamentos.instanciaListaGeral();
		Filme add = null;
		for(Filme i : ListaGeral.instanciaListaGeral().getListadeFilmes()) {
			if(i.getTitulo().equals(titulo)) {
				add = i;
			}
		}if(add != null) {
			lancamentos.getNovosFilmes().add(add);
			System.out.printf("Filme %s adicionado com sucesso%n",add.getTitulo());
		}else {
			System.out.printf("Nehum filme com o título %s encontrado%n",titulo);
		}
	}
	
	void RemoveFilmeLancamento(String titulo) {
		Lancamentos lancamentos = Lancamentos.instanciaListaGeral();
		Filme remove = null;
		for(Filme i : lancamentos.getNovosFilmes()) {
			if(i.getTitulo().equals(titulo)) {
				remove = i;
			}
		}if(remove != null) {
			lancamentos.getNovosFilmes().remove(remove);
			System.out.printf("Filme %s removido com sucesso%n",remove.getTitulo());
		}else {
			System.out.printf("Nehum filme com o título %s encontrado%n",titulo);
		}
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nTipo da conta:" + this.getTipo();
	}
}