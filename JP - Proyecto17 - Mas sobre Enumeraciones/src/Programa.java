public class Programa {

	public static void main(String[] args) {
		CuentaBancaria cta01 = new CuentaBancaria();
		cta01.propietario = "Juan Díaz";
		cta01.saldo = 12_000.0;
		cta01.numero = "JPD01535";
		cta01.tipo = TipoCuenta.Ahorro;
		
		System.out.println(cta01.tipo.getDescripcion());

	}
}