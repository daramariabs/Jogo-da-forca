import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int escolhaMenu;
		String[][] matrizJogo = new String[50][50];
		
		matrizJogo[0][0] = "cidade";
		matrizJogo[0][1] = "palmas";
		matrizJogo[0][2] = "paraiso";
		matrizJogo[1][0] = "frutas";
		matrizJogo[1][1] = "morango";
		matrizJogo[1][2] = "uva";
		matrizJogo[2][0] = "pais";
		matrizJogo[2][1] = "brasil";
		matrizJogo[2][2] = "mexico";
		matrizJogo[3][0] = "cores";
		matrizJogo[3][1] = "azul";
		matrizJogo[3][2] = "rosa";
		matrizJogo[3][3] = "amarelo";
		
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

		lerMatriz(matrizJogo);
		
		sc.close();	
	}
	
	public static void lerMatriz(String[][] matriz) {
		for(int i =0; i< 10; i++) {
			for (int j= 0; j < 10; j++) {
				System.out.print(matriz[i][j] + " ");
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
		
		System.out.println("--------------------");
		System.out.println("Grenciador de temas");
		System.out.println("1. Cadastrar Tema");
		System.out.println("2. Excluir Tema ");
		System.out.println("3. Buscar tema ");
		System.out.println("0. Sair ");
		System.out.println("--------------------");
		opcao = sc.nextInt();
		sc.nextLine();
		
		while(opcao != 0) {
			
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
			//Final dos ifs
			
			System.out.println("--------------------");
			System.out.println("Grenciador de temas");
			System.out.println("1. Cadastrar Tema");
			System.out.println("2. Excluir Tema ");
			System.out.println("3. Buscar tema ");
			System.out.println("0. Sair ");
			System.out.println("--------------------");
			opcao = sc.nextInt();
			sc.nextLine();
			
		}		
		
		sc.close();
	}
	
	public static void gerenciarPalavras(String[][] matrizPalavras) {
		Scanner sc = new Scanner(System.in);
		
		int opcao, contPesquisa;
		contPesquisa = 0;
		String temaEscolhido, palavraCadastro, palavraExcluida;
		
		
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
				System.out.println("3. Buscar Palavras ");
			}
			else if(opcao == 4) {
				System.out.println("4. Listar Palavras pelo tema ");
			}
			
		}while(opcao != 0);
			
		
		sc.close();
	}

}


