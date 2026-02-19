import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Clasificacion extends LinkedList<Equipo>{

	private static final long serialVersionUID = -4003914142649062738L;

	private List<Partido> listaPartidos;
	
	public Clasificacion(List<Partido> partidos) {
		
		this.listaPartidos = partidos;
	}

	public Clasificacion() {
		
		this(new LinkedList<>());
	}
	
	public void añadePartido(Partido partido) {
		
		this.listaPartidos.add(partido);
	}
	
	public Equipo buscaEquipo(String nombre) {
		
		Equipo eq = null;
		
		for(Equipo equipo : this) {
			
			if(equipo.equals(eq)) {
				
				eq = equipo;
			}
		}
		
		return eq;
	}
	
	@Override
	public String toString() {
		
		String cadena =  "CLASIFICACION \tPJ \tPG \tPE \tPP \tGF \tGC \tPuntos \tEquipo";
		
		for(Equipo equipo : this) {
			
			cadena += "\n\t" + equipo.toStringLineal();
		}
		
		return cadena;
	}
	
	public String partidosPorFecha(String fecha) {
		
		String cadena = "Partidos jugados el " + fecha;
		
		Calendar c = Calendar.getInstance();
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-YYYY");
		
		try {
			
			c.setTime(format.parse(fecha));
			
		} catch (ParseException e) {
			
			System.out.println("Formato de fecha no valido. (DD-MM-YYYY)");
		}
		
		for(Partido partido : this.listaPartidos) {
			
			if (partido.getFecha().equals(c)) {
				
				cadena += "\n\t" + partido;
			}
		}
		
		return cadena;
	}
	
}
