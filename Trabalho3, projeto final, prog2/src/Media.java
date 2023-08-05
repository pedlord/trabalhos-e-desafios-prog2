
public abstract class Media {
	private String titulo;
    private int idadeMinima;
    //private String Sinopse;
    
	public Media(String titulo,int idadeMinima) {
        this.titulo = titulo;
        this.idadeMinima = idadeMinima;
    }
    public String getTitulo() {
		return this.titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getIdadeMinima() {
		return idadeMinima;
	}

	public void setIdadeMinima(int idadeMinima) {
		this.idadeMinima = idadeMinima;
	}
	public abstract Avaliacao getAvaliacao();
	@Override
    public String toString() {
        return String.format("Titulo : "+ titulo +"\nIdade Minima : "+ idadeMinima +" anos");
    }
}
