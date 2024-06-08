package seccionA;

public class Main {

	public static void main(String[] args) {
        Hdmi hdmiDevice = new HdmiDevice();
        Usb adapter = new HdmiToUsbAdapter(hdmiDevice);
        adapter.connectWithUsbCable(); 
        
        ConfiguracionManager c_Manager1 = ConfiguracionManager.getInstance();
        ConfiguracionManager c_Manager2 = ConfiguracionManager.getInstance();

        c_Manager1.cargarConfiguracion();

        //La respuesta esperada es TRUE, se debe verificar que ambas
        //referencias apuntan a la misma instancia
        
        System.out.println(c_Manager1 == c_Manager2); 
        }
	}


