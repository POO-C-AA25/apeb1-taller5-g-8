/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Andrea
 */
class Problema5_Pais {
    public String nombre;
    public boolean esDesarrollado;
    public double porcentajeBajas;

    public Problema5_Pais(String nombre, boolean esDesarrollado) {
        this.nombre = nombre;
        this.esDesarrollado = esDesarrollado;
        this.porcentajeBajas = 0;
    }

    public void actualizarBajas(double porcentaje) {
        this.porcentajeBajas = porcentaje;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean esDesarrollado() {
        return esDesarrollado;
    }

    public double getPorcentajeBajas() {
        return porcentajeBajas;
    }

    @Override
    public String toString() {
        return "Problema5_Pais{" + "nombre: " + nombre + ", esDesarrollado: " + esDesarrollado
                + ", porcentajeBajas: " + porcentajeBajas + '}';
    }
    
    
}
