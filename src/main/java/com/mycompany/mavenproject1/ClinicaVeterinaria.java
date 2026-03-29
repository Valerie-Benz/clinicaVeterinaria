/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;
import models.*;
/**
 *
 * @author valer
 */
import java.util.ArrayList;

public class ClinicaVeterinaria {
    public static void main(String[] args) {
        // Crear propietarios y mascotas
        Propietario p1 = new Propietario("Valeria");
        Mascota m1 = new Mascota("Luna", 3, "Perro");
        Mascota m2 = new Mascota("Michi", 2, "Gato");
        p1.agregarMascota(m1);
        p1.agregarMascota(m2);

        // Crear veterinario
        Veterinario v1 = new Veterinario("Dr. Pérez");

        // Crear consulta
        Consulta c1 = new Consulta(m1, v1);
        Medicamento med1 = new Medicamento("Antibiótico", "2 veces al día");
        Medicamento med2 = new Medicamento("Vitaminas", "1 vez al día");

        c1.agregarMedicamento(med1);
        c1.agregarMedicamento(med2);

        // Mostrar datos
        System.out.println("Propietario: " + p1.getNombre());
        System.out.println("Mascotas:");
        for (Mascota m : p1.getMascotas()) {
            System.out.println("- " + m.getNombre() + " (" + m.getEspecie() + ")");
        }

        System.out.println("\nConsultas realizadas:");
        c1.mostrarConsulta();
    }
}