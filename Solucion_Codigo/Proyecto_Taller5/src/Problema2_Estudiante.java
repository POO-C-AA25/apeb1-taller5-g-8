/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Andrea
 */
class Problema2_Estudiante {

    

    public String nombre;
    public int edad;
    public Problema2_Materia materia;

    public Problema2_Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void asignarMateria(Problema2_Materia materia) {
        this.materia = materia;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
    @Override
    public String toString() {
        return "Problema2_Estudiante{" + "nombre=" + nombre + ", edad=" + edad + ", materia=" + materia + '}';
    }
}
