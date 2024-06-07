package seccionB;

public class Main2 {

	public static void main(String[] args) {
		SistemaPagoAntiguo pago_antiguo = new SistemaPagoAntiguo();
		NuevoSistemaPago Adapter_pago = (NuevoSistemaPago) pago_antiguo;
        Adapter_pago.ProcesarPago(100.0);

	}

}
