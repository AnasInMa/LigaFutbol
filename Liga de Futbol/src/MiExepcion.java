
public class MiExepcion extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3366566322243951077L;

	public MiExepcion() {
		
		this.getMessage();
	}
	
	public MiExepcion(String mensaje) {
		
		super(mensaje);
	}
	
}