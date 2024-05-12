package projetoIntegrador;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class OperacaoAurora {
	/*
	 * Fazenddo a chamda do scanner de forma global para ser utilizada no código 
	 * inteiro.
	 * Isso evita de ficar instanciando em todas as funções.
	 */
	static Scanner input = new Scanner(System.in);

	/*
	 * Variáveis responsáveis por determinar o delay nas mensagens que serão
	 * imprimidas.
	 */
	static int tempo_dialogo = 70,
			tempo_narrativa = 150,
			tempo_transicao = 25;

	// #region Funções genéricas para utilização de forma global.

	/*
	 * Função responsável por imprir uma mensagem utilizando um tempo de exibição.
	 * 
	 * @param mensagem a mensagem que será imprimida.
	 * @param tipo_tempo o formato de tempo que será utilizado para contabilizar o
	 * tempo.
	 * @param tempo_mensagem por quanto tempo a mensagem será exibida.
	 */
	public static void Imprimir(String mensagem, TimeUnit formato_tempo, long tempo_mensagem)
			throws InterruptedException {
		for (char caractere : mensagem.toCharArray()) {
			System.out.print(caractere);

			formato_tempo.sleep(tempo_mensagem);
		}
	}
	// #endregion

	/*
	 * Função responsável por dar ao jogador instruções sobre o jogo.
	 */
	static void Intrucoes() {
		System.out.println(
				"Operação Aurora é uma experiência imersiva que combina elementos de narrativa e resolução de enigmas, proporcionando a você uma jornada emocionante e cheia de mistérios para desvendar!");

		/*
		 * DEFINIR ESSAS INTRUÇÕES - O QUE SERÁ POSTO?
		 * Ideias:
		 * - Colocar um pouco sobre os capitulos
		 * - Explicar um pouco sobre os personagens
		 * - Falar sobre os enigmas de forma breve
		 */

	}

	// #region Funçõs responsáveis pelo desenvolvimento dos capitúlos/jogo.

	/*
	 * Função responsável por iniciar o PRIMEIRO iro capitúlo.
	 */
	static void SombrasGrandeMaca() {
		System.out.println("\nSOMBRAS DA GRANDE MAÇA: ");
	}

	/*
	 * Função responsável por iniciar o SEGUNDO capitúlo.
	 */
	static void DesvendarOlhoSecreto() {
		System.out.println("\nDESENDANDO O OLHO SECRETO: ");
	}

	/*
	 * Função responsável por iniciar o TERCEIRO capitúlo.
	 */
	static void BuscarVerdade() {
		System.out.println("\nBUSCAR A VERDADE POR TRÁS DE TUDO:");
	}

	/*
	 * Função responsável por iniciar o QUARTO capitúlo.
	 */
	static void Alianca() {
		System.out.println("\nALIANDO-SE A ALGUÉM IMPROVAVEL:");
	}

	/*
	 * Função responsável por iniciar o QUINTO capitúlo.
	 */
	static void EncontrarAurora() {
		System.out.println("\nBUSCANDO A AURORA: ");
	}

	/*
	 * Função responsável por iniciar o SEXTO capitúlo.
	 */
	static void Confrontar() {
		System.out.println("\nO CONFRONTO FINAL - TERÁ OS 3 FINAIS: ");
	}
	// #endregion

	/*
	 * Função responsável por iniciar o jogo.
	 */
	static void Jogar() throws InterruptedException {
		// Colocar um letreiro maior (pegar no google) para aparecer no console.
		System.out.println("SEJA BEM VINDO A OPERAÇÃO AURORA!");

		Imprimir("Preparado (a) para uma aventura nunca antes vivida? Aperte os cintos e vamos lá!",
				TimeUnit.MILLISECONDS, tempo_dialogo);

		/*
		 * Inicializando os capitúlos do jogo e seus respectivos aspectos.
		 */

		// 1 - capitulo
		SombrasGrandeMaca();

		// 2 - capitulo
		DesvendarOlhoSecreto();

		// 3 - capitulo
		BuscarVerdade();

		// 4- capitulo
		Alianca();

		// 5 - capitulo
		EncontrarAurora();

		// 6 - capitulo
		Confrontar();
	}

	// //#endregion

	/*
	 * Função responsável por exibir os criadores do jogo.
	 */
	static void Creditos() throws Exception {
		Imprimir("\n\n</> Desenvolvedores </>\n\n-> Mariana Medeiros \n-> Breno \n-> Gustavo", TimeUnit.MILLISECONDS,
				tempo_narrativa);

		// Colocar as opções do menu para continuar a navegação do jogo.
	}

	/*
	 * Função responsável por dar opções referentes ao jogo para o jogador.
	 */
	static void Menu() throws Exception {
		int escolha_menu = 0;

		do {
			System.out.print("Olá meu caro desbravador. Escolha uma opção: \n");
			System.out.println("1 - Instruções");
			System.out.println("2 - Jogar");
			System.out.println("3 - Créditos");
			System.out.println("4 - Sair");

			System.out.println("\n");

			escolha_menu = input.nextInt();

			switch (escolha_menu) {
				case 1:
					Intrucoes();
					break;

				case 2:
					Jogar();
					break;

				case 3:
					Creditos();
					break;

				case 4:
					System.exit(0);
					break;

				default:
					System.out.println("\nOpÃ§Ã£o invÃ¡lida, digite novamente: ");
					break;
			}
		} while (escolha_menu != 1 && escolha_menu != 2 && escolha_menu != 3 && escolha_menu != 4);
	}

	/*
	 * Função responsável por iniciar a classe e suas devidas funções.
	 */
	public static void main(String[] args) throws Exception {
		// Iniciando o jogo com o menu
		Menu();

		// Ao final de tudo o scanner é encerrado.
		input.close();
	}
}