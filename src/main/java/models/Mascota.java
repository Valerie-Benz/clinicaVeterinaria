/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author valer
 */
public class Mascota extends Animal {
    private String especie;

    public Mascota(String nombre, int edad, String especie) {
        super(nombre, edad);
        this.especie = especie;
    }

    public String getEspecie() { return especie; }
    public void setEspecie(String especie) { this.especie = especie; }
}
