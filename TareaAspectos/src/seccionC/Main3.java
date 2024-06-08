package seccionC;

public class main3 {

	 public static void main(String[] args) {
	        RegistroEventos registro1 = RegistroEventos.obtenerInstancia();
	        RegistroEventos registro2 = RegistroEventos.obtenerInstancia();

	        registro1.registrar("Este es el primer mensaje de registro.");
	        registro2.registrar("Este es el segundo mensaje de registro.");

	        System.out.println("Hash de registro 1:" + registro1.hashCode());
	        System.out.println("Hash de registro 2:" + registro2.hashCode());

	        if (registro1 == registro2) {
	            System.out.println("Ambos registros son la misma instancia.");
	        } else {
	            System.out.println("Los registros son instancias diferentes.");
	        }
	    }
	}

