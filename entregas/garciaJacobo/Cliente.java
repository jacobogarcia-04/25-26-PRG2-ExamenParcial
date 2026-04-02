
package entregas.garciaJacobo;

public class Cliente {

    public static void main(String[] args) {

        Console console = new Console();

        Gimnasio gimnasio = new Gimnasio("FitLife Center");
        Actividades yoga = new Actividades("Yoga", "Elena Ruiz", 20);
        Horario horYoga = new Horario("Lun/Vie", 10.0, 12.0);
        Socios socio1 = new Socios("Juan García", "12345678A", "01/04/2025", "ALTA");

        gimnasio.mostrarNombreGimnasio();
        console.writeln("");

        console.writeln("Actividades:");
        console.writeln("  \"" + yoga.nombrarActividad() + "\" - Monitor/a: " + yoga.nombrarMonitor() + " - "
                + horYoga.preguntarDia() + " " + horYoga.preguntarHoraInicio() + horYoga.preguntarHoraFinal());
        console.writeln("");

        console.writeln("Socios:");
        console.write("  \"" + socio1.preguntarNombreSocios() + "\" - DNI: " + socio1.preguntarDNI());
        console.writeln("  " + socio1.preguntarEstadoInscripcion());
        console.writeln("");

        console.writeln("Reservas:");
        Reservas res1 = new Reservas(socio1.preguntarNombreSocios(), "Yoga", "01/04/2025");

        yoga.agregarActividad();

        console.write("  Socio: " + socio1.preguntarNombreSocios() + " en ");
        yoga.mostrar();

        yoga.mostrarAforo();

        console.writeln("  Fecha: " + socio1.preguntarFechaInscripcion());
    }
}