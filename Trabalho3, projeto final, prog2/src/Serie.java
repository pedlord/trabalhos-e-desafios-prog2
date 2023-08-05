
public class Serie extends Media {
    private Avaliacao avaliacao;
    private int totalEpisodios;
    private int temporadas;
    
    public Serie(String nomeSerie, int idadeMinima, int totalEpisodios, int temporadas){
    	super(nomeSerie, idadeMinima);
    	this.totalEpisodios = totalEpisodios;
    	this.temporadas = temporadas;
        this.setAvaliacao();
    }
    public int getTotalTemporadas() {
    	return temporadas;
    }
    
    public void setTotalTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}
	public int getTotalEpisodios() {
		return totalEpisodios;
	}
	public void settotalEpisodios(int total) {
		this.totalEpisodios = total;
	}
	@Override
	public Avaliacao getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao() {
		Avaliacao aval = new Avaliacao();
		this.avaliacao = aval;
	}
	
	public String toString() {
        return super.toString()+ "\nTotal de Episodios : "+ this.getTotalEpisodios() 
        		+ "\nTotal de Temporadas : \n"+ this.getTotalTemporadas() +
        		"\nAvaliação : \n"+ this.avaliacao.toString();
    }
}