import java.util.Scanner;
import java.util.Random;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int escolhaMenu;
		String[][] matrizJogo = new String[50][50];
		
		lerMatriz(matrizJogo);
		
		System.out.println("----------------------");
		System.out.println("MENU");
		System.out.println("----------------------");
		System.out.println("1. Gerenciar Temas");
		System.out.println("2. Gerenciar Palavras");
		System.out.println("3. Jogar");
		System.out.println("4. Sair");
		System.out.println("----------------------");
		System.out.print("O que você deseja fazer? ");
		escolhaMenu = sc.nextInt();
		sc.nextLine();
		
		if (escolhaMenu == 1) {
			gerenciarTemas(matrizJogo);
		}
		else if(escolhaMenu == 2) {
			gerenciarPalavras(matrizJogo);
		}
		else if(escolhaMenu == 3) {
			jogar(matrizJogo);
		}

		//lerMatriz(matrizJogo);
		
		sc.close();	
	}
	
	public static void lerMatriz(String[][] matrizJogo) {
		
		matrizJogo[0][0] = "cidade";
		matrizJogo[0][1] = "palmas";
		matrizJogo[0][2] = "paraiso";
		matrizJogo[0][3] = "salvador";
		matrizJogo[0][4] = "manaus";
		matrizJogo[0][5] = "recife";
		matrizJogo[0][6] = "fortaleza";
		matrizJogo[0][7] = "sorocaba";
		matrizJogo[0][8] = "aracaju";
		matrizJogo[0][9] = "betim";
		matrizJogo[0][10] = "pelotas";
		
		matrizJogo[1][0] = "fruta";
		matrizJogo[1][1] = "morango";
		matrizJogo[1][2] = "uva";
		matrizJogo[1][3] = "banana";
		matrizJogo[1][4] = "ameixa";
		matrizJogo[1][5] = "melancia";
		matrizJogo[1][6] = "abacaxi";
		matrizJogo[1][7] = "pera";
		matrizJogo[1][8] = "pessego";
		matrizJogo[1][9] = "laranja";
		matrizJogo[1][10] = "manga";
		
		matrizJogo[2][0] = "pais";
		matrizJogo[2][1] = "brasil";
		matrizJogo[2][2] = "mexico";
		matrizJogo[2][3] = "barbados";
		matrizJogo[2][4] = "canada";
		matrizJogo[2][5] = "jamaica";
		matrizJogo[2][6] = "paraguai";
		matrizJogo[2][7] = "irlanda";
		matrizJogo[2][8] = "portugal";
		matrizJogo[2][9] = "israel";
		matrizJogo[2][10] = "argentina";
		
		matrizJogo[3][0] = "cor";
		matrizJogo[3][1] = "azul";
		matrizJogo[3][2] = "rosa";
		matrizJogo[3][3] = "amarelo";
		matrizJogo[3][4] = "branco";
		matrizJogo[3][5] = "verde";
		matrizJogo[3][6] = "cinza";
		matrizJogo[3][7] = "bronze";
		matrizJogo[3][8] = "creme";
		matrizJogo[3][9] = "dourado";
		matrizJogo[3][10] = "laranja";
		
		matrizJogo[4][0] = "animal";
		matrizJogo[4][1] = "abelha";
		matrizJogo[4][2] = "babuino";
		matrizJogo[4][3] = "cachorro";
		matrizJogo[4][4] = "foca";
		matrizJogo[4][5] = "golfinho";
		matrizJogo[4][6] = "jaguar";
		matrizJogo[4][7] = "lagarto";
		matrizJogo[4][8] = "ovelha";
		matrizJogo[4][9] = "papagaio";
		matrizJogo[4][10] = "urubu";
		
		for(int i =0; i < 10; i++) {
			for (int j= 0; j < 20 ; j++) {
				System.out.print(matrizJogo[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void gerenciarTemas(String[][] matrizTemas) {
		Scanner sc = new Scanner(System.in);
		
		int opcao;
		int contPesquisa = 0;
		String novoTema = "";
		String excluiTema = "";
		String buscaTema = "";
		
		do {
			System.out.println("--------------------");
			System.out.println("Grenciador de temas");
			System.out.println("1. Cadastrar Tema");
			System.out.println("2. Excluir Tema ");
			System.out.println("3. Buscar tema ");
			System.out.println("0. Sair ");
			System.out.println("--------------------");
			opcao = sc.nextInt();
			sc.nextLine();
			
			if(opcao == 1) {
				//Cadastro de Temas
				System.out.print("Informe o tema que deseja cadastrar: ");
				novoTema = sc.nextLine().toLowerCase();
				for(int i =0; i< 10; i++) {
					if(novoTema.equals(matrizTemas[i][0])) {
						System.out.println("O tema já existe. Impossivel cadastrar!");
						break;
					}
					else if(matrizTemas[i][0] == null) {
						matrizTemas[i][0] = novoTema;
						System.out.println("O tema foi cadastrado.");
						break;
					}	
				}
			}
			else if(opcao == 2) {
				//Excluir Temas
				System.out.print("Informe o tema que deseja Excluir: ");
				excluiTema = sc.nextLine().toLowerCase();
				for(int i = 0; i< 10; i++) {
					if(excluiTema.equals(matrizTemas[i][0])) {
						if(matrizTemas[i][1] == null) {
							matrizTemas[i][0] = null;
							System.out.println("Tema excluido...");
						}
						else {
							System.out.println("Não foi possível excluir o tema. Verifique se existem palavras cadastradas nesse tema.");
						}
					}
					
				}
			}
			else if(opcao == 3) {
				//Buscar Temas
				System.out.print("Informe o tema que deseja buscar: ");
				buscaTema = sc.nextLine().toLowerCase();
				
				for (int i = 0; i < 10; i++) {
					if (buscaTema.equals(matrizTemas[i][0])) {
						System.out.println("Tema encontrado: " + matrizTemas[i][0]);
						contPesquisa++;
						break;
					}
				}
				
				if(contPesquisa == 0) {
					System.out.println("Tema não encontrado!");	
				}	
			}	
		}while(opcao != 0);	
		
		sc.close();
	}
	
	
	public static void gerenciarPalavras(String[][] matrizPalavras) {
		Scanner sc = new Scanner(System.in);
		
		int opcao, contPesquisa;
		contPesquisa = 0;
		String temaEscolhido, palavraCadastro, palavraExcluida, buscaPalavra, buscaTema;
		
		do {
			System.out.println("--------------------");
			System.out.println("GERENCIADOS DE PALAVRAS");
			System.out.println("1. Cadastrar Palavras");
			System.out.println("2. Excluir Palavras ");
			System.out.println("3. Buscar Palavras ");
			System.out.println("4. Listar Palavras pelo tema ");
			System.out.println("0. Sair ");
			System.out.println("--------------------");
			opcao = sc.nextInt();
			sc.nextLine();
			
			if(opcao == 1) {
				System.out.println("Escolha um TEMA para cadastrar uma palavra: ");
				temaEscolhido = sc.nextLine().toLowerCase();
				
				for(int i = 0; i < 10; i++) {
					if(temaEscolhido.equals(matrizPalavras[i][0])) {
						System.out.println("Informe a palavra: ");
						palavraCadastro = sc.nextLine().toLowerCase();
						for(int j = 1; j < 10; j++) {
							if(palavraCadastro.equals(matrizPalavras[i][j])) {
								System.out.println("Essa palavra ja existe!");
								break;
							}
							else if(matrizPalavras[i][j] == null) {
								matrizPalavras[i][j] = palavraCadastro;
								System.out.println("Palavra cadastrada.");
								break;
							}
						}
						contPesquisa++;
					}
				}
				if(contPesquisa == 0) {
					System.out.println("Tema não encontrado!");
					
				}
			}
			else if(opcao == 2) {
				//CONTINUAR A LOGICA DO EXCLUIR
				System.out.println("Informe a palavra que deseja exluir: ");
				palavraExcluida = sc.nextLine().toLowerCase();
				
				for (int i = 0; i < 10; i++) {
					for(int j = 1; j < 10; j++) {
						if(palavraExcluida.equals(matrizPalavras[i][j])) {
							matrizPalavras[i][j] = null;
							System.out.println("Palavra excluida");
							break;
						}
					}
				}
			}
			else if(opcao == 3) {
				contPesquisa = 0;
				System.out.print("Informe a PALAVRA que deseja buscar: ");
				buscaPalavra = sc.nextLine().toLowerCase();
				
				for (int i = 0; i < 10; i++) {
					for(int j = 0; j < 10; j ++) {
						if (buscaPalavra.equals(matrizPalavras[i][j])) {
							System.out.println("PALAVRA encontrada no tema: " + matrizPalavras[i][0].toUpperCase());
							contPesquisa++;
							break;
						}
					}	
				}
				
				if(contPesquisa == 0) {
					System.out.println("PALAVRA não encontrada!");	
				}
			}
			else if(opcao == 4) {
				System.out.print("Informe o TEMA que deseja litar as palavras: ");
				buscaTema = sc.nextLine().toLowerCase();
				
				for (int i = 0; i < 20; i++) {
					if (buscaTema.equals(matrizPalavras[i][0])) {
						System.out.print("No tema "+ matrizPalavras[i][0] + " temos as palavras: ");
						for(int j = 1; j < 20; j ++) {
							System.out.print(matrizPalavras[i][j] + " ");		
						}
						
					}
						
				}
				System.out.println();
			}
			
		}while(opcao != 0);
			
		
		sc.close();
	}

	public static void jogar(String[][] matrizJogo) {
		Scanner sc = new Scanner(System.in);
		
		String[] palavrasJogo = new String [10];
		String temaJogado, letra;
		int posicao = 0;
		int erros = 0;
		int tentativas = 5;
		int opcao = 0;
		
		System.out.println("----------------------");
		System.out.println("1. Iniciar Jogo");
		System.out.println("0. Sair");
		System.out.println("----------------------");
		opcao = sc.nextInt();
		sc.nextLine();
		
		while(opcao != 0) {
			
			System.out.print("ESCOLHA UM TEMA PARA INICIAR O JOGO:");
			for(int i=0; i < 10; i++) {
				System.out.print(matrizJogo[i][0] + " ");
			}
			System.out.println();
			temaJogado = sc.nextLine().toLowerCase();
			
			//preenchendo um vetor com as palavras do tema escolhido
			for(int i=1; i < 11; i++) {
				for(int j=1; j < 11; j++) {
					if(temaJogado.equals(matrizJogo[i][0])) {
						//System.out.print(matrizJogo[i][j] + " ");
						palavrasJogo[posicao] = matrizJogo[i][j];
						posicao++;
					}
				}
			}
			
			//sorteando uma palavra
			System.out.println();
			Random sorteio = new Random();
			int indiciePalavra = sorteio.nextInt(palavrasJogo.length);
			String palavraSorteada = palavrasJogo[indiciePalavra];
			System.out.println("A palavra é: "+ palavraSorteada);
			
			//separando em letras
			String[] letras = palavraSorteada.split("");
			System.out.println("A palavra tem " + letras.length + " letras.");
			
			while(erros != 5) {	
				System.out.println("Informe uma letra de A a Z: ");
				letra = sc.nextLine();
				for(int i= 0; i < letras.length; i++) {
					if(letra.equals(letras[i])) {
						//System.out.println("Você acertou");
						System.out.println("A letra está na posição: " + i );	
						break;
					}
					else {
						System.out.println("Você erro!");
						erros++;
						tentativas--;
						System.out.println("Restam apenas " + tentativas + " tentativas.");
						//break;
					}
				}
			}
			
			System.out.println("----------------------");
			System.out.println("1. Iniciar Jogo");
			System.out.println("0. Sair");
			System.out.println("----------------------");
			opcao = sc.nextInt();
			sc.nextLine();
		}
		
		sc.close();
	}
}


