package entregas.garciaJacobo;

public class Actividades {
    private String actividad;
    private String monitor;
    private int aforo;

    public Actividades(String actividad, String monitor, int aforo) {
        this.actividad = actividad;
        this.monitor = monitor;
        this.aforo = aforo;
    }

    public String nombrarActividad() {
        return this.actividad;
    }

    public String nombrarMonitor() {
        return this.monitor;
    }

    public void mostrarAforo() {
        Console console = new Console();
        console.writeln("Aforo de " + this.actividad + ": " + this.aforo);
    }

    public void mostrar() {
        Console console = new Console();
        console.writeln(this.actividad + " imparte " + this.monitor);
    }

    public void agregarActividad() {
        Console console = new Console();
        console.writeln("Procesando inscripción en " + this.actividad);
        console.writeln("Resultado: El socio ha sido vinculado a " + this.actividad + " (Aforo: " + this.aforo + ")");
    }
}
