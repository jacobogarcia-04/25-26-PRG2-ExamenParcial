package entregas.garciaJacobo;

public class Cliente {

    public static void main(String[] args) {
        Console console = new Console();

        Gimnasio gimnasio = new Gimnasio("FitLife Center");
        Actividades actividad = new Actividades("Yoga", "Elena Ruiz", 20);
        Horario diaInicio = new Horario("Lun/Vie", 10.0, 12.0);
        Socios socios = new Socios("Juan García", "12345678A", "01/04/2025", "Alta");

        gimnasio.mostrarNombreGimnasio();
        console.writeln("");

        console.writeln("Actividades:");
        console.writeln("  \"" + actividad.nombrarActividad() + "\" - Monitor: " + actividad.nombrarMonitor() + " - "
                + diaInicio.preguntarHoraInicio() + " - Aforo: 20");
        console.writeln("");

        console.writeln("Socios:");
        console.writeln("  \"" + socios.preguntarNombreSocios() + "\" - DNI " + socios.preguntarDNI() + " - "
                + socios.preguntarEstadoInscripcion());
        console.writeln("");

        console.writeln("Reservas:");
        Reservas reservas = new Reservas("Juan García", "Yoga", "01/04/2025");
        console.writeln("  " + socios.preguntarNombreSocios() + " reserva \"" + actividad.nombrarActividad()
                + "\" el 01/04/2025");
    }
}