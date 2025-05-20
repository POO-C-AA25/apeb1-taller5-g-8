
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Problema4_EjecutorAppFiscalia {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Problema4_Personas> personasCaso1 = new ArrayList<>(Arrays.asList(
                new Problema4_Personas("Miguel Escaleras", 34, "Juez", "Acusado"),
                new Problema4_Personas("Jorge Espinoza", 24, "Abogado", "Victima"),
                new Problema4_Personas("Daniel Pezantes", 45, "Notario", "Testigo")       
        ));
        Problema4_Casos caso1 = new Problema4_Casos("Caso X", "17 de Mayo del 2025", "Iniciado", 56700, personasCaso1);
        String eleccion, nombre, ocupacion, implicacion;
        int edad, dias, sentencia;
        boolean colabora;
        
        
        System.out.println("\n+---------------------+");
        System.out.println("| Casos de Corrupcion |");
        System.out.println("+---------------------+");
        System.out.println(caso1.toString());
        
        System.out.print("Ingrese los Dias que han pasado desde el Inicio del Caso: ");
        dias = sc.nextInt();
        sc.nextLine();
        System.out.print("Desea Agregar una Persona al Caso(Si/No): ");
        eleccion = sc.nextLine();
        if(eleccion.equalsIgnoreCase("Si")){           
            System.out.print("Ingrese el Nombre de la Persona: ");
            nombre = sc.nextLine();
            System.out.print("Ingrese su Edad: ");
            edad = sc.nextInt();
            sc.nextLine();
            System.out.print("Ingrese la Ocupacion: ");
            ocupacion = sc.nextLine();
            System.out.print("Ingrese la Implicacion(Acusado/Testigo/Victima): ");
            implicacion = sc.nextLine();
            
            if(implicacion.equalsIgnoreCase("Acusado")){
                System.out.print("Ingrese la Sentencia en Meses: ");
                sentencia = sc.nextInt();
                sc.nextLine();
                colabora = true;
                Problema4_Personas nuevaPersona = new Problema4_Personas(nombre, edad, ocupacion, implicacion, sentencia, colabora);
                caso1.agregarPersonas(nuevaPersona);
                
                if(colabora && sentencia < 12){
                    double maxFianza;
                    maxFianza = caso1.danioEconomicoCausado * 0.5;
                    System.out.println("Puede Pagar una Fianza que Maximo es de: " + maxFianza);
                }else{
                    System.out.println("No Puede Pagar Fianza");
                }
            }else{
                Problema4_Personas nuevoAcusado = new Problema4_Personas(nombre, edad, ocupacion, implicacion);
                caso1.agregarPersonas(nuevoAcusado);
            }
        }
        System.out.println("\n+---Estado Final del Caso---+");
        System.out.println(caso1.toString());
    }
   
}
