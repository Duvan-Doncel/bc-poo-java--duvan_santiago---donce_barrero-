# Semana 02 - Clínica Veterinaria "Cuidado Animal"

Este proyecto corresponde a la Semana 02 del módulo de Programación Orientada a Objetos (OOP) en Java.

## 🐾 Dominio
Sistema para gestionar la información de una clínica veterinaria ubicada en Engativá, Bogotá.  
Incluye manejo de dueños, mascotas, citas médicas, servicios veterinarios y registro clínico.

## 📌 Contenido

### ✔ Clases existentes (Semana 1 incluidas en Semana 2)
- Dueño.java  
- Mascota.java  
- Veterinario.java  
- Cita.java  

### ✔ Nuevas clases (Semana 2)
- ServicioVeterinario.java  
- RegistroClinico.java (gestora con ArrayList)  
- Main.java

### ✔ Relaciones implementadas
- Mascota → Dueño  
- Cita → Mascota + Veterinario  
- ServicioVeterinario → Mascota  
- RegistroClinico → ArrayList de Cita y ServicioVeterinario  

### ✔ Clase Gestora
`RegistroClinico.java` administra colecciones de:
- Citas
- Servicios veterinarios

### ✔ Main
El archivo `Main.java` crea varios objetos, registra citas y servicios y muestra todos los registros.

## 📁 Estructura del directorio
