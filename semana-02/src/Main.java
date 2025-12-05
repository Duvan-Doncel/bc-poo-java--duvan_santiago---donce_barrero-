public class Main {
    public static void main(String[] args) {

        Dueño dueño = new Dueño("Carlos López", "310555789", "Engativá, Bogotá");
        Mascota mascota = new Mascota("Nala", "Perro", 3, 12.5, true, dueño);
        Veterinario vet = new Veterinario("Dra. Pérez", "Dermatología", 8);

        Cita cita = new Cita("2025-02-10", "10:30 AM", mascota, vet);

       ServicioVeterinario servicio = new ServicioVeterinario(
            "Vacunación Antirrábica",
            45000,
            "2025-02-10",
            mascota
        );

        RegistroClinico registro = new RegistroClinico("Cuidado Animal - Engativá");

        registro.agregarCita(cita);
        registro.agregarServicio(servicio);

        registro.mostrarRegistros();

        System.out.println("\nTotal de citas: " + registro.contarCitas());
        System.out.println("Total de servicios: " + registro.contarServicios());
    }
}
