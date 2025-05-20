import java.util.Scanner;

public class Problema1_EjecutorSistemaVentas {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Problema1_Producto[] producto = {
            new Problema1_Producto("Manzanas", 0.50, 15), 
            new Problema1_Producto("Leche", 1.20, 23),
            new Problema1_Producto("Huevos", 0.20, 34),
            new Problema1_Producto("Arroz", 1.50, 19)
        };
        Problema1_CarritoDeCompras carrito = new Problema1_CarritoDeCompras(producto);
        
        String nombreP;
        int cantidadP, agregado;
        double montoPagar;
        System.out.println("\n+--------+");
        System.out.println("| Tienda |");
        System.out.println("+--------+");
        System.out.println("Productos Disponibles");
        for(Problema1_Producto product: producto){
            System.out.println("======================");
            System.out.println("Nombre: " + product.nombre);
            System.out.println("Cantidad Disponible: " + product.cantidad);
            System.out.println("Precio: " + product.precio);
        }
            
        System.out.print("Ingrese el Nombre del Producto: ");
        nombreP = sc.nextLine();
        System.out.print("Ingrese la Cantidad a Comprar: ");
        cantidadP = sc.nextInt();
        
        agregado = carrito.agregarProducto(nombreP, cantidadP);
        if(agregado == -1){
            System.out.println("El Producto no Existe...");
        }else if(agregado == 0){
            System.out.println("Cantidad Insuficiente...");
        }else{
            carrito.calcularTotal();
            carrito.toString();
            System.out.print("Ingrese el Monto a Pagar: ");
            montoPagar = sc.nextDouble();
            if(carrito.realizarPago(montoPagar)){
                System.out.println("Gracias por su Compra...");
                System.out.println("\n+---------+");
                System.out.println("| Factura |");
                System.out.println("+---------+");
                carrito.toString();
                System.out.println(carrito.toString());
                
            }else{
                System.out.println("Pago Insuficiente le faltan " + carrito.pagoFaltante);
            }
        }
        
    }
    
}
