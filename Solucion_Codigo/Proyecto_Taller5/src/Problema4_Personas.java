
public class Problema4_Personas {
    public String nombre;
    public int edad;
    public String ocupacion;
    public String implicacion;
    public int sentenciaMeses;
    public boolean colabora;

    public Problema4_Personas() {
    }

    public Problema4_Personas(String nombre, int edad, String ocupacion, String implicacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.ocupacion = ocupacion;
        this.implicacion = implicacion;
    }
    
    public Problema4_Personas(String nombre, int edad, String ocupacion, String implicacion, int sentenciaMeses, boolean colabora){
        this(nombre, edad, ocupacion, implicacion);
        this.sentenciaMeses = sentenciaMeses;
        this.colabora = colabora;
    }

    @Override
    public String toString() {
        String info;
        info = "Nombre de la Persona: " + nombre + "\n" +
               "Edad: " + edad + "\n" +
               "Ocupacion: " + ocupacion + "\n" +
               "Implicacion: " + implicacion + "\n";
        if(implicacion.equalsIgnoreCase("Acusado")){
            info += "Sentencia(meses): " + sentenciaMeses + "\n" +
                    "Colabora?: " + (colabora ? "Si": "No") + "\n";              
        }
        return info;
    }
    
 
}
