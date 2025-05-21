/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Andrea
 */
class Problema2_Materia {
    public String nombre;
    public double acd;
    public double ape;
    public double aa;

    public Problema2_Materia(String nombre, double acd, double ape, double aa) {
        this.nombre = nombre;
        this.acd = acd;
        this.ape = ape;
        this.aa = aa;
    }

    public double calcularNotaTotal() {
        return acd + ape + aa;
    }

    public boolean aprobado() {
        return calcularNotaTotal() >= 7.0;
    }

    public String getNombre() {
        return nombre;
    }

    public double getNotaParcial() {
        return calcularNotaTotal();
    }

    @Override
    public String toString() {
        return "Problema2_Materia{" + "Nombre:" + nombre + ", acd=" + acd + ", ape=" + ape + ", aa=" + aa + '}';
    }
    
    
}
