import java.util.ArrayList;

public class Problema4_Casos {
    public String nombre;
    public String fechaInicio;
    public String estado;
    public double danioEconomicoCausado;
    public ArrayList<Problema4_Personas> personas;

    public Problema4_Casos() {
    }

    public Problema4_Casos(String nombre, String fechaInicio, String estado, double danioEconomicoCausado, ArrayList<Problema4_Personas> personas) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.estado = estado;
        this.danioEconomicoCausado = danioEconomicoCausado;
        this.personas = personas;
    }
    
    
    public void agregarPersonas(Problema4_Personas persona){
        personas.add(persona);
    }
    
    public void actualizarEstado(int diasTranscurridos){
        if(diasTranscurridos > 14){
            estado = "Urgente";
        }else if(diasTranscurridos > 7){
            estado = "Alerta";
        }else{
            estado = "Iniciado";
        }
    }

    @Override
    public String toString() {
        String resultado = "";
        resultado =  "Nombre del Caso: " + nombre + "\n" +
               "Fecha de Inicio: " + fechaInicio + "\n" +
               "Estado: " + estado + "\n" + 
               "Dano Economico Causado: " + danioEconomicoCausado + "\n" +
               "\n+-----------------------+" + "\n" +
               "| Personas Involucradas |" + "\n" +
               "+-----------------------+\n";
        for(Problema4_Personas p: personas){
            resultado += p.toString() + "\n";
        }
        return resultado;

    }
      
}


