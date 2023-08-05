public class Conta{
	private String nome;
	private String sobrenome;
	private String email;
	private String senha;
	private String tipo;
	
	public Conta(String nome,String sobrenome,String email,String senha,String tipo) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
		this.senha = senha;
		this.tipo = tipo;
	}
	
	@Override
	public String toString() {
		return "Nome: " + this.nome + " " + this.sobrenome + "\n" + "Email: " + this.email;
	}
	
	public String getNome() {return this.nome + " " + this.sobrenome;}
	
	public String getEmail() {return this.email;}
	
	public String getSenha() {return this.senha;}
	
	public String getTipo() {return this.tipo;}
	
}