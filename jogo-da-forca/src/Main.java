import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int escolhaMenu;
		String[][] matrizJogo = new String[3][3];
		
		matrizJogo[0][0] = "Cidade";
		matrizJogo[0][1] = "Palmas";
		matrizJogo[0][2] = "Paraiso";
		matrizJogo[1][0] = "Frutas";
		matrizJogo[1][1] = "Morango";
		matrizJogo[1][2] = "Uva";
		matrizJogo[2][0] = "Pais";
		matrizJogo[2][1] = "Brasil";
		matrizJogo[2][2] = "Mexico";
		
		lerMatriz(matrizJogo);
//		do {
//			System.out.println("----------------------");
//			System.out.println("MENU");
//			System.out.println("----------------------");
//			System.out.println("1. Gerenciar Temas");
//			System.out.println("2. Gerenciar Palavras");
//			System.out.println("3. Jogar");
//			System.out.println("4. Sair");
//			System.out.println("----------------------");
//			System.out.print("O que você deseja fazer? ");
//			escolhaMenu = sc.nextInt();
//			
//			if (escolhaMenu == 1) {
//				gerenciarTemas();
//			}
//			else if(escolhaMenu == 2) {
//				System.out.println("Gerenciar Palavras");
//			}
//			else if(escolhaMenu == 3) {
//				System.out.println("Jogar");
//			}
//			
//		}while(escolhaMenu != 4);
		
		sc.close();	
	}
	
	public static void lerMatriz(String[][] matriz) {
		for(int i =0; i< 3; i++) {
			for (int j= 0; j < 3; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void gerenciarTemas() {
		Scanner sc = new Scanner(System.in);
		int opcao;
		int contPesquisa = 0;
		String[][] matrizTemas = new String[3][3];
		String temaExcluido, temaBuscado;
		
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
			
			switch(opcao) {
			case 1:
				// Falta implementar o não cadastro de palavras repetidas.
				System.out.println("Informe os temas: ");
				for (int i = 0; i < 3; i++) {
					 	matrizTemas[i][0] = sc.nextLine().toLowerCase();
				}
				break;
				
			case 2:
				//Falta finalizar a exclusão do tema
				System.out.println("Temas cadastrados:");
				for (int i = 0; i < 3; i++) {
						System.out.println(matrizTemas[i][0].toLowerCase());
				}
				
				System.out.println("Qual tema deseja excluir? ");
				break;
				
			case 3:
				System.out.print("Informe o tema que deseja buscar: ");
				temaBuscado = sc.nextLine();
				
				for (int i = 0; i < 3; i++) {
					if (temaBuscado.equals(matrizTemas[i][0])) {
						contPesquisa++;
					}
				}
				
				if (contPesquisa == 1) {
					System.out.println("Tema encontrado!");
				}
				else {
					System.out.println("Tema não encontrado!");	
				}
				break;
			}
			
			System.out.println("--------------------");
			System.out.println("Grenciador de temas");
			System.out.println("1. Cadastrar Tema");
			System.out.println("2. Excluir Tema ");
			System.out.println("3. Buscar tema ");
			System.out.println("0. Sair ");
			System.out.println("--------------------");
			opcao = sc.nextInt();

			
		}
		
		sc.close();
	}

}
