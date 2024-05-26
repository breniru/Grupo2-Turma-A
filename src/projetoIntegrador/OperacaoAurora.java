package projetoIntegrador;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class OperacaoAurora {
	/*
	 * Fazenddo a chamada do scanner de forma global para ser utilizada no código 
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

	
//	  Função responsável por iniciar o PRIMEIRO capitúlo.
	 
	static void SombrasGrandeMaca() {
		System.out.println("\nSOMBRAS DA GRANDE MAÇA: ");
	}

	
//	 Função responsável por iniciar o SEGUNDO capitúlo.
	 
	static void DesvendarOlhoSecreto() {
		
		System.out.println("Capitulo 2:\n");
		System.out.println();
		System.out.println(
		            "██████╗ ███████╗███████╗██╗   ██╗███████╗███╗   ██╗██████╗  █████╗ ███╗   ██╗██████╗  ██████╗ \n" +
		            "██╔══██╗██╔════╝██╔════╝██║   ██║██╔════╝████╗  ██║██╔══██╗██╔══██╗████╗  ██║██╔══██╗██╔═══██╗\n" +
		            "██║  ██║█████╗  ███████╗██║   ██║█████╗  ██╔██╗ ██║██║  ██║███████║██╔██╗ ██║██║  ██║██║   ██║\n" +
		            "██║  ██║██╔══╝  ╚════██║╚██╗ ██╔╝██╔══╝  ██║╚██╗██║██║  ██║██╔══██║██║╚██╗██║██║  ██║██║   ██║\n" +
		            "██████╔╝███████╗███████║ ╚████╔╝ ███████╗██║ ╚████║██████╔╝██║  ██║██║ ╚████║██████╔╝╚██████╔╝\n" +
		            "╚═════╝ ╚══════╝╚══════╝  ╚═══╝  ╚══════╝╚═╝  ╚═══╝╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═══╝╚═════╝  ╚═════╝ \n" +
		            " ██████╗      ██████╗ ██╗     ██╗  ██╗ ██████╗     ███████╗███████╗ ██████╗██████╗ ███████╗████████╗ ██████╗    \n" +
		            "██╔═══██╗    ██╔═══██╗██║     ██║  ██║██╔═══██╗    ██╔════╝██╔════╝██╔════╝██╔══██╗██╔════╝╚══██╔══╝██╔═══██╗ ██╗\n" +
		            "██║   ██║    ██║   ██║██║     ███████║██║   ██║    ███████╗█████╗  ██║     ██████╔╝█████╗     ██║   ██║   ██║ ╚═╝\n" +
		            "██║   ██║    ██║   ██║██║     ██╔══██║██║   ██║    ╚════██║██╔══╝  ██║     ██╔══██╗██╔══╝     ██║   ██║   ██║ ██╗\n" +
		            "╚██████╔╝    ╚██████╔╝███████╗██║  ██║╚██████╔╝    ███████║███████╗╚██████╗██║  ██║███████╗   ██║   ╚██████╔╝ ╚═╝\n" +
		            " ╚═════╝      ╚═════╝ ╚══════╝╚═╝  ╚═╝ ╚═════╝     ╚══════╝╚══════╝ ╚═════╝╚═╝  ╚═╝╚══════╝   ╚═╝    ╚═════╝    "
		        );
		
		System.out.println();
		System.out.println("Após Ethan conferir quase todos os documentos encontrados dentro do compartimento secreto.\n");
		System.out.println("Ele encontra um ultimo documento, então Ethan resolve ler esse documento, nele estava escrito algumas informações sobre seus pais e que eles eram dono de uma organização secreta conhecida como O Olho Secreto.\n");
	    System.out.println("Uma organização secreta obscura especializada em segurança nacional e em inteligência liderada pelo seus pais que,aparentemente,foram vítimas de uma traição dentro da própria organização.\n");
		System.out.println("A revelaçào acaba sendo desvastadora para Ethan, o que acaba fazendo com que ele ficasse muito confuso e devastado com tudo que ele tinha lido no documento.Então Ethan se vê diante de um dilema cruel.\n");
		System.out.println("Seguir em frente com sua vida ou embarcar em uma jornada perigosa para desvendar a verdade sobre seus pais e a organização obscura à qual eles pertenciam:\n");
		
		int decisao;
		do {
			System.out.println("1 - Seguir em frente com sua vida e ignorar tudo que tenha lido\n");
            System.out.println("2 - Embarcar em uma jornada perigosa para desvendar a verdade sobre seus pais e a organização obscura à qual eles pertenciam.");
            
            decisao = input.nextInt();
            
            if (decisao == 1) {
                System.out.println("Você decidiu seguir em frente com sua vida e ignorar tudo que você leu. Mas será que essa é realmente um boa descisão!\n");
            } else if (decisao == 2) {
                System.out.println("Você escolheu embarcar em uma jornada perigosa em busca da verdade sobre seus pais e a organização obscura.\n");
                
            } else {
                System.out.println("Opção inválida. Por favor, escolha apenas [1] ou [2]:");
            }
    
            
		} while (decisao != 2);
	 
		System.out.println("A sede de justiça e a busca por respostas o impulsionam a seguir em frente. Ethan decide infiltrar-se no Olho Secreto e desvendar seus segredos e descobrir quem foi o responsável pela morte de seus pais.\n");
		System.out.println("A missão vai ser árdua e repleta de perigos, mas Ethan está determinado a fazer o que for preciso para obter justiça e honrar a memória de seus pais.\n");
		System.out.println("Ethan: acaba se decidindo,ele precisava encontrar equipamentos para conseguir se enfiltrar,então ethan decide ir visitar um local que ele já havia passado antes após interrogar alguns informantes.\n");
		System.out.println("Esse local era obscuro, um lugar onde  criminosos, bandidos,guangues frequentavam  um local clandestino que fica escondido em sin city, Ethan caminhava e observava as pessoas ao seu redor, olhava para o chão sujo com poças de aguá e as paredes com rachaduras.\n");
		System.out.println("Ethan continua caminhando até chegar na loja, Ethan entra na loja e encontra um senhor barbudo e careca, o vendedor pegunta para ethan\n");
		System.out.println("???:O que você procura rapaz?\n");
		
		int escolha;
		do {
			System.out.println("1 - Responder ao vendendor que está procurando equipamentos e roupas");
            System.out.println("2 - Perguntar o nome do vendedor");
            
            escolha = input.nextInt();
            input.nextLine();
            
            if (escolha == 1) {
                System.out.println("Estou procurando alguns equipamentos e roupas, preciso ir em uma missão.");
            } else if (escolha == 2) {
                System.out.println("Ethan: olha para o vendedor e pergunta como ele se chamava.");
                System.out.println("???: O vendendor olha para o rosto de Ethan e responde, vejo que você não é desse lugar.");
                System.out.println("Ethan: pergunta como ele sabia dessa informação?");
                System.out.println("???: o vendedor responde que ele não tinha aparencia de um criminoso.");
                System.out.println("Ethan: responde que ele realmente não fazia parte desse lugar obscuro e sujo, que estava só de passagem.");
                System.out.println("???: O vendedor dá um risada e fala bom não tenho interesse em saber quais são seus motivos para você estar visitando esse lugar.");
                System.out.println("???: o pessoal por aqui me chama de Victor.");
                System.out.println("Ethan: estou procurando alguns equipamentos e roupas victor, preciso ir em uma missão.");
                
            } else {
                System.out.println("Opção inválida. Por favor, escolha entre a opção [1] ou [2]:");
            }
		
		} while (escolha != 1 && escolha != 2 );
		
		System.out.println("você está na loja certa tenho alguma roupas e equipamentos do que você precisa.");
		System.out.println("Ethan: preciso de um traje apropriado, uma mascara, uma identidade falsa e uma arma.");
		System.out.println("Vou providenciar para você espere um pouco, aqui está tudo o que você pediu era isso que você precisava?");
		System.out.println("Ethan: sim está tudo certo, pode ficar com o troco.");
		System.out.println("O vendendor fala para ethan, tome cuidado e vê se não morre em sua missão, quem sabe você a gente não possa tomar um cerveja e você me conta sobre sua missão");
		System.out.println("Ethan: Quem sabe, mas espero que eu não tenha que voltar para esse lugar denovo");
		System.out.println("O vendedor olha para Ethan e dá um risada");
		System.out.println("Ethan sai da loja e resolve ir até a base do olho secreto\n");

		
//		Enigma 2: O Código Secreto:
		
		System.out.println("Ethan chega até a base do olho secreto e consegue se infiltrar na base sem ser visto pelos guardas");
		System.out.println("Ao se infiltrar na base ethan se depara com um computador protegido por um código complexo.");
		System.out.println("O acesso a porta está bloqueado e tudo depende da decifração do código, que parece ser um criptograma elaborado.\n");
		

        String respostaCorreta = "A"; // a resposta correta letra A

        while (true) {
            System.out.println("Qual é o resultado de 2^3 * 2^2?");
            System.out.println("A) 2^5");
            System.out.println("B) 2^6");
            System.out.println("C) 2^4");

            String respostaUsuario = input.nextLine();

            if (respostaUsuario.equals(respostaCorreta)) {
                System.out.println("Você conseguiu destravar a porta!/n");
                break;
            } else {
                System.out.println("Tente novamente.");
            }
        }
		
	}
	

	//	Função responsável por iniciar o TERCEIRO capitúlo.
	 

		static void BuscarVerdade() throws Exception {
			System.out.println("Capitulo 3:\n");
			System.out.println();
			System.out.println(
					"█████╗     ███╗   ███╗███████╗███╗   ██╗███████╗ █████╗  ██████╗ ███████╗███╗   ███╗     ██████╗  ██████╗██╗   ██╗██╗  ████████╗ █████╗    \n" +
					"██╔══██╗    ████╗ ████║██╔════╝████╗  ██║██╔════╝██╔══██╗██╔════╝ ██╔════╝████╗ ████║    ██╔═══██╗██╔════╝██║   ██║██║  ╚══██╔══╝██╔══██╗ ██╗\n" +
					"███████║    ██╔████╔██║█████╗  ██╔██╗ ██║███████╗███████║██║  ███╗█████╗  ██╔████╔██║    ██║   ██║██║     ██║   ██║██║     ██║   ███████║ ╚═╝\n" +
					"██╔══██║    ██║╚██╔╝██║██╔══╝  ██║╚██╗██║╚════██║██╔══██║██║   ██║██╔══╝  ██║╚██╔╝██║    ██║   ██║██║     ██║   ██║██║     ██║   ██╔══██║ ██╗\n" +
					"██║  ██║    ██║ ╚═╝ ██║███████╗██║ ╚████║███████║██║  ██║╚██████╔╝███████╗██║ ╚═╝ ██║    ╚██████╔╝╚██████╗╚██████╔╝███████╗██║   ██║  ██║ ╚═╝\n" +
					"╚═╝  ╚═╝    ╚═╝     ╚═╝╚══════╝╚═╝  ╚═══╝╚══════╝╚═╝  ╚═╝ ╚═════╝ ╚══════╝╚═╝     ╚═╝     ╚═════╝  ╚═════╝ ╚═════╝ ╚══════╝╚═╝   ╚═╝  ╚═╝   "
					);
			
			System.out.println();
			System.out.println("Através de sua inteligência e perspicácia, Ethan consegue se infiltra dentro do Olho Secreto");
			System.out.println("Ethan começa a caminhar pelos corredores e logo vê dois guardas na sua frente parados conversando");
			System.out.println("Ethan precisava dar um jeito de passar pelos dois guardas para que ele podesse continuar, então ele resolve enfrentar os dois guardas");
			System.out.println("Ethan pega sua arma e resolve atirar nos dois guardas, ele estava um pouco nevorso e sua mira não estava muito boa\n");
			
//			Conta para acerta os guardas

			String[] opcoes = {"A: 196", "B: 729", "C: 512"};  //	resposta correta letra B
			int vidas = 3;
			boolean guardasVivos = true;

			while (guardasVivos && vidas > 0) {
			    System.out.println("Resolva a equação: (3^2)^2 = ?");
			    for (int i = 0; i < opcoes.length; i++) {
			        System.out.print(opcoes[i] + " ");
			    }
			    System.out.println();
			    String alternativa = input.next();

			    if (alternativa.equalsIgnoreCase("B")) {
			        System.out.println("Você acertou! Você matou os dois guardas com dois tiros.");
			        guardasVivos = false;
			    } else {
			        vidas--;
			        if (vidas == 2) {
			            System.out.println("Você errou! Você foi atingido pelos guardas de raspão e perdeu uma vida.");
			        } else if (vidas == 1) {
			            System.out.println("Você errou novamente! Você foi atingido com um tiro na perna e perdeu outra vida.");
			        } else {
			            System.out.println("Você errou pela terceira vez! Você foi acertado pelos guardas na cabeça e perdeu todas as vidas.\n");
			            Menu();  
			        }
			    }
			}
	        
			System.out.println("Após ethan consegui matar os dois guardas, ele segue em frente pelos corredores");
			System.out.println("Ethan caminha pelos corredores e encontra uma pessoa na sua frente, esse inviduo parecia diferente");
			System.out.println("O Individuo não se parecia com nenhum guarda que Ethan havia visto, ele usava roupas diferentes, o individuo olha para ethan e logo se aproxima dele.");
			System.out.println("Ethan aponta sua arma e pergunta para o individuo misterioso quem era ele, ele olha para ethan e se apresenta como Magnus Montgomery.");
			System.out.println("Magnus Montgomery: Se acalme meu jovem não precisa apontar essa arma para mim, não irei te machucar, me chamo Magnus Montgomery.");
			System.out.println("Ethan: O que você faz aqui dentro, como posso saber se você não é nenhum inimigo ou algúem que faz parte do olho secreto.");
			System.out.println("Magnus Montgomery: Não precisa se preocupar seu eu fosse algum guarda eu já teria te atacado, poderia abaixar a sua arma/n");
			
			
			int escolha;
			do {
				System.out.println("1 - Abaixar a arma e perguntar para Magnus o que ele estava fazendo naquele lugar");
	            System.out.println("2 - Continuar com a arma apontada e ameaçar Magnus a falar o que ele estava fazendo naquele lugar ");
	        
	            escolha = input.nextInt();
	            input.nextLine();
	            
	            if (escolha == 1) {
	                System.out.println("Etha: o que você está fazendo nesse lugar, porque você está aqui sozinho.");
	            } else if (escolha == 2) {
	                System.out.println("Ethan: \"NÃO IREI ABAIXAR MINHA ARMA\", COMO POSSO CONFIAR EM ALGUÉM DENTRO DESSE LUGAR");
	                System.out.println("Magnus Montgomery: tudo bem então meu rapaz, como posso fazer para você acreditar em mim?");
	                System.out.println("Ethan: me fale o que você está fazendo nesse lugar sozinho?");
	                
	            } else {
	                System.out.println("Opção inválida. Por favor, escolha entre a opção [1] ou [2]:");
	            }
			
			} while (escolha != 1 && escolha != 2 );
			
			
			System.out.println("Magnus Montgomery: Estou investigando essa organização chamada \"O olho secreto\", sou um investigador e estou inestigando essa organização já faz algum tempo");
			System.out.println("Ethan: tudo bem irei abaixar minha arma vou acreditar em você, me chamo Ethan estou envestigando a organização para descobrir que foi os responsaveis pela morte dos meus pais");
			System.out.println("Ethan: eles faziam parte da organização e a unica pista que eu tenho é uma mensagem com  nome \"AURORA\" que eu encontrei, por isso estou investigando esse local.");
			System.out.println("Magnus Montgomery: Já que você está investigando a organização posso te ajudar Ethan, quem sabe a gente possa encontrar os responsaveis pela morte de seus pais");
			System.out.println("Ethan: Aceita a ajuda de Magnus para continuar investigando o local e encontrar quem foi os responsaveis pela morte de seus pais");
			System.out.println("Os dois caminham pelo corredores e encontra um sala, dentro dessa sala eles encontrar alguns quadros, documentos e algumas fotos");
			System.out.println("Ethan percebe que em uma das fotos havia a foto de seus pais, então ele se lembra das risadas da sua mãe a voz do seu pai conversando com ele");
			System.out.println("Magnus: você está bem Ethan...");
			System.out.println("Ethan: Lembrei do meus pais sinto falta deles, mas não posso me deixar se distrair");
			System.out.println("Ethan: vamos continuar investigando talvez a gente encontre alguma informação que possa nos ajudar");
			System.out.println("Ethan: caminha até uma gaveta e abre ela, nela ele encontra varios papeis e documentos dentre desses documentos, Ethan encontra uma mensagem cheia de numeros mas está dificil para decifrar ");
			
			
//			Enigma 3: A Mensagem Oculta
			
			
			

		}

	
//	  Função responsável por iniciar o QUARTO capitúlo.
	 
	static void Alianca() {
		System.out.println("\nALIANDO-SE A ALGUÉM IMPROVAVEL:");
	}

	
//	  Função responsável por iniciar o QUINTO capitúlo.
	 
	static void EncontrarAurora() {
		System.out.println("\nBUSCANDO A AURORA: ");
	}

	
//	  Função responsável por iniciar o SEXTO capitúlo.
	 
	static void Confrontar() {
		System.out.println("\nO CONFRONTO FINAL - TERÁ OS 3 FINAIS: ");
	}
	// #endregion

	
//	  Função responsável por iniciar o jogo.
	 
	static void Jogar() throws Exception {
		// Colocar um letreiro maior (pegar no google) para aparecer no console.
		System.out.println("SEJA BEM VINDO A OPERAÇÃO AURORA!");

		Imprimir("Preparado (a) para uma aventura nunca antes vivida? Aperte os cintos e vamos lá!",
				TimeUnit.MILLISECONDS, tempo_dialogo);

		
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