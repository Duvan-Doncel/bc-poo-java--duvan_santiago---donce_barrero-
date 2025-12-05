public class Dueño {

    private String nombre;
    private String teléfono;
    private String dirección;
    private int númeroMascotas;

    public Dueño(String nombre, String teléfono, String dirección) {
        this.nombre = nombre;
        this.teléfono = teléfono;
        this.dirección = dirección;
        this.númeroMascotas = 0;
    }

    public void mostrarInformación() {
        System.out.println("=== INFORMACIÓN DEL DUEÑO ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Teléfono: " + teléfono);
        System.out.println("Dirección: " + dirección);
        System.out.println("Número de mascotas: " + númeroMascotas);
    }

    public void agregarMascota() {
        númeroMascotas++;
    }

    public boolean esClienteFrecuente() {
        return númeroMascotas >= 3;
    }

    public String getNombre() {
        return nombre;
    }
}
