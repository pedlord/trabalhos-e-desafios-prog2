import java.util.ArrayList;

public class topDezFilmes extends topDez {
	private Filme[] topdezF;
	private static topDezFilmes dezf;
	
	private static final int fil = 10;


	private topDezFilmes() {}
	
	public static topDezFilmes instancia() {
		if (dezf == null) {
			dezf = new topDezFilmes();
		}
		return dezf;
	}
	public void VerificarTopDezFilmes() {
		try {
			ArrayList<Filme> filme = ListaGeral.instanciaListaGeral().getListadeFilmes();
			ArrayList<Filme> listadeFilmes = new ArrayList<Filme>();
		
			for(Filme i: filme){
				listadeFilmes.add(i);
			}
		
			ArrayList<Filme> topdez = new ArrayList<Filme>();
			for(int c =0; c<fil; c++){
				Avaliacao maiorNota = listadeFilmes.get(0).getAvaliacao();
				double maior = maiorNota.getPorcentagem();
				Filme omaior = listadeFilmes.get(0);
				for(Filme j: listadeFilmes){
					double nota = j.getAvaliacao().getPorcentagem();
					if (nota > maior){
						omaior = j;
						maior = nota;
					}
				}
				if (listadeFilmes.size() == 0){
					break;
				}
				topdez.add(omaior);
				listadeFilmes.remove(omaior);
			}
			Filme[] osDez = new Filme[fil];
			for (int k = 0; k < topdez.size(); k++) {
				osDez[k] = topdez.get(k);
			}
			this.topdezF = osDez;
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Não há filmes registrados no Sistema");
		}
	}
	

	public Filme[] getTopdezF() {
		return topdezF;
	}

	@Override
	public void imprimirDez() {
		try {
			System.out.println("\nTop 10 Filmes:");
			for(Filme i : getTopdezF()) {
					System.out.println(i.getTitulo());
			}
		}catch (NullPointerException e) {
			System.out.println("não há filmes registrados");
		}
	}
}
