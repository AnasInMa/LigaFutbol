import java.util.GregorianCalendar;

public class Test {

	public static void main(String[] args) {
		
		Equipo equipo1 = new Equipo("Antequera CF", (byte) 21, (byte) 3, (byte) 1,
									(byte) 43, (byte) 12);
		
		Equipo equipo2 = new Equipo("REAL MURCIA CF", (byte) 2, (byte) 0, (byte) 22,
									(byte) 3, (byte) 56);
		
		//System.out.println(equipo1);
		
		System.out.println(equipo1.toStringLineal());
		
		System.out.println("\n" + equipo2.toStringLineal());
		
		Partido partido = new Partido(equipo1, equipo2, new GregorianCalendar(2, 12, 2026),
										(byte) 4, (byte) 1);
		
		System.out.println("\n" + partido);
		
		System.out.println("\n" + equipo1.toStringLineal());
		
		System.out.println("\n" + equipo2.toStringLineal());

	}

}
