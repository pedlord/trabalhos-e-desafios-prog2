
public class Filme extends Media {
	private Categoria categoria;
	private int duracao;
	private Avaliacao avaliacao;
	
	public Filme(String titulo, int duracao, int idadeMinima, Categoria categoria) {
        super(titulo, idadeMinima);
        this.duracao = duracao;
        this.categoria = categoria;
        this.setAvaliacao();
    }

    public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public Categoria getCategoria() {
		return this.categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	@Override
	public Avaliacao getAvaliacao() {
		return avaliacao;
	}
	
	public void setAvaliacao() {
		Avaliacao aval = new Avaliacao();
		this.avaliacao = aval;
	}
	
	@Override
    public String toString() {
        return super.toString()+ "\nCategoria : "+ this.categoria.getCategoriaNome() + "\nAvaliação : "+ this.avaliacao.toString();
    }

}
