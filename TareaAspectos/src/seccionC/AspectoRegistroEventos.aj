package seccionC;

public aspect AspectoRegistroEventos {
	pointcut creacionRegistroEventos() : call(public static RegistroEventos RegistroEventos.obtenerInstancia());

    RegistroEventos around() : creacionRegistroEventos() {
        System.out.println("AspectJ: Asegurando la creación de la instancia de RegistroEventos.");
        return RegistroEventos.obtenerInstancia();
    }
}
