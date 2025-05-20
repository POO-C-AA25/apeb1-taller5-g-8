import java.util.Scanner;

public class Problema3_EjecutorSistemaCategorizacion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Problema3_Empresa empresa1 = new Problema3_Empresa();
        Problema3_Departamento[] departamentos1 = new Problema3_Departamento[3];
        String nombreEmpresa, RUC, direccionEmpresa, nombreDep;
        int numEmpleados;
        double produccionAnual;
        
        System.out.println("\n+-------------------------------------------------------+");
        System.out.println("| Sistema para Categorizar Departamentos en una Empresa |");
        System.out.println("+-------------------------------------------------------+");
        System.out.print("Ingrese el Nombre de la Empresa: ");
        nombreEmpresa = sc.nextLine();
        System.out.print("Ingrese el Numero RUC de la Empresa: ");
        RUC = sc.nextLine();
        System.out.print("Ingrese la Direccion de la Empresa: ");
        direccionEmpresa = sc.nextLine();
        
        System.out.println("\n+---------------+");
        System.out.println("| Departamentos |");
        System.out.println("+---------------+");     
        for(int cn = 0; cn < departamentos1.length; cn ++){
            System.out.println("Departamento N.-" + (cn + 1));
            System.out.print("Ingrese el Nombre del Departamento: ");
            nombreDep = sc.nextLine();
            System.out.print("Ingrese el Numero de Empleados: ");
            numEmpleados = sc.nextInt();
            System.out.print("Ingrese la Produccion Anual: ");
            produccionAnual = sc.nextDouble();
            sc.nextLine();
            
            departamentos1[cn] = new Problema3_Departamento(nombreDep, numEmpleados, produccionAnual);           
        }
        empresa1 = new Problema3_Empresa(nombreEmpresa, RUC, direccionEmpresa, departamentos1);
        
        System.out.println("\n+------------+");
        System.out.println("| Resultados |");
        System.out.println("+------------+");
        System.out.println(empresa1.toString());
        empresa1.clasificarCategorias();
        System.out.print(empresa1.mostrarDepartamentos());
        
    }
}
