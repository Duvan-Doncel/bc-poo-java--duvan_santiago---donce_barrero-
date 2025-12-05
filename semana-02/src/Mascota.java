public class Mascota {

    private String nombre;
    private String especie;
    private int edad;
    private double peso;
    private boolean vacunado;

    private Dueño dueño;

    public Mascota(String nombre, String especie, int edad, double peso, boolean vacunado, Dueño dueño) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.peso = peso;
        this.vacunado = vacunado;
        this.dueño = dueño;

        dueño.agregarMascota();
    }

    public void mostrarInformacion() {
        System.out.println("=== INFORMACIÓN DE LA MASCOTA ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Vacunado: " + (vacunado ? "Sí" : "No"));
        System.out.println("Dueño: " + dueño.getNombre());
    }

    public double calcularDosisMedicamento() {
        return peso * 0.75;
    }

    public String getNombre() {
        return nombre;
    }

    public Dueño getDueño() {
        return dueño;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
