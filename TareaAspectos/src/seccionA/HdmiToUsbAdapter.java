package seccionA;

public class HdmiToUsbAdapter implements Usb{

    private Hdmi hdmiDevice;

    public HdmiToUsbAdapter(Hdmi hdmiDevice) {
        this.hdmiDevice = hdmiDevice;
        }

    @Override
    public void connectWithUsbCable() {
        hdmiDevice.connectWithHdmiCable();
        System.out.println("Adaptado a conexión USB");
        }
}