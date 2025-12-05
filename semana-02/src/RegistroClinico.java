import java.util.ArrayList;

public class RegistroClinico {

    private String nombreClinica;
    private ArrayList<Cita> citas;
    private ArrayList<ServicioVeterinario> servicios;

    public RegistroClinico(String nombreClinica) {
        this.nombreClinica = nombreClinica;
        this.citas = new ArrayList<>();
        this.servicios = new ArrayList<>();
    }

    public void agregarCita(Cita cita) {
        citas.add(cita);
    }

    public void agregarServicio(ServicioVeterinario servicio) {
        servicios.add(servicio);
    }

    public void mostrarRegistros() {
        System.out.println("\n===== REGISTROS DE " + nombreClinica + " =====");

        System.out.println("\n--- CITAS ---");
        for (Cita c : citas) {
            System.out.println(c.obtenerDescripcion());
        }

        System.out.println("\n--- SERVICIOS ---");
        for (ServicioVeterinario s : servicios) {
            System.out.println(s.obtenerDetalle());
        }
    }

    public int contarCitas() {
        return citas.size();
    }

    public int contarServicios() {
        return servicios.size();
    }
}
