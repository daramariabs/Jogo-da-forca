import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		menu();
		
		sc.close();
	}
	
	public static void menu() {
		System.out.println("----------------------");
		System.out.println("MENU");
		System.out.println("----------------------");
		System.out.println("1. Gerenciar Temas");
		System.out.println("2. Gerenciar Palavras");
		System.out.println("3. Jogar");
		System.out.println("4. Sair");
		System.out.println("----------------------");
		System.out.print("O que você deseja fazer?");
    }

}
