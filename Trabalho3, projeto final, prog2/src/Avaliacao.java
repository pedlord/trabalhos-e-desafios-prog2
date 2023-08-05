import java.util.ArrayList;

public class Avaliacao {
	private double porcentagem;
	private Cliente[] likes;
	private Cliente[] deslikes;
	
	public double getPorcentagem() {
		return porcentagem;
	}
	private void setPorcentagem(double porcentagem) {
		this.porcentagem = porcentagem;
	}
	
	private void calculaPorcentagem() {
		int likes = getLikes();
		int deslikes = getDeslikes();
		int total = likes + deslikes;
		double porcento = 0;
		if(total > 0) {
			porcento = (likes/total)*100;
		}
		setPorcentagem(porcento);
	}
	public int getLikes() {
		int totalLikes=0;
		if (this.likes != null){
			for(int i = 0;i < this.likes.length;i++){
				totalLikes++;
			}
		}
		return totalLikes;
	}
	public void setLikes(Cliente clienteLike) {
		boolean l= avaliouLike(clienteLike);
		boolean d= avaliouDeslike(clienteLike);
		if(l == false & d == false){
			ArrayList<Cliente> listadeLikes = new ArrayList<Cliente>();
			listadeLikes.add(clienteLike);
		
			Cliente[] likesCliente = new Cliente[listadeLikes.size()];
			for (int k = 0; k < listadeLikes.size(); k++) {
				likesCliente[k] = listadeLikes.get(k);
			}
			this.likes = likesCliente;
			calculaPorcentagem();
		}
		else if (l == true){
			System.out.println("Like já registrado");
		}
		else if (d == true){
			removerAval(clienteLike);
			setLikes(clienteLike);
		}
	}
	public int getDeslikes() {
		int totalDeslikes=0;
		if (this.deslikes != null){
			for(int i = 0;i < this.deslikes.length;i++){
				totalDeslikes++;
			}
		}
		return totalDeslikes;
	}
	public void setDeslikes(Cliente clienteDeslike) {
		boolean l= avaliouLike(clienteDeslike);
		boolean d= avaliouDeslike(clienteDeslike);
		if(l == false & d == false){
			//System.out.println("d1");
			ArrayList<Cliente> listadeDeslikes = new ArrayList<Cliente>();
			listadeDeslikes.add(clienteDeslike);
		
			Cliente[] deslikesCliente = new Cliente[listadeDeslikes.size()];
			for (int k = 0; k < listadeDeslikes.size(); k++) {
				deslikesCliente[k] = listadeDeslikes.get(k);
			}
			this.deslikes = deslikesCliente;
			calculaPorcentagem();
		}
		else if (l == true){
			removerAval(clienteDeslike);
			setDeslikes(clienteDeslike);
		}
		else if (d == true){
			System.out.println("Deslike já registrado");
		}
	}
	
	public boolean avaliouLike(Cliente clienteAvaliou){
		boolean aval = false;
		if (this.likes != null) {
			for(Cliente i : this.likes){
				if (i == clienteAvaliou){
					aval = true;
				}
			}
		}
		return aval;
	}
	public boolean avaliouDeslike(Cliente clienteAvaliou){
		boolean aval = false;
		if (this.deslikes != null) {
			for(Cliente i : this.deslikes){
				if (i == clienteAvaliou){
					aval = true;
				}
			}
		}
		return aval;
	}
	public void removerAval(Cliente cliente){
		boolean l= avaliouLike(cliente);
		boolean d= avaliouDeslike(cliente);
		if(l == false & d == false){
			System.out.println("Não deu like ou deslike");
		}
		if (l == true){
			ArrayList<Cliente> listadeLikes = new ArrayList<Cliente>();
			int tamanho = getLikes();
			Cliente[] retira = this.likes;
			for (int k = 0; k < tamanho; k++) {
				listadeLikes.add(retira[k]);
			}
			listadeLikes.remove(cliente);
			
			Cliente[] listalikes = new Cliente[listadeLikes.size()];
			for (int k = 0; k < listadeLikes.size(); k++) {
				listalikes[k] = listadeLikes.get(k);
			}
			this.likes = listalikes;
		}
		if (d == true){
			ArrayList<Cliente> listadeDeslikes = new ArrayList<Cliente>();
			
			Cliente[] retira = this.deslikes;
			int tamanho = getDeslikes();
			for (int k = 0; k < tamanho; k++) {
				listadeDeslikes.add(retira[k]);
			}
			listadeDeslikes.remove(cliente);
			
			Cliente[] listadeslikes = new Cliente[listadeDeslikes.size()];
			for (int k = 0; k < listadeDeslikes.size(); k++) {
				listadeslikes[k] = listadeDeslikes.get(k);
			}
			this.deslikes = listadeslikes;
		}
	}
	@Override
	public String toString(){
		String avaliacao = "\nPorcentagem = " + getPorcentagem() +
		"\nNº de Likes = " + getLikes() + 
		"\nNº de Deslikes = " + getDeslikes();
		return avaliacao;
	}
}