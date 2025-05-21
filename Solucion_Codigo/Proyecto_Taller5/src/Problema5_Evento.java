/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Date;

/**
 *
 * @author Andrea
 */
class Problema5_Evento {

    String nombre;
    Date fecha;
    String ubicacion;
    String descripcion;
    String tipo; // "Batalla", "Tratado", etc.
    Problema5_Pais paisAfectado;
    int numeroBajas;
    boolean usoArmasNucleares;

    public Problema5_Evento(String nombre, Date fecha, String ubicacion, String descripcion,
            String tipo, Problema5_Pais paisAfectado, int numeroBajas, boolean usoArmasNucleares) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.ubicacion = ubicacion;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.paisAfectado = paisAfectado;
        this.numeroBajas = numeroBajas;
        this.usoArmasNucleares = usoArmasNucleares;
    }

    public String getTipo() {
        return tipo;
    }

    public Problema5_Pais getPaisAfectado() {
        return paisAfectado;
    }

    public boolean usoArmasNucleares() {
        return usoArmasNucleares;
    }
}
