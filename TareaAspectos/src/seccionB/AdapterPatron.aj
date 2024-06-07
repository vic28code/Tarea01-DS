package seccionB;

public aspect AdapterPatron {
    declare parents: SistemaPagoAntiguo implements NuevoSistemaPago;
    public void SistemaPagoAntiguo.ProcesarPago(double cantidad) {
        hacerPago(cantidad);
    }
}

