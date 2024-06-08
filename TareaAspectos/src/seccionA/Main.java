package seccionA;

public class Main {

	public static void main(String[] args) {
        Hdmi hdmiDevice = new HdmiDevice();
        Usb adapter = new HdmiToUsbAdapter(hdmiDevice);
        adapter.connectWithUsbCable(); 
   }

}
