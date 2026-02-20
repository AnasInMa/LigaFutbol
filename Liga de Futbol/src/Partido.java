import java.util.Calendar;

public class Partido {

	private Equipo anfitrion, visitante;
	private String fecha;
	private byte golesAnfitrion, golesVisitante;
	public char resultadoPartido;
	private String resultado;
	
	public Partido(Equipo anfitrion, Equipo visitante, String fecha, byte gA, byte gV) {
		
		this.anfitrion = anfitrion;
		this.visitante = visitante;
		this.fecha = fecha;
		this.golesAnfitrion = gA;
		this.golesVisitante = gV;
		this.resultado = gA + "-" + gV;
		
		//Actualizacion equipos
		anfitrion.incrementaGolesMarcados(gA);
		visitante.incrementaGolesMarcados(gV);
		
		if(this.golesAnfitrion > golesVisitante) {

			this.anfitrion.incrementarPartidosGanados();
			this.visitante.incrementarPartidosPerdidos();

			this.resultadoPartido = '1';

		} else if(this.golesAnfitrion == golesVisitante) {

			this.anfitrion.incrementarPartidosEmpatados();
			this.visitante.incrementarPartidosEmpatados();

			this.resultadoPartido = 'X';

		} else {

			this.anfitrion.incrementarPartidosPerdidos();
			this.visitante.incrementarPartidosGanados();

			this.resultadoPartido = '2';
		}
	}
	
	@Override
	public String toString() {
		
		return this.anfitrion.getNombre() + " " + this.golesAnfitrion + ", "
			   + this.visitante.getNombre() + " " + this.golesVisitante;
	}
	
	/**
	 * Getters
	 * 
	 * @return
	 */
	public Equipo getAnfitrion() {
		return anfitrion;
	}

	public Equipo getVisitante() {
		return visitante;
	}

	public String getFecha() {
		return fecha;
	}

	public byte getGolesAnfitrion() {
		return golesAnfitrion;
	}

	public byte getGolesVisitante() {
		return golesVisitante;
	}

	public String getResultado() {
		return resultado;
	}
	
	
}
