package seccionA;

public class ConfiguracionManager {

    private static final ConfiguracionManager INSTANCIA = new ConfiguracionManager();

    // Constructor privado para evitar que se instancie de manera directa
    private ConfiguracionManager() {
        // Código de inicialización
    }

    public static ConfiguracionManager getInstance() {
        return INSTANCIA;
    }

    public void cargarConfiguracion() {
        System.out.println("Cargando configuración...");
    }
}
