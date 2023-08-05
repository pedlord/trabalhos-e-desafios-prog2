import java.io.BufferedReader;
import java.util.Scanner;
public class Tela{
	public static void TelaCliente(Cliente cliente,Scanner sc ,BufferedReader br) throws Exception {
		while(true) {
			System.out.println("[1]procurar mídia;[2]avaliar mídia;[3]gerenciar favoritos;[4]sair da conta");
			int acao = sc.nextInt();
			if(acao == 1) {
				String tituloPesquisa = "";
				System.out.println("Pesquisar: [1]filme;[2]Série");
				int pesquisar = sc.nextInt();
				if(pesquisar == 1) {
					System.out.println("Digite o título do filme a ser pesquisado");
					tituloPesquisa = br.readLine();
					Filme filme = cliente.PesquisarFilme(tituloPesquisa);
					if(filme != null) {
						System.out.println(filme.toString());
					}else {
						System.out.printf("Filme de título %s não encontrado",tituloPesquisa);
					}
				}else {
					System.out.println("Digite o título da série a ser pesquisada");
					tituloPesquisa = br.readLine();
					Serie serie = cliente.PesquisarSerie(tituloPesquisa);
					if(serie != null) {
						System.out.println(serie.toString());
					}else {
						System.out.printf("Série de título %s não encontrado",tituloPesquisa);
					}
				}
			}
			else if(acao == 2) {
				System.out.println("Avaliar: [1]filme;[2]Série");
				int avaliarTipo = sc.nextInt();
				String avaliarTitulo = "";
				if(avaliarTipo == 1) {
					System.out.println("Digite o título do filme a ser avaliado");
					avaliarTitulo = br.readLine();
					Filme filme = cliente.PesquisarFilme(avaliarTitulo);
					System.out.println("[1]like;[2]deslike");
					int like = sc.nextInt();
					if(like == 1) {
						cliente.AvaliarMedia(true, filme, cliente);
					}else {
						cliente.AvaliarMedia(false, filme, cliente);
					}
				}else {
					System.out.println("Digite o título da série a ser avaliada");
					avaliarTitulo = br.readLine();
					Serie serie = cliente.PesquisarSerie(avaliarTitulo);
					System.out.println("[1]like;[2]deslike");
					int like = sc.nextInt();
					if(like == 1) {
						cliente.AvaliarMedia(true, serie, cliente);
					}else {
						cliente.AvaliarMedia(false, serie, cliente);
					}
				}
			}
			else if(acao == 3) {
				System.out.println("[1]adicionar;[2]remover;[3]mostrar os favoritos");
				int favoritosAcao = sc.nextInt();
				int favoritosTipo;
				if(favoritosAcao == 1) {
					System.out.println("Adicionar: [1]Filme;[2]Série");
					favoritosTipo = sc.nextInt();
					if(favoritosTipo == 1) {
						System.out.println("Digite o tíulo do filme a ser adicionado");
						String titulo = br.readLine();
						cliente.AddFavoritosFilme(titulo);
					}else {
						System.out.println("Digite o tíulo da série a ser adicionada");
						String titulo = br.readLine();
						cliente.AddFavoritosSerie(titulo);
					}
				}else if(favoritosAcao == 2) {
					System.out.println("Remover: [1]Filme;[2]Série");
					favoritosTipo = sc.nextInt();
					if(favoritosTipo == 1) {
						System.out.println("Digite o tíulo do filme a ser removido");
						String titulo = br.readLine();
						cliente.RemoveFavoritosFilme(titulo);
					}else {
						System.out.println("Digite o tíulo da série a ser removida");
						String titulo = br.readLine();
						cliente.RemoveFavoritosSerie(titulo);
					}
				}else {
					cliente.getFavoritos();
				}
			}
			else if(acao == 4) {
				System.out.printf("Saindo da conta %s%n",cliente.getNome());
				break;
			}
			else {
				System.out.println("comando inválido");
			}
		}
	}
		
	
	public static void TelaFuncionario(Funcionario funcionario,Scanner sc, BufferedReader br) throws Exception {
		while(true) {
			System.out.println("[1]Adicionar mídia;[2]remover mídia;[3]configurar lançamentos;[4]sair da conta");
			int acao = sc.nextInt();
			if(acao == 1) {
				System.out.println("[1]Adicionar filme;[2]Adicionar série");
				int filme_serie = sc.nextInt();
				if(filme_serie == 1) {
					System.out.println("Digite o título do filme:");
					String titulo = br.readLine();
					System.out.println("Digite a duração do filme em minutos:");
					int duracao = sc.nextInt();
					System.out.println("Digite a idade mínima do filme:");
					int idadeMinima = sc.nextInt();
					System.out.println("Escolha o gênero:");
					System.out.println("[1]Ação;[2]Suspense;[3]Aventura;[4]Drama;[5]Terror;[6]Romance");
					int genero = sc.nextInt();
					Categoria generoTipo = null;
					switch(genero) {
					case 1:
						generoTipo = Categoria.ACAO;
						break;
					case 2:
						generoTipo = Categoria.SUSPENSE;
						break;
					case 3:
						generoTipo = Categoria.AVENTURA;
						break;
					case 4:
						generoTipo = Categoria.DRAMA;
						break;
					case 5:
						generoTipo = Categoria.TERROR;
						break;
					case 6:
						generoTipo = Categoria.ROMANCE;
						break;
					}
					Filme filme = new Filme(titulo,duracao,idadeMinima,generoTipo);
					ListaGeral.instanciaListaGeral().adicionaraListadeFilmes(filme);
					System.out.println("Filme adicionado com sucesso");
				}else {
					System.out.println("Digite o título da série:");
					String titulo = br.readLine();
					
					System.out.println("Digite a idade mínima da série:");
					int idadeMinima = sc.nextInt();
					
					System.out.println("Digite a quantidade de temporadas");
					int QuantidaTemporadas = sc.nextInt();
					
					System.out.println("Digite a quantidade de episódios total da série");
					int QuantidaEpisodiosInicial = sc.nextInt();
					
					//Temporada temporada = new Temporada(1,QuantidaEpisodiosInicial);
					Serie serie = new Serie(titulo,idadeMinima, QuantidaEpisodiosInicial, QuantidaTemporadas);
					
					ListaGeral.instanciaListaGeral().adicionaraListadeSeries(serie);
					System.out.println("Série adicionada com sucesso");
				}
				
			}
			else if(acao == 2) {
				System.out.println("[1]Remover: [1]filme;[2]série");
				int removerAcao = sc.nextInt();
				String remover = "";
				if(removerAcao == 1) {
					System.out.println("Digite o título do filme");
					remover = br.readLine();
					funcionario.RemoveFilme(remover);
				}else {
					System.out.println("Digite o título da série");
					remover = br.readLine();
					funcionario.RemoveSerie(remover);
				}
			}
			else if(acao == 3) {
				System.out.println("[1]Adicionar um filme;[2]Remover um filme - aos lançamentos");
				int lancamentoAcao = sc.nextInt();
				
				if(lancamentoAcao == 1) {
					System.out.println("Digite o título do filme");
					String titulo = br.readLine();
					funcionario.AddFilmeLancamento(titulo);
				}else {
					System.out.println("Digite o título do filme");
					String titulo = br.readLine();;
					funcionario.RemoveFilmeLancamento(titulo);
				}
				
			}
			else if(acao == 4) {
				System.out.printf("Saindo da conta %s%n",funcionario.getNome());
				break;
			}
			else {
				System.out.println("comando inválido");
			}
		}
	}
}