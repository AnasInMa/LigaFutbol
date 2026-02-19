import java.util.Objects;

public class Equipo implements Comparable<Equipo>{

	private String nombre;
	private byte numeroPartidosGanados, numeroPartidosEmpatados, numeroPartidosPerdidos;
	private byte golesMarcados, golesRecibidos;
	
	
	public Equipo(String nombre, byte numeroPartidosGanados, byte numeroPartidosEmpatados, byte numeroPartidosPerdidos,
			byte golesMarcados, byte golesRecibidos) {
		
		this.nombre = nombre;
		this.numeroPartidosGanados = numeroPartidosGanados;
		this.numeroPartidosEmpatados = numeroPartidosEmpatados;
		this.numeroPartidosPerdidos = numeroPartidosPerdidos;
		this.golesMarcados = golesMarcados;
		this.golesRecibidos = golesRecibidos;
	}

	public byte TotalPartidosJugados() {
		
		return (byte) (this.numeroPartidosGanados + this.numeroPartidosEmpatados + this.numeroPartidosPerdidos);
	}
	
	public short puntosTotales() {
		
		return (short) (this.numeroPartidosGanados * 3 + this.numeroPartidosEmpatados);
	}

	public void incrementarPartidosGanados() {

		this.numeroPartidosGanados++;
	}

	public void incrementarPartidosEmpatados() {

		this.numeroPartidosEmpatados++;
	}

	public void incrementarPartidosPerdidos() {

		this.numeroPartidosPerdidos++;
	}
	
	public void incrementaGolesMarcados(byte goles) {
		
		this.golesMarcados += goles;
	}
	
	public void incrementaGolesRecibidos(byte goles) {
		
		this.golesRecibidos += goles;
	}
	
	@Override
	public int hashCode() {
		
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Equipo other = (Equipo) obj;
		
		return nombre.equalsIgnoreCase(other.nombre);
	}
	
	
	public static boolean comparaEquipos(Equipo e1, Equipo e2) {
		
		return e1.nombre.equalsIgnoreCase(e2.nombre);
	}
	
	@Override
	public int compareTo(Equipo o) {
		
		return this.nombre.compareToIgnoreCase(o.nombre);
	}
	
	@Override
	public String toString() {
		
		return this.nombre.toUpperCase() +
				"\n\tPartidos Jugados: " + this.TotalPartidosJugados() +
				"\n\tPartidos Ganados: " + this.numeroPartidosGanados +
				"\n\tPartidos Empatados: " + this.numeroPartidosEmpatados +
				"\n\tPartidos Perdidos: " + this.numeroPartidosPerdidos +
				"\n\tGoles a favor: " + this.golesMarcados +
				"\n\tGoles en contra: " + this.golesRecibidos +
				"\n\tPuntos acumulados: " + this.puntosTotales();
	}
	
	public String toStringLineal() {
		
		return 	this.TotalPartidosJugados() +
				"\t" + this.numeroPartidosGanados +
				"\t" + this.numeroPartidosEmpatados +
				"\t" + this.numeroPartidosPerdidos +
				"\t" + this.golesMarcados +
				"\t" + this.golesRecibidos +
				"\t" + this.puntosTotales() +
				"\t" + this.nombre.toUpperCase();
	}

	/**
	 * Getters y Setters
	 * 
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public byte getNumeroPartidosGanados() {
		return numeroPartidosGanados;
	}


	public void setNumeroPartidosGanados(byte numeroPartidosGanados) {
		this.numeroPartidosGanados = numeroPartidosGanados;
	}


	public byte getNumeroPartidosEmpatados() {
		return numeroPartidosEmpatados;
	}


	public void setNumeroPartidosEmpatados(byte numeroPartidosEmpatados) {
		this.numeroPartidosEmpatados = numeroPartidosEmpatados;
	}


	public byte getNumeroPartidosPerdidos() {
		return numeroPartidosPerdidos;
	}


	public void setNumeroPartidosPerdidos(byte numeroPartidosPerdidos) {
		this.numeroPartidosPerdidos = numeroPartidosPerdidos;
	}


	public byte getGolesMarcados() {
		return golesMarcados;
	}


	public void setGolesMarcados(byte golesMarcados) {
		this.golesMarcados = golesMarcados;
	}


	public byte getGolesRecibidos() {
		return golesRecibidos;
	}


	public void setGolesRecibidos(byte golesRecibidos) {
		this.golesRecibidos = golesRecibidos;
	}

}
