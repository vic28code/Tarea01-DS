package seccionC;
import seccionB.Configuracion;

public class Main2 {

	public static void main(String[] args) {
        
        Configuracion config1 = Configuracion.obtenerInstancia();
        Configuracion config2 = Configuracion.obtenerInstancia();

        config1.establecerValor("clave1", "valor1");
        System.out.println("Config 1, clave1: " + config1.obtenerValor("clave1"));

        config2.establecerValor("clave2", "valor2");
        System.out.println("Config 2, clave2: " + config2.obtenerValor("clave2"));

        System.out.println("Hash de config 1:" + config1.hashCode());
        System.out.println("Hash de config 2:" + config2.hashCode());

        if (config1 == config2) {
            System.out.println("Ambas configuraciones son la misma instancia.");
        } else {
            System.out.println("Las configuraciones son instancias diferentes.");
        }
	}

}
