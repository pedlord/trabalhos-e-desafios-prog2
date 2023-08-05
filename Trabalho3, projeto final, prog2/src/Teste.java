
public class Teste {
	public static void main(String args[]) {
		Funcionario func = new Funcionario("Root", "Admin", "admin", "admin123");
        func.AddFilme("Jogo Vorazes", 122, 12, Categoria.ACAO);
        func.AddFilme("Jogo Vorazes: A esperança - Parte I", 124, 12, Categoria.ACAO);
        func.AddFilme("Jogo Vorazes: Em chamas", 145, 12, Categoria.ACAO);
        func.AddFilme("Jogo Vorazes: A esperança - Parte II", 112, 12, Categoria.ACAO);
        func.AddFilme("O Hobbit: A Batalha dos Cinco Exércitos", 165,12, Categoria.AVENTURA);
        func.AddFilme("O Hobbit: Uma jornada Inesperada", 156, 14, Categoria.AVENTURA);
        func.AddFilme("O Hobbit: A Desolação de Smaug", 165, 14, Categoria.ACAO);
        func.AddFilme("Senhor dos Aneis : A sociedade do Anel", 175, 16, Categoria.AVENTURA);
        func.AddFilme("Senhor dos Aneis : As Duas Torres", 188, 16, Categoria.AVENTURA);
        func.AddFilme("Senhor dos Aneis : O retorno do Rei", 144, 16, Categoria.AVENTURA);

/*
        func.AddFilmeLancamento("Senhor dos Aneis : A sociedade do Anel");
        func.AddFilmeLancamento("Senhor dos Aneis : O retorno do Rei");
        func.AddFilmeLancamento("Senhor dos Aneis : As Duas Torres");
        func.AddFilme("Free Guy: Assumindo o Controle", 115, 12, Categoria.AVENTURA);
        func.AddFilme("AINBO - A GUERREIRA DA AMAZÔNIA", 84, 5, Categoria.AVENTURA);
        */
        topDezFilmes topteste = topDezFilmes.instancia();
        topteste.VerificarTopDezFilmes();
        topteste.imprimirDez();
        
        topDezSeries topsteste = topDezSeries.instancia();
        topsteste.VerificarTopDezSeries();
        topsteste.imprimirDez();
	}
}
