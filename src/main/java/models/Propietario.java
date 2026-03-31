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

public class Propietario {
    
    private String nombre;
    private ArrayList<Mascota> mascotas;

    public void setMascotas(ArrayList<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    @Override
    public String toString() {
        return "Propietario{" + "nombre=" + nombre + ", mascotas=" + mascotas + '}';
    }

    public Propietario(String nombre) {
        this.nombre = nombre;
        this.mascotas = new ArrayList<>();
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public ArrayList<Mascota> getMascotas() { return mascotas; }
    public void agregarMascota(Mascota mascota) {
        mascotas.add(mascota);
    }
}