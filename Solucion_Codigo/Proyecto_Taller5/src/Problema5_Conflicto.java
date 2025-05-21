
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Date;

/**
 *
 * @author Andrea
 */
class Problema5_Conflicto {

    public String nombre;
    public Date fechaInicio;
    public String estadoActual;
    public String descripcion;
    public Problema5_Pais[] paisesInvolucrados;
    public Problema5_Evento[] eventos;
    public int numPaises;
    public int numEventos;

    public Problema5_Conflicto(String nombre, Date fechaInicio, String descripcion) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.descripcion = descripcion;
        this.estadoActual = "Activo";
        this.paisesInvolucrados = new Problema5_Pais[10]; 
        this.eventos = new Problema5_Evento[10];          
        this.numPaises = 0;
        this.numEventos = 0;
    }

    public void agregarPais(Problema5_Pais pais) {
        if (numPaises == paisesInvolucrados.length) {
            redimensionarPaises();
        }
        paisesInvolucrados[numPaises++] = pais;
    }

    public void agregarEvento(Problema5_Evento evento) {
        if (numEventos == eventos.length) {
            redimensionarEventos();
        }
        eventos[numEventos++] = evento;
        evaluarEscalada();
    }

    public void redimensionarPaises() {
        Problema5_Pais[] nuevoArreglo = new Problema5_Pais[paisesInvolucrados.length * 2];
        for (int i = 0; i < paisesInvolucrados.length; i++) {
            nuevoArreglo[i] = paisesInvolucrados[i];
        }
        paisesInvolucrados = nuevoArreglo;
    }

    public void redimensionarEventos() {
        Problema5_Evento[] nuevoArreglo = new Problema5_Evento[eventos.length * 2];
        for (int i = 0; i < eventos.length; i++) {
            nuevoArreglo[i] = eventos[i];
        }
        eventos = nuevoArreglo;
    }

    public void evaluarEscalada() {
        int totalPaises = 195; 
        int[] paisesConBatalla = new int[totalPaises];
        int contadorBatallas = 0;
        boolean armasNuclearesEnPaisDesarrollado = false;

        for (int i = 0; i < numEventos; i++) {
            Problema5_Evento evento = eventos[i];

            if (evento.getTipo().equalsIgnoreCase("Batalla")) {
                boolean yaContado = false;
                for (int j = 0; j < contadorBatallas; j++) {
                    if (paisesConBatalla[j] == evento.getPaisAfectado().hashCode()) {
                        yaContado = true;
                        break;
                    }
                }
                if (!yaContado) {
                    paisesConBatalla[contadorBatallas++] = evento.getPaisAfectado().hashCode();
                }
                if (evento.getPaisAfectado().esDesarrollado() && evento.usoArmasNucleares()) {
                    armasNuclearesEnPaisDesarrollado = true;
                }
                if (evento.getPaisAfectado().getPorcentajeBajas() >= 50) {
                    Problema5_ONU.convocarReunionUrgente(this, "Bajas >= 50% en " + evento.getPaisAfectado().getNombre());
                }
            }
        }
        double porcentajeBatalla = (double) contadorBatallas / totalPaises * 100;

        if (porcentajeBatalla > 50 || armasNuclearesEnPaisDesarrollado) {
            estadoActual = "Guerra Mundial";
            Problema5_ONU.declararGuerraMundial(this);
        } else if (porcentajeBatalla >= 30) {
            Problema5_ONU.convocarReunionUrgente(this, "Batallas en más del 30% de países");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void mostrarEstado() {
        System.out.println("Conflicto: " + nombre + " | Estado: " + estadoActual);
    }

}
