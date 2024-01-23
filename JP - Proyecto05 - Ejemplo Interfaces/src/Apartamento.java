public class Apartamento implements IHabitable {
	public boolean puertaAbierta = false;
	@Override public void abrirPuerta() {
		this.puertaAbierta = true;
		System.out.println("Puerta abierta");
	}
	@Override public void cerrarPuerta() {
		this.puertaAbierta = false;
		System.out.println("Puerta cerrada");		
	}	
}