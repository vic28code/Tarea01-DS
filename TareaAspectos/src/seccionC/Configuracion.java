package seccionC;

import java.util.HashMap;
import java.util.Map;

public class Configuracion {
	private Map<String, String> configuraciones;
    private Configuracion() {
        configuraciones = new HashMap<>();
    }
    private static class ConfiguracionHolder {
        private static final Configuracion INSTANCIA = new Configuracion();
    }
    public static Configuracion obtenerInstancia() {
        return ConfiguracionHolder.INSTANCIA;
    }
    public void establecerValor(String clave, String valor) {
        configuraciones.put(clave, valor);
    }
    public String obtenerValor(String clave) {
        return configuraciones.get(clave);
    }
}

