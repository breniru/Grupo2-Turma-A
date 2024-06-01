package projetoIntegrador;

import java.util.Random;
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
		System.out.println(
		            "██████╗ ███████╗███████╗██╗   ██╗███████╗███╗   ██╗██████╗  █████╗ ███╗   ██╗██████╗  ██████╗ \n" +
		            "██╔══██╗██╔════╝██╔════╝██║   ██║██╔════╝████╗  ██║██╔══██╗██╔══██╗████╗  ██║██╔══██╗██╔═══██╗\n" +
		            "██║  ██║█████╗  ███████╗██║   ██║█████╗  ██╔██╗ ██║██║  ██║███████║██╔██╗ ██║██║  ██║██║   ██║\n" +
		            "██║  ██║██╔══╝  ╚════██║╚██╗ ██╔╝██╔══╝  ██║╚██╗██║██║  ██║██╔══██║██║╚██╗██║██║  ██║██║   ██║\n" +
		            "██████╔╝███████╗███████║ ╚████╔╝ ███████╗██║ ╚████║██████╔╝██║  ██║██║ ╚████║██████╔╝╚██████╔╝\n" +
		            "╚═════╝ ╚══════╝╚══════╝  ╚═══╝  ╚══════╝╚═╝  ╚═══╝╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═══╝╚═════╝  ╚═════╝ \n" +
		            " ██████╗      ██████╗ ██╗     ██╗  ██╗ ██████╗     ███████╗███████╗ ██████╗██████╗ ███████╗████████╗ ██████╗  \n" +
		            "██╔═══██╗    ██╔═══██╗██║     ██║  ██║██╔═══██╗    ██╔════╝██╔════╝██╔════╝██╔══██╗██╔════╝╚══██╔══╝██╔═══██╗ \n" +
		            "██║   ██║    ██║   ██║██║     ███████║██║   ██║    ███████╗█████╗  ██║     ██████╔╝█████╗     ██║   ██║   ██║ \n" +
		            "██║   ██║    ██║   ██║██║     ██╔══██║██║   ██║    ╚════██║██╔══╝  ██║     ██╔══██╗██╔══╝     ██║   ██║   ██║ \n" +
		            "╚██████╔╝    ╚██████╔╝███████╗██║  ██║╚██████╔╝    ███████║███████╗╚██████╗██║  ██║███████╗   ██║   ╚██████╔╝ \n" +
		            " ╚═════╝      ╚═════╝ ╚══════╝╚═╝  ╚═╝ ╚═════╝     ╚══════╝╚══════╝ ╚═════╝╚═╝  ╚═╝╚══════╝   ╚═╝    ╚═════╝    "
		        );
		
		System.out.println();
		System.out.println("Já verifiquei quase todos os documento parece que não tem nada nesse lugar. Esse parece ser o ultimo documento, parece ter algo escrito nele.\n");
		
		String documento;

        do {
            System.out.println("Você encontrou um documento. Deseja ler? (Sim/Nao)");
            documento = input.next();

            if (documento.equalsIgnoreCase("Sim")) {
                System.out.println("Você resolveu ler o documento!!\n");
            } else if (documento.equalsIgnoreCase("Nao")) {
                while (!documento.equalsIgnoreCase("Sim")) {
                    System.out.println("Você escolheu não ler o documento. Deseja reconsiderar? (Sim/Nao)");
                    documento = input.next();
                }
                System.out.println("Você resolveu ler o documento.\n");
            } else {
                System.out.println("Resposta inválida. Por favor, digite 'Sim' ou 'Nao'.\n");
            }
        } while (!documento.equalsIgnoreCase("Sim"));

		
        System.out.println("No documento estava escrito algumas informações sobre seus pais e uma organizaçào secreta que pertencia a eles conhecida como \"O Olho Secreto\".\n");
	    System.out.println("Uma organização secreta obscura especializada em segurança nacional e em inteligência liderada pelo seus pais que aparentemente,foram vítimas de uma traição dentro da própria organização.\n");
		System.out.println("A revelaçào acaba sendo desvastadora para Ethan, o que acaba fazendo com que  ele ficasse muito confuso e devastado com tudo que ele tinha lido no documento.Então Ethan se vê diante de um dilema cruel.\n");
		System.out.println("Será que realmente Devo Seguir em frente com minha vida e tentar esquecer tudo isso ou devo continuar procurando a verdade sobre a morte do meus pais e sobre essa organização chamada O olho Secreto.\n");
		System.out.println();
		
		int caminho;
		do {
			System.out.println("1 - Seguir em frente com sua vida e ignorar tudo que tenha lido\n");
            System.out.println("2 - Embarcar em uma jornada perigosa para desvendar a verdade sobre seus pais e a organização obscura à qual eles pertenciam.");
            
            caminho = input.nextInt();
            if (caminho == 1) {
                System.out.println("Você decidiu seguir em frente com sua vida e ignorar tudo que você leu. Mas será que essa é realmente um boa descisão!!\n");
            } else if (caminho == 2) {
                System.out.println();
            	System.out.println("Você escolheu embarcar em uma jornada perigosa em busca da verdade sobre seus pais e a organização obscura.\n");
                System.out.println("Sua sede de justiça e a busca por respostas o impulsionam a seguir em frente. você decide infiltrar-se no Olho Secreto e desvendar seus segredos e descobrir quem foi o responsável pela morte de seus pais.\n");
        		System.out.println("A missão vai ser árdua e repleta de perigos, mas Ethan está determinado a fazer o que for preciso para obter justiça e honrar a memória de seus pais.\n");
            } else {
                System.out.println("Opção inválida. Por favor, escolha apenas [1] ou [2]:");
            }
    
            
		} while (caminho != 2);
	 
		System.out.println("Preciso continuar não posso desistir agora, preciso encontrar alguns equipamentos se eu quiser me enfiltrar na organização, lembro de ter passado por uma loja enquanto interrogava alguns informamantes.\n");
		System.out.println("Aquele local era obscuro, é cheio de criminosos,bandidos,guangues preciso tomar cuidado, lembro que esse local ficava escondido em Sin City.\n");
		System.out.println("Finalmente cheguei. Esse lugar é sujo, as pessoas não param de encarar e as paredes estào cheias de rachaduras, se eu me lembro a loja está proxima.\n");
		System.out.println("Você continua caminhando até chegar na loja, você entra na loja e encontra um senhor barbudo e careca, o vendedor pegunta para você.\n");
		System.out.println("???:Bem Vindo rapaz. O que você procura?\n");
		
		int escolha;
		do {
			System.out.println("1 - Responder ao vendendor que está procurando equipamentos e roupas");
            System.out.println("2 - Perguntar o nome do vendedor");
            
            escolha = input.nextInt();
            input.nextLine();
            
            if (escolha == 1) {
                System.out.println("Estou procurando alguns equipamentos e roupas, preciso ir em uma missão.");
            } else if (escolha == 2) {
                System.out.println("Ethan: Você olha para o vendedor e pergunta como ele se chamava.");
                System.out.println("???: O vendendor olha para o seu rosto e responde, vejo que você não é desse lugar.");
                System.out.println("Ethan: como você sabe dessa informação?");
                System.out.println("???: Você não parece ter a aparência de um criminoso.");
                System.out.println("Ethan: Eu realmente não faço parte desse lugar obscuro e sujo, só estou de passagem.");
                System.out.println("???: Hahahaha!. Bom não tenho interesse em saber quais são seus motivos para você estar visitando esse lugar.");
                System.out.println("???: o pessoal por aqui me chama de Victor.");
                System.out.println("Ethan: estou procurando alguns equipamentos e roupas victor, preciso desses equipamentos para uma missão.");
                
            } else {
                System.out.println("Opção inválida. Por favor, escolha entre a opção [1] ou [2]:");
            }
		
		} while (escolha != 1 && escolha != 2 );
		
		System.out.println("você está na loja certa tenho alguma roupas e equipamentos do que você precisa.\n");
		System.out.println("Ethan: preciso de um traje apropriado, uma mascara, uma identidade falsa e uma arma.\n");
		System.out.println("Vou providenciar para você espere um pouco, aqui está tudo o que você pediu era isso que você precisava?\n");
		System.out.println("Ethan: sim está tudo certo, pode ficar com o troco.\n");
		System.out.println("Tome cuidado e vê se não morre em sua missão, afinal me preocupo com meus clientes.\n");
		System.out.println("Ethan: você se preocupa é com o dinheiro, mas espero que eu não tenha que voltar para esse lugar denovo.\n");
		System.out.println("Hahahaha, tome cuidado");
		System.out.println("Agora já posso ir até o Olho Secreto, Espero descobrir toda a verdade.\n");

		
//		Enigma 2: O Código Secreto:
		
		System.out.println("Você chega até a base do olho secreto e consegue se infiltrar na base sem ser visto pelos guardas.\n");
		System.out.println("Ao se infiltrar na base você se depara com um computador protegido por um código complexo.\n");
		System.out.println("O acesso a porta está bloqueado e tudo depende da decifração do código, que parece ser um criptograma elaborado.\n");
		

        String respostaCorreta = "A"; // a resposta correta letra A

        while (true) {
            System.out.println("Qual é o resultado de 2^3 * 2^2?");
            System.out.println("A) 2^5");
            System.out.println("B) 2^6");
            System.out.println("C) 2^4");

            String respostaUsuario = input.nextLine();

            if (respostaUsuario.equals(respostaCorreta)) {
                System.out.println("Você conseguiu destravar a porta!\n");
                break;
            } else {
                System.out.println("Codigo Errado, acesso negado!!");
            }
        }
		
	}
	

	//	Função responsável por iniciar o TERCEIRO capitúlo.
	 

		static void BuscarVerdade() throws Exception {
			System.out.println("Capitulo 3:\n");
			System.out.println();
			System.out.println(
			            "███████╗███╗   ███╗    ██████╗ ██╗   ██╗███████╗ ██████╗ █████╗     ██████╗  █████╗     ██╗   ██╗███████╗██████╗ ██████╗  █████╗ ██████╗ ███████╗\n" +
			            "██╔════╝████╗ ████║    ██╔══██╗██║   ██║██╔════╝██╔════╝██╔══██╗    ██╔══██╗██╔══██╗    ██║   ██║██╔════╝██╔══██╗██╔══██╗██╔══██╗██╔══██╗██╔════╝\n" +
			            "█████╗  ██╔████╔██║    ██████╔╝██║   ██║███████╗██║     ███████║    ██║  ██║███████║    ██║   ██║█████╗  ██████╔╝██║  ██║███████║██║  ██║█████╗  \n" +
			            "██╔══╝  ██║╚██╔╝██║    ██╔══██╗██║   ██║╚════██║██║     ██╔══██║    ██║  ██║██╔══██║    ╚██╗ ██╔╝██╔══╝  ██╔══██╗██║  ██║██╔══██║██║  ██║██╔══╝  \n" +
			            "███████╗██║ ╚═╝ ██║    ██████╔╝╚██████╔╝███████║╚██████╗██║  ██║    ██████╔╝██║  ██║     ╚████╔╝ ███████╗██║  ██║██████╔╝██║  ██║██████╔╝███████╗\n" +
			            "╚══════╝╚═╝     ╚═╝    ╚═════╝  ╚═════╝ ╚══════╝ ╚═════╝╚═╝  ╚═╝    ╚═════╝ ╚═╝  ╚═╝      ╚═══╝  ╚══════╝╚═╝  ╚═╝╚═════╝ ╚═╝  ╚═╝╚═════╝ ╚══════╝");
			        
			                                                                                                                       
			
			System.out.println();
			System.out.println("Através de sua inteligência e perspicácia, Ethan consegue se infiltra dentro do Olho Secreto.\n");
			System.out.println("Ethan começa a caminhar pelos corredores e logo vê dois guardas na sua frente parados conversando.\n");
			System.out.println("Ethan precisava dar um jeito de passar pelos dois guardas para que ele podesse continuar, então ele resolve enfrentar os dois guardas.\n");
			System.out.println("Ethan pega sua arma e resolve atirar nos dois guardas, ele estava um pouco nevorso e sua mira não estava muito boa.\n");
			
//			Conta para acerta os guardas

		String[] opcoes = {"A: 196", "B: 729", "C: 512"}; // Resposta Correta B
			int vidas = 3;
	        boolean guardasVivos = true;
			Random rand = new Random();

	        while (guardasVivos && vidas > 0) {
	            System.out.println("Resolva a equação: (3^2)^2 = ?");
	            
	            // Embaralhar as opções
	            for (int i = opcoes.length - 1; i > 0; i--) {
	                int j = rand.nextInt(i + 1);
	                String temp = opcoes[i];
	                opcoes[i] = opcoes[j];
	                opcoes[j] = temp;
	            }
	            
	            for (String opcao : opcoes) {
	                System.out.print(opcao + " ");
	            }
	            System.out.println();
	            
	            String alternativa = input.next();

	            if (alternativa.equalsIgnoreCase("B")) {
	                System.out.println("Você acertou! Você matou os dois guardas com dois tiros.\n");
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
	        
			System.out.println("Finalmente consegui matar os dois guardas, nào posso parar agora preciso continuar seguindo em frente.\n");
			System.out.println("Ethan caminha pelos corredores e encontra uma pessoa na sua frente, esse inviduo parecia diferente.\n");
			System.out.println("O Individuo não se parecia com nenhum guarda que Ethan havia visto, ele usava roupas diferentes, o individuo olha para ethan e logo se aproxima.\n");
			System.out.println("Ethan aponta sua arma e pergunta para o individuo misterioso quem era ele, ele olha para ethan e se apresenta como Magnus Montgomery.\n");
			System.out.println("Magnus Montgomery: Se acalme meu jovem não precisa apontar essa arma para mim, não irei te machucar, me chamo Magnus Montgomery.\n");
			System.out.println("Ethan: O que você faz aqui dentro, como posso saber se você não é nenhum inimigo ou algúem que faz parte do olho secreto.\n");
			System.out.println("Magnus Montgomery: Não precisa se preocupar seu eu fosse algum guarda eu já teria te atacado, poderia abaixar a sua arma\n");
			
			
			int escolha;
			do {
				System.out.println("1 - Abaixar a arma e perguntar para Magnus o que ele estava fazendo naquele lugar");
	            System.out.println("2 - Continuar com a arma apontada e ameaçar Magnus a falar o que ele estava fazendo naquele lugar ");
	        
	            escolha = input.nextInt();
	            input.nextLine();
	            
	            if (escolha == 1) {
	                System.out.println("Etha: o que você está fazendo nesse lugar, porque você está aqui sozinho.");
	            } else if (escolha == 2) {
	                System.out.println("Ethan: \"NÃO IREI ABAIXAR MINHA ARMA\", COMO POSSO CONFIAR EM ALGUÉM DENTRO DESSE LUGAR.\n");
	                System.out.println("Magnus Montgomery: tudo bem então meu rapaz, como posso fazer para você acreditar em mim?");
	                System.out.println("Ethan: me fale o que você está fazendo nesse lugar sozinho?");
	                
	            } else {
	                System.out.println("Opção inválida. Por favor, escolha entre a opção [1] ou [2]:");
	            }
			
			} while (escolha != 1 && escolha != 2 );
			
			
			System.out.println("Magnus Montgomery: Estou investigando essa organização chamada 'O olho secreto'. Sou um investigador, estou investigando essa organização já faz algum tempo.");
	        System.out.println("Ethan: Tudo bem, irei abaixar minha arma. Vou acreditar em você. Me chamo Ethan, estou investigando a organização para descobrir quem foi responsável pela morte dos meus pais.");
	        System.out.println("Ethan: Eles faziam parte da organização, e a única pista que tenho é uma mensagem com o nome 'AURORA' que encontrei. Por isso, estou investigando este local.");
	        System.out.println("Magnus Montgomery: Já que você está investigando a organização, posso te ajudar, Ethan. Quem sabe a gente possa encontrar os responsáveis pela morte de seus pais.");
	        System.out.println("Ethan: Aceita a ajuda de Magnus para continuar investigando o local e encontrar quem foi responsável pela morte de seus pais?");
	        System.out.println("Os dois caminham pelos corredores e encontram uma sala. Dentro dessa sala, eles encontram alguns quadros, documentos e algumas fotos.");
	        System.out.println("Ethan percebe que em uma das fotos há a imagem de seus pais. Então, ele se lembra das risadas de sua mãe e da voz de seu pai conversando com ele.");
	        System.out.println("Magnus: Você está bem, Ethan...\n");
	        System.out.println("Ethan: Lembrei dos meus pais. Sinto falta deles, mas não posso me deixar distrair.\n");
	        System.out.println("Ethan: Vamos continuar investigando. Talvez a gente encontre alguma informação que possa nos ajudar.\n");
	        System.out.println("Ethan: Encontrei uma gaveta. Dentro dela está cheio de papéis e documentos. Espera acho que encontrei algo entre os documentos, parece ser um tipo de mensagem está cheia de números, mas está difícil de decifrar.\n");
			

//			Enigma 3: A Mensagem Oculta
			
	        final String respostaCorreta = "A"; // Resposta correta Letra A
	        boolean correto = false;

	        do {
	            System.out.println("Considere o monômio 2x e o polinômio 3x^2 + 4x - 5.\n");
	            System.out.println("Qual é o resultado da multiplicação desse monômio pelo polinômio?");
	            System.out.println("A) 6x^3 + 8x^2 - 10x");
	            System.out.println("B) 6x^3 + 8x");
	            System.out.println("C) 5x^3 + 6x^2 - 8x");
	            System.out.println("D) 6x^2 + 8x - 5");
	            System.out.println();
	            System.out.print("Digite a letra da resposta correta: ");
	            
	            String respostaUsuario = input.nextLine();

	            if (respostaUsuario.equalsIgnoreCase(respostaCorreta)) {
	                System.out.println("Você conseguiu decifrar o código!\n");
	                correto = true;
	            } else {
	                System.out.println("Tente novamente.");
	            }
	        } while (!correto);

			
	        	System.out.println("Magnus Montgomery: Você conseguiu decifrar o codigo Ethan. O que está escrito no documento.");
	        	System.out.println("Ethan: A mensagem parece ser uma citação de um poema, mas inda não sei sua ligaçào com o nome \"AURORA\", o poema está escrito com as seguintes palavras:");
	        	System.out.println("Em uma terra distante, de passado velado,\n" +
	                    "Jaz uma propriedade, outrora iluminada.\n" +
	                    "Erguida em segredo, nos confins do oculto,\n" +
	                    "Onde mistérios e sombras teciam o seu vulto.\n\n" +

	                    "Ali repousava, oculta aos olhos comuns,\n" +
	                    "A propriedade do Olho Secreto, guardiã dos rumos.\n" +
	                    "Um casarão antigo, em ruínas envolto,\n" +
	                    "Onde segredos se ocultavam em cada recanto.\n\n" +

	                    "Nos corredores, ecoavam histórias sombrias,\n" +
	                    "De tempos idos, de uma era esquecida.\n" +
	                    "Nas paredes, retratos de rostos desconhecidos,\n" +
	                    "Testemunhas mudas de mistérios escondidos.\n\n" +

	                    "Entre os escombros, sussurros do passado ecoam,\n" +
	                    "Lembranças de uma época em que o medo voava.\n" +
	                    "A propriedade, outrora poderosa e temida,\n" +
	                    "Agora jaz em silêncio, em sua própria partida.\n\n" +

	                    "Em uma terra distante, onde a luz mal alcança,\n" +
	                    "Ergue-se a propriedade em silêncio e esperança.\n" +
	                    "Nos confins do mundo, em um recanto esquecido,\n" +
	                    "Lá repousa o segredo, em um lugar escondido.\n\n" +

	                    "Entre vales profundos e montanhas isoladas,\n" +
	                    "Nas margens de um rio onde a névoa é prateada,\n" +
	                    "Encontra-se a morada, em seu local isolado,\n" +
	                    "Onde o Olho Secreto foi outrora aclamado.\n\n" +

	                    "Mas além das colinas e além do horizonte,\n" +
	                    "Existe uma pista, um sussurro que confronte.\n" +
	                    "Através de uma foto, revela-se o mistério,\n" +
	                    "A localização da propriedade, um enigma sério.\n\n" +

	                    "Pois quem souber decifrar a imagem ancestral,\n" +
	                    "Encontrará a propriedade, além do temporal.\n" +
	                    "Em uma terra esquecida, em um lugar remoto,\n" +
	                    "Onde o Olho Secreto repousa, em seu sagrado loto.\n");
	        	
	        	System.out.println("Magnus Montgomery: Lembro de ter visto a foto de uma casa em cima da mesa, vou pegar para você!!");
	        	System.out.println("Magnus Montgomery: está vendo parece ser a propriedade que o poema cita, talvez ela tenha relação com a organização");
	        	System.out.println("Ethan: Sim, parerece que está propriedade está ligada a organização, mas não consigo identificar a localização dela");
	        	System.out.println("Magnus Montgomery:HMMMMMMM.....");
	        	System.out.println("Magnus Montgomery:Lembrei de algo, quando estava investigando a organização lembro de ter ouvido algo sobre uma propriedade abandonada no sul de Sin City");
	        	System.out.println("Magnus Montgomery: O que você acha da gente dá uma olhada nessa propriedade?\n");
	        	
	        	
	        	int decisao;
	    		do {
	    			System.out.println("1 - Ir verificar propriedade que o Magnus mencionou.");
	                System.out.println("2 - Verificar se tem alguma outra pista na sala.");
	                
	                decisao = input.nextInt();
	                input.nextLine();
	                
	                if (decisao == 1) {
	                    
	                	System.out.println("Vamos, talvez a gente econtre alguma coisa nessa propriedade .");
	                	System.out.println();
	                } else if (decisao == 2) {
	                    System.out.println("Ethan: Acho que a gente deveria dar mais uma olhada nessa sala, talvez tenha mais algum coisa por aqui.");
	                    System.out.println("Magnus Montgomery: tudo bem, vou dar mais olhada por aqui, por que você não verifica aqueles quadros ali na parede.");
	                    System.out.println("Magnus Montgomery: na verdade também não encontrei nada, aacho que a gente não deveria peder mais tempo vamos até essa propriedade");
	                    System.out.println("tudo bem vamos!!");
	                    System.out.println();
	                   
	                } else {
	                    System.out.println("Opção inválida. Por favor, escolha entre a opção [1] ou [2]:");
	                }
	    		
	    		} while (decisao != 1 && decisao != 2 );
	        	
	        	
		}

	
//	  Função responsável por iniciar o QUARTO capitúlo.
	 
	static void Alianca() throws Exception {
		
		System.out.println("Capitulo 4:/n");
	    System.out.println(
		            "██╗   ██╗███╗   ███╗     █████╗ ██╗     ██╗ █████╗ ██████╗  ██████╗     ██╗███╗   ██╗███████╗███████╗██████╗ ███████╗██████╗  █████╗ ██████╗  ██████╗ \n" +
		            "██║   ██║████╗ ████║    ██╔══██╗██║     ██║██╔══██╗██╔══██╗██╔═══██╗    ██║████╗  ██║██╔════╝██╔════╝██╔══██╗██╔════╝██╔══██╗██╔══██╗██╔══██╗██╔═══██╗\n" +
		            "██║   ██║██╔████╔██║    ███████║██║     ██║███████║██║  ██║██║   ██║    ██║██╔██╗ ██║█████╗  ███████╗██████╔╝█████╗  ██████╔╝███████║██║  ██║██║   ██║\n" +
		            "██║   ██║██║╚██╔╝██║    ██╔══██║██║     ██║██╔══██║██║  ██║██║   ██║    ██║██║╚██╗██║██╔══╝  ╚════██║██╔═══╝ ██╔══╝  ██╔══██╗██╔══██║██║  ██║██║   ██║\n" +
		            "╚██████╔╝██║ ╚═╝ ██║    ██║  ██║███████╗██║██║  ██║██████╔╝╚██████╔╝    ██║██║ ╚████║███████╗███████║██║     ███████╗██║  ██║██║  ██║██████╔╝╚██████╔╝\n" +
		            " ╚═════╝ ╚═╝     ╚═╝    ╚═╝  ╚═╝╚══════╝╚═╝╚═╝  ╚═╝╚═════╝  ╚═════╝     ╚═╝╚═╝  ╚═══╝╚══════╝╚══════╝╚═╝     ╚══════╝╚═╝  ╚═╝╚═╝  ╚═╝╚═════╝  ╚═════╝ \n" );
		       
	     System.out.println("Algumas horas depois....\n");
		 System.out.println("Magnus Montgomery: Chegamos a propriedade fica logo ali na frente, acho melhor a gente ir caminhando.");
		 System.out.println("Ethan: Tem certeza que essa propriedade pertencia a organização, ela parece abandonada.");
		 System.out.println("Magnus Montgomery: Ela pode aparentar abandonada por fora, mas ainda pode ter alguma coisa nela que nos ajude a descobrir algo sobre a oorganização");
		 System.out.println("Ethan: Esse portão parece enferrujado, parece não ter nenhum tipo de alarme ou cadeado no portão,vou tentar abrir o portão");
		 System.out.println("Magnus Montgomery: Tome cuidado Ethan pode ser uma armadilha!!");
		 
		 int verificar;
	        String resposta;

	        do {
	            System.out.println("1 - Abrir o portão e entrar na propriedade abandonada\n");
	            System.out.println("2 - Verificar se possui alguma armadilha.");
	            
	            verificar = input.nextInt();
	            input.nextLine(); 
	            
	            if (verificar == 1) {
	                System.out.println("Parece que não tem nenhum tipo de armadilha, acho que ela está realmente abandonada.");
	                System.out.println();
	            } else if (verificar == 2) {
	                System.out.println("Ethan: Acho melhor a gente verificar se não possui algum tipo de armadilha.");
	                System.out.println("Magnus Montgomery: Vou dar uma olhada nos fundos da casa e você olha em volta dela.");
	                System.out.println("Ethan: Tudo bem, a gente se encontra aqui de novo quando acabarmos de verificar.");
	                System.out.println("Você caminha em volta da propriedade abandonada mas não encontra nada.");
	                System.out.println("Então você resolve voltar até a entrada da casa e aguardar.");
	                System.out.println("Magnus Montgomery: Ethan, verifiquei nos fundos e não encontrei nada.");
	                 
	            } else {
	                System.out.println("Opção inválida. Por favor, escolha entre a opção [1] ou [2]:");
	            }

	        
	        } while (verificar != 1 && verificar != 2);

	        System.out.println("Magnus Montgomery: Vamos entrar, mas fique atento mesmo assim, não sabemos o que podemos encontrar");
	        System.out.println("Ethan: Parece que a porta está aberta também, acho que não tem ninguém.");
	        System.out.println("Ethan: vamos ver se encontramos alguma pista.Talvez tenha algo que nos ajude");
	        System.out.println("Magnus Montgomery: Por onde você gostaria de começar a procurar?\n");
	        
	        
	        int pista;
	        
	        do {
	            System.out.println("1 - Verficar a sala.");
	            System.out.println("2 - Verficar os quartos.");
	            System.out.println("3 - Verficar a biblioteca.");
	            
	            pista = input.nextInt();
	            input.nextLine();  
	            
	            if (pista == 1) {
	                System.out.println("Ethan: vamos verficar a sala.");
	                System.out.println("Magnus Montgomery: Boa ideia. A sala pode conter alguma pista sobre quem esteve aqui recentemente.");
	                System.out.println("Ethan: Vou checar perto da lareira, você pode dar uma olhada nos armários.  ");
	                System.out.println("Você procura perto da lareira mas não encontra nada!!");
	                System.out.println("Ethan: Você encontrou alguma coisa?");
	                System.out.println("Magnus Montgomery: Não econtrei nada também, o que você acha da gente verficar os outos comodos da casa?");
	                System.out.println();
	            } else if (pista == 2) {
	            	System.out.println("vamos verficar os quartos");
	                System.out.println("Magnus Montgomery: Boa escolha, os quartos podem ter itens pessoais ou documentos.");
	                System.out.println("Ethan: Eu vou começar pelo quarto principal, você pode ver o quarto de hóspedes.");
	                System.out.println("Magnus Montgomery: Combinado. Mantenha os olhos abertos para qualquer coisa fora do comum.");
	                System.out.println("Você verfica o quarto principal mas não encontra nada!!");
	                System.out.println("Magnus Montgomery: Parece que não tivemos sorte dessa vez, não encontramos nada");
	                System.out.println("Magnus Montgomery: O que você acha da gente ir verficar os outos comodos da casa?");
	                System.out.println();
	            } else if (pista == 3) {
	            	System.out.println("vamos verficar a biblioteca");
	                System.out.println("Magnus Montgomery: A biblioteca pode ter registros importantes ou diários");
	                System.out.println("Ethan: Vou olhar nas prateleiras do fundo, você pode ver a mesa de leitura.");
	                System.out.println("Magnus Montgomery: Sim, vou ver se encontro algum livro ou documento relevante.");
	                System.out.println("Ethan: Estranho esse livro parece ser diferente dos outros, vou dar uma olhada");
	                System.out.println("Ethan: maguns vem ver isso acho que encontrei algo");
	                System.out.println("Magnus Montgomery: parece ser algum tipo de trava com uma senha, você acha que consegue destravar descobrindo a senha?");
	                System.out.println();
	            } else {
	                System.out.println("Opção inválida. Por favor, escolha entre a opção [1], [2] ou [3]:");
	            }
	        
	        } while (pista!= 3);
	        	        

//	        Enigma 4: A Prova Final	        
	        
	        String[] opcoes = {"A: x = -1 ou x = -3", 
	                   "B: x = 1 ou x = 3", // resposta correta letra C
	                   "C: x = 2 ou x = -3",
	                   "D: x = -2 ou x = 3"};  
	        int vidas = 3;
			boolean tentativas = true;
			 Random embaralhar = new Random();

		        while (tentativas && vidas > 0) {
		            System.out.println("Resolva a equação do segundo grau 2x^2 - 8x + 6 = 0. Qual é o valor de x?");
		            
		            // Embaralhar as opções
		            for (int i = opcoes.length - 1; i > 0; i--) {
		                int j = embaralhar.nextInt(i + 1);
		                String temp = opcoes[i];
		                opcoes[i] = opcoes[j];
		                opcoes[j] = temp;
		            }
		            
		            for (String opcao : opcoes) {
		            	System.out.println(opcao);;
		            }
		            System.out.println();
		            
		            String alternativa = input.next();

		            if (alternativa.equalsIgnoreCase("C")) {  
		                System.out.println("Acesso liberado! Sistema destravado.");
		                tentativas = false;
		            } else {
		                vidas--;
		                if (vidas == 2) {
		                    System.out.println("Código inválido! Número de tentativas restantes: 2.");
		                } else if (vidas == 1) {
		                    System.out.println("Código inválido! Número de tentativas restantes: 1.");
		                } else {
		                    System.out.println("Acesso bloqueado! Número de tentativas excedido.");
		                    Menu();
		                }
		            }
		        }

			}
	

	
//	  Função responsável por iniciar o QUINTO capitúlo.
	 
	static void EncontrarAurora() throws Exception {
		System.out.println("Capitulo 5: \n");
	    System.out.println(
		            "█████╗          ██╗ ██████╗ ██████╗ ███╗   ██╗ █████╗ ██████╗  █████╗     ██████╗  █████╗ ██████╗  █████╗     ███████╗███╗   ██╗ ██████╗ ██████╗ ███╗   ██╗████████╗██████╗  █████╗ ██████╗      █████╗ ██╗   ██╗██████╗  ██████╗ ██████╗  █████╗     ███████╗██╗███╗   ██╗ ██████╗██╗      █████╗ ██╗██████╗ \n" +
		            "██╔══██╗         ██║██╔═══██╗██╔══██╗████╗  ██║██╔══██╗██╔══██╗██╔══██╗    ██╔══██╗██╔══██╗██╔══██╗██╔══██╗    ██╔════╝████╗  ██║██╔════╝██╔═══██╗████╗  ██║╚══██╔══╝██╔══██╗██╔══██╗██╔══██╗    ██╔══██╗██║   ██║██╔══██╗██╔═══██╗██╔══██╗██╔══██╗    ██╔════╝██║████╗  ██║██╔════╝██║     ██╔══██╗██║██╔══██╗\n" +
		            "███████║         ██║██║   ██║██████╔╝██╔██╗ ██║███████║██║  ██║███████║    ██████╔╝███████║██████╔╝███████║    █████╗  ██╔██╗ ██║██║     ██║   ██║██╔██╗ ██║   ██║   ██████╔╝███████║██████╔╝    ███████║██║   ██║██████╔╝██║   ██║██████╔╝███████║    ███████╗██║██╔██╗ ██║██║     ██║     ███████║██║██████╔╝\n" +
		            "██╔══██║    ██   ██║██║   ██║██╔══██╗██║╚██╗██║██╔══██║██║  ██║██╔══██║    ██╔═══╝ ██╔══██║██╔══██╗██╔══██║    ██╔══╝  ██║╚██╗██║██║     ██║   ██║██║╚██╗██║   ██║   ██╔══██╗██╔══██║██╔══██╗    ██╔══██║██║   ██║██╔══██╗██║   ██║██╔══██╗██╔══██║    ╚════██║██║██║╚██╗██║██║     ██║     ██╔══██║██║██╔══██╗\n" +
		            "██║  ██║    ╚█████╔╝╚██████╔╝██║  ██║██║ ╚████║██║  ██║██████╔╝╚██████╔╝    ██║     ██║  ██║██║  ██║██║  ██║    ███████╗██║ ╚████║╚██████╗╚██████╔╝██║ ╚████║   ██║   ██║  ██║██║  ██║██║  ██║    ██║  ██║╚██████╔╝██║  ██║╚██████╔╝██║  ██║██║  ██║    ███████║██║██║ ╚████║╚██████╗███████╗██║  ██║██║██║  ██║\n" +
		            "╚═╝  ╚═╝     ╚════╝  ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═══╝╚═╝  ╚═╝╚═════╝  ╚═════╝     ╚═╝     ╚═╝  ╚═╝╚═╝  ╚═╝╚═╝  ╚═╝    ╚══════╝╚═╝  ╚═══╝ ╚═════╝ ╚═════╝ ╚═╝  ╚═══╝   ╚═╝   ╚═╝  ╚═╝╚═╝  ╚═╝╚═╝  ╚═╝    ╚═╝  ╚═╝ ╚═════╝ ╚═╝  ╚═╝ ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝    ╚══════╝╚═╝╚═╝  ╚═══╝ ╚═════╝╚══════╝╚═╝  ╚═╝╚═╝╚═╝  ╚═╝\n");
		        
		
	    System.out.println("Pratileira: CRRRRREEEEAAAKKKK... THUD!");
        System.out.println("Magnus Montgomery: Parece que encontramos uma passagem secreta.");
        System.out.println("Magnus Montgomery: Devemos descer e ver onde leva?");
        System.out.println("Ethan: Com certeza. Vamos descobrir o que estão escondendo aqui.");
        System.out.println("Magnus Montgomery: Fique atento. Não sabemos o que podemos encontrar lá embaixo.");
        System.out.println("Magnus Montgomery: Esse lugar parece realmente abandonado, parece que chegamos");
        System.out.println("Ethan: Olha para esse lugar parece que realmente eles estiveram por aqui.");
        System.out.println("Magnus Montgomery: Ethan!!, venha ver isso aqui.");
        System.out.println("Ethan: Não consigo acreditar no que estou vendo, precisamos dar um jeito de impedir isso");
        System.out.println("Magnus Montgomery: Realmente, precisamos dar um jeito de impedir esse plano deles");
        System.out.println("Magnus Montgomery: Não consigo acreditar que eles estavam planejando fazer algo desse tamanho, isso pode afetar a segurança de todos globalmente");
        System.out.println("Ethan: Espere!!,Acho que algo em baixo desses papeis, parece ser uma foto de uma mulher");
        System.out.println("Ethan: Atrás da foto está escrito algo parece ser um endereço e um nome, mas não consigo reconhecer nada do que está escrito parece estar escrito em outro idioma");
        System.out.println("Magnus Montgomery: Posso dar uma olhada nessa foto?");
        
        String foto;

        do {
            System.out.println("Mostrar a foto para o Magnus Montgomery? - (Sim)");
            foto = input.next();

            if (foto.equalsIgnoreCase("Sim")) {
                System.out.println("Você resolveu mostrar a foto para o Magnus Montgomery.\n");
            } else if (!foto.equalsIgnoreCase("Nao")) {
                System.out.println("Resposta inválida. Por favor, digite 'Sim'.\n");
            }
        } while (!foto.equalsIgnoreCase("Sim"));
        
        
        System.out.println("Magnus Montgomery: O nome que está escrito parece se chamar \"Aurora\" e esse endereço parece ser de um  templo budista.");
        System.out.println("Ethan: Não consigo acreditar que essa mulher seja a Aurora, precisamos ir verificar o mais rapido possivel.");
        System.out.println("Magnus Montgomery: Esse templo fica um pouco longe de Sin City, o que você acha da gente ir agora verificar");
        System.out.println("Ethan: vamos não podemos ficar parados.");
        System.out.println("Algumas horas depois....");
        System.out.println("Magnus Montgomery: estamos quase chegando no templo, falta muito pouco só precisamos subir essa montanha.");
        System.out.println("Ethan: Vamos!!");
        System.out.println("Ethan: Estamos quase lá, não podemos desistir agora.");
        System.out.println("Magnus Montgomery: Espere um pouco, acho que estamos sendo seguidos.");
        System.out.println("Agentes do Olho Secreto: Parados ai você dois não se mexam!!!");
        System.out.println("Agentes do Olho Secreto: Não podemos deixar que vocês continuem, a jornada de vocês termina agora.");
        System.out.println("Magnus Montgomery: Ethan precisamos enfrentalos, não podemos deixar que eles nós peguem.");
        
        
        int confronto;
		do {
			System.out.println("1 - Pegar sua arma e atirar nos agente do Olho Secreto.");
            System.out.println("2 - Correr para as arvores para se proteger.");
            
            confronto = input.nextInt();
            input.nextLine();
            
            if (confronto == 1) {
                
            	System.out.println("Você pega sua arma para atirar, mas acaba errando os tiros!!");
            	System.out.println("Você resolve tentar atirar mais uma vez nos agentes.");
            	System.out.println();
            } else if (confronto == 2) {
                System.out.println("Você corre para trás de um arvore para se proteger  e saca sua arma para atirar nos agentes.");
                System.out.println("Os agentes começam a se aproximar de você.");
                System.out.println("Você se prepara para entrar em confronto com os agentes.");
                System.out.println();
               
            } else {
                System.out.println("Opção inválida. Por favor, escolha entre a opção [1] ou [2]:");
            }
		
		} while (confronto != 1 && confronto != 2 );
		
		
        
		String[] opcoes1 = {"A: x1 = 1, x2 = 6", "B: x1 = 2, x2 = 3", "C: x1 = -2, x2 = 3", "D: x1 = 3, x2 = -2"}; 
        int vidas1 = 3;
        boolean agentesVivos1 = true;
        Random embaralhar1 = new Random();
        
        while (agentesVivos1 && vidas1 > 0) {
            System.out.println("Resolva a equação de segundo grau: x^2 - 5x + 6 = 0");
            
            // Embaralhar as opções
            for (int i = opcoes1.length - 1; i > 0; i--) {
                int j = embaralhar1.nextInt(i + 1);
                String temp = opcoes1[i];
                opcoes1[i] = opcoes1[j];
                opcoes1[j] = temp;
            }
            
            for (String opcao : opcoes1) {
                System.out.print(opcao + " ");
            }
            System.out.println();
            
            String alternativa = input.next();

            if (alternativa.equalsIgnoreCase("B")) {
                System.out.println("Você acertou! Você matou os dois guardas com dois tiros.\n");
                agentesVivos1 = false;
            } else {
                vidas1--;
                if (vidas1 == 2) {
                    System.out.println("Você errou! Você foi atingido pelos guardas de raspão e perdeu uma vida.");
                } else if (vidas1 == 1) {
                    System.out.println("Você errou novamente! Você foi atingido com um tiro na perna e perdeu outra vida.");
                } else {
                    System.out.println("Você errou pela terceira vez! Você foi acertado pelos guardas na cabeça e perdeu todas as vidas.\n");
                    Menu();
                }
            }
        }
	        
        System.out.println("Magnus Montgomery: Boa Ethan!!. mas ainda resta dois agentes precisamos acabar com eles.");
        
        
        String[] opcoes2 = {"A: x1 = 2, x2 = -8", "B: x1 = 2, x2 = -4", "C: x1 = 4, x2 = -2", "D: x1 = -4, x2 = 2"}; 
        int vidas2 = 3;
        boolean agentesVivos2 = true;
        Random embaralhar2 = new Random();
      
        while (agentesVivos2 && vidas2 > 0) {
            System.out.println("Resolva a equação de segundo grau: x^2 + 2x - 8 = 0");
            
            // Embaralhar os números das opções
            for (int i = 0; i < opcoes2.length; i++) {
                String[] numeros = opcoes2[i].split(": ")[1].split(", ");
                int j = embaralhar2.nextInt(numeros.length);
                String temp = numeros[0];
                numeros[0] = numeros[j];
                numeros[j] = temp;
                opcoes2[i] = opcoes2[i].split(": ")[0] + ": " + numeros[0] + ", " + numeros[1];
            }
            
            for (String opcao : opcoes2) {
                System.out.print(opcao + " ");
            }
            System.out.println();
            
            String alternativa = input.next();

            if (alternativa.equalsIgnoreCase("B")) {
                System.out.println("Você acertou! Você matou os dois guardas com dois tiros.\n");
                agentesVivos2 = false;
            } else {
                vidas2--;
                if (vidas2 == 2) {
                    System.out.println("Você errou! Você foi atingido pelos guardas de raspão e perdeu uma vida.");
                } else if (vidas2 == 1) {
                    System.out.println("Você errou novamente! Você foi atingido com um tiro na perna e perdeu outra vida.");
                } else {
                    System.out.println("Você errou pela terceira vez! Você foi acertado pelos guardas na cabeça e perdeu todas as vidas.\n");
                    Menu();
                }
            }
        }
        
        System.out.println("Magnus Montgomery: finalmente conseguimos, derrotamos todos eles,acho que podemos continuar estamos quase chegando.\n");
        System.out.println("Exaustos, mas vitoriosos, Magnus e você finalmente chegam ao templo budista. O santuário, um refúgio de paz, se ergue majestoso entre as montanhas diante seus olhos.\n");
        System.out.println("Monge Ancião: Bem-vindos, viajantes. No que posso ajudalos?\n");
        
       
        int responder;

        do {
        	System.out.println("1 - Responder ao monge ancião que está procurando a mulher da foto\n");
        	System.out.println("Ethan: Estou procurando a mulher da foto ela se chama AURORA");
            while (!input.hasNextInt()) {
                System.out.println("Opção inválida. Por favor, digite um número.");
                input.next(); 
            }
            responder = input.nextInt();

            if (responder != 1) {
                System.out.println("Opção inválida. Digite 1 para responder ao monge ancião.");
            }
        } while (responder != 1);
        
        
        System.out.println("Monge Ancião: UHMMMMMMMMMM...");
        System.out.println("Agora lembrei tem uma mulher com esse nome aqui, vou apresentala a vocês, me siguam que irei mostrar o caminho.");
        System.out.println("Monge Ancião: Veja ela está sentada ali perto dos jardins, podem ir flar com ela.");
        System.out.println("Ethan: Aurora é você?");
        System.out.println("AURORA: Quem são vocês, como você sabem meu nome.");
        System.out.println("Ethan: me chamo Etahn e esse ao meu lado se chama Magnus Montgomery, estavamos procurando por você atrás de respostas.");
        System.out.println("Ethan: Você fazia parte do Olho Secreto e trabalhou junto com os meus pais que foram mortos");
        System.out.println("AURORA: Eu não sou mais aquela mulher. Eu encontrei a paz aqui, mas sei que preciso acertar minhas contas com o passado. Vocês merecem respostas.");
        System.out.println("AURORA: Tudo começou quando eu descobri os segredos do Olho Secreto. Mas acabei sendo traida por um membro de alto escalão da organização.");
        System.out.println("AURORA: Eles me forçaram a particpar da morte de seus pais, eu não queria ter feito aquilo mas fui obrigada não tive outra escolha. ");
        System.out.println("AURORA: Ameaçaram pessoa que eu conhecia e me ameaçaram se eu não matasse seus pais.");
        System.out.println("AURORA: Refugiei-me para este templo em busca de redenção, pelo meus atos.");
        System.out.println("AURORA: Me perdoe Ethan não tive outra escolha.");
      
        
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