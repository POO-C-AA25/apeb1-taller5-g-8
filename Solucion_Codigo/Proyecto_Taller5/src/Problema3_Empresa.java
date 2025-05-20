
public class Problema3_Empresa {
    public String nombre;
    public String RUC;
    public String direccion;
    public Problema3_Departamento[] departamentos;

    public Problema3_Empresa() {
    }

    public Problema3_Empresa(String nombre, String RUC, String direccion, Problema3_Departamento[] departamentos) {
        this.nombre = nombre;
        this.RUC = RUC;
        this.direccion = direccion;
        this.departamentos = departamentos;
    }
    
    public void clasificarCategorias(){
        for(Problema3_Departamento dep: departamentos){
            dep.determinarCategoria();
        }
    }
    
    public String mostrarDepartamentos(){
        String resultado = "";
        for(Problema3_Departamento dep: departamentos){
            resultado += dep.toString() + "\n";
        }
        return resultado;
    }

    @Override
    public String toString() {
        return "  Empresa: " + nombre + "\n" +
               "      RUC: " + RUC + "\n" +
               "Direccion: " + direccion;
    }
    
}
