package seccionC;

public class RegistroEventos {
	private RegistroEventos() { }

    private static class RegistroEventosHolder {
        private static final RegistroEventos INSTANCIA = new RegistroEventos();
    }

    public static RegistroEventos obtenerInstancia() {
        return RegistroEventosHolder.INSTANCIA;
    }

    public void registrar(String mensaje) {
        System.out.println("Registro: " + mensaje);
    }
}