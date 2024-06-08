package seccionC;

public aspect AspectoConfiguracion {
	pointcut creacionConfiguracion() : call(public static seccionC.Configuracion seccionC.Configuracion.obtenerInstancia());

    Configuracion around() : creacionConfiguracion() {
        System.out.println("AspectJ: Asegurando la creación de la instancia de Configuracion.");
        return Configuracion.obtenerInstancia();
    }
}
