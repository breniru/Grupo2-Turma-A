package projetoIntegrador;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class OperacaoAurora {
	

	static void menu() throws Exception {
		Scanner entrada = new Scanner(System.in);
		int escolha_menu;
		do {
			System.out.print("Olá Jogador escolha uma opção: ");
			System.out.println("1 - Instruções");
			System.out.println("2 - Jogar");
			System.out.println("3 - Créditos");
			System.out.println("4 - Sair");
			
			System.out.println("\n");
			escolha_menu = entrada.nextInt();
			if (escolha_menu == 1) {
				intrucoes();
			} else if (escolha_menu == 2) {
				jogar();
			} else if (escolha_menu == 3) {
				creditos();
			} else if (escolha_menu == 4) {
				System.exit(0);
			} else {
				System.out.println("\nOpÃ§Ã£o invÃ¡lida, digite novamente: ");
			}
		} while (escolha_menu != 1 && escolha_menu != 2 && escolha_menu != 3 && escolha_menu != 4);
	}
	
//	public static void Digita(String mensagem, TimeUnit unit, long tempo_mensagem) throws InterruptedException {
//		for (char caractere : mensagem.toCharArray()) {
//			System.out.print(caractere);
//			unit.sleep(tempo_mensagem);
		}
	}
}