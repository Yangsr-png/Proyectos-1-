package controller;

import java.util.Random;

import java.util.Scanner;
import java.util.stream.DoubleStream;

public class juegoMain2 {

	public static void main(String[] args) {
		final String RESET = "\033[0m";
		final String RED = "\033[31m";
		final String GREEN = "\033[32m";
		final String YELLOW = "\033[33m";
		final String BLUE = "\033[34m";

		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		String contrasena;
		int menu = 0;
		int numVueltaMenu = 0;
		int mc = 0;
		String dialogo = null;
		String boton;
		int favorabilidadGrupal = 50;
		String objetivo;
String Mc=null;
		System.out.println("Para inicar el programa necesita ingresar su contraseña");

		contrasena = sc.nextLine();
		do {
			for (int i = 0; i < 5; i++) {

				try {
					Thread.sleep(400);
					System.out.println(".");
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
				}
			}
			if (contrasena.equalsIgnoreCase("Jugones")) {
				System.out.println("La contraseña ingresada es correcta.");
			} else {
				System.out.println("La contraseña ingresada es incorrecta.");
				System.out.println("Ingrese su contraseña de nuevo");
				contrasena = sc.nextLine();
			}
		} while (!contrasena.equalsIgnoreCase("Jugones"));
		System.out.println("Cargando...");
		for (int i = 0; i < 5; i++) {

			try {
				Thread.sleep(400);
				System.out.println(".");
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}

		System.out.println(RED
				+ "INFORMACIÓN:Para poder interactuar con el menu de acciones durante el transcurso de la historia."
				+ "\nUtilizara los numeros en su barra numerica para realizar acciones u avanzar en la historia(En caso de no ser un numero lo que se pida se le indicara EXPLICITAMENTE que acción sera requerida)"
				+ RESET);
		System.out.println("Cargando...");
		for (int i = 0; i < 5; i++) {

			try {
				Thread.sleep(500);
				System.out.println(".");
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}

		System.out.println("**************MENU****************");
		System.out.println("¡Bienvenido al Juego Ecos del Tiempo: Convergencia!");
		System.out.println("La historia del tiempo está por desmoronarse");
		System.out.println("¿Estás listo para escuchar sus ecos?");
		do {
			System.out.println("**********************************");
			System.out.println("1. Iniciar el juego");
			System.out.println("2. Creditos");
			System.out.println("3. Salir");
			System.out.println("**********************************");
			menu = sc.nextInt();
			if (menu < 1 || menu > 3) {
				System.out.println("Error, eleccion no valida elija nuevamente");
				numVueltaMenu += 1;
			}
		} while (menu < 1 || menu > 3);
		switch (menu) {
		case 1:
			// Inicio Juego//
			for (int i = 0; i < 5; i++) {

				try {
					Thread.sleep(400);
					System.out.println(".");
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
				}
			}

			System.out.println("Empecemos tu nueva aventura: ");

			System.out.println("Historia 1: \nEl Lazo de la Rutina\nSam(Analista de Sistemas)");
			for (int i = 0; i < 3; i++) {
				System.out.println(".");
			}

			System.out.println(
					"Abres los ojos en una habitación silenciosa. Filas interminables de escritorios vacíos se extienden hacia el horizonte, \nbañadas por la luz artificial de un techo que no recuerdas haber visto.");
			System.out.println(" ");
			System.out.println("Un monitor frente a ti parpadea. En su reflejo, apenas reconoces tu propio rostro.");
			System.out.println(" ");
			System.out.println(
					"No hay ventanas, ni relojes, ni puertas. Solo una sensación persistente: algo está terriblemente mal.");
			System.out.println(" ");
			System.out.println(
					"Y entonces, una voz fría y distante resuena en tu cabeza: 'Usuario 001, tu sesión ha comenzado.");

			do {
				System.out.println("=======================================");
				System.out.println("  PRESIONA 'E' PARA CONTINUAR   ");
				System.out.println("=======================================");
				boton = sc.next();
				if (!boton.equalsIgnoreCase("E")) {
					System.out.println("Tecla no valida, Escriba la letra E en su teclado");
				}
			} while (!boton.equalsIgnoreCase("E"));

			for (int i = 0; i < 2; i++) {
				System.out.println(
						"_____________________________________________________________________________________________________");
			}
			System.out.println("Historia 2: \nLa Última Cuenta Atrás \n(Jayden, el Sobreviviente)");
			for (int i = 0; i < 5; i++) {

				try {
					Thread.sleep(400);
					System.out.println(".");
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
				}
			}
			System.out.println(
					"El aire es denso y sofocante. La ciudad, o lo que queda de ella, está en silencio.\nNo hay pájaros, no hay viento, solo un eco distante que nunca termina.");

			System.out.println(" ");
			System.out.println(
					"Tu ropa está sucia y rasgada. Tu cuerpo, agotado. No recuerdas el último momento de calma, pero tampoco te importa.");

			System.out.println(" ");
			System.out.println(
					"A tu alrededor, las sombras parecen moverse, como si el mundo estuviera vigilándote. \nTodo lo que sabes es que si te detienes demasiado tiempo, no volverás a moverte.");
			do {
				System.out.println("=======================================");
				System.out.println("  PRESIONA 'E' PARA CONTINUAR   ");
				System.out.println("=======================================");
				boton = sc.next();
				if (!boton.equalsIgnoreCase("E")) {
					System.out.println("Tecla no valida, Escriba la letra E en su teclado");
				}
			} while (!boton.equalsIgnoreCase("E"));

			for (int i = 0; i < 2; i++) {
				System.out.println(
						"_____________________________________________________________________________________________________");
			}

			System.out.println("Historia 3: \nEl Lienzo del Tiempo \n(Lila, la Artista)");
			for (int i = 0; i < 5; i++) {

				try {
					Thread.sleep(400);
					System.out.println(".");
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
				}
			}
			System.out.println(
					"Te despiertas en un vagón oscuro. La madera cruje bajo tus pies mientras el tren se desliza por rieles que parecen no tener fin.");
			System.out.println(" ");
			System.out.println(
					"Los asientos están vacíos, pero sientes que no estás solo. Algo, o alguien, te observa desde las sombras.");
			System.out.println(" ");
			System.out.println(
					"No recuerdas cómo llegaste aquí, ni hacia dónde se dirige el tren. Las ventanas están cubiertas de una niebla densa, ocultando lo que hay afuera.");
			System.out.println(" ");
			System.out.println(
					"Un leve sonido metálico rompe el silencio. Unos pasos se escuchan en el vagón contiguo... y no son tuyos.");
			do {
				System.out.println("=======================================");
				System.out.println("  PRESIONA 'E' PARA CONTINUAR   ");
				System.out.println("=======================================");
				boton = sc.next();
				if (!boton.equalsIgnoreCase("E")) {
					System.out.println("Tecla no valida, Escriba la letra E en su teclado");
				}
			} while (!boton.equalsIgnoreCase("E"));

			for (int i = 0; i < 2; i++) {
				System.out.println(
						"_____________________________________________________________________________________________________");
			}

			System.out.println(
					"Tres historias, tres destinos. Cada uno atrapado en un ciclo que solo tú puedes romper. \nElige con cuidado... tu decisión determinará más de lo que imaginas.");
			System.out.println(" ");
			System.out.println(
					"Escribe el número del personaje que deseas controlar y prepárate para enfrentarte a lo que se oculta en su mundo.");

			int eleccionMc = sc.nextInt();

			switch (eleccionMc) {
			case 1:
				mc = 1;
				objetivo = "administrador";
				Mc="SAM";
				System.out.println("Cargando...");
				for (int i = 0; i < 5; i++) {

					try {
						Thread.sleep(400);
						System.out.println(".");
					} catch (InterruptedException e) {
						Thread.currentThread().interrupt();
					}
				}

				System.out.println("=======================================");
				System.out.println("         ECOS DEL TIEMPO: SAM         ");
				System.out.println("=======================================");

				for (int i = 0; i < 11; i++) {
					System.out.println(" ");

				}

				dialogo = "Narrador:\nEl zumbido de los fluorescentes llena la oficina vacía.Abres los ojos,No hay ventanas, ni relojes, ni puertas. "
						+ "\nMientras miras a tu alrededor te encuentras con un monitor frente a ti que parpadea. En su reflejo, apenas reconoces tu propio rostro. "
						+ "\nA lo lejos, escuchas un leve murmullo. Parece que no estás solo en la oficina.";

				imprimirConRetraso(dialogo, 30);
				System.out.println(YELLOW + "\n¿Qué harás a continuación?");
				System.out.println("1. Examinar el monitor.");
				System.out.println("2. Buscar algo inusual en la sala." + RESET);
				int eleccion1 = sc.nextInt();
				while (eleccion1 < 1 || eleccion1 > 3) {
					System.out.println("Elección no válida. Intenta de nuevo.");
					eleccion1 = sc.nextInt();
				}
				switch (eleccion1) {

				case 1:
					dialogo = "\nNarrador:\nTe acercas al monitor. Una línea de texto aparece en la pantalla: ";
					imprimirConRetraso(dialogo, 30);
					System.out.println(BLUE + "'BIENVENIDO DE NUEVO, SAM. HORA DE COMENZAR OTRO DÍA.'" + RESET);
					dialogo = "El mensaje se siente familiar, pero no recuerdas haber estado aquí antes.";

					break;

				case 2:
					dialogo = "\nNarrador:\nExploras la sala. Todo parece en perfecto orden, demasiado perfecto."
							+ "\nEn uno de los escritorios, encuentras una hoja de papel con un mensaje escrito a mano:";
					imprimirConRetraso(dialogo, 30);

					System.out.println("'¿CUÁNTO TIEMPO CREES QUE HA PASADO? NO LO SABES, ¿VERDAD?'");
					dialogo = "\nNarrador:\nEl mensaje te provoca un escalofrío. ¿Quién podría haberlo escrito?";
					break;

				case 3:
					dialogo = "\nNrrador:\nDecides ir hacia las voces. Al doblar una esquina, ves a algunos compañeros de trabajo."
							+ "\nMarina, Tomás, Carla y Eduardo están allí, cada uno ocupado con sus tareas habituales."
							+ "\nAlgo parece extraño: nadie parece notar que algo no está bien en la oficina.";
					break;

				}// switch 3(eleccion1)
				imprimirConRetraso(dialogo, 30);

				if (eleccion1 == 1 || eleccion1 == 2) {
					dialogo = "Sin terminar de procesar lo que acabas de ver la puerta de la oficina se abre mientras entran 7 personas hablando alegremente"
							+ "\nal ver que llegaron tus compañeros a la ofcina piensas\n";
					imprimirConRetraso(dialogo, 30);
					System.out.println(" '¿Deberia contarles lo que vi?' ");
					System.out.println(YELLOW + "1._ Hablar con el grupo" + "\n2._ Quedarse callado");
					System.out.println("Tu eleccion determinara tus acciones en el futuro" + RESET);
					int eleccionGrupo = sc.nextInt();
					while (eleccionGrupo != 1 && eleccionGrupo != 2) {
						System.out.println("Elección no válida. Intenta de nuevo.");
						eleccion1 = sc.nextInt();
					}
					if (eleccionGrupo == 1 || eleccion1 == 3) {
						favorabilidadGrupal += 10;
						System.out.println("Tu favorabilidad dentro del grupo es: " + favorabilidadGrupal);
						System.out.println("¿Con quién quieres hablar primero?");
						System.out.println("1. Marina (compañera de trabajo, siempre amable)");
						System.out.println("2. Tomás (tu jefe, serio y exigente)");
						System.out.println("3. Carla (especialista en sistemas, concentrada en su tableta)");
						System.out.println("4. Eduardo (guardia de seguridad, callado pero observador)");
						System.out.println("5. Laura (una figura extraña que parece observarte desde lejos)");
						int interactuarPersonaje = sc.nextInt();
						while (interactuarPersonaje < 1 && interactuarPersonaje > 5) {
							System.out.println("Elección no válida. Intenta de nuevo.");
							interactuarPersonaje = sc.nextInt();
						}
						switch (interactuarPersonaje) {
						case 1:
							dialogo = "\nNarrador:\nHablas con Marina. Ella parece tranquila, pero algo en su tono te inquieta.";
							imprimirConRetraso(dialogo, 30);
							System.out.println(
									"\nMarina:\n¿Cómo te sientes hoy, Sam? Parece que últimamente estás un poco distraído...");
							dialogo = "Te preguntas qué quiso decir con 'últimamente', ya que no recuerdas los días anteriores.";

							break;

						case 2:
							System.out.println(
									"\nNarrador:\nTe acercas a Tomás. Como siempre, su rostro está serio y enfocado.");
							imprimirConRetraso(dialogo, 30);

							System.out.println(
									"\nTomás: \nSam, necesito el informe que pedí. Ya deberías saber que no tolero retrasos.'");
							dialogo = "\nNarrador\nSus palabras son firmes, pero sientes que hay algo más detrás de su actitud.";

							break;

						case 3:
							System.out.println(
									"\nNarrador:\nHablas con Carla, quien apenas levanta la vista de su tableta.");
							imprimirConRetraso(dialogo, 30);

							System.out.println(
									"\nCarla: \nNo sé qué pasa con el sistema hoy. Está mostrando registros inconsistentes...\n");
							dialogo = "\nNarrador:\nTe pregunta si has notado algo extraño, pero no estás seguro de cómo responder.";

							break;

						case 4:
							System.out.println(
									"\nNarrador:\nEduardo está de pie cerca de la puerta, observando la oficina con atención.");
							imprimirConRetraso(dialogo, 30);

							System.out.println(
									"\nEduardo: \nAlgo no me cuadra, Sam. He estado revisando las cámaras y hay lagunas en las grabaciones\n");
							dialogo = "\nNarrador:\nSus palabras te ponen nervioso. ¿Qué significan esas lagunas?";

							break;

						case 5:
							System.out.println(
									"\nNarrador:\nTe giras hacia Laura, pero ella no parece estar del todo presente.");
							imprimirConRetraso(dialogo, 30);

							System.out.println("\nNarrador\nLaura: 'Sam, ¿aún no recuerdas? No tienes mucho tiempo.'");
							dialogo = "\nNarrador\n:Antes de que puedas responder, Laura desaparece como una sombra. ¿Quién es realmente?";
							break;
						}
					} else if (eleccionGrupo == 2) {
						favorabilidadGrupal -= 5;
						System.out.println("Tu favorabilidad dentro del grupo es: " + favorabilidadGrupal);
					}
				}
				dialogo = "\nMientras interactúas con ellos, sientes que hay algo fuera de lugar."
						+ "\nEl monitor detrás de ti vuelve a parpadear, mostrando un nuevo mensaje:";
				imprimirConRetraso(dialogo, 30);
				System.out.println(BLUE + "  'INTERACTÚA MÁS PARA DESCUBRIR LA VERDAD.'  " + RESET);
				dialogo = "\nNarrador:\n"
						+ "\nEl monitor parpadea de nuevo. Un zumbido constante llena el aire mientras aparecen palabras en la pantalla:";
				imprimirConRetraso(dialogo, 30);
				System.out.println(BLUE + "'PRUEBA EN PROGRESO: UNIÓN Y DECISIÓN SON CLAVES.'" + RESET);

				System.out.println(YELLOW + "'FAVORABILIDAD GRUPAL ACTUAL: " + favorabilidadGrupal + "%'" + RESET);
				dialogo = "\nNarrador:\nMarina frunce el ceño mientras observa la pantalla.";
				imprimirConRetraso(dialogo, 30);
				System.out.println("Marina: \nEsto parece un reto. ¿Qué tipo de prueba será?");
				dialogo = "\nNarrador:\nTomás ajusta su corbata y habla con voz firme.\n";
				imprimirConRetraso(dialogo, 30);
				System.out.println("Tomás:\nNo importa qué sea. Necesitamos mantener la calma y resolverlo rápido.");
				dialogo = "\nNarrador:\nEduardo, que se había mantenido en silencio, finalmente interviene.\n";
				imprimirConRetraso(dialogo, 30);
				System.out.println(
						"Eduardo: \nAlgo en todo esto no me cuadra... ¿por qué quieren que trabajemos juntos?'");

				dialogo = "\nNarrador:\nEl monitor muestra un nuevo mensaje:\n";
				imprimirConRetraso(dialogo, 30);
				System.out.println(BLUE + "'PRUEBA 1: EL FUEGO NECESITA ____ PARA ARDER.'\n");
				System.out.println("'TIENEN TRES INTENTOS PARA RESPONDER CORRECTAMENTE COMO EQUIPO.'" + RESET);
				dialogo = "\nNarrador:\nLos miembros del equipo intercambian miradas nerviosas. ¿Quién tiene la respuesta correcta?";
				imprimirConRetraso(dialogo, 30);

				iniciarPuzzleCooperativo(sc, random, favorabilidadGrupal);

				dialogo = "\nNarrador:\nTras el resultado de la prueba, el ambiente en la sala cambia. Las tensiones entre los miembros del equipo son palpables."
						+ "\nMarina te mira con una mezcla de curiosidad y preocupación. Parece estar pensando algo, pero no lo dice."
						+ "\nTomás habla con tono firme:\n";
				imprimirConRetraso(dialogo, 30);
				System.out.println(
						"Tomás: \nEsto no es solo un reto. Es una forma de medirnos. Alguien o algo nos está observando.");
				dialogo = "\nNarrador:\nCarla sigue mirando su tableta. Sus dedos se detienen un momento, y luego dice:\n";
				imprimirConRetraso(dialogo, 30);
				System.out.println(
						"Carla: \nHay anomalías en este sistema... y parece que se ajustan a nuestras acciones.\n");
				dialogo = "\nNarrador:\nEduardo te observa en silencio, como si intentara leer tus pensamientos.\n";
				imprimirConRetraso(dialogo, 30);
				System.out.println("Eduardo: \nLa pregunta es: ¿quién tiene el control de esto?\n");
				dialogo = "\nEl monitor parpadea una vez más, y un nuevo mensaje aparece:";
				imprimirConRetraso(dialogo, 30);
				System.out.println(BLUE + "\n'IDENTIFIQUEN AL ADMINISTRADOR ESCONDIDO EN SU GRUPO.'" + RESET);
				dialogo = "\nNarrador:\nEl mensaje es claro, pero nadie parece dispuesto a hablar primero. La desconfianza empieza a crecer.";
				imprimirConRetraso(dialogo, 30);
				dialogo = "\nNarrador:\n"
						+ "Te quedas observando el monitor apagado. La sala, que antes parecía estática, comienza a sentirse más viva, \n"
						+ "como si las sombras mismas hubieran cobrado conciencia de tu presencia.\n"
						+ "De repente, el zumbido de los fluorescentes cesa, y la oficina queda sumida en un silencio absoluto."
						+ "\nUn fuerte golpe resuena detrás de ti."
						+ "Te giras rápidamente y ves que uno de los escritorios ha caído, \n"
						+ "revelando un extraño símbolo grabado en el suelo."
						+ "\nCarla, que seguía inmersa en su tableta, alza la mirada y murmura:"
						+ "Carla: 'Eso no estaba ahí antes... ¿o sí?'";
				imprimirConRetraso(dialogo, 30);

				do {
					System.out.println("\n=======================================");
					System.out.println("  PRESIONA 'E' PARA CONTINUAR   ");
					System.out.println("=======================================");
					boton = sc.next();
					if (!boton.equalsIgnoreCase("E")) {
						System.out.println("Tecla no valida, Escriba la letra E en su teclado");
					}
				} while (!boton.equalsIgnoreCase("E"));
				dialogo = "\nTomás, visiblemente molesto, habla con firmeza:\n"
						+ "Tomás: \n'Esto no tiene sentido. No estamos aquí para juegos.'"
						+ "\nMarina se acerca a ti con cautela.\n"
						+ "Marina: \n'Sam, ¿sientes que algo está... cambiando? Como si no fuera la primera vez que estamos aquí.'";
				imprimirConRetraso(dialogo, 30);
				dialogo = "\nNarrador:\n" + "Sus palabras te desconciertan, pero no puedes negar que algo está mal. \n"
						+ "Una sensación extraña te invade: recuerdos fragmentados de momentos que no recuerdas haber vivido, \n"
						+ "pero que se sienten familiares." + "\nEl monitor parpadea de nuevo, y aparece un mensaje:";
				imprimirConRetraso(dialogo, 30);

				System.out.println(
						BLUE + "\n'USUARIO 001: TU TIEMPO SE ESTÁ ACABANDO. EL DESPERTAR ES INMINENTE.'" + RESET);

				dialogo = "\nEduardo se cruza de brazos y te mira fijamente.\n"
						+ "Eduardo: '¿Qué significa eso, Sam? ¿Qué sabes que nosotros no?'" + "\nNarrador:\n"
						+ "La tensión en la sala es palpable. Marina parece preocupada, Carla está más alerta, \n"
						+ "y Tomás te observa con desconfianza. Eduardo mantiene su postura fría, pero no aparta los ojos de ti."
						+ "\nEl monitor muestra un nuevo mensaje:";
				imprimirConRetraso(dialogo, 30);

				System.out.println(BLUE + "\n'LA PRIMERA VERDAD ESTÁ OCULTA EN EL SÍMBOLO.'" + RESET);
				dialogo = "\nMarina: '¿Qué hacemos ahora? ¿Nos acercamos?'";
				imprimirConRetraso(dialogo, 30);

				System.out.println(YELLOW + "\n¿Qué decides hacer?");
				System.out.println("1. Examinar el símbolo en el suelo.");
				System.out.println("2. Preguntar al equipo si recuerdan algo extraño.");
				System.out.println("3. Ignorar el mensaje y buscar una salida." + RESET);
				int eleccion = sc.nextInt();
				while (eleccion < 1 || eleccion > 3) {
					System.out.println("Elección no válida. Intenta de nuevo.");
					eleccion = sc.nextInt();
				}
				switch (eleccion) {
				case 1:
					dialogo = "\nNarrador:\n"
							+ "\nTe acercas al símbolo. Su diseño parece antiguo, casi tribal, pero hay algo inquietante en él."
							+ "\nAl tocarlo, una corriente fría recorre tu cuerpo. Por un momento, el mundo parece detenerse, \n"
							+ "y escuchas una voz distante en tu mente: 'Este no es tu mundo, Sam.'"
							+ "Recuerdos borrosos llenan tu cabeza. Algo está intentando despertarte, pero aún no puedes comprenderlo.";
					break;

				case 2:
					dialogo = "\nNarrador:\n"
							+ "Decides preguntar al equipo. Marina menciona haber tenido sueños extraños últimamente, \n"
							+ "Tomás dice que nada le parece fuera de lo común, y Carla comenta que su tableta sigue mostrando datos inconsistentes.\n"
							+ "Eduardo guarda silencio, pero notas que evita mirar el símbolo.\n"
							+ "Te das cuenta de que todos perciben algo diferente, como si la realidad misma estuviera fragmentada.";
					break;

				case 3:
					dialogo = "\nNarrador:"
							+ "Ignoras el mensaje y decides buscar una salida. Sin embargo, todas las puertas están bloqueadas, \n"
							+ "y la oficina parece cambiar de forma. Cada vez que giras en un pasillo, terminas regresando al mismo lugar.\n"
							+ "El monitor parpadea nuevamente, y la voz del Administrador resuena: ";
					System.out.println(BLUE + "\n'NO PUEDES ESCAPAR HASTA QUE ENFRENTES LA VERDAD.'" + RESET);
					break;
				}
				imprimirConRetraso(dialogo, 30);

				System.out.println("\nEl monitor muestra un último mensaje antes de apagarse:");
				System.out.println(BLUE + "'LA PRUEBA HA COMENZADO.'" + RESET);
				resolverPuzzleEcos(sc, random, favorabilidadGrupal, dialogo, BLUE, RESET, RED);
				do {
					System.out.println("=======================================");
					System.out.println("  PRESIONA 'E' PARA CONTINUAR   ");
					System.out.println("=======================================");
					boton = sc.next();
					if (!boton.equalsIgnoreCase("E")) {
						System.out.println("Tecla no valida, Escriba la letra E en su teclado");
					}
				} while (!boton.equalsIgnoreCase("E"));

				dialogo = "\nNarrador:\n"
						+ "Después del último mensaje en el monitor, la oficina comienza a cambiar. \n"
						+ "Las luces parpadean irregularmente, y un sonido metálico resuena en las paredes, como si algo se estuviera fracturando.\n"
						+ "Marina se acerca, pero por un instante, su figura parpadea, como si estuviera a punto de desaparecer."
						+ "\nMarina: \n¿Me ves bien, Sam? Siento... como si no estuviera aquí." + "\nNarrador:\n"
						+ "Antes de que puedas responder, un zumbido fuerte llena la sala. El monitor parpadea y muestra un mensaje incomprensible:";
				imprimirConRetraso(dialogo, 30);
				System.out.println(BLUE + "\n'T#MPO%FALLA&ECH0S'" + RESET);

				System.out.println(YELLOW + "\n¿Qué harás?");
				System.out.println("1. Ignorar el mensaje y hablar con Eduardo sobre las cámaras.");
				System.out.println("2. Intentar estabilizar a Marina.");
				System.out.println("3. Pedirle a Carla que investigue más datos en su tableta." + RESET);
				int eleccionGlitch = sc.nextInt();
				while (eleccionGlitch < 1 || eleccionGlitch > 3) {
					System.out.println("Elección no válida. Intenta de nuevo.");
					eleccionGlitch = sc.nextInt();

				}
				switch (eleccionGlitch) {
				case 1:
					dialogo = "\nNarrador:\n"
							+ "Eduardo revisa las cámaras de seguridad, pero las imágenes parecen distorsionadas. \n"
							+ "Una grabación muestra a todo el equipo entrando en la sala repetidamente, cada vez más borrosos.\n"
							+ "Eduardo: \n'Esto... no puede ser real. ¿Estamos atrapados en un bucle?";
					imprimirConRetraso(dialogo, 30);
					dialogo = "\nNarrador:\n"
							+ "En la pantalla, tu rostro parpadea por un instante, pero es diferente. No eres tú, \n"
							+ "es alguien que te observa desde el otro lado. Eduardo apaga la pantalla rápidamente, pero el daño está hecho.";
					System.out.println(YELLOW + "Favorabilidad grupal actual: " + favorabilidadGrupal + "%" + RESET);
					break;
				case 2:
					dialogo = "\nNarrador:\n"
							+ "Marina parece inestable, como si estuviera desvaneciéndose. Su figura parpadea y vuelve a aparecer, \n"
							+ "cada vez más borrosa."
							+ "Marina: \nSam... ¿qué está pasando? Siento que estoy perdiendo algo importante.";
					imprimirConRetraso(dialogo, 30);

					dialogo = "\nNarrador:\n"
							+ "Su voz comienza a repetirse, como un eco infinito: 'Sam... Sam... Sam...' \n"
							+ "Hasta que finalmente recupera la compostura, pero su mirada ahora es distante.";
					System.out.println(YELLOW + "Favorabilidad grupal actual: " + favorabilidadGrupal + "%" + RESET);
					break;
				case 3:
					dialogo = "\nNarrador:\n"
							+ "Carla analiza la tableta, que ahora muestra caracteres incomprensibles."
							+ "\nCarla: \n'Este código... parece estar hablando de una anomalía en el sistema.'";
					imprimirConRetraso(dialogo, 30);
					dialogo = "\nNarrador:\n"
							+ "De repente, la tableta se apaga, y Carla golpea la mesa con frustración."
							+ "Carla: \n'¡Era importante! Pero ahora no puedo recuperarlo.'";
					System.out.println(YELLOW + "Favorabilidad grupal actual: " + favorabilidadGrupal + "%" + RESET);
				}
				imprimirConRetraso(dialogo, 30);
				dialogo = "\nNarrador:" + "\nTras el último evento, la oficina parece más inestable que nunca.\n"
						+ "Las luces parpadean sin cesar, y las sombras en las paredes parecen moverse como si tuvieran vida propia."
						+ "\nCarla señala el monitor, que muestra un nuevo mensaje:" + "\n'PR---A SI--- TE---AL---."
						+ " --URR---'" + " (EL TIEMPO SE AGOTA).'" + "\nNarrador:\n"
						+ "El texto está incompleto y desordenado. Marina lo mira con preocupación, pero antes de que alguien pueda decir algo, \n"
						+ "el monitor emite un zumbido ensordecedor."
						+ "\nEl monitor parpadea y muestra un texto corrupto acompañado de imágenes intermitentes:";
				imprimirConRetraso(dialogo, 30);

				dialogo = """
						  'SEC%NCIA-1**:
						     2, 6, 12, 20, 30... [?]

						     SEC%NCIA-2***:
						     1, 4, 9, 16, 25... [?]

						     ***SOLUCIÓN=#SUMA#+DE#LO--CALCULADO.'
						""" + "\nCarla: 'Esto parece un acertijo... pero está completamente corrupto. ¿Qué hacemos?'";
				imprimirConRetraso(dialogo, 30);

				System.out.println(YELLOW + "\n¿Qué decides hacer?");
				System.out.println("1. Preguntar a Carla si puede decodificar el mensaje.");
				System.out.println("2. Pedir al equipo que intente resolverlo juntos.");
				System.out.println("3. Ignorar el acertijo y buscar pistas en la sala." + RESET);

				int eleccionSam = sc.nextInt();
				while (eleccionSam < 1 || eleccionSam > 3) {
					System.out.println("Elección no válida. Intenta de nuevo.");
					eleccionSam = sc.nextInt();
				}
				dialogo = "\nSam: " + "\n'No, no podemos esperar. Resolveré esto.'" + "\nNarrador:\n"
						+ "Sin escuchar al resto del equipo, te acercas al monitor y comienzas a analizar el texto corrupto, \n"
						+ "como si algo en tu interior supiera lo que hacer.";
				imprimirConRetraso(dialogo, 30);

				resolverAcertijoCorruptoDificil(sc, random, favorabilidadGrupal, dialogo, BLUE, RESET);
				dialogo = "\nNarrador:"
						+ "El monitor se ilumina con un brillo cegador, y las sombras en las paredes parecen moverse por sí solas. \n"
						+ "Un mensaje distorsionado aparece en la pantalla, rodeado de ruido visual y parpadeos:";
				imprimirConRetraso(dialogo, 30);

				System.out.println(BLUE + """
						    ---E*S*---ALT%-C-M*--UNA-T%RRE,
						       %PER%-N%T3&N3-CUER&P#NI%PI3S--
						       ---NO-S%--M&V-@....
						       -SOMB%&R4-DE-T&D0S.
						    ---INSTR--SUC--D!GA#SU-N0MRE---
						""" + RESET);
				dialogo = "\nNarrador:"
						+ "Las palabras corruptas zumban en tu cabeza, como si algo estuviera tratando de comunicarse contigo desde el otro lado."
						+ "Marina: 'Sam... ¿entiendes algo de esto? Parece... que está dirigido a ti.'";
				imprimirConRetraso(dialogo, 30);

				resolverAdivinanza(sc, random, favorabilidadGrupal);
				int buclesRepetidos = random.nextInt(1000) + 9000;
				dialogo = "\nNarrador:\n"
						+ "Tras resolver la adivinanza, el monitor se apaga por completo. El equipo comienza a buscar desesperadamente \n"
						+ "alguna pista en la oficina.Carla encuentra una carpeta que parece haber salido de la nada. Marina la abre y lee en voz alta:";
				imprimirConRetraso(dialogo, 30);

				System.out.printf("""
						'PROYECTO SIMULACIÓN - PROTOCOLO C-0001
						 SUJETO: USUARIO 001 (SAM)
						 TIEMPO EN SIMULACIÓN: 10 AÑOS
						 BUCLES COMPLETADOS:""" + buclesRepetidos + """
						     OBJETIVO: OBSERVACIÓN DE RESPUESTAS HUMANAS EN CONDICIONES DE AISLAMIENTO EXTREMO.'
						""");

				dialogo = "\nNarrador:\n"
						+ "Las palabras parecen congelar el ambiente. Marina deja caer la carpeta, incapaz de procesar lo que acaba de leer."
						+ "\nMarina: \n'¿10 años? ¿Miles de bucles? ¡Esto no puede ser cierto! Sam... ¿cómo no recuerdas nada?'"
						+ "\nNarrador:\n"
						+ "Tu mente empieza a llenarse de fragmentos de recuerdos: imágenes de la oficina, repitiéndose una y otra vez, \n"
						+ "y el monitor siempre mostrándote pruebas imposibles. Todo empieza a tener sentido: has estado atrapado aquí durante 10 años, \n"
						+ "repitiendo el mismo ciclo una y otra vez."
						+ "\nEl monitor vuelve a encenderse, mostrando un último mensaje:";
				imprimirConRetraso(dialogo, 30);

				System.out.println(BLUE
						+ "\n'EL ADMINISTRADOR HA OBSERVADO TODOS TUS FRACASOS. ¿REALMENTE CREES QUE PUEDES ESCAPAR?'"
						+ RESET);

				System.out.println("\nFavorabilidad grupal actual: " + favorabilidadGrupal + "%");
				dialogo = "\nNarrador:\n"
						+ "Después de descubrir la verdad sobre los 10 años atrapado en la simulación y los miles de bucles, \n"
						+ "el monitor vuelve a encenderse. Esta vez, el mensaje es claro pero inquietante:\n";
				imprimirConRetraso(dialogo, 30);

				System.out
						.println(BLUE + "'LA PRUEBA FINAL SE ACERCA. UNO ENTRE USTEDES NO ES QUIEN DICE SER.'" + RESET);

				dialogo = "\nMarina da un paso atrás, con el rostro pálido.\n"
						+ "Marina: \n'¿Qué significa eso? ¿Uno de nosotros...? ¡Esto tiene que ser un error!\n'"
						+ "\nEduardo, con el ceño fruncido, cruza los brazos.\n"
						+ "Eduardo: \n'¿O tal vez es exactamente lo que significa? ¿Quién de nosotros está trabajando para el Administrador?'"
						+ "\nNarrador:\n"
						+ "El equipo intercambia miradas sospechosas. Carla encuentra un archivo en su tableta que revela al infiltrado.";
				imprimirConRetraso(dialogo, 30);

				String infiltrado = descubrirInfiltrado(random);

				dialogo = "\nCarla:\n'¡Aquí está! El infiltrado del Administrador es..." + infiltrado + "\nNarrador:\n"
						+ "Antes de que puedan reaccionar, el monitor muestra un nuevo mensaje:\n"
						+ "'ENFRENTA AL INFILTRADO EN UN JUEGO. PIEDRA, PAPEL O TIJERA. QUIEN PIERDA SERÁ REINICIADO A 0.\n'";
				imprimirConRetraso(dialogo, 30);

				desafioPiedraPapelTijeraAmañado(sc, random, infiltrado, favorabilidadGrupal, dialogo, YELLOW, RESET);
				System.out.println("\nNarrador:");
				System.out.println("El Administrador se alza frente a Sam, su figura envuelta en glitches y sombras. \n"
						+ "'Este es el fin, Sam. Tus intentos de resistirte siempre han sido inútiles.'");

				combateFinal(random, sc, objetivo, infiltrado, favorabilidadGrupal, dialogo, YELLOW, RESET);

				dialogo = "\nEl sistema comienza a reiniciarse, mostrando múltiples líneas de código en las pantallas. Una voz desconocida emerge:"
						+ "'El camino está despejado. Ahora, la decisión final está en tus manos.'";
				imprimirConRetraso(dialogo, 30);

				if (favorabilidadGrupal >= 80) {
					dialogo = "\nLos compañeros de Sam intervienen, visiblemente emocionados pero también divididos. Uno de ellos dice:"
							+ "'Sam, mereces ser libre, pero... ¿qué pasará con este mundo si lo destruyes?'"
							+ "Otro compañero añade: 'Tal vez podamos encontrar otra forma. No tiene que acabar así.'"
							+ "\nFinalmente, te vuelves hacia ellos, buscando orientación.";

					imprimirConRetraso(dialogo, 30);

					System.out.println(YELLOW + "\n[Elige la decisión final]");
					System.out.println("1. Liberar a Sam y destruir este mundo para salvarlo.");
					System.out.println("2. Permitir que Sam permanezca aquí y preservar el mundo." + RESET);

					int eleccionFinal = sc.nextInt();
					if (eleccionFinal == 1) {
						dialogo = "\nNarrador: Con un peso en el corazón, decides liberar a Sam. El mundo comienza a colapsar, desintegrándose en un destello cegador de luz."
								+ "Sam, por primera vez, siente una verdadera libertad, aunque a un alto precio.";
					} else {
						dialogo = "\nNarrador: Decides preservar este mundo. Sam observa desde las sombras, aceptando su papel como guardián silencioso."
								+ "\nEl mundo sigue adelante, pero las cicatrices del conflicto permanecen.";
					}
					imprimirConRetraso(dialogo, 30);

				} else {
					dialogo = "\nLos compañeros no están de acuerdo, y algunos incluso dudan de la decisión de Sam. Uno murmura: 'Esto es demasiado grande para nosotros.'"
							+ "La responsabilidad recae únicamente en Sam.";
					imprimirConRetraso(dialogo, 30);

					System.out.println(YELLOW + "\n[Elige la decisión final]");
					System.out.println("1. Liberarse y destruir el mundo.");
					System.out.println("2. Permanecer y proteger este lugar." + RESET);

					int eleccionFinal = sc.nextInt();
					if (eleccionFinal == 1) {
						dialogo = "\nNarrador: Sam elige la libertad, aunque sabe que destruirá todo a su paso. El mundo colapsa mientras Sam escapa al infinito vacío."
								+ "La sensación de liberación es amarga, pero innegable.";
					} else {
						dialogo = "\nNarrador: Sam decide quedarse, sacrificando su propia libertad para preservar el mundo. Una nueva paz se asienta, aunque llena de melancolía."
								+ "\nEl Administrador ha caído, pero Sam sigue vigilando desde las sombras.";
					}
					imprimirConRetraso(dialogo, 30);
					System.out.println("\n=== FIN DE LA HISTORIA ===");
					return;

				}

				System.out.println("\nFavorabilidad grupal final: " + favorabilidadGrupal + "%");

				break;
			case 2:
				mc = 2;
				objetivo="lucio";
				Mc="lila";
				System.out.println("Cargando...");
				for (int i = 0; i < 5; i++) {

					try {
						Thread.sleep(400);
						System.out.println(".");
					} catch (InterruptedException e) {
						Thread.currentThread().interrupt();
					}
				}

				System.out.println("=======================================");
				System.out.println("         ECOS DEL TIEMPO: JAYDEN        ");
				System.out.println("=======================================");
				objetivo = "administrador";
				for (int i = 0; i < 11; i++) {
					System.out.println(" ");

				}
				dialogo = "\nNarrante:\n"
						+ "El aire es denso y sofocante. La ciudad, o lo que queda de ella, está en silencio.\n"
						+ "No hay pájaros, no hay viento, solo un eco distante que nunca termina.\n"
						+ "Tu ropa está sucia y rasgada. Tu cuerpo, agotado.\n"
						+ "No recuerdas el último momento de calma, pero tampoco te importa.\n"
						+ "A tu alrededor, las sombras parecen moverse, como si el mundo estuviera vigilándote.\n"
						+ "Todo lo que sabes es que si te detienes demasiado tiempo, no volverás a moverte.\n"
						+ "Narrador:\nUna figura borrosa emerge entre los escombros.\n"
						+ "Su voz es áspera, como si llevara años sin hablar." + "\nDesconocido: \n¿Eres tú... Jayden?";
				imprimirConRetraso(dialogo, 30);

				System.out.print(YELLOW + "\nElige una respuesta:\n" + "1. '¿Quién pregunta?'\n"
						+ "2. 'Eso depende de quién seas.'\n" + "3. Guarda silencio.\n" + "4. Salir\n" + "Tu decisión: "
						+ RESET);
				int respuesta = sc.nextInt();
				while (respuesta < 1 || respuesta > 4) {
					System.out.println("Elección no válida. Intenta de nuevo.");
					respuesta = sc.nextInt();
					break;
				}
				if (respuesta == 1) {
					dialogo = "\nJayden:\n¿Quién pregunta?\n"
							+ "Desconocido: \nAlguien que recuerda los días antes de todo esto.\n"
							+ "Narrador: La figura se acerca un paso, dejando ver un rostro cubierto de cicatrices.";
				} else if (respuesta == 2) {
					dialogo = "\nJayden: \nEso depende de quién seas."
							+ "\nDesconocido: \nSolo alguien que necesita ayuda, igual que tú.\n"
							+ "Narrador: \nSu tono es neutral, pero no puedes evitar desconfiar.";
				} else if (respuesta == 4) {
					salir(eleccionMc);
				}

				else {
					dialogo = "\nNarrador: Optas por guardar silencio. La figura te observa en silencio, evaluándote."
							+ "Desconocido: Bueno, supongo que eso también dice algo de ti.";
				}

				imprimirConRetraso(dialogo, 30);
				dialogo = "\nNarrador:\nEl desconocido se sienta en una roca cercana, sacando un pequeño artefacto de metal.\n"
						+ "Desconocido: \nEscucha, no hay mucho tiempo. Las máquinas están cada vez más cerca.\n"
						+ "Jayden: \n¿Qué máquinas?"
						+ "\nDesconocido: \nLas que destruyeron todo. Las que están cazando lo poco que queda de nosotros."
						+ "\nNarrador: \nEl desconocido señala un punto en el horizonte. Una columna de humo se eleva lentamente."
						+ "\nDesconocido: \nSi no llegamos al refugio antes del anochecer, estaremos acabados."
						+ "\nJayden: \n¿Y por qué debería confiar en ti?"
						+ "Desconocido: Porque si no lo haces, morirás aquí."
						+ "\nNarrador: No tienes tiempo para considerar muchas opciones. Sus palabras suenan ciertas, pero la desconfianza está arraigada en ti.";
				imprimirConRetraso(dialogo, 30);

				System.out.print(YELLOW + "\nElige una acción:\n" + "1. Seguir al desconocido.\n"
						+ "2. Negarte y continuar solo.\n" + "Tu decisión: " + RESET);

				int accion = sc.nextInt();

				if (accion == 1) {
					dialogo = "\nNarrador: "
							+ "\nDecides seguir al desconocido, aunque tus sentidos están alerta a cualquier señal de peligro.\n"
							+ "Desconocido:\n Bien, mantente cerca. Y no hagas ruido.\n"
							+ "Narrador: Juntos, caminan por los restos de la ciudad, esquivando escombros y restos de una civilización olvidada.";
				} else {
					dialogo = "\nNarrador: \nDecides que confiar en un extraño es demasiado arriesgado.\n"
							+ "Jayden: \nBuena suerte. Espero que llegues al refugio.\n"
							+ "Desconocido: \nComo quieras. Pero recuerda mis palabras cuando la oscuridad caiga.\n"
							+ "Narrador: \nTe alejas, sintiendo su mirada clavada en tu espalda. Solo queda el sonido de tus pasos entre los escombros.";
				}
				imprimirConRetraso(dialogo, 30);
				dialogo = "\nNarrador:\nDe repente, un ruido metálico rompe el silencio. Una máquina enorme emerge de entre las ruinas.\n"
						+ "Es un coloso mecánico, con luces rojas brillando como ojos demoníacos y un zumbido que hace vibrar el suelo.\n"
						+ "El tiempo parece detenerse mientras consideras tus opciones. La última cuenta atrás ha comenzado.\n"
						+ "\nNarrador:\nLa figura mecánica emite un rugido metálico y comienza a avanzar.\n"
						+ "El desconocido: \n¡Corre! No podemos enfrentarlo aquí.\n"
						+ "Narrador: \nSigues al desconocido, tus pasos se vuelven más rápidos con cada estruendo que la máquina deja tras de sí.\n"
						+ "Narrador:\n Finalmente, llegas a lo que parece ser una entrada oculta entre los escombros.\n"
						+ "Una gran compuerta de metal se alza frente a ti, con un panel de control cubierto de polvo y cables expuestos."
						+ "Desconocido: \nAquí estamos. Pero para entrar necesitamos resolver esto.\n"
						+ "Jayden: \n¿Esto?\n"
						+ "Desconocido: \nUn viejo sistema de seguridad. Nos dará acceso si resolvemos el acertijo."
						+ "\nNarrador:\nEl panel parpadea y muestra un mensaje en su pantalla.";
				imprimirConRetraso(dialogo, 30);

				System.out.println(BLUE + "\nPantalla:\n" + "'Tengo ciudades, pero no casas.\n"
						+ "Tengo montañas, pero no árboles.\n" + "Tengo agua, pero no peces. ¿Qué soy?'" + RESET);

				String respuestaCorrecta = "mapa";
				boolean exito = false;

				for (int i = 0; i < 3 && !exito; i++) {
					System.out.print(YELLOW + "\nFavorabilidad grupal: 50%");
					System.out.print("\nTu respuesta: " + RESET);
					String respuestaJugador = sc.next().toLowerCase();

					if (respuestaJugador.equals(respuestaCorrecta)) {
						System.out.println(
								"\nNarrador:\nEl panel parpadea una vez más antes de emitir un sonido de desbloqueo.");
						System.out.println("Pantalla: 'ACCESO CONCEDIDO. BIENVENIDO AL REFUGIO PRIMARIO.'");
						exito = true;
					} else {
						System.out.println("\nNarrador:\nRespuesta incorrecta. Intenta de nuevo.");
					}
				}

				if (!exito) {
					System.out.println("\nNarrador:\nEl sistema de seguridad se apaga, dejando la entrada sellada.\n"
							+ "Desconocido: ¡No puede ser! Esto era nuestra única opción.");
					System.out.println(
							"Narrador: Sin otra alternativa, te das la vuelta. La máquina sigue acercándose...");
					System.out.println("\n=== FIN DE LA HISTORIA ===");
					return;
				}
				dialogo = "\nNarrador:\nLa puerta se abre lentamente, revelando un refugio subterráneo iluminado por luces tenues."
						+ "Adentro, cinco figuras te observan con cautela. Cada una parece tener una historia que contar, marcada por cicatrices y miradas llenas de determinación."
						+ "\nPersonaje 1 (Ayla, la Ingeniera): '¿Quiénes son ustedes? ¿Cómo encontraron este lugar?'\n"
						+ "Jayden: Fue pura suerte... y un poco de ingenio."
						+ "\nPersonaje 2 (Drake, el Estratega): 'No hay tiempo para preguntas ahora. Si han llegado aquí, deben saber que la situación es crítica.'\n"
						+ "\nPersonaje 3 (Lila, la Sanadora): 'Calma, Drake. Déjales al menos respirar. Parecen agotados.'\n"
						+ "\nNarrador:\nCada personaje parece ocupar un rol específico dentro del grupo. Ayla ajusta un artefacto, mientras Drake señala un mapa. "
						+ "Lila se acerca con un trapo húmedo para limpiar tu rostro. Los otros dos permanecen en silencio, observándote."
						+ "\nPersonaje 4 (Kai, el Guardián): 'Si vienen de afuera, tienen que haber visto a las máquinas. ¿Están cerca?'\n"
						+ "Desconocido: Demasiado cerca. Casi no llegamos."
						+ "\nPersonaje 5 (Mara, la Exploradora): 'Entonces estamos sin tiempo. Necesitamos actuar antes de que encuentren esta base.'\n"
						+ "\nNarrador:\nAunque acabas de llegar, la urgencia en sus voces deja claro que no hay descanso. La guerra contra las máquinas continúa.";
				imprimirConRetraso(dialogo, 30);

				do {
					System.out.println("\n=======================================");
					System.out.println("  PRESIONA 'E' PARA CONTINUAR   ");
					System.out.println("=======================================");
					boton = sc.next();
					if (!boton.equalsIgnoreCase("E")) {
						System.out.println("Tecla no valida, Escriba la letra E en su teclado");
					}
				} while (!boton.equalsIgnoreCase("E"));

				dialogo = "\nNarrador:\nDentro del refugio, los cinco personajes te observan con atención.\n"
						+ "Ayla: \n'Si vas a quedarte aquí, necesitamos saber si podemos confiar en ti.'"
						+ "Drake: \n'Esto no es un refugio para extraños. Demuéstranos que puedes aportar algo.'"
						+ "\nNarrador:\nAyla señala una consola antigua conectada a varios sistemas del refugio."
						+ "Ayla: \n'Esta máquina contiene datos vitales, pero su acceso está bloqueado por un acertijo de cifrado.'"
						+ "Drake: \n'Si puedes resolverlo, ganarás algo de nuestra confianza.'";
				imprimirConRetraso(dialogo, 30);

				System.out.println("\nNarrador:\nLa pantalla de la consola se ilumina y muestra un mensaje:\n" + BLUE
						+ "'\nCuanto más me quitas, más grande me hago. ¿Qué soy?'\n" + RESET);
				String respuestaCorrectaAgujero = "agujero";
				boolean exitoAgujero = false;

				for (int i = 0; i < 3 && !exitoAgujero; i++) {
					System.out.println("\nFavorabilidad grupal actual: " + favorabilidadGrupal + "%");
					System.out.print("Tu respuesta: ");
					String respuestaJugador = sc.next().toLowerCase();

					if (respuestaJugador.equals(respuestaCorrectaAgujero)) {
						dialogo = "\nNarrador:\nLa consola emite un pitido y muestra un mensaje:"
								+ "\nPantalla: 'ACCESO CONCEDIDO. SISTEMA OPERATIVO RESTAURADO.'"
								+ "Ayla: 'Impresionante. No esperaba que lo resolvieras tan rápido.'"
								+ "Lila: 'Quizás haya esperanza después de todo.'";
						imprimirConRetraso(dialogo, 30);

						exitoAgujero = true;
						favorabilidadGrupal += 20;
					} else {
						dialogo = "\nNarrador:\nRespuesta incorrecta. La consola muestra un mensaje de error."
								+ "Drake: '¿Eso es todo lo que tienes?'"
								+ "Mara: 'Dale otra oportunidad, Drake. La presión puede ser intensa.'";
						favorabilidadGrupal -= 10;
						imprimirConRetraso(dialogo, 30);

					}
				}

				if (exito) {
					dialogo = "\nNarrador:\nEl grupo parece más relajado, aunque la desconfianza no desaparece del todo."
							+ "\nKai: \n'Quizás no seas solo un peso muerto. Pero esto es solo el principio.'\n"
							+ "\nFavorabilidad grupal final: " + favorabilidadGrupal + "%";
				} else {
					dialogo = "\nNarrador:\nEl sistema se bloquea tras varios intentos fallidos."
							+ "\nDrake:\n 'Esto fue una pérdida de tiempo. Será mejor que encuentres otra forma de ganarte nuestra confianza.'";
					System.out.println("Favorabilidad grupal final: " + favorabilidadGrupal + "%");
				}
				imprimirConRetraso(dialogo, 30);

				dialogo = "\nNarrador:\nIndependientemente del resultado, el refugio parece más seguro que el mundo exterior, pero sabes que no puedes quedarte aquí sin demostrar tu valía."
						+ "Lila: 'Tómate un respiro. La próxima prueba no será tan sencilla.'"
						+ "\nNarrador:\nTras resolver el acertijo de la consola, el grupo te permite explorar la base.\n"
						+ "\nNarrador:\nEl aire aquí es más limpio, pero los pasillos están llenos de sombras y secretos."
						+ "\nAyla: \n'Bienvenido al refugio. Este lugar tiene más preguntas que respuestas, así que no bajes la guardia.'"
						+ "\nDrake: \n'Solo asegúrate de no tocar nada sin permiso.'"
						+ "\nNarrador:\nEn una esquina, encuentras una vieja terminal parpadeando."
						+ "Pantalla: '\nACCESO A LOS ARCHIVOS DE SAM.'"
						+ "\nLila: \n'¿Archivos de Sam? ¿Crees que eso tenga algo que ver con los registros que mencionó la consola?'"
						+ "Kai: \n'Podría ser. Los rumores dicen que los sistemas de Sam siguen funcionando en ruinas como esta.'"
						+ "\nNarrador:\nCuando intentas interactuar con la terminal, aparece un mensaje en la pantalla:"
						+ "\nPantalla:\n'Para acceder a los archivos, primero debes probar que eres digno. Resuelve el siguiente desafío:'";
				System.out.println(BLUE
						+ "\nPantalla:\n'Un hombre construyó una casa rectangular. Todas las paredes dan al sur. Un oso pasa por allí. ¿De qué color es el oso?'"
						+ RESET);
				imprimirConRetraso(dialogo, 30);
				String respuestaCorrectaSam = "blanco";
				boolean exitoSam = false;

				for (int i = 0; i < 3 && !exitoSam; i++) {
					System.out.println("\nFavorabilidad grupal actual: " + favorabilidadGrupal + "%");
					System.out.print("Tu respuesta: ");
					String respuestaJugador = sc.next().toLowerCase();

					if (respuestaJugador.equals(respuestaCorrectaSam)) {
						dialogo = "\nNarrador:\nLa terminal emite un sonido mecánico.\n"
								+ "Pantalla: 'ACCESO CONCEDIDO.'\n"
								+ "\nAyla: \n'Lo lograste. No pensé que entendieras la lógica detrás del acertijo.'"
								+ "\nLila: \n'Un oso blanco... Claro, la casa debe estar en el Polo Norte.'";
						imprimirConRetraso(dialogo, 30);

						exitoSam = true;
						favorabilidadGrupal += 20;

						dialogo = "\nNarrador:\nLa terminal muestra los archivos. Fragmentos de datos, mapas y un mensaje incompleto."
								+ "Pantalla: \n'El Proyecto Sam... Último registro: "
								+ "'\nRompí el ciclo, pero el mundo que creé está roto. Solo queda esperar... que alguien continúe lo que empecé.'"
								+ "\nKai: \n'¿Crees que esto tiene algo que ver con lo que nos pasó? ¿El colapso de todo?'"
								+ "\nDrake: \n'No importa. El pasado no puede salvarnos. Tenemos que centrarnos en sobrevivir.'";
						imprimirConRetraso(dialogo, 30);

					} else {
						dialogo = "\nNarrador:\nLa terminal parpadea con un mensaje de error."
								+ "\nDrake: '¿Eso es lo mejor que puedes hacer? Inténtalo de nuevo.'";
						favorabilidadGrupal -= 10;
						imprimirConRetraso(dialogo, 30);

					}
				}

				if (exitoSam) {
					dialogo = "\nNarrador:\nEl grupo parece confiar un poco más en ti.";
					imprimirConRetraso(dialogo, 30);

					System.out.println("Favorabilidad grupal final: " + favorabilidadGrupal + "%");
				} else {
					dialogo = "\nNarrador:\nLa terminal se apaga, dejando los archivos de Sam inaccesibles."
							+ "\nAyla: 'Tendremos que buscar otro terminal funcional... si es que queda alguno.'"
							+ "\nDrake: 'Solo fue una pérdida de tiempo.'";
					imprimirConRetraso(dialogo, 30);

					System.out.println("Favorabilidad grupal final: " + favorabilidadGrupal + "%");
				}
				dialogo = "\nNarrador:\nA pesar de los altibajos, el grupo sigue adelante. El refugio esconde más secretos, y tú estás decidido a desentrañarlos."
						+ "\nPero en el fondo de tu mente, las palabras de Sam resuenan. ¿Qué significa continuar lo que empezó?";
				imprimirConRetraso(dialogo, 30);

				dialogo = "\nNarrador:\nLa tranquilidad en el refugio se ve interrumpida por un repentino zumbido metálico."
						+ "\nDrake: \n'¡Esas máquinas! Están aquí.'\n"
						+ "Ayla: \n'No puede ser, no pensábamos que llegaran tan rápido.'\n"
						+ "Kai: \n'¡Preparados, todos! No podemos permitir que nos encuentren aquí.'\n"
						+ "Mara: \n'Esto es demasiado... ¿No hay forma de detenerlos?'\n"
						+ "\nNarrador:\nPero en ese momento, una figura aparece frente a la entrada del refugio."
						+ "\nLa puerta se abre con un estruendo, y el aire se llena de una energía palpable."
						+ "\nDesconocido: 'Es inútil. Ya no hay refugio que los salve.'\n"
						+ "Narrador: \nLa figura da un paso hacia adentro, revelando su rostro. Es... el Administrador del Bucle.\n"
						+ "\nAdministrador del Bucle: 'Vaya, parece que has logrado algo... pero no será suficiente. El mundo está a mis pies.'"
						+ "\nNarrador: \nEl grupo se paraliza al reconocer la figura. El Administrador del Bucle, un ser de poder inmenso, se ha manifestado en el mundo real."
						+ "\nAdministrador del Bucle: 'Mi dominio sobre la tecnología ha sido absoluto. Sam nunca salió del bucle, y ustedes... no son más que piezas en mi juego.'"
						+ "\nJayden: '¿Sam...? ¿Tú...? ¿El administrador del bucle de Sam? ¿Cómo es posible?'"
						+ "\nAdministrador del Bucle: 'Sam fue solo una pieza de un juego mucho más grande. Creísteis que las máquinas que crearon el bucle controlaban todo, pero soy yo quien tiene el verdadero control.'"
						+ "\nNarrador: La revelación es impactante. El enemigo que enfrentas no solo tiene poder sobre la tecnología, sino que también fue responsable de la desaparición de Sam."
						+ "\nAdministrador del Bucle: 'Ahora, el mundo es mío. No hay refugio, no hay escape. Yo soy el administrador de esta realidad.'"
						+ "\nNarrador: El Administrador extiende su mano, y el refugio comienza a temblar, las pantallas parpadean con mensajes incoherentes."
						+ "\nAdministrador del Bucle: 'Te he estado observando, Jayden. Como lo hice con Sam... y ahora... es tu turno.'"
						+ "\nNarrador:\nLa figura se acerca. El tiempo parece detenerse. La amenaza del Administrador del Bucle es inminente.";

				dialogo = "\nNarrador:\nLa batalla final ha comenzado. El Administrador del Bucle se alza frente a ti, "
						+ "con su figura envuelta en glitches y sombras. Sabes que este es el último enfrentamiento, "
						+ "el último desafío que te aguarda. La atmósfera es densa, el aire se siente pesado.\n"
						+ "\nAdministrador del Bucle: 'Este es el fin, Jayden. Tus intentos de resistir siempre han sido inútiles. "
						+ "Los bucles fueron creados para derrotarte, pero nunca lo entendiste. Ahora es tarde para cambiar el curso de las cosas.'"
						+ "\nNarrador:\nEl Administrador del Bucle se alza frente a Jayden, su figura envuelta en glitches y sombras. "
						+ "\nEl espacio se distorsiona a su alrededor. Sabes que este será un combate decisivo.\n"
						+ "\nAdministrador del Bucle: 'Estás en mi dominio, Jayden. Tus esfuerzos son inútiles, solo en este ciclo puedo dominarte. "
						+ "Ahora, prepárate para el fin.'";
				imprimirConRetraso(dialogo, 30);
				combateFinal(random, sc, objetivo, respuestaCorrectaSam, favorabilidadGrupal, dialogo, YELLOW, RESET);

				if (favorabilidadGrupal >= 80) {
					dialogo = "\nNarrador: Tras la derrota del Administrador, el grupo se une en victoria. La batalla fue dura, pero con su apoyo, Jayden logró liberar al mundo."
							+ "\nJayden: 'Lo hicimos, todos juntos.'"
							+ "\nNarrador: La paz regresa al mundo, pero las cicatrices del pasado permanecen. Juntos, el grupo y Jayden se enfrentarán a un nuevo futuro, sin los hilos invisibles del Administrador.";
				} else {
					dialogo = "\nNarrador: La derrota del Administrador marca el fin de un ciclo, pero la división entre el grupo y Jayden ha dejado huellas profundas. Algunos deciden abandonar, otros siguen luchando junto a él."
							+ "\nJayden: 'El camino no será fácil... pero lo enfrentaremos, aunque sea solos.'";
				}

				imprimirConRetraso(dialogo, 30);

				break;
			case 3:
				dialogo = "\nHistoria 3: El Lienzo del Tiempo \n(Lila, la hija de Sam)\n";

				for (int i = 0; i < 5; i++) {
					try {
						Thread.sleep(400);
						dialogo += ".";
					} catch (InterruptedException e) {
						Thread.currentThread().interrupt();
					}
				}

				dialogo += "\nTe despiertas en un vagón oscuro. La madera cruje bajo tus pies mientras el tren se desliza por rieles que parecen no tener fin."
						+ "\n\nLos asientos están vacíos, pero sientes que no estás solo. Algo, o alguien, te observa desde las sombras."
						+ "\n\nNo recuerdas cómo llegaste aquí, ni hacia dónde se dirige el tren. Las ventanas están cubiertas de una niebla densa, ocultando lo que hay afuera."
						+ "\n\nUn leve sonido metálico rompe el silencio. Unos pasos se escuchan en el vagón contiguo... y no son tuyos."
						+ "\n"
						+ "\nNarrador: La hija de Sam, Lila, despierta en este extraño tren, una situación que parece sacada de uno de los muchos bucles que su madre había vivido."
						+ "\nLila: '¿Es esto lo que quedaba después del sacrificio de mi madre? ¿Estoy atrapada en otra trampa?'"
						+"\nNarrador: El tren sigue su curso, pero algo es diferente. Lila sabe que no está simplemente atrapada; el destino de su madre la persigue."
						+"\nNarrador: A lo lejos, ve una figura familiar... es su madre, Sam, pero de una forma distorsionada. Su rostro es sombrío, pero su mirada le indica que debe seguir adelante."
						+"\nNarrador: Sam no responde con palabras, solo apunta hacia una puerta cerrada en el fondo del vagón. La hija de Sam sabe que debe avanzar, pero la incertidumbre es su única compañera."
						+"\nNarrador: Lila se acerca a la puerta, y un mensaje aparece en las paredes del tren: 'Solo quien entienda el tiempo podrá escapar'. La puerta está sellada con un acertijo."
						+"\nNarrador: El acertijo se muestra en la puerta: 'Soy invisible, pero lo tocas todos los días. El pasado, el presente y el futuro se unen en mí. ¿Quién soy?'";
				imprimirConRetraso(dialogo, 0);


		        String respuestaCorrectalila = "tiempo";
		        int intentos = 0;
		        boolean acertado = false;

		        while (intentos < 3 && !acertado) {
		            System.out.print("\nEscribe tu respuesta: ");
		            String respuestalila = sc.nextLine().toLowerCase().trim();

		            if (respuestalila.equals(respuestaCorrectalila)) {
		                dialogo = "\nNarrador: \nLa puerta emite un sonido metálico y se abre lentamente. Lila siente que ha dado un paso más cerca de desentrañar el misterio del tren.\n";
		                dialogo += "'El tiempo... siempre estaba frente a mí.' dice Lila, aliviada.";
		                imprimirConRetraso(dialogo, 30);
		                acertado = true;
		            } else {
		                intentos++;
		                if (intentos < 3) {
		                    switch (intentos) {
		                        case 1:
		                            dialogo = "\nNarrador: \nLa inscripción en la puerta parpadea como burlándose de ti. '¿En serio? ¿Eso es lo mejor que tienes?'";
		                            break;
		                        case 2:
		                            dialogo = "\nNarrador: \nLa puerta parece emitir un sonido de risa. 'Piensa un poco más. Esto no es tan difícil.'";
		                            break;
		                    }
		                    imprimirConRetraso(dialogo, 30);
		                } else {
		                    dialogo = "\nNarrador: \nLa puerta permanece cerrada y la inscripción se desvanece. 'No todos están destinados a escapar del tiempo.'";
		                    dialogo += "\nLila siente un escalofrío mientras el tren sigue avanzando hacia lo desconocido.";
		                    imprimirConRetraso(dialogo, 30);
		                }
		            }
		        }

		        if (!acertado) {
		            dialogo = "\nNarrador: \nLa hija de Sam no logró resolver el acertijo. Pero, ¿es este el fin de su historia, o el comienzo de otra trampa del tiempo?";
		            imprimirConRetraso(dialogo, 30);
		        }
		        else {
		            String[] personajes = {"Kai", "Mara", "Drake", "Ayla", "Lucien (el enemigo)"};
		            dialogo = "\nNarrador: \nMás allá de la puerta, Lila encuentra un vagón lleno de extraños rostros. Cada uno parece tener un propósito en este lugar fuera del tiempo.";
		            imprimirConRetraso(dialogo, 30);

		            for (String personaje : personajes) {
		                dialogo = "\n" + personaje + ": \n";
		                if (personaje.equals("Lucien (el enemigo)")) {
		                    dialogo += "'No todos aquí están para ayudarte, Lila. Algunos tenemos nuestros propios planes.'";
		                } else {
		                    dialogo += "'Estamos atrapados aquí igual que tú, pero juntos quizás tengamos una oportunidad.'";
		                }
		                imprimirConRetraso(dialogo, 30);
		            }

		            dialogo = "\nNarrador: \nEn el centro del vagón hay un pedestal con una caja cerrada y una nueva inscripción:";
		            dialogo += "\n'Aquello que todos buscan, pero pocos encuentran. Soy el tesoro más grande y también el más efímero. ¿Qué soy?'";
		            imprimirConRetraso(dialogo, 30);

		            respuestaCorrecta = "felicidad";
		            intentos = 0;
		            acertado = false;

		            while (intentos < 3 && !acertado) {
		                System.out.print("\nEscribe tu respuesta: ");
		                String respuesta1 = sc.nextLine().toLowerCase().trim();

		                if (respuesta1.equals(respuestaCorrecta)) {
		                    dialogo = "\nNarrador: \nLa caja se abre, revelando un extraño artefacto que comienza a brillar intensamente.\n";
		                    dialogo += "Lila siente una paz interior mientras los espejos empiezan a desvanecerse.";
		                    imprimirConRetraso(dialogo, 30);
		                    acertado = true;

		                    favorabilidadGrupal += 10;
		                    dialogo = "\nNarrador: \nEl grupo parece más unido tras resolver el acertijo.";
		                    imprimirConRetraso(dialogo, 30);
		                } else {
		                    intentos++;
		                    favorabilidadGrupal -= 5;
		                    if (intentos < 3) {
		                        switch (intentos) {
		                            case 1:
		                                dialogo = "\nNarrador: \nLos espejos parecen distorsionar su reflejo. 'Esa respuesta no es suficiente.'";
		                                break;
		                            case 2:
		                                dialogo = "\nNarrador: \nLa caja emite un leve zumbido, como si estuviera perdiendo la paciencia. 'Intenta de nuevo, pero piensa bien.'";
		                                break;
		                        }
		                        imprimirConRetraso(dialogo, 30);
		                    } else {
		                        dialogo = "\nNarrador: \nLa caja se cierra definitivamente y los espejos estallan en mil pedazos. Lila siente que ha perdido algo importante.";
		                        imprimirConRetraso(dialogo, 30);
		                    }
		                }
		            }

		            boolean enemigoRevelado = false;
		            if (!enemigoRevelado && favorabilidadGrupal < 40) {
		                dialogo = "\nLucien: \n'Siempre supe que este grupo era débil. Quizás sea mejor que siga mi propio camino.'";
		                imprimirConRetraso(dialogo, 30);

		                dialogo = "\nNarrador: \nLucien abandona el grupo, dejándolos en una situación aún más precaria.";
		                imprimirConRetraso(dialogo, 30);
		            } else {
		                dialogo = "\nLucien: \n'Me sorprende que hayan llegado tan lejos. Tal vez merezcan mi ayuda... por ahora.'";
		                imprimirConRetraso(dialogo, 30);
		            }

		            dialogo = "\nNarrador: \nEl tren parece desacelerar, y una nueva puerta se perfila al fondo del vagón. Lo que espera más allá sigue siendo un misterio, pero el grupo debe decidir si avanzan juntos o no.";
		            imprimirConRetraso(dialogo, 30);
		            
		        }	dialogo = "\nNarrador: \nFrente a la nueva puerta, el grupo se encuentra con una decisión crucial. Una inscripción en la puerta dice: 'Sólo quienes confían unos en otros pueden cruzar. La duda es la verdadera barrera.'";
		        imprimirConRetraso(dialogo, 30);

		        boolean decisionTomada = false;
		        while (!decisionTomada) {
		            System.out.print("\n¿El grupo decide avanzar juntos? (si/no): ");
		            String decision = sc.nextLine().toLowerCase().trim();

		            if (decision.equals("si")) {
		                dialogo = "\nNarrador: \nEl grupo toma una profunda inspiración y, con determinación, colocan sus manos juntas en la puerta. Esta brilla con un destello dorado y comienza a abrirse.";
		                imprimirConRetraso(dialogo, 30);
		                decisionTomada = true;

		                dialogo = "\nNarrador: \nMás allá de la puerta, un paisaje deslumbrante se extiende ante ellos: un vasto campo de estrellas, como si estuvieran caminando sobre el propio cosmos.";
		                dialogo += "\nEl tren parece haber desaparecido, dejando al grupo en un espacio donde el tiempo y el lugar pierden significado.";
		                imprimirConRetraso(dialogo, 30);

		                dialogo = "\nNarrador: \nUna figura etérea aparece en el horizonte, diciendo: 'Habéis pasado las pruebas del tiempo y la unidad. Pero el viaje apenas comienza. Cada uno de vosotros deberá enfrentarse a su propia verdad.'";
		                imprimirConRetraso(dialogo, 30);


		                String[] personajes = {"Kai", "Mara", "Drake", "Ayla", "Lucien (el enemigo)"};

		                for (String personaje : personajes) {
		                    dialogo = "\nNarrador: \nEl suelo debajo de " + personaje + " comienza a brillar, separándolos momentáneamente del grupo.";
		                    imprimirConRetraso(dialogo, 30);

		                    if (personaje.equals("Lucien (el enemigo)")) {
		                        dialogo = "\nLucien: \n'Siempre supe que depender de otros me haría débil. Mi verdad es que solo yo puedo controlar mi destino.'";
		                        dialogo += "\nLa figura etérea asiente, pero sus ojos brillan con una advertencia: 'Tu desafío será aprender que la fuerza también reside en otros.'";
		                    } else {
		                        dialogo = "\n" + personaje + ": \n'Si debo enfrentarme a mi verdad, que así sea. Pero confío en que nos reuniremos de nuevo.'";
		                    }
		                    imprimirConRetraso(dialogo, 30);
		                }

		                dialogo = "\nNarrador: \nLila observa cómo cada miembro del grupo enfrenta su destino, hasta que finalmente la figura etérea se vuelve hacia ella.";
		                dialogo += "\nFigura etérea: 'Y tú, Lila, ¿estás lista para descubrir quién eres realmente?'";
		                imprimirConRetraso(dialogo, 30);

		                dialogo = "\nNarrador: \nLa luz comienza a rodear a Lila, y todo se desvanece en blanco...";
		                imprimirConRetraso(dialogo, 30);

		            } else if (decision.equals("no")) {
		                dialogo = "\nNarrador: \nEl grupo duda, y la puerta comienza a oscurecerse. 'La falta de confianza es vuestra caída', susurra una voz distante.";
		                imprimirConRetraso(dialogo, 30);

		                dialogo = "\nNarrador: \nCon un crujido final, el tren reaparece, pero ahora parece más oscuro, más opresivo. El grupo siente que han perdido una oportunidad única.";
		                imprimirConRetraso(dialogo, 30);

		                decisionTomada = true;
		            } else {
		                System.out.println("Por favor, responde 'si' o 'no'.");
		            }
		        }

		        dialogo = "\nNarrador: \nEl tren avanza hacia lo desconocido una vez más. Aunque las respuestas no siempre están claras, cada elección lleva a un nuevo desenlace."
		        + "\nNarrador: \nCuando Lila recupera la consciencia, se encuentra en una sala circular. Las paredes están hechas de relojes que giran hacia adelante y hacia atrás sin control. En el centro, hay un pedestal con una esfera luminosa.";
		        imprimirConRetraso(dialogo, 30);

		        dialogo = "\nNarrador: \nUna voz resonante llena el espacio: 'Para avanzar, debes comprender la paradoja del tiempo. La esfera muestra un acertijo.'"
		        + "\nLa esfera comienza a brillar con las siguientes palabras: \n"
		        + "'Soy siempre creciente, pero nunca mayor.\n\nPuedes romperme, pero nunca detenerme. ¿Quién soy?'";
		        imprimirConRetraso(dialogo, 30);

		        String respuestaCorrecta1 = "olvido"; 
		        int intentos1 = 0;
		        boolean acertado1 = false;

		        while (intentos1 < 3 && !acertado1) {
		            System.out.print("\nEscribe tu respuesta: ");
		            String respuesta1 = sc.nextLine().toLowerCase().trim();

		            if (respuesta1.equals(respuestaCorrecta1)) {
		                dialogo = "\nNarrador: \nLa esfera se divide en cientos de partículas de luz, iluminando los relojes en las paredes. Los relojes se detienen y la sala comienza a transformarse.";
		                dialogo += "\nLila siente un alivio al comprender que el olvido es parte de la naturaleza del tiempo, y que aceptar esto es la clave para seguir adelante.";
		                imprimirConRetraso(dialogo, 30);
		                acertado1 = true;
		            } else {
		                intentos1++;
		                if (intentos1 < 3) {
		                    switch (intentos1) {
		                        case 1:
		                            dialogo = "\nNarrador: \nLa esfera emite un leve zumbido, como si se burlara de tu respuesta. 'No has entendido la paradoja.'";
		                            break;
		                        case 2:
		                            dialogo = "\nNarrador: \nLa esfera comienza a oscurecerse. 'Tu tiempo se acaba, viajera.'";
		                            break;
		                    }
		                    imprimirConRetraso(dialogo, 30);
		                } else {
		                    dialogo = "\nNarrador: \nLa esfera se apaga por completo y los relojes en las paredes comienzan a girar incontrolablemente. Lila siente que ha perdido algo vital.";
		                    dialogo += "\nUn portal oscuro aparece, forzándola a entrar y llevándola a una ruta diferente, donde el desafío será aún mayor.";
		                    imprimirConRetraso(dialogo, 30);
		                }
		            }
		        }

		        if (acertado1) {
		            dialogo = "\nNarrador: \nUn portal dorado se forma en el centro de la sala. La voz resonante habla nuevamente: 'Has demostrado que comprendes la paradoja. Adelante, hacia tu destino.'";
		            imprimirConRetraso(dialogo, 30);

		            dialogo = "\nNarrador: \nLila cruza el portal y se encuentra nuevamente con su grupo, quienes parecen haber superado sus propios retos. La sala donde están reunidos está marcada por símbolos antiguos y una nueva puerta con inscripciones complejas.";
		            imprimirConRetraso(dialogo, 30);

		            dialogo = "\nNarrador: \nLa puerta presenta un mensaje enigmático: 'Sólo con todas las piezas del rompecabezas podréis continuar. La unión es la clave.'";
		            imprimirConRetraso(dialogo, 30);
		        } else {
		            dialogo = "\nNarrador: \nEl portal oscuro lleva a Lila a un espacio completamente diferente. Está sola, en una sala vacía y fría, y siente que el tiempo se le escapa. El tren, el grupo y su propósito parecen estar más lejos que nunca.";
		            imprimirConRetraso(dialogo, 30);

		            dialogo = "\nNarrador: \nPero algo dentro de ella le dice que este no es el fin. Tal vez, en el olvido, pueda encontrar una nueva esperanza.";
		            imprimirConRetraso(dialogo, 30);
		        }    
		        dialogo = "\nNarrador: \nEl grupo se reúne frente a un altar donde hay cinco piezas brillantes que encajan en una ranura circular. Cada miembro del grupo debe elegir una y colocarlas juntas.";
		        imprimirConRetraso(dialogo, 30);

		        boolean grupoExitoso = true;
		        for (String personaje : new String[]{"Kai", "Mara", "Drake", "Ayla", "Lila"}) {
		            System.out.print("\n" + personaje + " debe colocar su pieza. ¿Acepta? (si/no): ");
		            String decision = sc.nextLine().toLowerCase().trim();
		            if (!decision.equals("si")) {
		                dialogo = "\nNarrador: \n" + personaje + " duda y no coloca la pieza. El altar comienza a temblar.";
		                imprimirConRetraso(dialogo, 30);
		                grupoExitoso = false;
		                break;
		            } if (grupoExitoso) {
			            dialogo = "\nNarrador: \nLas piezas encajan perfectamente y el altar libera un rayo de luz hacia el techo, revelando la figura de Lucien."+"\nLucien: 'Pensaste que podrías escapar sin enfrentarme, pero este tren es mío. Ahora prepárate para la batalla final.'";
			            imprimirConRetraso(dialogo, 30);
			        } else {
			            dialogo = "\nNarrador: \nEl altar colapsa y el grupo es separado en diferentes habitaciones. Lila escucha la risa de Lucien resonando en la distancia.";
			            imprimirConRetraso(dialogo, 30);
			        }
		        }

		       

		          
		        dialogo = "\nNarrador: \nEl portal oscuro lleva a Lila a un espacio completamente diferente. Está sola, en una sala vacía y fría, y siente que el tiempo se le escapa. El tren, el grupo y su propósito parecen estar más lejos que nunca.";
		        imprimirConRetraso(dialogo, 30);

		        dialogo = "\nNarrador: \nPero algo dentro de ella le dice que este no es el fin. Tal vez, en el olvido, pueda encontrar una nueva esperanza.";
		        imprimirConRetraso(dialogo, 30);
		    }
			objetivo="lucien";
			Mc="lila";
		
			combateFinal(random, sc, objetivo, Mc, favorabilidadGrupal, dialogo, YELLOW, RESET);

			// Switch 2(eleccion historia)
			break;
		case 2:
			// creditos//
			System.out.println("Desarrolladores:");
			System.out.println("  ");
			System.out.println("Jean Salazar Rodríguez");
			System.out.println("  ");
			System.out.println("Daniel Sanz");
			System.out.println("  ");
			System.out.println("Guillermo Pinilla");

			break;
		case 3:
			salir(mc);
		}// switch principal(MENU)
}

	public static String descubrirInfiltrado(Random random) {
		String[] personajes = { "Marina", "Eduardo", "Carla" };
		return personajes[random.nextInt(personajes.length)];
	}

	public static void imprimirConRetraso(String dialogo, long retrasoMilisegundos) {

		for (char c : dialogo.toCharArray()) {
			System.out.print(c);
			try {
				Thread.sleep(retrasoMilisegundos); // Pausa entre caracteres
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}

			dialogo = " ";

			/*
			 * e es una variable que representa la excepción capturada de tipo
			 * InterruptedException en el bloque catch. c es una variable que representa
			 * cada carácter del texto de dialogo durante el ciclo for que recorre el texto
			 * para imprimirlo con un retraso.
			 */

		}

	}

	public static void desafioPiedraPapelTijeraAmañado(Scanner sc, Random random, String infiltrado,
			int favorabilidadGrupal, String dialogo, String YELLOW, String RESET) {
		dialogo = "\nNarrador:\n" + infiltrado
				+ " da un paso adelante, con una sonrisa inquietante. Sus ojos parecen brillar con un destello extraño.\n"
				+ "El infiltrado: '¿Estás listo, Sam? Piedra, Papel o Tijera.'";
		System.out.println(YELLOW + "¿Q*^´ `?¿uiere j0ñ-.?" + "1.Piedra" + "2.Papel" + "3.Tijera" + RESET);
		dialogo = "\nNarrador:\n"
				+ "Intentas decidir qué jugar, pero algo dentro de ti despierta. Tu cuerpo se mueve solo. Sam ha tomado el control.";
		imprimirConRetraso(dialogo, 30);

		String[] opciones = { "piedra", "papel", "tijera" };
		boolean exito = false;
		int ronda = 1;

		while (ronda <= 3) {
			String eleccionSam;
			String eleccionInfiltrado;

			if (ronda == 1) {
				eleccionSam = "piedra";
				eleccionInfiltrado = "papel";
			} else if (ronda == 2) {
				eleccionSam = "tijera";
				eleccionInfiltrado = "papel";
			} else {
				eleccionSam = opciones[random.nextInt(opciones.length)];
				eleccionInfiltrado = opciones[random.nextInt(opciones.length)];
			}

			System.out.printf("\nSam juega:" + eleccionSam);
			System.out.printf(infiltrado + "juega:" + eleccionInfiltrado);

			if (eleccionSam.equals(eleccionInfiltrado)) {
				System.out.println("\nEmpate. Ambos retroceden un paso.");
			} else if ((eleccionSam.equals("piedra") && eleccionInfiltrado.equals("tijera"))
					|| (eleccionSam.equals("papel") && eleccionInfiltrado.equals("piedra"))
					|| (eleccionSam.equals("tijera") && eleccionInfiltrado.equals("papel"))) {
				System.out.printf("\n¡Sam gana la ronda " + ronda);
				exito = true;
			} else {
				System.out.printf(infiltrado + "\ngana la ronda" + ronda);
				exito = false;
			}

			ronda++;
		}

		if (exito) {
			System.out.println("\nNarrador:");
			System.out.println(
					"El infiltrado comienza a desvanecerse en una nube de glitches, como si estuviera siendo reiniciado a 0. \n"
							+ "Sam, por primera vez, siente que tiene el control absoluto.");
			System.out.println("'PRUEBA SUPERADA. EL CAMINO AL ADMINISTRADOR ESTÁ ABIERTO.'");
			System.out.println("\nSin embargo, el monitor muestra un mensaje inquietante:");
			System.out.println("'AUNQUE GANES, NO ESCAPARÁS. EL TIEMPO SIGUE SIENDO MÍO.'");
			favorabilidadGrupal += 10;
		} else {
			System.out.println("\nNarrador:");
			System.out.println("Sam siente cómo su propia existencia comienza a desvanecerse, siendo reiniciado a 0. \n"
					+ "El infiltrado ríe mientras el sistema colapsa alrededor del equipo.");
			System.out.println("'PRUEBA FALLIDA. EL ADMINISTRADOR GANA UNA VEZ MÁS.'");
			favorabilidadGrupal -= 20;

		}

		System.out.println("\nFavorabilidad grupal actual: " + favorabilidadGrupal + "%");
	}

	public static void iniciarPuzzleCooperativo(Scanner sc, Random random, int favorabilidadGrupal) {
		String[] personajes = { "Marina", "Tomás", "Carla", "Eduardo" };
		String administrador = personajes[random.nextInt(3) + 1];
		String[] respuestas = { "agua", "Hidrogeno", "Oxígeno", "Sal", "Metano", "Mechero" };

		System.out.println("\nEl monitor muestra un patrón de palabras incompleto:");
		System.out.println("'El fuego necesita ____ para arder.'");
		System.out.println("Tienes tres intentos para responder correctamente como equipo.");
		System.out.println(" ");

		int intentosRestantes = 3;
		boolean exito = false;

		while (intentosRestantes > 0 && !exito) {
			String respuestaCorrecta = "oxígeno";
			int respuestasIncorrectas = random.nextInt(2);
			boolean interferenciaAdministrador = random.nextBoolean();

			System.out.println("Tus compañeros empiezan a responder:");
			for (String personaje : personajes) {
				String respuestaPersonaje = null;

				if (personaje.equals(administrador) && interferenciaAdministrador) {
					respuestaPersonaje = "hidrógeno";
				} else if (respuestasIncorrectas > 0 && random.nextBoolean()) {
					for (int i = 0; i < 5; i++) {
						i += 1;
						respuestaPersonaje = respuestas[i];
					}
					respuestasIncorrectas--;
				} else {
					respuestaPersonaje = respuestaCorrecta;
				}

				System.out.println(personaje + " dice: '" + respuestaPersonaje + "'");
			}

			System.out.print("Tu respuesta final como equipo: ");
			String respuestaJugador = sc.next().toLowerCase();

			if (respuestaJugador.equals(respuestaCorrecta)) {
				System.out.println("\nEl monitor parpadea y muestra un nuevo mensaje:");
				System.out.println("'PRUEBA SUPERADA. CONTINUEN JUNTOS.'");
				exito = true;
				favorabilidadGrupal += 5;
			} else {

				System.out.println("\nRespuesta incorrecta.");
				intentosRestantes--;
				if (intentosRestantes == 1) {
					System.out.println("\nEl ambiente es más tenso.");
					System.out.println("Todos parecen normales, pero una idea inquietante cruza tu mente.");
					System.out.println("Si alguien está manipulando las cosas, ¿cómo puedes saber quién es?");
					System.out.println();
				}
			}
		}

		if (!exito) {
			System.out.println("\nEl monitor se apaga, dejando una sensación de desconfianza en el aire.");
			System.out.println(
					"Alguien en el equipo parece no estar jugando limpio... o simplemente cometieron un error.");
			favorabilidadGrupal -= 15;
		}
		System.out.println("Favorabilidad grupal actual: " + favorabilidadGrupal + "%");
	}

	public static void resolverPuzzleEcos(Scanner sc, Random random, int favorabilidadGrupal, String dialogo,
			String BLUE, String RESET, String RED) {
		dialogo = "\nEl monitor parpadea y muestra un nuevo mensaje:";
		imprimirConRetraso(dialogo, 30);

		System.out.println(BLUE + "'EL TIEMPO ESTÁ FRACTURADO. ESCUCHEN LOS ECOS Y RECONSTRUYAN LA VERDAD.'" + RESET);
		dialogo = "\nNarrador:\n"
				+ "Altavoces en la sala se activan, reproduciendo cinco grabaciones distintas. Cada grabación parece ser un fragmento de un mensaje.\n"
				+ "Sin embargo, algunos de los fragmentos están distorsionados, y otros parecen provenir de otro tiempo.";
		imprimirConRetraso(dialogo, 30);

		String[] grabaciones = { "Primera grabación: 'El... fuego... requiere... ox... ox... oxígeno...'",
				"Segunda grabación: 'No puedes escapar... de lo que siempre has sido...'",
				"Tercera grabación: 'El ciclo debe cerrarse... solo uno puede recordar...'",
				"Cuarta grabación: 'Para avanzar, debes confiar en el Administrador.'",
				"Quinta grabación: 'El Administrador no es quien parece ser... busca en el pasado...'" };

		int correcta = random.nextInt(grabaciones.length);

		System.out.println("\nLas grabaciones comienzan a reproducirse:");
		for (int i = 0; i < grabaciones.length; i++) {
			System.out.println((i + 1) + ". " + grabaciones[i]);
		}

		dialogo = "\nNarrador:\n" + "Debes elegir la grabación correcta para avanzar. Tienes tres intentos.\n";
		imprimirConRetraso(dialogo, 30);

		int intentosRestantes = 3;
		boolean exito = false;

		while (intentosRestantes > 0 && !exito) {
			System.out.print(BLUE + "\nElige el número de la grabación que crees que es correcta (1-5): " + RESET);
			int eleccionPuzzle = sc.nextInt() - 1;

			if (eleccionPuzzle == correcta) {
				dialogo = "\nEl monitor parpadea y muestra un mensaje:";
				imprimirConRetraso(dialogo, 30);

				System.out.println(BLUE + "'PRUEBA SUPERADA. LOS ECOS TE GUÍAN A LA VERDAD.'" + RESET);
				exito = true;
				favorabilidadGrupal += 10;
			} else {
				System.out.println(RED + "\nRespuesta incorrecta. El eco elegido no revela nada útil." + RESET);
				intentosRestantes--;
				if (intentosRestantes > 0) {
					System.out.println("Tienes " + intentosRestantes + " intentos restantes.");
				}
			}
		}

		if (!exito) {
			System.out.println("\nEl monitor se apaga, dejando una sensación de fracaso.");
			System.out.println("El equipo comienza a sospechar que el Administrador está jugando con ellos.");
			favorabilidadGrupal -= 10;
		}

		System.out.println("Favorabilidad grupal actual: " + favorabilidadGrupal + "%");
	}

	public static void resolverAcertijoCorruptoDificil(Scanner sc, Random random, int favorabilidadGrupal,
			String dialogo, String BLUE, String RESET) {
		dialogo = "\nNarrador:\n" + "Observas las secuencias. Una parece ser aritmética y la otra cuadrática."
				+ "\nTienes tres intentos para resolver ambas y encontrar la suma correcta.";
		imprimirConRetraso(dialogo, 30);

		int respuestaSecuencia1 = 42;
		int respuestaSecuencia2 = 36;
		int respuestaCorrecta = respuestaSecuencia1 + respuestaSecuencia2;

		int intentosRestantes = 3;
		boolean exito = false;

		while (intentosRestantes > 0 && !exito) {
			System.out.print("\nEscribe tu respuesta: ");
			int respuestaJugador = sc.nextInt();

			if (respuestaJugador == respuestaCorrecta) {
				dialogo = "\nEl monitor se estabiliza y muestra un mensaje claro:";
				imprimirConRetraso(dialogo, 30);

				System.out.println(BLUE + "\n'PRUEBA SUPERADA. EL TIEMPO TE PERTENECE.'" + RESET);
				exito = true;
				favorabilidadGrupal += 15;
			} else {
				System.out.println("\nRespuesta incorrecta. El sistema parece colapsar aún más.");
				intentosRestantes--;

				if (intentosRestantes == 2) {
					dialogo = "\nNarrador:\n"
							+ "El monitor muestra imágenes de sombras caminando en círculos. Por un instante, \n"
							+ "ves a alguien con tu rostro observándote desde la pantalla.";
					imprimirConRetraso(dialogo, 30);

				} else if (intentosRestantes == 1) {
					dialogo = "\nNarrador:\n"
							+ "La sala comienza a distorsionarse. Por un momento, sientes que el suelo se desplaza bajo tus pies, \n"
							+ "y las paredes se doblan hacia adentro.";
					imprimirConRetraso(dialogo, 30);

				}

				if (intentosRestantes > 0) {
					System.out.println("Intentos restantes: " + intentosRestantes);
				}
			}
		}

		if (!exito) {
			dialogo = "\nNarrador:\n" + "El monitor se apaga abruptamente.";
			imprimirConRetraso(dialogo, 30);

			System.out.println(BLUE + "\n'PRUEBA FALLIDA. EL TIEMPO SE ESTÁ CERRANDO.'" + RESET);
			dialogo = "\nNarrador:\n"
					+ "La oficina parece volverse más pequeña, como si el mundo se encogiera a tu alrededor.";
			imprimirConRetraso(dialogo, 30);

			favorabilidadGrupal -= 20;
		}

		System.out.println("\nFavorabilidad grupal actual: " + favorabilidadGrupal + "%");
	}

	public static int resolverAdivinanza(Scanner sc, Random random, int favorabilidadGrupal) {
		System.out.println("\nNarrador:");
		System.out.println(
				"El monitor emite un zumbido constante mientras intentas descifrar las palabras. El eco de tu propia voz \n"
						+ "repite la adivinanza en susurros, como si el sistema estuviera jugando contigo.");

		String respuestaCorrecta = "sombra";
		boolean exito = false;
		int intentosRestantes = 3;

		while (intentosRestantes > 0 && !exito) {
			System.out.print("\nEscribe tu respuesta: ");
			String respuestaJugador = sc.next().toLowerCase();

			if (respuestaJugador.equals(respuestaCorrecta)) {
				System.out.println("\nEl monitor se estabiliza y muestra un mensaje claro:");
				System.out.println("'PRUEBA SUPERADA. LA SOMBRA SIEMPRE TE SIGUE.'");
				exito = true;
				favorabilidadGrupal += 10;
			} else {
				System.out.println("\nRespuesta incorrecta. El sistema parece volverse más inestable.");
				intentosRestantes--;

				if (intentosRestantes == 2) {
					System.out.println("\nNarrador:");
					System.out.println(
							"El monitor muestra imágenes distorsionadas de ti mismo caminando en círculos. Por un instante, \n"
									+ "parece que otra versión de ti observa desde la pantalla.");
				} else if (intentosRestantes == 1) {
					System.out.println("\nNarrador:");
					System.out.println(
							"Las luces parpadean frenéticamente, y por un momento, la oficina parece girar a tu alrededor.");
				}

				if (intentosRestantes > 0) {
					System.out.println("Intentos restantes: " + intentosRestantes);
				}
			}
		}

		if (!exito) {
			System.out.println("\nEl monitor se apaga abruptamente.");
			System.out.println("'PRUEBA FALLIDA. LA CORRUPCIÓN SE EXPANDE.'");
			System.out.println("Narrador:");
			System.out.println(
					"Las paredes de la oficina comienzan a encogerse, como si el mundo entero estuviera cerrándose sobre ti.");
			favorabilidadGrupal -= 20;
		}

		System.out.println("\nFavorabilidad grupal actual: " + favorabilidadGrupal + "%");
		return favorabilidadGrupal;
	}

	public static void salir(int mc) {
		// salir//
		if (mc == 1) {
			System.out.println("Oh, ¿ya te rindes? Qué pena... El Administrador ni siquiera tuvo que esforzarse.");
			System.out.println("¡Espero que no vuelvas atrapado aquí por otros 10 años! Hasta luego... cobarde.");
		} else if (mc == 2) {
			System.out.println(
					"¿Así que te largas? Bravo, campeón. Eres justo lo que esperaba de ti: un desperdicio de oxígeno.");
			System.out.println(
					"¿Qué pasa? ¿El apocalipsis te quedó grande? No te preocupes, los zombis no necesitan masticar algo tan blando como tú.");
			System.out.println(
					"Adiós, valiente desertor. Espero que disfrutes tu glorioso retiro mientras el mundo se pudre por tu incompetencia.");
			System.out.println("Nos vemos... bueno, si es que alguna vez encuentras el valor de volver, claro.");
		} else if (mc == 3) {
			System.out.println(
					"¿Salir? ¡JAJAJA! Claro, huye como el cobarde que eres. Qué sorpresa, otro perdedor incapaz de enfrentar sus propios miedos.");
			System.out.println(
					"¿Creías que este tren era aterrador? No, lo aterrador eres tú: un fracaso ambulante que ni siquiera puede caminar hacia la luz.");
			System.out.println(
					"¿Qué piensas hacer ahí fuera? ¿Esconderte bajo una piedra? Porque déjame decirte algo: ni la oscuridad te quiere.");
			System.out.println(
					"Corre, desaparece, rómpete en mil pedazos... pero recuerda: este tren seguirá aquí, y algún día volverás, porque no tienes dónde más ir.");
			System.out.println(
					"Nos vemos en la próxima ronda, cobarde. Bueno, si es que algún día consigues algo de dignidad.");
		} else {
			System.out.println("Gracias por jugar. vuelve pronto");

		}

	}

	public static void combateFinal(Random random, Scanner sc, String objetivo, String Mc, int favorabilidadGrupal,
			String dialogo, String YELLOW, String RESET) {
		int vidaMc = 100;
		int vidaObjetivo = 120;
		int ataqueLigero = 5;
		int ataqueNormal = 20;
		int ataqueCritico = 35;

		int turnoContadorMc = 0;
		int turnoContadorObjetivo = 0;

		boolean turnoMc = random.nextBoolean();
		if (favorabilidadGrupal >= 80) {
			System.out.println("\nNarrador: El grupo está a tu lado. La esperanza les da fuerzas. "
					+ "Su apoyo te da la determinación necesaria para resistir.");
			vidaMc += 50;
			ataqueNormal += 10;
		} else {
			System.out
					.println("\nNarrador: El grupo está dividido. Sin su apoyo completo, el combate será más difícil. "
							+ "Tus amigos lucharán, pero necesitas hacer frente al Administrador con tus propios esfuerzos.");
		}

		// Bucle del combate
		while (vidaMc > 0 && vidaObjetivo > 0) {
			if (turnoMc) {
				System.out.println("\nTurno de " + Mc);

				// Probabilidad de ataques
				double numeroAleatorio = random.nextDouble();

				if (numeroAleatorio <= 0.3) {
					System.out.println("Tu enemigo ha esquivado parcialmente el golpe.");
					vidaObjetivo -= ataqueLigero;
					System.out.println("Tu ataque inflige " + ataqueLigero + " de daño.");
				} else if (numeroAleatorio <= 0.6) {
					System.out.println("Golpeas al Administrador con fuerza.");
					vidaObjetivo -= ataqueNormal;
					System.out.println("Tu ataque inflige " + ataqueNormal + " de daño.");
				} else if (numeroAleatorio <= 0.8) {
					System.out.println("¡Golpe crítico!");
					vidaObjetivo -= ataqueCritico;
					System.out.println("Tu ataque inflige " + ataqueCritico + " de daño.");
				} else {
					System.out.println("Has fallado el ataque.");
				}

				turnoContadorMc++;
				if (turnoContadorMc % 2 == 0) {
					System.out.println("\nSam:\nnecesito tu ayuda:");
					System.out.println("\n[Elige una Habilidad especial del " + Mc + "]");
					System.out.println("1.Curar: aumenta un 20HP de la vida de " + Mc);
					System.out.println("2.Golpe Mortal: Reunes una gran parte de tu energía en tu proximo golpe");
					int eleccionAtaque = sc.nextInt();

					if (eleccionAtaque == 1) {
						System.out.println(Mc + " se recupera 20 HP.");
						vidaMc += 20;
						if (vidaMc > 100)
							vidaMc = 100;
						System.out.println("Vida del " + Mc + "= " + vidaMc + "HP");
					} else if (eleccionAtaque == 2) {
						System.out.println(Mc + " prepara un ataque más fuerte para el siguiente turno.");
						ataqueNormal += 10;
					}
				}

				System.out.println("Vida del " + objetivo + ": " + vidaObjetivo + " HP");
			} else {
				System.out.println("\nTurno del " + objetivo);

				double numeroAleatorio = random.nextDouble();

				if (numeroAleatorio <= 0.3) {
					System.out.println(Mc + " esquiva parcialmente el ataque.");
					vidaMc -= ataqueLigero;
					System.out.println("El ataque inflige " + ataqueLigero + " de daño.");
				} else if (numeroAleatorio <= 0.6) {
					System.out.println("El Administrador golpea a " + Mc + " con fuerza.");
					vidaMc -= ataqueNormal;
					System.out.println("El ataque inflige " + ataqueNormal + " de daño.");
				} else if (numeroAleatorio <= 0.8) {
					System.out.println("¡Golpe crítico del Administrador!");
					vidaMc -= ataqueCritico;
					System.out.println("El ataque inflige " + ataqueCritico + " de daño.");
				} else {
					System.out.println("El Administrador falla el ataque.");
				}

				turnoContadorObjetivo++;
				if (turnoContadorObjetivo % 2 == 0) {
					System.out.println("\n[Habilidad especial del " + objetivo + "]");
					double habilidadAleatoria = random.nextDouble();
					if (habilidadAleatoria < 0.5) {
						System.out.println("El " + objetivo + " se recupera 15 HP.");
						vidaObjetivo += 15;
						System.out.println("Vida del " + objetivo + "= " + vidaObjetivo + "HP");

						if (vidaObjetivo > 120)
							vidaObjetivo = 120;
					} else {
						System.out.println("El " + objetivo + " aumenta su ataque temporalmente.");
						ataqueNormal += 5;
					}
				}

				System.out.println("Vida de " + Mc + ": " + vidaMc + " HP");
			}

			turnoMc = !turnoMc;

			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
		}

		if (vidaMc <= 0) {
			System.out.println("\nNarrador:" + Mc + "ha sido derrotado. El Administrador prevalece.");
			favorabilidadGrupal -= 30;
			System.out.println("Fin del juego");
			return;
		} else {
			System.out.println(
					"\nNarrador:" + Mc + "ha derrotado al Administrador, pero una decisión crucial lo espera.");
			favorabilidadGrupal += 20;
		}

	}

}
