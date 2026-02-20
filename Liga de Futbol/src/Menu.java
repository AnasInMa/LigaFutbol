import java.text.ParseException;
import java.util.*;

public class Menu {

	public static void main(String[] args) {

		Equipo equipo1 = new Equipo("Antequera CF", (byte) 21, (byte) 3, (byte) 1,
				(byte) 43, (byte) 12);

		Equipo equipo2 = new Equipo("REAL MURCIA CF", (byte) 2, (byte) 0, (byte) 22,
				(byte) 3, (byte) 56);

		Equipo[] equipos = {equipo1, equipo2};

		Partido partido = new Partido(equipo1, equipo2, "02-12-2026",
				(byte) 4, (byte) 1);

		char opcion = ' ';

		Clasificacion clasificacion = new Clasificacion();
		
		clasificacion.añadePartido(partido);

		Scanner sc = new Scanner(System.in);

		do {

			menu();
			
			System.out.print("Introduzca una opcion: ");
			opcion = sc.next().charAt(0);

			sc.nextLine();

			switch(opcion) {

			case '1' -> añadeEquipo(clasificacion, equipos, sc);
			case '2' -> System.out.println(partido.toString());
			case '3' -> System.out.println(clasificacion.toString());
			case '4' -> resultadosPartidoPorFecha(clasificacion, sc);
			case '5' -> System.out.println("\nHas salido del menu");
			default -> System.out.println("\nOpcion no válida");
			}

		} while (opcion != '5');
	}

	private static void menu() {

		System.out.println( "1. Añadir un nuevo equipo \n"
				+ "2. Cargar los resultados de un partido.\n"
				+ "3. Mostrar la clasificación. \n"
				+ "4. Mostrar los partidos jugados en una determinada fecha.\n"
				+ "5. Salir\n");
	}

	private static void añadeEquipo(Clasificacion c, Equipo[] arrayEquipos, Scanner sc) {

		System.out.println(Arrays.toString(arrayEquipos));
		System.out.print("Introduzca la posicion del equipo que desea añadir: ");

		c.add(arrayEquipos[sc.nextInt() - 1]);

		sc.nextLine();
	}

	private static void resultadosPartidoPorFecha(Clasificacion c, Scanner sc) {

		System.out.println("Introduzca la fecha para ver los partidos (DD-MM-YYYY)");

		try {
			
			System.out.println(c.partidosPorFecha(sc.nextLine()));
			
		} catch (MiExepcion e) {
			
			System.err.println("Fecha no valida(DD-MM-YYYY)");
		}
	}
}
