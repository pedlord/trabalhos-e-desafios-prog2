
public enum Setor {
	CODIFICACAO("codificacao"),
	TESTE("teste"),
	RECURSOS_HUMANOS("recursos humanos"),
	REQUISISTOS("requisitos"),
	MODELAGEM("modelagem");
	
	private String descricao;
	
	Setor(String descricao){
		this.descricao = descricao;
	}
	public String getDescricao() {
		return descricao;
	}
	/*public String setDescricao(String descricao) {
		return this.descricao = descricao;
	}*/
}
