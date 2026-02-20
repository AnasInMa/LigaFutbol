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
	
	public String partidosPorFecha(String fecha) throws MiExepcion {
		
		int cont = 0;

		String cadena = "Partidos jugados el " + fecha;


		for(Partido partido : this.listaPartidos) {

			if (partido.getFecha().equals(fecha)) {

				cadena += "\n\t" + partido;
				
				cont++;
			}
		}
		
		if(cont == 0) throw new MiExepcion("ola");
		
		return cadena;
	}

}
