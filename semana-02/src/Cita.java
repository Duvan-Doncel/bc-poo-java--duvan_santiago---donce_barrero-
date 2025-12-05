public class Cita {

    private String fecha;
    private String hora;
    private Mascota mascota;
    private Veterinario veterinario;

    public Cita(String fecha, String hora, Mascota mascota, Veterinario veterinario) {
        this.fecha = fecha;
        this.hora = hora;
        this.mascota = mascota;
        this.veterinario = veterinario;
    }

    public String obtenerDescripcion() {
        return "Cita el " + fecha + " a las " + hora +
               " | Mascota: " + mascota.getNombre() +
               " | Veterinario: " + veterinario.getNombre();
    }
}
