
public class Programa {
	public static void main(String[] args) {
		Casa miCasa = new Casa();
		System.out.println("Abrimos y cerramos la puerta de la casa");
		miCasa.abrirPuerta();
		miCasa.cerrarPuerta();

		Apartamento miApartamento = new Apartamento();
		System.out.println("Abrimos y cerramos la puerta del apartamento");
		miApartamento.abrirPuerta();
		miApartamento.cerrarPuerta();
		
		// Aqui viene lo chido: Polimorfismo
		// Creo una variable de tipo Interfaz y la hago que controle un objeto
		IHabitable superLlave = miCasa;
		// Ahora voy a abrir miCasa con esta superLlave
		System.out.println("Abro y cierro la casa con la superLlave");
		superLlave.abrirPuerta();
		superLlave.cerrarPuerta();
		
		// Ahora hago que la superLlave apunte al Apartamento
		superLlave = miApartamento;
		// Ahora abro y cierro el apartamento con la superLlave
		System.out.println("Abro y cierro el apartamento con la superLlave");
		superLlave.abrirPuerta();
		superLlave.cerrarPuerta();
		
		
	}
}
