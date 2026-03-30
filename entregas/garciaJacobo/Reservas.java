package entregas.garciaJacobo;

public class Reservas {
    private String nombre;
    private String actividad;
    private String fecha;

    public Reservas(String nombre, String actividad, String fecha) {
        this.nombre = nombre;
        this.actividad = actividad;
        this.fecha = fecha;
        if (this.esValida()) {
            Console console = new Console();
            console.writeln("SISTEMA: Reserva validada internamente con éxito.");
        }
    }

    private boolean esValida() {
        boolean tieneNombre = !this.nombre.equals("");
        boolean tieneActividad = !this.actividad.equals("");
        boolean tieneFecha = !this.fecha.equals("");

        return tieneNombre && tieneActividad && tieneFecha;
    }
}
