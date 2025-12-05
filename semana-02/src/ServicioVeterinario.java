public class ServicioVeterinario {

    private String tipoServicio;
    private double costo;
    private String fecha;
    private Mascota mascota;

    public ServicioVeterinario(String tipoServicio, double costo, String fecha, Mascota mascota) {
        this.tipoServicio = tipoServicio;
        this.costo = costo;
        this.fecha = fecha;
        this.mascota = mascota;
    }

    public String obtenerDetalle() {
        return "Servicio: " + tipoServicio +
               " | Costo: $" + costo +
               " | Fecha: " + fecha +
               "\nMascota: " + mascota.getNombre() +
               " | Dueño: " + mascota.getDueño().getNombre();
    }
}
