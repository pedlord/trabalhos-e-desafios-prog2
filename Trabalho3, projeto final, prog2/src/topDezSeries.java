import java.util.ArrayList;

public class topDezSeries extends topDez  {
	private Serie[] topdezS;
	private static topDezSeries dezs;
	
	private static final int ser = 10;
	
	private topDezSeries() {}
	
	public static topDezSeries instancia() {
		if (dezs == null) {
			dezs = new topDezSeries();
		}
		return dezs;
	}

	public void VerificarTopDezSeries() {
		try {
			ArrayList<Serie> serie = ListaGeral.instanciaListaGeral().getListadeSeries();
			ArrayList<Serie> listadeSeries = new ArrayList<Serie>();
		
		
			for(Serie i: serie){
				listadeSeries.add(i);
			}
		
			ArrayList<Serie> topdez = new ArrayList<Serie>();
			for(int c =0; c<ser; c++){
				Avaliacao maiorNota = listadeSeries.get(0).getAvaliacao();
				double maior = maiorNota.getPorcentagem();
				Serie omaior = listadeSeries.get(0);
				for(Serie j: listadeSeries){
					double nota = j.getAvaliacao().getPorcentagem();
					if (nota > maior){
						maior = nota;
						omaior = j;
					}
				}
				if (listadeSeries.size() == 0){
					break;
				}
				topdez.add(omaior);
				listadeSeries.remove(omaior);
			}
		
			Serie[] osDez = new Serie[ser];
			for (int k = 0; k < topdez.size(); k++) {
				osDez[k] = topdez.get(k);
			}
			this.topdezS = osDez;
		}catch(IndexOutOfBoundsException e) {
			System.out.println("Não há Séries registrados no Sistema");
		}
	}
	

	public Serie[] getTopdezS() {
		return topdezS;
	}

	@Override
	public void imprimirDez() {
		try {
			System.out.println("\nTop 10 Series:");
			for(Serie i : getTopdezS()){
				System.out.println(i.getTitulo());
			}
		}catch (NullPointerException e) {
			System.out.println("não há séries registradas");
		}
	}
}
