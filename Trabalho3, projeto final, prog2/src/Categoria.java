
public enum Categoria {
    ACAO("Ação"),
    SUSPENSE("Suspense"),
    AVENTURA("Aventura"),
    DRAMA("Drama"),
    TERROR("Terror"),
    ROMANCE("Romance");
	
	private String CategoriaNome;
	
	Categoria(String CategoriaNome){
		this.CategoriaNome = CategoriaNome;
	}
	public String getCategoriaNome() {
		return this.CategoriaNome;
	}
}