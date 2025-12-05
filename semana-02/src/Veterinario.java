public class Veterinario {

    private String nombre;
    private String especialidad;
    private int experiencia;

    public Veterinario(String nombre, String especialidad, int experiencia) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.experiencia = experiencia;
    }

    public String obtenerPerfil() {
        return "Veterinario: " + nombre +
               " | Especialidad: " + especialidad +
               " | Experiencia: " + experiencia + " años";
    }

    public String getNombre() {
        return nombre;
    }
}
