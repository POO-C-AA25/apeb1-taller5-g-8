/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Date;

/**
 *
 * @author Andrea
 */
public class Problema5_SistemaConflictos {

    public static void main(String[] args) {
        Problema5_Conflicto conflicto = new Problema5_Conflicto("Conflicto del Norte", new Date(), "Tension por recursos");
        Problema5_Pais pais1 = new Problema5_Pais("Pais A", true);
        Problema5_Pais pais2 = new Problema5_Pais("Pais B", false);
        conflicto.agregarPais(pais1);
        conflicto.agregarPais(pais2);
        pais1.actualizarBajas(55);
        Problema5_Evento evento = new Problema5_Evento(
                "Batalla en la capital",
                new Date(),
                "Ciudad Central",
                "Enfrentamiento armado severo",
                "Batalla",
                pais1,
                1000,
                true
        );
        conflicto.agregarEvento(evento);
        conflicto.mostrarEstado();
    }
}
