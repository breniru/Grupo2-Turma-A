package projetoIntegrador;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class OperacaoAurora {
	/*
	 * Fazenddo a chamada do scanner de forma global para ser utilizada no código
	 * inteiro. Isso evita de ficar instanciando em todas as funções.
	 */
	static Scanner input = new Scanner(System.in);
	static Random random = new Random();

	/*
	 * Variáveis responsáveis por determinar o delay nas mensagens que serão
	 * imprimidas.
	 */
	static int tempo_dialogo = 70, tempo_narrativa = 150, tempo_transicao = 25;

	// #region Funções genéricas para utilização de forma global.

	/*
	 * Função responsável por imprir uma mensagem utilizando um tempo de exibição.
	 * 
	 * @param mensagem a mensagem que será imprimida.
	 * 
	 * @param tipo_tempo o formato de tempo que será utilizado para contabilizar o
	 * tempo.
	 * 
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
	static void Intrucoes() throws Exception {
		Imprimir(
				"Operação Aurora é uma experiência imersiva que combina elementos de narrativa e resolução de enigmas, proporcionando a você uma jornada emocionante e cheia de mistérios para desvendar!",TimeUnit.MILLISECONDS, tempo_narrativa);

		/*
		 * DEFINIR ESSAS INTRUÇÕES - O QUE SERÁ POSTO? Ideias: - Colocar um pouco sobre
		 * os capitulos - Explicar um pouco sobre os personagens - Falar sobre os
		 * enigmas de forma breve
		 */

	}

	// #region Funçõs responsáveis pelo desenvolvimento dos capitúlos/jogo.

//	  Função responsável por iniciar o PRIMEIRO capitúlo.

	static void SombrasGrandeMaca() throws Exception {
		Imprimir("\n\nCapitulo 1: \n\n",TimeUnit.MILLISECONDS, tempo_narrativa);
		
		System.out.println(
	   "\u001B[33m███████╗ ██████╗ ███╗   ███╗██████╗ ██████╗  █████╗ ███████╗    ██████╗  █████╗      ██████╗ ██████╗  █████╗ ███╗   ██╗██████╗ ███████╗    ███╗   ███╗ █████╗  ██████╗ █████╗ \n"
				+"██╔════╝██╔═══██╗████╗ ████║██╔══██╗██╔══██╗██╔══██╗██╔════╝    ██╔══██╗██╔══██╗    ██╔════╝ ██╔══██╗██╔══██╗████╗  ██║██╔══██╗██╔════╝    ████╗ ████║██╔══██╗██╔════╝██╔══██╗\n"
				+"███████╗██║   ██║██╔████╔██║██████╔╝██████╔╝███████║███████╗    ██║  ██║███████║    ██║  ███╗██████╔╝███████║██╔██╗ ██║██║  ██║█████╗      ██╔████╔██║███████║██║     ███████║\n"
				+"╚════██║██║   ██║██║╚██╔╝██║██╔══██╗██╔══██╗██╔══██║╚════██║    ██║  ██║██╔══██║    ██║   ██║██╔══██╗██╔══██║██║╚██╗██║██║  ██║██╔══╝      ██║╚██╔╝██║██╔══██║██║     ██╔══██║\n"
				+"███████║╚██████╔╝██║ ╚═╝ ██║██████╔╝██║  ██║██║  ██║███████║    ██████╔╝██║  ██║    ╚██████╔╝██║  ██║██║  ██║██║ ╚████║██████╔╝███████╗    ██║ ╚═╝ ██║██║  ██║╚██████╗██║  ██║\n"
				+"╚══════╝ ╚═════╝ ╚═╝     ╚═╝╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝╚══════╝    ╚═════╝ ╚═╝  ╚═╝     ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝╚═╝  ╚═══╝╚═════╝ ╚══════╝    ╚═╝     ╚═╝╚═╝  ╚═╝ ╚═════╝╚═╝  ╚═╝\u001B[0m");
		
	}

//	 Função responsável por iniciar o SEGUNDO capitúlo.

	static void DesvendarOlhoSecreto() throws Exception {

		Imprimir("\n\nCapitulo 2:\n\n",TimeUnit.MILLISECONDS, tempo_narrativa);
		System.out.println(
				"\u001B[33m██████╗ ███████╗███████╗██╗   ██╗███████╗███╗   ██╗██████╗  █████╗ ███╗   ██╗██████╗  ██████╗ \n"
						+ "██╔══██╗██╔════╝██╔════╝██║   ██║██╔════╝████╗  ██║██╔══██╗██╔══██╗████╗  ██║██╔══██╗██╔═══██╗\n"
						+ "██║  ██║█████╗  ███████╗██║   ██║█████╗  ██╔██╗ ██║██║  ██║███████║██╔██╗ ██║██║  ██║██║   ██║\n"
						+ "██║  ██║██╔══╝  ╚════██║╚██╗ ██╔╝██╔══╝  ██║╚██╗██║██║  ██║██╔══██║██║╚██╗██║██║  ██║██║   ██║\n"
						+ "██████╔╝███████╗███████║ ╚████╔╝ ███████╗██║ ╚████║██████╔╝██║  ██║██║ ╚████║██████╔╝╚██████╔╝\n"
						+ "╚═════╝ ╚══════╝╚══════╝  ╚═══╝  ╚══════╝╚═╝  ╚═══╝╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═══╝╚═════╝  ╚═════╝ \n"
						+ " ██████╗      ██████╗ ██╗     ██╗  ██╗ ██████╗     ███████╗███████╗ ██████╗██████╗ ███████╗████████╗ ██████╗  \n"
						+ "██╔═══██╗    ██╔═══██╗██║     ██║  ██║██╔═══██╗    ██╔════╝██╔════╝██╔════╝██╔══██╗██╔════╝╚══██╔══╝██╔═══██╗ \n"
						+ "██║   ██║    ██║   ██║██║     ███████║██║   ██║    ███████╗█████╗  ██║     ██████╔╝█████╗     ██║   ██║   ██║ \n"
						+ "██║   ██║    ██║   ██║██║     ██╔══██║██║   ██║    ╚════██║██╔══╝  ██║     ██╔══██╗██╔══╝     ██║   ██║   ██║ \n"
						+ "╚██████╔╝    ╚██████╔╝███████╗██║  ██║╚██████╔╝    ███████║███████╗╚██████╗██║  ██║███████╗   ██║   ╚██████╔╝ \n"
						+ " ╚═════╝      ╚═════╝ ╚══════╝╚═╝  ╚═╝ ╚═════╝     ╚══════╝╚══════╝ ╚═════╝╚═╝  ╚═╝╚══════╝   ╚═╝    ╚═════╝\u001B[0m");

		System.out.println();
		Imprimir("Ethan Blackwood: Já verifiquei quase todos os documentos, parece que não tem nada nesse lugar.\n", TimeUnit.MILLISECONDS, tempo_dialogo);
		Imprimir("Ethan Blackwood: Pera aí, aqui tem mais um. Parece que esse é o último documento, mas calma, acho que tem algo escrito nele.\n\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		
		String documento;

		do {
			Imprimir( "Você encontrou um documento. Deseja ler? (Sim/Não)",TimeUnit.MILLISECONDS, tempo_transicao);
			documento = input.next();

			if (documento.equals("Sim") || documento.equals("sim")) {
				Imprimir("Você resolveu ler o documento!!\n\n",TimeUnit.MILLISECONDS, tempo_transicao);

			} else if (documento.equals("Não") || documento.equals("não")) {

				while (!(documento.equals("Sim") || documento.equals("sim"))) {
					Imprimir("Você escolheu não ler o documento. Deseja reconsiderar? (Sim/Não)\n\n",TimeUnit.MILLISECONDS, tempo_transicao);
					documento = input.next();
				}
				Imprimir("Você resolveu ler o documento!!.\n\n",TimeUnit.MILLISECONDS, tempo_transicao);
			} else {
				Imprimir("Resposta inválida. Por favor, digite 'Sim' ou 'Não'.\n\n",TimeUnit.MILLISECONDS, tempo_transicao);
			}
		} while (!(documento.equals("Sim") || documento.equals("sim")));
		
		
		Imprimir("No documento estava escrito algumas informações sobre seus pais e uma organização secreta que pertencia a eles conhecida como \"O Olho Secreto\".\n",TimeUnit.MILLISECONDS, tempo_narrativa);
		Imprimir("Uma organização secreta obscura, especializada em segurança nacional liderada pelo seus pais que aparentemente foram vítimas de uma traição dentro da própria organização.\n",TimeUnit.MILLISECONDS, tempo_narrativa);
		Imprimir("A revelaçào acaba sendo desvastadora para Ethan , o que acaba fazendo com que  ele ficasse muito confuso e devastado com tudo que ele tinha lido no documento. Ethan se vê diante de um dilema cruel.\n\n",TimeUnit.MILLISECONDS, tempo_narrativa);
		Imprimir("Ethan Blackwood: Será que realmente devo seguir em frente com minha vida e tentar esquecer tudo isso ou devo continuar procurando a verdade sobre a morte do meus pais e sobre essa organização chamada O Olho Secreto.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		System.out.println();

		
		int caminho = 0;
		
		while (caminho != 2) {
			Imprimir("Escolha uma opção:\n",TimeUnit.MILLISECONDS, tempo_transicao);
            Imprimir("1 - Seguir em frente com sua vida e ignorar tudo que você tenha lido\n",TimeUnit.MILLISECONDS, tempo_transicao);
            Imprimir("2 - Embarcar em uma jornada perigosa para desvendar a verdade sobre seus pais e a organização obscura à qual eles pertenciam.\n",TimeUnit.MILLISECONDS,tempo_transicao);

            if (input.hasNextInt()) {
                caminho = input.nextInt();
                if (caminho == 1) {
                    Imprimir("\nVocê decidiu seguir em frente com sua vida e ignorar tudo que você leu. Mas será que essa é realmente uma boa decisão??\n\n",TimeUnit.MILLISECONDS, tempo_transicao);
                } else if (caminho == 2) {
                    Imprimir("\nVocê escolheu embarcar em uma jornada perigosa em busca da verdade sobre seus pais e essa organização obscura a qual eles fizeram parte.\n",TimeUnit.MILLISECONDS, tempo_transicao);
                    
                    Imprimir("Sua sede de justiça e a busca por respostas o impulsionam a seguir em frente. Você decide infiltrar-se no Olho Secreto e desvendar seus segredos e descobrir quem foi o responsável pela morte de seus pais.\n",TimeUnit.MILLISECONDS, tempo_narrativa);
                    Imprimir("A missão vai ser árdua e repleta de perigos, mas você está determinado a fazer o que for preciso para obter justiça e honrar a memória de seus pais.\n\n",TimeUnit.MILLISECONDS, tempo_transicao);
                } else {
                    Imprimir("\nOpção inválida. Por favor, escolha apenas [1] ou [2]:\n",TimeUnit.MILLISECONDS, tempo_transicao);
                }
                } else {
                Imprimir("\nOpção inválida. Por favor, escolha apenas [1] ou [2]:\n",TimeUnit.MILLISECONDS, tempo_transicao);
                input.next(); 
            }
        }

		Imprimir("Ethan Blackwood: Preciso continuar não posso desistir agora, preciso encontrar alguns equipamentos se eu quiser me enfiltrar na organização, lembro de ter passado por uma loja enquanto interrogava alguns informamantes.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		Imprimir("Ethan Blackwood: Aquele local era obscuro, é cheio de criminosos,bandidos,guangues preciso tomar cuidado, lembro que esse local ficava escondido em Sin City.\n\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		Imprimir("Algumas horas depois...\n\n",TimeUnit.MILLISECONDS, tempo_narrativa);
		Imprimir("Ethan Blackwood: Finalmente cheguei. Esse lugar é sujo, as pessoas não param de encarar e as paredes estào cheias de rachaduras, se eu me lembro a loja está proxima.\n\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		Imprimir("Ethan Blackwood continua caminhando até chegar na loja, entra e encontra um senhor barbudo e careca. Na mesma hora o vendedor pegunta para Ethan Blackwood.\n\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		Imprimir("Vendedor: Bem Vindo rapaz. O que você procura?\n\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		
		int escolha = 0;

		do {
			Imprimir("Escolha uma opção:\n",TimeUnit.MILLISECONDS, tempo_transicao);
			Imprimir("1 - Responder ao vendedor que está procurando equipamentos e roupas.\n",TimeUnit.MILLISECONDS, tempo_transicao);
			Imprimir("2 - Perguntar o nome do vendedor.\n",TimeUnit.MILLISECONDS, tempo_transicao);

			if (input.hasNextInt()) {
				escolha = input.nextInt();
				if (escolha == 1 || escolha == 2) {
					switch (escolha) {
					case 1:
						Imprimir("\nEthan Blackwood: Estou procurando alguns equipamentos e roupas. Vou precisar para uma missão.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
						break;
					case 2:
						Imprimir("\nEthan Blackwood: Posso saber qual o seu nome?\n",TimeUnit.MILLISECONDS, tempo_dialogo);
						Imprimir("Vendedor: Pode sim, mas rapaz, vejo que você não é desse lugar.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
						Imprimir("Ethan Blackwood: Como você sabe dessa informação?\n",TimeUnit.MILLISECONDS, tempo_dialogo);
						Imprimir("Vendedor: Você não parece ter a aparência de um criminoso.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
						Imprimir("Ethan Blackwood: Eu realmente não faço parte desse lugar obscuro e sujo, só estou de passagem.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
						Imprimir("Vendedor: Hahahaha! Bom, não tenho interesse em saber quais são seus motivos para você estar visitando esse lugar.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
						Imprimir("Vendedor: O pessoal por aqui me chama de Victor.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
						Imprimir("Ethan Blackwood: Estou procurando alguns equipamentos e roupas, preciso desses equipamentos para uma missão.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
						break;
					}
				} else {
					Imprimir("\nOpção inválida. Por favor, escolha entre a opção [1] ou [2].\n",TimeUnit.MILLISECONDS, tempo_transicao);
				}
			} else {
				Imprimir("\nOpção inválida. Por favor, escolha entre a opção [1] ou [2].\n",TimeUnit.MILLISECONDS, tempo_transicao);
				input.next();
			}
		} while (escolha != 1 && escolha != 2);
		

		Imprimir("Vendedor: Você está na loja certa tenho alguma roupas e equipamentos do que você precisa.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		Imprimir("Ethan Blackwood: Vou precisar de um traje apropriado, uma máscara, uma identidade falsa e uma arma.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		Imprimir("Vendedor: Vou providenciar para você, espere um pouco... Aqui está tudo o que você pediu, era isso que você precisava?\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		Imprimir("Ethan Blackwood: Sim está tudo certo, pode ficar com o troco.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		Imprimir("Vendedor: Tome cuidado e vê se não morre em sua missão, afinal me preocupo com meus clientes.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		Imprimir("Ethan Blackwood: Você se preocupa é com o dinheiro, mas espero que eu não tenha que voltar para esse lugar denovo.\n",TimeUnit.MILLISECONDS,tempo_dialogo);
		Imprimir("Vendedor: Hahahaha, tome cuidado.\n\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		Imprimir("Ethan sai pela porta e diz:\n\n",TimeUnit.MILLISECONDS, tempo_narrativa);
		
		Imprimir("Ethan Blackwood: Bom acho posso ir até o Olho Secreto, espero que eu consiga descobrir toda a verdade.\n\n",TimeUnit.MILLISECONDS, tempo_dialogo);

//		Enigma 2: O Código Secreto:

		Imprimir("Você chega até a base do olho secreto e consegue se infiltrar na base sem ser visto pelos guardas.\n",TimeUnit.MILLISECONDS, tempo_narrativa);
		Imprimir("Ao se infiltrar na base você se depara com um computador protegido por um código complexo que proteje a entrada da organização.\n",TimeUnit.MILLISECONDS, tempo_narrativa);
		Imprimir("O acesso a porta está bloqueado e tudo depende da decifração do código, que parece ser um criptograma elaborado.\n\n",TimeUnit.MILLISECONDS, tempo_narrativa);

		Imprimir("Qual é o resultado de 2^3 * 2^2 ?\n",TimeUnit.MILLISECONDS, tempo_transicao);
		
		input.nextLine();
	      
        String[] respostas = {
            "2^5",  // Resposta correta
            "2^6",
            "2^4",
            "2^7"
        };

        String[] letras = {"A", "B", "C", "D"};

        int vidas = 3;
        boolean respostaCorreta = false;
        while (!respostaCorreta) {
            // Embaralha as alternativas
            for (int i = 0; i < respostas.length; i++) {
                int j = random.nextInt(respostas.length);
                String temp = respostas[i];
                respostas[i] = respostas[j];
                respostas[j] = temp;
            }

            // Exibe as alternativas embaralhadas
            for (int i = 0; i < respostas.length; i++) {
                Imprimir(letras[i] + ") " + respostas[i] + "\n",TimeUnit.MILLISECONDS, tempo_transicao);
            }

            
            
            System.out.println();
            Imprimir("Digite a letra da resposta correta: ",TimeUnit.MILLISECONDS, tempo_transicao);
            
            String resposta = input.nextLine().toUpperCase();

            int indexResposta = -1;
            switch (resposta) {
                case "A":
                    indexResposta = 0;
                    break;
                case "B":
                    indexResposta = 1;
                    break;
                case "C":
                    indexResposta = 2;
                    break;
                case "D":
                    indexResposta = 3;
                    break;
                default:
                    Imprimir("Resposta inválida. Tente novamente.\n",TimeUnit.MILLISECONDS, tempo_transicao);
                    continue;
            }

            if (respostas[indexResposta].equals("2^5")) {
                Imprimir("Você conseguiu destravar a porta!",TimeUnit.MILLISECONDS, tempo_transicao);
                respostaCorreta = true;
            } else {
                vidas--;  // Decrementa o contador de vidas
                if (vidas > 0) {
                    Imprimir("Codigo Invalido, tente novamente. Vidas restantes: " + vidas + "\n",TimeUnit.MILLISECONDS, tempo_transicao);
                } else {
                    Imprimir("Você perdeu todas as suas vidas. Fim de jogo.",TimeUnit.MILLISECONDS, tempo_transicao);
                    Menu();
                }
            }
        }

	}

	// Função responsável por iniciar o TERCEIRO capitúlo.

	static void BuscarVerdade() throws Exception {
		Imprimir("\n\nCapitulo 3:\n\n",TimeUnit.MILLISECONDS, tempo_transicao);
		
		System.out.println(
			    "\u001B[33m███████╗███╗   ███╗    ██████╗ ██╗   ██╗███████╗ ██████╗ █████╗     ██████╗  █████╗     ██╗   ██╗███████╗██████╗ ██████╗  █████╗ ██████╗ ███████╗\n"
						+ "██╔════╝████╗ ████║    ██╔══██╗██║   ██║██╔════╝██╔════╝██╔══██╗    ██╔══██╗██╔══██╗    ██║   ██║██╔════╝██╔══██╗██╔══██╗██╔══██╗██╔══██╗██╔════╝\n"
						+ "█████╗  ██╔████╔██║    ██████╔╝██║   ██║███████╗██║     ███████║    ██║  ██║███████║    ██║   ██║█████╗  ██████╔╝██║  ██║███████║██║  ██║█████╗  \n"
						+ "██╔══╝  ██║╚██╔╝██║    ██╔══██╗██║   ██║╚════██║██║     ██╔══██║    ██║  ██║██╔══██║    ╚██╗ ██╔╝██╔══╝  ██╔══██╗██║  ██║██╔══██║██║  ██║██╔══╝  \n"
						+ "███████╗██║ ╚═╝ ██║    ██████╔╝╚██████╔╝███████║╚██████╗██║  ██║    ██████╔╝██║  ██║     ╚████╔╝ ███████╗██║  ██║██████╔╝██║  ██║██████╔╝███████╗\n"
						+ "╚══════╝╚═╝     ╚═╝    ╚═════╝  ╚═════╝ ╚══════╝ ╚═════╝╚═╝  ╚═╝    ╚═════╝ ╚═╝  ╚═╝      ╚═══╝  ╚══════╝╚═╝  ╚═╝╚═════╝ ╚═╝  ╚═╝╚═════╝ ╚══════╝\u001B[0m\n");

		Imprimir("Através de sua inteligência e perspicácia, você consegue se infiltra dentro do Olho Secreto.\n\n",TimeUnit.MILLISECONDS, tempo_narrativa);
		Imprimir("Ethan Blackwood: Esses corredores parecem gigantes, preciso me esconder não posso deixar que os guardas me vejam.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		Imprimir("Ethan Blackwood: Preciso dar um jeito de passar por esses dois guardas, sem chamar atenção.\n\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		Imprimir("Você pega sua arma e resolve atirar nos dois guardas, você estava um pouco nevorso e sua mira não estava muito boa.\n\n",TimeUnit.MILLISECONDS, tempo_narrativa);

//			Conta para acerta os guardas

		Imprimir("Para disparar resolva a equação: (3^2)^2.\n",TimeUnit.MILLISECONDS, tempo_transicao);
	      
        String[] respostas = {
            "196",  // Resposta correta
            "729",
            "512",
            "821"
        };

        String[] letras = {"A", "B", "C", "D"};
        
        int vidas = 3;
        boolean respostaCorreta = false;
        while (!respostaCorreta) {
            // Embaralha as alternativas
            for (int i = 0; i < respostas.length; i++) {
                int j = random.nextInt(respostas.length);
                String temp = respostas[i];
                respostas[i] = respostas[j];
                respostas[j] = temp;
            }

            // Exibe as alternativas embaralhadas
            for (int i = 0; i < respostas.length; i++) {
                Imprimir(letras[i] + ") " + respostas[i] + "\n",TimeUnit.MILLISECONDS, tempo_transicao);
            }

            System.out.println();
            Imprimir("Digite a letra da resposta correta: \n",TimeUnit.MILLISECONDS, tempo_transicao);

            String resposta = input.nextLine().toUpperCase();

            int indexResposta = -1;
            switch (resposta) {
                case "A":
                    indexResposta = 0;
                    break;
                case "B":
                    indexResposta = 1;
                    break;
                case "C":
                    indexResposta = 2;
                    break;
                case "D":
                    indexResposta = 3;
                    break;
                default:
                    Imprimir("Resposta inválida. Tente novamente.\n",TimeUnit.MILLISECONDS, tempo_transicao);
                    continue;
            }

            if (respostas[indexResposta].equals("729")) {
                Imprimir("Você acertou! Você matou os dois guardas com dois tiros.\n\n",TimeUnit.MILLISECONDS, tempo_transicao);
                respostaCorreta = true;
            } else {
                vidas--;  // Decrementa o contador de vidas
                if (vidas > 0) {
                    Imprimir("Você errou! Você foi atingido pelos guardas de raspão e perdeu uma vida. Vidas restantes: " + vidas + "\n",TimeUnit.MILLISECONDS, tempo_transicao);
                } else {
                    Imprimir("Você perdeu todas as suas vidas. Fim de jogo.",TimeUnit.MILLISECONDS, tempo_transicao);
                    Menu();
                }
            }
        }

		Imprimir("Ethan Blackwood: Finalmente consegui matar os dois guardas, não posso parar agora preciso continuar seguindo em frente.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		Imprimir("Ethan Blackwood: Parece quem tem alguém ali na frente, mas essa pessoa parece diferente.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		Imprimir("Ethan Blackwood: Essa pessoa não se parece com nehum guarda que eu tenha visto, será que ele é uma pessoa da organização?.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		Imprimir("Ethan Blackwood: Ele parece estar se aproximando.\n\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		Imprimir("Olhando para o homem Ethan disse:\n\n",TimeUnit.MILLISECONDS, tempo_narrativa);
		Imprimir("Ethan Blackwood: FIQUE PARADO ONDE ESTÁ SE NÃO EU ATIRO!!!!\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		Imprimir("Magnus Montgomery: Se acalme meu jovem não precisa apontar essa arma para mim, não irei te machucar, me chamo Magnus Montgomery.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		Imprimir("Ethan Blackwood: O que você faz aqui dentro, como posso saber se você não é nenhum inimigo ou alguém que faz parte do olho secreto.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		Imprimir("Magnus Montgomery: Não precisa se preocupar, se eu fosse algum inimigo eu já teria te atacado, poderia abaixar a sua arma.\n\n",TimeUnit.MILLISECONDS, tempo_dialogo);

		
		int escolha = 0;

		do {
			Imprimir("Escolha uma opção:\n",TimeUnit.MILLISECONDS, tempo_transicao);
			Imprimir("1 - Abaixar a arma e perguntar para Magnus o que ele estava fazendo naquele lugar.\n",TimeUnit.MILLISECONDS, tempo_transicao);
			Imprimir("2 - Continuar com a arma apontada e ameaçar Magnus a falar o que ele estava fazendo naquele lugar.\n",TimeUnit.MILLISECONDS, tempo_transicao);

			if (input.hasNextInt()) {
				escolha = input.nextInt();
			if (escolha == 1 || escolha == 2) {
				switch (escolha) {
				case 1:
					Imprimir("\nEthan Blackwood: Faz sentido, o que você está fazendo nesse lugar? Por que você está aqui sozinho?\n",TimeUnit.MILLISECONDS, tempo_dialogo);
					break;
				case 2:
					Imprimir("\nEthan Blackwood: NÃO IREI ABAIXAR MINHA ARMA, COMO POSSO CONFIAR EM ALGUÉM DENTRO DESSE LUGAR?\n",TimeUnit.MILLISECONDS, tempo_dialogo);
			        Imprimir("Magnus Montgomery: Ok então meu rapaz, como posso fazer para você acreditar em mim?\n",TimeUnit.MILLISECONDS, tempo_dialogo);
			        Imprimir("Ethan Blackwood: Me fale o que você está fazendo nesse lugar sozinho.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
					break;
					}
				} else {
					Imprimir("Opção inválida. Por favor, escolha entre a opção [1] ou [2].\n",TimeUnit.MILLISECONDS, tempo_transicao);
				}
			} else {
				Imprimir("Opção inválida. Por favor, escolha entre a opção [1] ou [2].\n",TimeUnit.MILLISECONDS, tempo_transicao);
				input.next();
			}
		} while (escolha != 1 && escolha != 2);
		
	
		Imprimir("Magnus Montgomery: Estou investigando essa organização já faz algum tempo, mas só agora consegui invadi-la, eles mataram alguém que eu amava, então quero leva-los a ruina.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		Imprimir("Ethan Blackwood: Tudo bem, irei abaixar minha arma. Vou acreditar em você. Me chamo Ethan Blackwood, estou investigando a organização para descobrir quem foi responsável pela morte dos meus pais.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		Imprimir("Ethan Blackwood: Eles faziam parte da organização, e a única pista que tenho é uma mensagem com o nome \"AURORA SINCLAIR\" que encontrei. Por isso, estou investigando este local.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		Imprimir("Magnus Montgomery: Já que você está investigando a organização, posso te ajudar Ethan . Quem sabe a gente possa encontrar os responsáveis pela morte de seus pais.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		Imprimir("Ethan Blackwood: Ok, eu aceito sua ajuda.\n\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		Imprimir("Os dois caminham pelos corredores e descobrem uma sala. Dentro dessa sala, eles encontram alguns quadros, documentos e algumas fotos.\n",TimeUnit.MILLISECONDS, tempo_narrativa);
		Imprimir("Ethan percebe que em uma das fotos há a imagem de seus pais. Então, na mesma hora o vem lembraças. Ele se lembra das risadas de sua mãe e da voz de seu pai.\n\n",TimeUnit.MILLISECONDS, tempo_narrativa);
		Imprimir("Magnus Montgomery: Você está bem, Ethan?\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		Imprimir("Ethan Blackwood: Estou sim, apenas lembrei dos meus pais. Sinto falta deles, mas não posso me isso deixar distrair.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		Imprimir("Ethan Blackwood: Vamos continuar investigando. Talvez a gente encontre alguma informação que possa nos ajudar.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		Imprimir("Ethan Blackwood: Olha só, falei que se continuássemos procurando acharíamos algo.\n", TimeUnit.MILLISECONDS, tempo_dialogo);
		Imprimir("Ethan Blackwood: Encontrei uma gaveta. Dentro dela está cheio de papéis e documentos.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		Imprimir("Ethan Blackwood: Espera........\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		Imprimir("Ethan Blackwood: Acho que encontrei algo entre os documentos, parece ser um tipo de mensagem está cheia de números, mas está difícil de decifrar.\n\n",TimeUnit.MILLISECONDS, tempo_dialogo);

//		Enigma 3: A Mensagem Oculta
	
        Imprimir("Para decifrar resolva a seguinte questão. Considere o monômio 2x e o polinômio 3x^2 + 4x - 5.\n",TimeUnit.MILLISECONDS, tempo_transicao);
        Imprimir("Qual é o resultado da multiplicação desse monômio pelo polinômio?\n",TimeUnit.MILLISECONDS, tempo_transicao);

        Scanner scanner = new Scanner(System.in);
        
        String[] respostas2 = {
            "6x^3 + 8x^2 - 10x",  // Resposta correta
            "6x^3 + 8x",
            "5x^3 + 6x^2 - 8x",
            "6x^2 + 8x - 5"
        };

        String[] letras2 = {"A", "B", "C", "D"};

        vidas = 3;
        boolean respostaCorreta2 = false;
        while (!respostaCorreta2) {
            // Embaralha as alternativas
            for (int i = 0; i < respostas2.length; i++) {
                int j = random.nextInt(respostas2.length);
                String temp = respostas2[i];
                respostas2[i] = respostas2[j];
                respostas2[j] = temp;
            }

            // Exibe as alternativas embaralhadas
            for (int i = 0; i < respostas2.length; i++) {
                Imprimir(letras2[i] + ") " + respostas2[i] + "\n",TimeUnit.MILLISECONDS, tempo_transicao);
            }
            

            System.out.println();
            Imprimir("Digite a letra da resposta correta: \n",TimeUnit.MILLISECONDS, tempo_transicao);

            String resposta = scanner.nextLine().toUpperCase();

            int indexResposta = -1;
            switch (resposta) {
                case "A":
                    indexResposta = 0;
                    break;
                case "B":
                    indexResposta = 1;
                    break;
                case "C":
                    indexResposta = 2;
                    break;
                case "D":
                    indexResposta = 3;
                    break;
                default:
                    Imprimir("Resposta inválida. Tente novamente.\n",TimeUnit.MILLISECONDS, tempo_transicao);
                    continue;
            }

            if (respostas2[indexResposta].equals("6x^3 + 8x^2 - 10x")) {
                Imprimir("Você conseguiu decifrar o código!\n\n",TimeUnit.MILLISECONDS, tempo_transicao);
                respostaCorreta2 = true;
            } else {
                vidas--;  // Decrementa o contador de vidas
                if (vidas > 0) {
                    Imprimir("Você errou! Você foi atingido pelos guardas de raspão e perdeu uma vida. Vidas restantes: " + vidas + "\n",TimeUnit.MILLISECONDS, tempo_transicao);
                } else {
                    Imprimir("Você perdeu todas as suas vidas. Fim de jogo.",TimeUnit.MILLISECONDS, tempo_transicao);
                    Menu();
                }
            }
        }

		
		Imprimir("Magnus Montgomery: Você conseguiu decifrar o codigo Ethan. O que está escrito no documento?\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		Imprimir(
				"Ethan Blackwood: A mensagem parece ser uma citação de um poema, mas inda não sei sua ligaçào com o nome \"AURORA\", o poema está escrito com as seguintes palavras:\n\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		
		Imprimir("Em uma terra distante, de passado velado,\n" + "Jaz uma propriedade, outrora iluminada.\n"
				+ "Erguida em segredo, nos confins do oculto,\n" + "Onde mistérios e sombras teciam o seu vulto.\n\n" +

				"Ali repousava, oculta aos olhos comuns,\n" + "A propriedade do Olho Secreto, guardiã dos rumos.\n"
				+ "Um casarão antigo, em ruínas envolto,\n" + "Onde segredos se ocultavam em cada recanto.\n\n" +

				"Nos corredores, ecoavam histórias sombrias,\n" + "De tempos idos, de uma era esquecida.\n"
				+ "Nas paredes, retratos de rostos desconhecidos,\n" + "Testemunhas mudas de mistérios escondidos.\n\n"
				+

				"Entre os escombros, sussurros do passado ecoam,\n" + "Lembranças de uma época em que o medo voava.\n"
				+ "A propriedade, outrora poderosa e temida,\n" + "Agora jaz em silêncio, em sua própria partida.\n\n" +

				"Em uma terra distante, onde a luz mal alcança,\n" + "Ergue-se a propriedade em silêncio e esperança.\n"
				+ "Nos confins do mundo, em um recanto esquecido,\n"
				+ "Lá repousa o segredo, em um lugar escondido.\n\n" +

				"Entre vales profundos e montanhas isoladas,\n" + "Nas margens de um rio onde a névoa é prateada,\n"
				+ "Encontra-se a morada, em seu local isolado,\n" + "Onde o Olho Secreto foi outrora aclamado.\n\n" +

				"Mas além das colinas e além do horizonte,\n" + "Existe uma pista, um sussurro que confronte.\n"
				+ "Através de uma foto, revela-se o mistério,\n" + "A localização da propriedade, um enigma sério.\n\n"
				+

				"Pois quem souber decifrar a imagem ancestral,\n" + "Encontrará a propriedade, além do temporal.\n"
				+ "Em uma terra esquecida, em um lugar remoto,\n"
				+ "Onde o Olho Secreto repousa, em seu sagrado loto.\n\n",TimeUnit.MILLISECONDS, tempo_narrativa);

		Imprimir("Magnus Montgomery: Calma ai, lembro de ter visto a foto de uma casa em cima da mesa, vou pegar para você!!\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		Imprimir("Magnus Montgomery: Está vendo, parece ser a propriedade que o poema cita, talvez ela tenha relação com a organização.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		Imprimir("Ethan Blackwood: Sim, parerece que esta propriedade está ligada a organização, mas não consigo identificar a localização dela.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		Imprimir("Magnus Montgomery:HMMMMMMM.....\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		Imprimir("Magnus Montgomery:Lembrei de algo, quando estava investigando a organização. Lembro de ter ouvido algo sobre uma propriedade abandonada no sul de Sin City.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		Imprimir("Magnus Montgomery: O que você acha da gente dá uma olhada nessa propriedade?\n\n",TimeUnit.MILLISECONDS, tempo_dialogo);

		
		int opcao = 0;

        do {
            Imprimir("Escolha uma opção:\n",TimeUnit.MILLISECONDS, tempo_transicao);
            Imprimir("1 - Ir verificar propriedade que o Magnus mencionou.\n",TimeUnit.MILLISECONDS, tempo_transicao);
            Imprimir("2 - Verificar se tem alguma outra pista na sala.\n",TimeUnit.MILLISECONDS, tempo_transicao);

            // Verifica se o próximo token de entrada é um inteiro
            if (input.hasNextInt()) {
                opcao = input.nextInt();
                if (opcao == 1 || opcao == 2) {
                    switch (opcao) {
                        case 1:
                            Imprimir("\nEthan Blackwood: Vamos, talvez a gente encontre alguma coisa nessa propriedade.\n\n",TimeUnit.MILLISECONDS, tempo_dialogo);
                            
                            break;
                        case 2:
                            Imprimir("Ethan Blackwood: Acho que a gente deveria dar mais uma olhada nessa sala, talvez tenha mais alguma coisa por aqui.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
                            Imprimir("Magnus Montgomery: Ok, vou dar mais uma olhada por aqui, por que você não verifica aqueles quadros ali na parede?\n",TimeUnit.MILLISECONDS, tempo_dialogo);
                            Imprimir("Ethan Blackwood: Já olhei esses quadros e não achei nada!\n",TimeUnit.MILLISECONDS, tempo_dialogo);
                            Imprimir("Magnus Montgomery: Na verdade também não encontrei nada no restante da sala, acho que a gente não deveria perder mais tempo, vamos até essa propriedade.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
                            Imprimir("Ethan Blackwood: Acho uma boa ideia, vamos!!\n\n",TimeUnit.MILLISECONDS, tempo_dialogo);
                            break;
                    }
                } else {
                    Imprimir("Opção inválida. Por favor, escolha entre a opção [1] ou [2].\n",TimeUnit.MILLISECONDS, tempo_transicao);
                }
            } else {
                // Limpa o buffer de entrada antes de continuar
                Imprimir("Opção inválida. Por favor, escolha entre a opção [1] ou [2].\n",TimeUnit.MILLISECONDS, tempo_transicao);
                input.next(); // Isso limpará o token inválido do scanner
            }
        } while (opcao != 1 && opcao != 2);
		
		
	}
	

//	  Função responsável por iniciar o QUARTO capitúlo.

	static void Alianca() throws Exception {

		Imprimir("\n\nCapitulo 4:\n\n",TimeUnit.MILLISECONDS, tempo_transicao);
		System.out.println(
			    "\u001B[33m██╗   ██╗███╗   ███╗     █████╗ ██╗     ██╗ █████╗ ██████╗  ██████╗     ██╗███╗   ██╗███████╗███████╗██████╗ ███████╗██████╗  █████╗ ██████╗  ██████╗ \n"
						+ "██║   ██║████╗ ████║    ██╔══██╗██║     ██║██╔══██╗██╔══██╗██╔═══██╗    ██║████╗  ██║██╔════╝██╔════╝██╔══██╗██╔════╝██╔══██╗██╔══██╗██╔══██╗██╔═══██╗\n"
						+ "██║   ██║██╔████╔██║    ███████║██║     ██║███████║██║  ██║██║   ██║    ██║██╔██╗ ██║█████╗  ███████╗██████╔╝█████╗  ██████╔╝███████║██║  ██║██║   ██║\n"
						+ "██║   ██║██║╚██╔╝██║    ██╔══██║██║     ██║██╔══██║██║  ██║██║   ██║    ██║██║╚██╗██║██╔══╝  ╚════██║██╔═══╝ ██╔══╝  ██╔══██╗██╔══██║██║  ██║██║   ██║\n"
						+ "╚██████╔╝██║ ╚═╝ ██║    ██║  ██║███████╗██║██║  ██║██████╔╝╚██████╔╝    ██║██║ ╚████║███████╗███████║██║     ███████╗██║  ██║██║  ██║██████╔╝╚██████╔╝\n"
						+ " ╚═════╝ ╚═╝     ╚═╝    ╚═╝  ╚═╝╚══════╝╚═╝╚═╝  ╚═╝╚═════╝  ╚═════╝     ╚═╝╚═╝  ╚═══╝╚══════╝╚══════╝╚═╝     ╚══════╝╚═╝  ╚═╝╚═╝  ╚═╝╚═════╝  ╚═════╝\u001B[0m \n");

		Imprimir("Algumas horas depois....\n\n",TimeUnit.MILLISECONDS, tempo_narrativa);
		Imprimir("Magnus Montgomery: Chegamos a propriedade, ela fica logo ali na frente, acho melhor a gente ir caminhando.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		Imprimir("Ethan Blackwood: Tem certeza que essa propriedade pertencia a organização? Ela parece abandonada!\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		Imprimir("Magnus Montgomery: Ela pode aparentar abandonada por fora, mas ainda pode ter alguma coisa nela que nos ajude a descobrir algo sobre O Olho Secreto.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		Imprimir("Ethan Blackwood: Olha o estado desse portão. Ele parece enferrujado, parece não ter nenhum tipo de alarme ou cadeado nele, vou tentar abrir o portão.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		Imprimir("Magnus Montgomery: Tome cuidado Ethan pode ser uma armadilha!!\n\n",TimeUnit.MILLISECONDS, tempo_dialogo);

		int verificar;
        String resposta;

        do {
            Imprimir("1 - Abrir o portão e entrar na propriedade abandonada\n",TimeUnit.MILLISECONDS, tempo_transicao);
            Imprimir("2 - Verificar se possui alguma armadilha.\n",TimeUnit.MILLISECONDS, tempo_transicao);

            while (!input.hasNextInt()) {
                Imprimir("Por favor, insira um número válido:\n",TimeUnit.MILLISECONDS, tempo_transicao);
                input.next(); 
            }
            verificar = input.nextInt();
            input.nextLine(); 

            if (verificar == 1) {
                Imprimir("\nEthan Blackwood: Parece que não tem nenhum tipo de armadilha, acho que ela está realmente abandonada.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
                
            } else if (verificar == 2) {
                Imprimir("\nEthan Blackwood: Acho melhor a gente verificar se não possui algum tipo de armadilha.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
                Imprimir("Magnus Montgomery: Vou dar uma olhada nos fundos da casa e você olha em volta dela.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
                Imprimir("Ethan Blackwood: Tudo bem, a gente se encontra aqui de novo quando acabarmos de verificar.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
                Imprimir("Você caminha em volta da propriedade abandonada mas não encontra nada.\n",TimeUnit.MILLISECONDS, tempo_narrativa);
                Imprimir("Então você resolve voltar até a entrada da casa e aguardar.\n",TimeUnit.MILLISECONDS, tempo_narrativa);
                Imprimir("Magnus Montgomery: Ethan, verifiquei nos fundos e não encontrei nada. Você encontrou alguma coisa?\n\n",TimeUnit.MILLISECONDS, tempo_dialogo);

                do {
                    Imprimir("Responda \"Não\":",TimeUnit.MILLISECONDS, tempo_transicao);
                    resposta = input.nextLine().trim().toLowerCase();

                    if (resposta.equals("não")) {
                        Imprimir("\nEthan Blackwood: Não, não encontrei nada.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
                    } else {
                        Imprimir("\nResposta inválida. Por favor, responda apenas 'não' para responder a pergunta.\n",TimeUnit.MILLISECONDS, tempo_transicao);
                    }
                } while (!resposta.equals("não"));

            } else {
                Imprimir("Opção inválida. Por favor, escolha entre a opção [1] ou [2]:\n",TimeUnit.MILLISECONDS, tempo_transicao);
            }

        } while (verificar != 1 && verificar != 2);

		Imprimir("Magnus Montgomery: Vamos entrar, mas fique atento mesmo assim, não sabemos o que podemos encontrar.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		Imprimir("Ethan Blackwood: Parece que a porta está aberta também, acho que não tem ninguém.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		Imprimir("Ethan Blackwood: vamos ver se encontramos alguma pista. Talvez tenha algo que nos ajude.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		Imprimir("Magnus Montgomery: Por onde você gostaria de começar a procurar?\n\n",TimeUnit.MILLISECONDS, tempo_dialogo);

		boolean salaVerificada = false;
	    boolean quartosVerificados = false;
	    boolean bibliotecaVerificada = false;

	    int pista;

	    while (!salaVerificada || !quartosVerificados || !bibliotecaVerificada) {
	        if (!salaVerificada) {
	            Imprimir("1 - Verificar a sala.\n", TimeUnit.MILLISECONDS, tempo_transicao);
	        }
	        if (!quartosVerificados) {
	            Imprimir("2 - Verificar os quartos.\n", TimeUnit.MILLISECONDS, tempo_transicao);
	        }
	        if (!bibliotecaVerificada) {
	            Imprimir("3 - Verificar a biblioteca.\n", TimeUnit.MILLISECONDS, tempo_transicao);
	        }

	        while (!input.hasNextInt()) {
	            Imprimir("Por favor, insira um número válido:\n", TimeUnit.MILLISECONDS, tempo_transicao);
	            input.next();
	        }
	        pista = input.nextInt();
	        input.nextLine();

	        if (pista == 1 && !salaVerificada) {
	            salaVerificada = true;
	            Imprimir("\nEthan Blackwood: Vamos verificar a sala.\n", TimeUnit.MILLISECONDS, tempo_dialogo);
	            Imprimir("Magnus Montgomery: Boa ideia. A sala pode conter alguma pista sobre quem esteve aqui recentemente.\n", TimeUnit.MILLISECONDS, tempo_dialogo);
	            Imprimir("Ethan Blackwood: Vou checar perto da lareira, você pode dar uma olhada nos armários.\n\n", TimeUnit.MILLISECONDS, tempo_dialogo);
	            Imprimir("Você procura perto da lareira mas não encontra nada!!\n\n", TimeUnit.MILLISECONDS, tempo_transicao);
	            Imprimir("Ethan Blackwood: Você encontrou alguma coisa?\n", TimeUnit.MILLISECONDS, tempo_dialogo);
	            Imprimir("Magnus Montgomery: Não encontrei nada também, o que você acha da gente verificar os outros cômodos da casa?\n\n", TimeUnit.MILLISECONDS, tempo_dialogo);

	        } else if (pista == 2 && !quartosVerificados) {
	            quartosVerificados = true;
	            Imprimir("\nEthan Blackwood: vamos verificar os quartos.\n", TimeUnit.MILLISECONDS,tempo_dialogo);
	            Imprimir("Magnus Montgomery: Boa escolha, os quartos podem ter itens pessoais ou documentos.\n", TimeUnit.MILLISECONDS, tempo_dialogo);
	            Imprimir("Ethan Blackwood: Eu vou começar pelo quarto principal, você pode ver o quarto de hóspedes.\n", TimeUnit.MILLISECONDS, tempo_dialogo);
	            Imprimir("Magnus Montgomery: Combinado. Mantenha os olhos abertos para qualquer coisa fora do comum.\n", TimeUnit.MILLISECONDS, tempo_dialogo);
	            Imprimir("Você verifica o quarto principal mas não encontra nada!!\n", TimeUnit.MILLISECONDS, tempo_transicao);
	            Imprimir("Magnus Montgomery: Parece que não tivemos sorte dessa vez, não encontramos nada.\n", TimeUnit.MILLISECONDS, tempo_dialogo);
	            Imprimir("Magnus Montgomery: O que você acha da gente ir verificar os outros cômodos da casa?.\n\n", TimeUnit.MILLISECONDS, tempo_dialogo);

	        } else if (pista == 3 && !bibliotecaVerificada) {
	            bibliotecaVerificada = true;
	            Imprimir("\nEthan Blackwood: Vamos verificar a biblioteca.\n", TimeUnit.MILLISECONDS, tempo_dialogo);
	            Imprimir("Magnus Montgomery: A biblioteca pode ter registros importantes ou diários.\n", TimeUnit.MILLISECONDS, tempo_dialogo);
	            Imprimir("Ethan Blackwood: Vou olhar nas prateleiras do fundo, você pode ver a mesa de leitura?\n", TimeUnit.MILLISECONDS, tempo_dialogo);
	            Imprimir("Magnus Montgomery: Sim, vou ver se encontro algum livro ou documento relevante.\n", TimeUnit.MILLISECONDS, tempo_dialogo);
	            Imprimir("Ethan Blackwood: Estranho esse livro parece ser diferente dos outros, vou dar uma olhada.\n", TimeUnit.MILLISECONDS, tempo_dialogo);
	            Imprimir("Ethan Blackwood: Magnus, vem ver isso, acho que encontrei algo. Puxei este livro e essa porta com senha apareceu.\n", TimeUnit.MILLISECONDS, tempo_dialogo);
	            Imprimir("Magnus Montgomery: Essa porta parece ter algum tipo de trava com uma senha, você acha que consegue destravar descobrindo a senha?\n\n", TimeUnit.MILLISECONDS, tempo_dialogo);
	            break; // Saímos do loop ao escolher a biblioteca

	        } else {
	            Imprimir("Opção inválida ou já escolhida. Por favor, escolha uma das opções disponíveis.\n", TimeUnit.MILLISECONDS, tempo_transicao);
	        }
	    }

//        Enigma 4: A Prova Final	
        

        Imprimir("Resolva a equação do segundo grau x^2 - 3x + 2 = 0 para destravar a porta. Qual é o valor de x?\n",TimeUnit.MILLISECONDS, tempo_transicao);
        

        String[] respostas = {
            "-3 e x = -2",  // Resposta correta
            "1 e x = 3",
            "-2 e x = 1",
            "2 e x = -1"
        };

        String[] letras = {"A", "B", "C", "D"};

        int vidas = 3;
        boolean respostaCorreta = false;
        while (!respostaCorreta) {
            // Embaralha as alternativas
            for (int i = 0; i < respostas.length; i++) {
                int j = random.nextInt(respostas.length);
                String temp = respostas[i];
                respostas[i] = respostas[j];
                respostas[j] = temp;
            }

            // Exibe as alternativas embaralhadas
            for (int i = 0; i < respostas.length; i++) {
                Imprimir(letras[i] + ") " + respostas[i] + "\n",TimeUnit.MILLISECONDS, tempo_transicao);
            }

            System.out.println();
            Imprimir("Digite a letra da resposta correta: \n",TimeUnit.MILLISECONDS, tempo_transicao);

            String respostaConta = input.nextLine().toUpperCase();

            int indexResposta = -1;
            switch (respostaConta) {
                case "A":
                    indexResposta = 0;
                    break;
                case "B":
                    indexResposta = 1;
                    break;
                case "C":
                    indexResposta = 2;
                    break;
                case "D":
                    indexResposta = 3;
                    break;
                default:
                    Imprimir("Resposta inválida. Tente novamente.\n",TimeUnit.MILLISECONDS, tempo_transicao);
                    continue;
            }

            if (respostas[indexResposta].equals("-2 e x = 1")) {
                Imprimir("\nAcesso liberado! Sistema destravado.\n\n",TimeUnit.MILLISECONDS, tempo_transicao);
                respostaCorreta = true;
            } else {
                vidas--;  // Decrementa o contador de vidas
                if (vidas > 0) {
                    Imprimir("Código inválido! Vidas restantes: " + vidas + "\n",TimeUnit.MILLISECONDS, tempo_transicao);
                } else {
                    Imprimir("Você perdeu todas as suas vidas. Fim de jogo.\n",TimeUnit.MILLISECONDS, tempo_transicao);
                    Menu();
                }
            }
        }

		Imprimir("Pratileira: CRRRRREEEEAAAKKKK... THUD!\n",TimeUnit.MILLISECONDS, tempo_narrativa);
		Imprimir("Magnus Montgomery: Parece que encontramos uma passagem secreta.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		Imprimir("Magnus Montgomery: Devemos descer e ver onde leva?\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		Imprimir("Ethan Blackwood: Com certeza. Vamos descobrir o que estão escondendo aqui.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		Imprimir("Magnus Montgomery: Fique atento. Não sabemos o que podemos encontrar lá embaixo.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		Imprimir("Magnus Montgomery: Esse lugar parece realmente abandonado...\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		Imprimir("Magnus Montgomery: Parece que chegamos!",TimeUnit.MILLISECONDS, tempo_dialogo);
		Imprimir("Ethan Blackwood: Olha para esse lugar parece que realmente eles estiveram por aqui.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		Imprimir("Magnus Montgomery: Ethan, venha ver isso aqui.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		Imprimir("Ethan Blackwood: Não consigo acreditar no que estou vendo, parece que é um plano para acabar com todos os antigos agentes da organização.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		Imprimir("Magnus Montgomery: Realmente, e parace que eles conseguiram eliminar quase todos.\n",TimeUnit.MILLISECONDS,tempo_dialogo);
		Imprimir("Magnus Montgomery: Não consigo acreditar que eles estavam planejando fazer isso.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		Imprimir("Ethan Blackwood: Espere, ali tem alguns papéis!!.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		Imprimir("Ethan Blackwood: E olha, em baixo desses papeis, parece ser uma foto de uma mulher!\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		Imprimir("Ethan Blackwood: Atrás da foto está escrito algo, parece ser um suposto endereço e um nome, mas não consigo reconhecer nada do que está escrito parece estar escrito em outro idioma.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		Imprimir("Magnus Montgomery: Posso dar uma olhada nessa foto?\n\n",TimeUnit.MILLISECONDS, tempo_dialogo);

		String foto;

		do {
			Imprimir("Mostrar a foto para o Magnus Montgomery? - (Sim)",TimeUnit.MILLISECONDS, tempo_narrativa);
			foto = input.next();

			if (foto.equalsIgnoreCase("Sim")) {
				Imprimir("\nVocê resolveu mostrar a foto para o Magnus.\n\n",TimeUnit.MILLISECONDS, tempo_narrativa);
			} else if (!foto.equalsIgnoreCase("Nao")) {
				Imprimir("Resposta inválida. Por favor, digite 'Sim' ou 'Nao'.\n",TimeUnit.MILLISECONDS, tempo_transicao);
			}
		} while (!foto.equalsIgnoreCase("Sim"));

		Imprimir("Magnus Montgomery: O nome que está escrito parece se chamar \"Aurora Sinclar\" e esse endereço parece ser de um templo budista no Himalaia.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		Imprimir("Magnus Montgomery: Será que essa mulher é a tal Aurora? Para ter certeza precisamos ir verificar o mais rapido possivel se realmente é ela.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		Imprimir("Magnus Montgomery: Esse templo fica longe de Sin City, mas o que você acha da gente ir agora checar?\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		Imprimir("Ethan Blackwood: Acho uma boa ideia, vamos sim!\n",TimeUnit.MILLISECONDS, tempo_dialogo);

	}

//	  Função responsável por iniciar o QUINTO capitúlo.

	static void EncontrarAurora() throws Exception {
		Imprimir("\n\nCapitulo 5: \n\n",TimeUnit.MILLISECONDS, 1);
				System.out.println( 
						  " \u001B[33m█████╗          ██╗ ██████╗ ██████╗ ███╗   ██╗ █████╗ ██████╗  █████╗     ██████╗  █████╗ ██████╗  █████╗     ███████╗███╗   ██╗ ██████╗ ██████╗ ███╗   ██╗████████╗██████╗  █████╗ ██████╗ \n"
							       +"██╔══██╗         ██║██╔═══██╗██╔══██╗████╗  ██║██╔══██╗██╔══██╗██╔══██╗    ██╔══██╗██╔══██╗██╔══██╗██╔══██╗    ██╔════╝████╗  ██║██╔════╝██╔═══██╗████╗  ██║╚══██╔══╝██╔══██╗██╔══██╗██╔══██╗\n"
							       +"███████║         ██║██║   ██║██████╔╝██╔██╗ ██║███████║██║  ██║███████║    ██████╔╝███████║██████╔╝███████║    █████╗  ██╔██╗ ██║██║     ██║   ██║██╔██╗ ██║   ██║   ██████╔╝███████║██████╔╝\n"
							       +"██╔══██║    ██   ██║██║   ██║██╔══██╗██║╚██╗██║██╔══██║██║  ██║██╔══██║    ██╔═══╝ ██╔══██║██╔══██╗██╔══██║    ██╔══╝  ██║╚██╗██║██║     ██║   ██║██║╚██╗██║   ██║   ██╔══██╗██╔══██║██╔══██╗\n"
							       +"██║  ██║    ╚█████╔╝╚██████╔╝██║  ██║██║ ╚████║██║  ██║██████╔╝██║  ██║    ██║     ██║  ██║██║  ██║██║  ██║    ███████╗██║ ╚████║╚██████╗╚██████╔╝██║ ╚████║   ██║   ██║  ██║██║  ██║██║  ██║\n"
							       +"╚═╝  ╚═╝     ╚════╝  ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═══╝╚═╝  ╚═╝╚═════╝ ╚═╝  ╚═╝    ╚═╝     ╚═╝  ╚═╝╚═╝  ╚═╝╚═╝  ╚═╝    ╚══════╝╚═╝  ╚═══╝ ╚═════╝ ╚═════╝ ╚═╝  ╚═══╝   ╚═╝   ╚═╝  ╚═╝╚═╝  ╚═╝╚═╝  ╚═╝\n"

						 		   +" █████╗ ██╗   ██╗██████╗  ██████╗ ██████╗  █████╗     ███████╗██╗███╗   ██╗ ██████╗██╗      █████╗ ██╗██████╗ \n"
							       +"██╔══██╗██║   ██║██╔══██╗██╔═══██╗██╔══██╗██╔══██╗    ██╔════╝██║████╗  ██║██╔════╝██║     ██╔══██╗██║██╔══██╗\n"
							       +"███████║██║   ██║██████╔╝██║   ██║██████╔╝███████║    ███████╗██║██╔██╗ ██║██║     ██║     ███████║██║██████╔╝\n"
							       +"██╔══██║██║   ██║██╔══██╗██║   ██║██╔══██╗██╔══██║    ╚════██║██║██║╚██╗██║██║     ██║     ██╔══██║██║██╔══██╗\n"
							       +"██║  ██║╚██████╔╝██║  ██║╚██████╔╝██║  ██║██║  ██║    ███████║██║██║ ╚████║╚██████╗███████╗██║  ██║██║██║  ██║\n"
							       +"╚═╝  ╚═╝ ╚═════╝ ╚═╝  ╚═╝ ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝    ╚══════╝╚═╝╚═╝  ╚═══╝ ╚═════╝╚══════╝╚═╝  ╚═╝╚═╝╚═╝  ╚═╝\u001B[0m\n");

		Imprimir(
				"A jornada ao Himalaia é árdua e repleta de perigos. Eles enfrentam tempestades de neve, avalanches e animais selvagens, por todo o caminho.\n",TimeUnit.MILLISECONDS, tempo_narrativa);
		Imprimir(
				"Finalmete após semanas de viagem, eles chegam ao templo budista, um santuário pacífico escondido entre as montanhas.\n\n",TimeUnit.MILLISECONDS, tempo_narrativa);

		Imprimir("Ethan Blackwood: Até que enfim chegamos Magnus, essa viagem foi longa.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		Imprimir(
				"Magnus Montgomery: Concordo com você Ethan, mas o importante é que chegamos. Agora vamos ver se achamos essa tal Aurora Sinclair!\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		
		Imprimir("Ethan Blackwood: Sim Magnus chegamos, mas você vê alguma passagem até o templo ?\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		Imprimir("Magnus Montgomery: Não, não vejo, vamos procurar ?",TimeUnit.MILLISECONDS, tempo_dialogo);
		Imprimir("Ethan Blackwood: Sim, vamos!\n\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		
		Imprimir("Digite a resposta correta para achar a entrada do templo.",TimeUnit.MILLISECONDS, tempo_transicao);
		
		Imprimir(" Resolva a seguinte equação do segundo grau: 2x^2 - 5x + 3 = 0.\n",TimeUnit.MILLISECONDS, tempo_transicao);
        

        String[] respostas = {
            "x1 = 3/2 e x2 = 1",  // Resposta correta
            "x1 = 5/2 e x2 = -1",
            "x1 = 1/2 e x2 = 3",
            "x1 = -1 e x2 = 3/2"
        };

        String[] letras = {"A", "B", "C", "D"};

        int vidas = 3;
        boolean respostaCorreta = false;
        while (!respostaCorreta) {
            // Embaralha as alternativas
            for (int i = 0; i < respostas.length; i++) {
                int j = random.nextInt(respostas.length);
                String temp = respostas[i];
                respostas[i] = respostas[j];
                respostas[j] = temp;
            }

            // Exibe as alternativas embaralhadas
            for (int i = 0; i < respostas.length; i++) {
                Imprimir(letras[i] + ") " + respostas[i] + "\n",TimeUnit.MILLISECONDS, tempo_transicao);
            }

            System.out.println();
            Imprimir("Digite a letra da resposta correta: \n",TimeUnit.MILLISECONDS, tempo_transicao);

            String respostaConta = input.nextLine().toUpperCase();

            int indexResposta = -1;
            switch (respostaConta) {
                case "A":
                    indexResposta = 0;
                    break;
                case "B":
                    indexResposta = 1;
                    break;
                case "C":
                    indexResposta = 2;
                    break;
                case "D":
                    indexResposta = 3;
                    break;
                default:
                    Imprimir("Resposta inválida. Tente novamente.\n",TimeUnit.MILLISECONDS, tempo_transicao);
                    continue;
            }

            if (respostas[indexResposta].equals("x1 = 3/2 e x2 = 1")) {
                Imprimir("\nEthan Blackwood: Achei uma passagem que leva até a entrada Magnus!.\n\n",TimeUnit.MILLISECONDS, tempo_transicao);
                respostaCorreta = true;
            } else {
                vidas--;  // Decrementa o contador de vidas
                if (vidas > 0) {
                    Imprimir("\nMagnus Montgomery: Caminho errado acho que não é por aqui! Vidas restantes: " + vidas + "\n",TimeUnit.MILLISECONDS, tempo_transicao);
                } else {
                    Imprimir("\nEthan e Magnus se perderam! Você perdeu todas as suas vidas. Fim de jogo.\n",TimeUnit.MILLISECONDS, tempo_narrativa);
                    Menu();
                }
            }
        }
		
		 
		Imprimir(
				"Ao adentrar no templo, Magnus e Ethan se deparam com um monge, que no mesmo momento os perguntam o que estão fazendo lá:\n\n",TimeUnit.MILLISECONDS, tempo_narrativa);

		Imprimir("Monge: Olá o que trazem vocês aqui?\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		Imprimir("Ethan Blackwood: Oi monge, tudo bem? Estamos procurando uma mulher chamada Aurora Sinclair.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		Imprimir("Magnus Montgomery: Sim, isso mesmo.\n",TimeUnit.MILLISECONDS, 1);
		Imprimir("Ethan Blackwood: Você por algum acaso conhece alguém que veio ou esteja aqui com esse nome?\n\n",TimeUnit.MILLISECONDS, tempo_dialogo);

		Imprimir("Muito tempo atrás, ao Aurora chegar no templo pedindo refugio ao monge, ela pediu para que nunca dissesse que a\n",TimeUnit.MILLISECONDS, tempo_narrativa);
		Imprimir("mesma estava lá, pois tinham pessoas à procurando e querendo sua morte. Então quando Ethan Blackwood perguntou sobre ela, o monge disse:\n\n",TimeUnit.MILLISECONDS, tempo_narrativa);

		Imprimir("Monge: Não, nunca veio ninguém aqui com esse nome!\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		Imprimir("Ethan Blackwood: Tem certeza senhor?\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		Imprimir("Monge: Sim, tenho muito certeza!\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		Imprimir("Monge: Mas qual o seu nome Jovem?\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		Imprimir("Ethan Blackwood: Meu nome é Ethan Blackwood e o dele é Magnus Montgomery.\n\n",TimeUnit.MILLISECONDS, tempo_dialogo);

		Imprimir("Mal eles sabiam que Aurora estava o tempo todo escutando a conversa, mas ja estava planejando sair quando escuto o nome de Ethan. Na mesma hora ela o reconheceu.\n",TimeUnit.MILLISECONDS, tempo_narrativa);
		Imprimir("Ficou na dúvida se parava de escutar a conversa e iria se revelar para Ethan Blackwood ou se deixava tudo como estava. Depois de tanta agonia, ela resolveu ir falar com ele:\n\n",TimeUnit.MILLISECONDS, tempo_narrativa);

		Imprimir("Aurora Sinclair: Sim Ethan estou aqui!\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		Imprimir("Ethan Blackwood: Quem é você? Não me diga que é Aurora.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		Imprimir("Aurora Sinclair: Sim, sou eu mesma e já até sei o motivo de você estar aqui.\n\n",TimeUnit.MILLISECONDS, tempo_dialogo);

		Imprimir("Aurora revela sua história. Ela confirma que foi traída por um membro chamado Viktor Delacroix de alto escalão de \"O Olho Secreto\" e coagida a\n",TimeUnit.MILLISECONDS, tempo_narrativa);
		Imprimir("participar da morte dos pais de Ethan. No entanto, ela alega que não agiu por maldade, mas sob ameaça de morte dela\n",TimeUnit.MILLISECONDS, tempo_narrativa);
		Imprimir("e de pessoas próximas. Consumida pelo remorso, fugiu da organização e buscou refúgio no templo, buscando redenção por seus atos.\n\n",TimeUnit.MILLISECONDS, tempo_narrativa);

		Imprimir("Diante da confissão de Aurora, Ethan se vê diante de uma escolha crucial:\n",TimeUnit.MILLISECONDS, tempo_narrativa);

		Imprimir("1 - Perdoar Aurora: Reconhecer a complexidade da situação e aceitar seu arrependimento.\n",TimeUnit.MILLISECONDS, tempo_transicao);
		Imprimir("2 - Buscar Vingança: Consumir-se pela raiva e punir Aurora pelos seus crimes.\n",TimeUnit.MILLISECONDS, tempo_transicao);
		Imprimir("3 - Uma Nova Jornada: Após saber sobre toda a verdade, decide honrar seus pais e seguir com seus passos, reabrindo a agência \"O Olho Secreto\". \n\n",TimeUnit.MILLISECONDS, tempo_transicao);

		Imprimir("Qual será sua escolha ?\n",TimeUnit.MILLISECONDS, tempo_transicao);
		int escolha = input.nextInt();

		switch (escolha) {

		case 1:
			Imprimir("\nVocê escolheu Perdoar Aurora.\n\n",TimeUnit.MILLISECONDS, tempo_transicao);
			final1PerdoarAurora();
			break;
		case 2:
			Imprimir("\nVocê escolheu Buscar Vingança.\n\n",TimeUnit.MILLISECONDS, tempo_transicao);
			fina2BuscarVinganca();
			break;
		case 3:
			Imprimir("\nVocê escolheu Uma Nova Jornada.\n\n",TimeUnit.MILLISECONDS, tempo_transicao);
			fina3UmaNovaJornada();
			break;
		default:
			Imprimir("\nOpção inválida. Tente novamente!\n\n",TimeUnit.MILLISECONDS, tempo_transicao);
			break;
		}
		

	}

	public static void final1PerdoarAurora() throws Exception {
		Imprimir("Com os primeiros raios de sol iluminando o jardim zen do templo budista, Ethan Blackwood olha profundamente nos olhos de Aurora.\n"//Ethan Blackwood
				+ "A tensão é palpável, mas há algo mais – um entendimento silencioso. Ele respira fundo, sentindo o peso da decisão iminente. Após um momento \nque parece eterno, ele finalmente fala:\n\n",TimeUnit.MILLISECONDS, tempo_narrativa);
		
		Imprimir("Ethan Blackwood: Eu te perdoo, Aurora.\n\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		
		Imprimir("Essas palavras, simples mas poderosas, ecoam pelo jardim. Aurora, com lágrimas nos olhos, ajoelha-sediante de [NOME DO JOGADOR],a gratidão \n"
				+ "e o alívio transbordando de sua expressão. O monge ancião, observando de perto, sorri serenamente, como se já soubesse que essa seria a escolha.\n\n",TimeUnit.MILLISECONDS, tempo_narrativa);
		
		Imprimir("Aurora Sinclair: Obrigado. Prometo que dedicarei minha vida a corrigir meus erros e ajudar a desmantelar \"O Olho Secreto\". \n\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		
		Imprimir("De volta a Sin City, Ethan Blackwood, Aurora Sinclair e Magnus Montgomery começam a reunir evidências contra o traidor, Viktor Delacroix. Aurora,\n"
				+ "com seu conhecimento interno, ajuda a identificar os principais apoiadores de Delacroix e os pontos fracos da organização. Eles criam uma \n"
				+ "rede de aliados confiáveis, incluindo antigos membros desiludidos de 'O Olho Secreto' e agentes de segurança locais, determinados a acabar com a corrupção.\n\n",TimeUnit.MILLISECONDS, tempo_narrativa);
		
		Imprimir("A operação é tensa, mas a confiança mútua e o apoio de Aurora são cruciais. Eles enfrentam agentes leais ao traidor e superam diversas armadilhas \n"
				+ "mortais. Finalmente, chegam ao coração da base, onde Delacroix está prestes a executar o plano que mataria os últimos antigos agentes.\n\n",TimeUnit.MILLISECONDS, tempo_narrativa);
		
		Imprimir("O confronto final é intenso, mas Delacroix é derrotado graças à combinação das habilidades de combate de Ethan Blackwood, a astúcia de Magnus Montgomery\n"
				+ "e o conhecimento interno de Aurora Sinclair. Com Delacroix neutralizado e as provas em mãos, 'O Olho Secreto' começa a ruir por dentro.\n\n",TimeUnit.MILLISECONDS, tempo_narrativa);
		
		Imprimir("Aurora cumpre sua promessa, expondo a organização ao mundo e garantindo que suas operações nunca mais sejam realizadas nas sombras. De volta a Sin City, [NOME DO JOGADOR]\n"
				+ "visita o túmulo de seus pais, finalmente em paz. Aurora, fiel à sua palavra, abre um orfanato, oferecendo um lar seguro para crianças vulneráveis.\n\n",TimeUnit.MILLISECONDS, tempo_narrativa);
		
		Imprimir("Ethan Blackwood, Aurora Sinclair e Magnus Montgomery continuam suas vidas, sabendo que a luta pela verdade e pela justiça nunca termina, mas agora com um propósito renovado.\n"
				+ "O caminho do perdão trouxe não apenas justiça, mas também a chance de um novo começo, onde a escuridão do passado foi finalmente iluminada pela luz do perdão e da redenção.\n\n",TimeUnit.MILLISECONDS, tempo_narrativa);
		
		
		
		System.out.println(
			   "\u001B[33m███████╗██╗███╗   ███╗\n"
						+"██╔════╝██║████╗ ████║\n"
						+"█████╗  ██║██╔████╔██║\n"
						+"██╔══╝  ██║██║╚██╔╝██║\n"
						+"██║     ██║██║ ╚═╝ ██║\n"
						+"╚═╝     ╚═╝╚═╝     ╚═╝\u001B[0m");
		
		
		
	}

	public static void fina2BuscarVinganca() throws Exception {
		
		Imprimir("Aurora encara Ethan com uma expressão de desafio, seus olhos não revelando nenhum sinal de remorso, apenas uma determinação fria e diz: \n\n",TimeUnit.MILLISECONDS, tempo_narrativa);
		
		Imprimir("Aurora Sinclair: Sim, foi minha mão que os silenciou. Eles eram uma ameaça, um obstáculo no caminho para o poder que eu almejava.\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		Imprimir("Aurora Sinclair: Não houve hesitação quando os matei. Foi um passo necessário para garantir meu domínio sobre \"O Olho Secreto\".\n\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		
		Imprimir("Sua confissão atinge Ethan Blackwood como um soco no estômago, deixando-o atordoado pela crueldade de suas palavras. A verdade nua\n"
		+"e crua diante dele, sem remorso, sem piedade. Ele luta para aceitar a realidade chocante diante dele, sua mente rejeitando\n"
		+ "a ideia de que alguém pudesse ser tão impiedoso.\n\n",TimeUnit.MILLISECONDS, tempo_narrativa);
		
		Imprimir("Com um olhar feroz e determinado, Ethan avança em direção a Aurora, cujos olhos gelados encaram-no com uma serenidade perturbadora.  \n"
				+ "Na palma de sua mão, ele segura uma lâmina afiada como a própria raiva que consome seu coração, reluzindo sinistramente à luz do luar.\n"
				+ "Cada passo de Ethan ressoa no silêncio sufocante do templo, carregado de uma energia sombria e implacável.\n\n",TimeUnit.MILLISECONDS, tempo_narrativa);
		
		Imprimir("Aurora dá um passo para trás, sua expressão impassível, mas um brilho fugaz de temor atravessa seus olhos, reconhecendo \n"
				+ "a intenção mortal de Ethan Blackwood. Ela tenta escapar, mas encontra-se encurralada contra a parede fria do templo, sem escapatória \n"
				+ "diante das sombras que se aproximam. \n\n",TimeUnit.MILLISECONDS, tempo_narrativa);
		
		Imprimir("Sem proferir uma palavra, sem hesitação, Ethan ergue a lâmina e avança, seu rosto contorcido pela dor e pela sede de \n"
				+ "vingança. O metal cortante perfura o ar com um sibilo sinistro antes de encontrar seu alvo com uma precisão assustadora. \n\n",TimeUnit.MILLISECONDS, tempo_narrativa);
		
		Imprimir("Um grito rasgado irrompe pelo templo quando a lâmina penetra fundo no peito de Aurora, arrancando-lhe um gemido\n"
				+ "angustiante. Ela cai de joelhos, os olhos ainda cravados nos de Ethan Blackwood, agora obscurecidos pelo choque e pela dor.\n\n",TimeUnit.MILLISECONDS, tempo_narrativa);
		
		Imprimir("Ethan observa em silêncio enquanto Aurora luta nos últimos momentos de sua vida, cada respiração tornando-se\n"
				+ "mais difícil, cada batida do coração mais fraca. O som do vento sussurrando pelas folhas do templo testemunhao desfecho sombrio do confronto.\n\n",TimeUnit.MILLISECONDS, tempo_narrativa);
		
		Imprimir("Com um suspiro final, Aurora desaba no chão, seus olhos perdendo o brilho da vida enquanto a escuridão a consome. Ethan permanece\n"
				+ "de pé, seu peito pesado com a tormenta de emoções, mas uma sensação de alívio sombrio o envolve e em seguida diz:\n\n",TimeUnit.MILLISECONDS, tempo_narrativa);
		
		Imprimir("Ethan Blackwood: Isso foi pelos meus pais, a vida deles não foram em vão, eu os vinguei!!!!\n\n",TimeUnit.MILLISECONDS, tempo_dialogo);
		
		Imprimir("Após assistir a vida de Aurora saindo lentamente de seu corpo, Ethan foge sem deixar rastros.\n\n",TimeUnit.MILLISECONDS, tempo_narrativa);
		
		System.out.println(
				   "\u001B[33m███████╗██╗███╗   ███╗\n"
							+"██╔════╝██║████╗ ████║\n"
							+"█████╗  ██║██╔████╔██║\n"
							+"██╔══╝  ██║██║╚██╔╝██║\n"
							+"██║     ██║██║ ╚═╝ ██║\n"
							+"╚═╝     ╚═╝╚═╝     ╚═╝\u001B[0m");

	}

	public static void fina3UmaNovaJornada() {
		
	}

	
	// #endregion

//	  Função responsável por iniciar o jogo.

	static void Jogar() throws Exception {
		// Colocar um letreiro maior (pegar no google) para aparecer no console.
		Imprimir("SEJA BEM VINDO A OPERAÇÃO AURORA!\n\n",TimeUnit.MILLISECONDS, tempo_transicao);

		Imprimir("Preparado(a) para uma aventura nunca antes vivida? Aperte os cintos e vamos lá!",
				TimeUnit.MILLISECONDS, tempo_transicao);

//		  Inicializando os capitúlos do jogo e seus respectivos aspectos.

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

	}

	// //#endregion

	/*
	 * Função responsável por exibir os criadores do jogo.
	 */
	static void Creditos() throws Exception {
		Imprimir("\n\n</> Desenvolvedores </>\n\n-> Mariana Medeiros \n-> Breno Silva \n-> Gustavo Amorim\n\n", TimeUnit.MILLISECONDS,
				tempo_transicao);

		Menu();
		// Colocar as opções do menu para continuar a navegação do jogo.
	}

	/*
	 * Função responsável por dar opções referentes ao jogo para o jogador.
	 */
	static void Menu() throws Exception {
		int escolha_menu = 0;

		do {
			System.out.print("Olá meu caro desbravador. Escolha uma opção: \n");
			Imprimir("1 - Instruções\n",TimeUnit.MILLISECONDS, tempo_transicao);
			Imprimir("2 - Jogar\n",TimeUnit.MILLISECONDS, tempo_transicao);
			Imprimir("3 - Créditos\n",TimeUnit.MILLISECONDS, tempo_transicao);
			Imprimir("4 - Sair\n",TimeUnit.MILLISECONDS, tempo_transicao);

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
				Imprimir("Reposta inválida, digite novamente: ",TimeUnit.MILLISECONDS, tempo_transicao);
				break;
			}
		} while (escolha_menu != 1 && escolha_menu != 2 && escolha_menu != 3 && escolha_menu != 4);
	}

	/*
	 * Função responsável por iniciar a classe e suas devidas funções.
	 */
	public static void main(String[] args) throws Exception {
		// Iniciando o jogo com o menu

		EncontrarAurora();
//
//		// Ao final de tudo o scanner é encerrado.
//		input.close();

		

	}
}