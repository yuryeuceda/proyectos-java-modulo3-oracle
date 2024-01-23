public enum TipoCuenta {	
/*
public class TipoCuenta {
	public static TipoCuenta Ahorro = new TipoCuenta("Cuenta de ahorro");
	public static TipoCuenta Planilla = new TipoCuenta("Cuenta de planilla");
	public static TipoCuenta Cheque = new TipoCuenta("Cuenta de cheques");
*/
	Ahorro("Cuenta de ahorro"),
	Planilla("Cuenta de planilla"),
	Cheque("Cuenta de cheques"),
	Aportaciones("Cuenta de aportaciones"),
	Crédito("Cuenta de crédito");
	
	// Agregamos una descripción
	private String descripción;
	
	// constructor dentro de el enumerado
	private TipoCuenta(String descripción) {
		this.descripción = descripción;
	}
	
	private TipoCuenta() {
		this.descripción = "Tipo de cuenta sin especificar";
	}
	
	public String getDescripcion() {
		return this.descripción;
	}
	
}