import java.util.ArrayList;

public class Lancamentos implements IListFilmes{
	private static Lancamentos OLancamento;
    private ArrayList<Filme> NovosFilmes = new ArrayList<Filme>();
   
    public static Lancamentos instanciaListaGeral() {
		if (OLancamento == null) {
			OLancamento = new Lancamentos();
		}
		return OLancamento;
	}
    
    public Lancamentos(){
        NovosFilmes = new ArrayList<Filme>();
    }

    @Override
    public void getFilmes() {
        System.out.println("Lancamentos");
        for(Filme filme : NovosFilmes){
            System.out.println(filme.getTitulo());
        }
    }

	public ArrayList<Filme> getNovosFilmes() {
		return NovosFilmes;
	}
}