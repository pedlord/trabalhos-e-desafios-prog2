import java.util.ArrayList;
public class Cliente extends Conta{
	private int idade;
	
	private ArrayList<Filme> FavoritosFilmes = new ArrayList<Filme>();
	private ArrayList<Serie> FavoritosSeries = new ArrayList<Serie>();
	
	public Cliente(String nome, String sobrenome,String email, String senha, int idade) {
		super(nome, sobrenome, email, senha, "cliente");
		this.idade = idade;
	}
	
	public int getIdade() {return this.idade;}
	
	void AvaliarMedia(boolean like,Media filmeserie,Cliente cliente) {
		if(like) {
			filmeserie.getAvaliacao().setLikes(cliente);
		}else {
			filmeserie.getAvaliacao().setDeslikes(cliente);
		}
	}
	
	public Filme PesquisarFilme(String titulo) {
		for(Filme i : ListaGeral.instanciaListaGeral().getListadeFilmes()) {
			if(i.getTitulo().equals(titulo)) {
				return i;
			}
		}return null;
	}
	
	public Serie PesquisarSerie(String titulo) {
		for(Serie i : ListaGeral.instanciaListaGeral().getListadeSeries()) {
			if(i.getTitulo().equals(titulo)) {
				return i;
			}
		}return null;
	}
	
	public void AddFavoritosFilme(String titulo) {
		Filme add = null;
		for(Filme i : ListaGeral.instanciaListaGeral().getListadeFilmes()) {
			if(i.getTitulo().equals(titulo)) {
				add = i;
			}
		}if(add != null) {
			FavoritosFilmes.add(add);
			System.out.printf("Filme %s adicionado com sucesso%n",add.getTitulo());
		}else {
			System.out.printf("nenhum filme com o título %s encontrado%n",titulo);
		}
	}
	
	public void AddFavoritosSerie(String titulo) {
		Serie add = null;
		for(Serie i : ListaGeral.instanciaListaGeral().getListadeSeries()) {
			if(i.getTitulo().equals(titulo)) {
				add = i;
			}
		}if(add != null) {
			FavoritosSeries.add(add);
			System.out.printf("Serie %s adicionada com sucesso%n",add.getTitulo());
		}else {
			System.out.printf("nenhuma série com o título %s encontrada%n",titulo);
		}
	}
	
	public void RemoveFavoritosFilme(String titulo) {
		Filme remover = null;
		for(Filme i : FavoritosFilmes) {
			if(i.getTitulo().equals(titulo)) {
				remover = i;
			}
		}if(remover != null) {
			FavoritosFilmes.remove(remover);
			System.out.printf("Filme %s removido com sucesso%n",remover.getTitulo());
		}else {
			System.out.printf("nenhum filme com o título %s encontrado%n",titulo);
		}
	}
	
	public void RemoveFavoritosSerie(String titulo) {
		Serie remover = null;
		for(Serie i : FavoritosSeries) {
			if(i.getTitulo().equals(titulo)) {
				remover = i;
			}
		}if(remover != null) {
			FavoritosSeries.remove(remover);
			System.out.printf("Série %s removida com sucesso%n",remover.getTitulo());
		}else {
			System.out.printf("nenhuma série com o título %s encontrada%n",titulo);
		}
	}
	
	public void getFavoritos() {
		System.out.println("Filmes:");
		for(Filme i : FavoritosFilmes) {
			System.out.printf("%s%n",i.getTitulo());
		}
		System.out.println("Séries:");
		for(Serie i : FavoritosSeries) {
			System.out.printf("%s%n",i.getTitulo());
		}
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nAno de nascimento: " + this.idade + "\nTipo da conta:" + this.getTipo();
	}	
}