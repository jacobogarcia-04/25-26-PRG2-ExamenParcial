package entregas.garciaJacobo;

public class Actividades {
    private String nombre;
    private String monitor;
    private int aforoMaximo;
    private int inscritos;

    private boolean estaLlena() {
        return this.inscritos >= this.aforoMaximo;
    }

    private int plazasLibres() {
        return this.aforoMaximo - this.inscritos;
    }
}
