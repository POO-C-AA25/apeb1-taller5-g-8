
public class Problema3_Departamento {
    public String nombre;
    public int numEmpleados;
    public double produccionAnual;
    public String categoria;

    public Problema3_Departamento() {
    }

    public Problema3_Departamento(String nombre, int numEmpleados, double produccionAnual) {
        this.nombre = nombre;
        this.numEmpleados = numEmpleados;
        this.produccionAnual = produccionAnual;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumEmpleados(int numEmpleados) {
        this.numEmpleados = numEmpleados;
    }

    public void setProduccionAnual(double produccionAnual) {
        this.produccionAnual = produccionAnual;
    }
    
    
    
    public void determinarCategoria(){
        if(numEmpleados <= 10 && produccionAnual <= 500000){
            categoria = "C";
            
        }else if(numEmpleados <= 20 && produccionAnual <= 1000000){
            categoria = "B";
        }else{
            categoria = "A";
        }
    }

    @Override
    public String toString() {
        return "       Departamento: " + nombre + "\n" +
               "Numero de Empleados: " + numEmpleados + "\n" +
               "   Produccion Anual: " + produccionAnual + "\n" +
               "           Catgoria: " + categoria;
    }
        
}
