/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author valer
 */
public class Veterinario {
    private String nombre;

    public Veterinario(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() { return nombre; }

    public void recetar(Medicamento medicamento) {
        System.out.println("El veterinario " + nombre + " receta: " + medicamento.getNombre());
    }
}
