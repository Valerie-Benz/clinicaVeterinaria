/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author valer
 */
import java.util.ArrayList;

public class Consulta {
    private Mascota mascota;
    private Veterinario veterinario;
    private ArrayList<Medicamento> medicamentos;

    public Consulta(Mascota mascota, Veterinario veterinario) {
        this.mascota = mascota;
        this.veterinario = veterinario;
        this.medicamentos = new ArrayList<>();
    }

    public void agregarMedicamento(Medicamento medicamento) {
        medicamentos.add(medicamento);
    }

    public void mostrarConsulta() {
        System.out.println("Consulta de la mascota: " + mascota.getNombre() +
                           " atendida por el veterinario: " + veterinario.getNombre());
        System.out.println("Medicamentos recetados:");
        for (Medicamento m : medicamentos) {
            System.out.println("- " + m.getNombre() + " (" + m.getDosis() + ")");
        }
    }
}