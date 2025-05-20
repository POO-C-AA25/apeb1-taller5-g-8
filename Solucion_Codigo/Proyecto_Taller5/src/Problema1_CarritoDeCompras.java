
public class Problema1_CarritoDeCompras {
    public Problema1_Producto[] producto;
    public Problema1_Producto productoComprado;
    public double totalCompra;
    public double pagoFaltante;
    public double descuento = 0.10;

    public Problema1_CarritoDeCompras() {
    }

    public Problema1_CarritoDeCompras(Problema1_Producto[] producto) {
        this.producto = producto;
    }
    
    
    public int agregarProducto(String nombre, int cantidad){
        for(Problema1_Producto p : producto){
            if(nombre.equalsIgnoreCase(p.getNombre())){
                if(cantidad <= p.getCantidad()){
                    productoComprado = new Problema1_Producto(p.getNombre(), p.getPrecio(), cantidad);
                    return 1;
                }else{
                return 0;
                }
            }
        }
        return -1;
    }
    
    public void calcularTotal(){
        totalCompra = productoComprado.getCantidad() * productoComprado.getPrecio();
        if(totalCompra > 1000){
            totalCompra -= totalCompra * descuento;
        }
    }
    
    public boolean realizarPago(double montoPagar){
        int restarCantidad;
        if(totalCompra > 1000){
            totalCompra -= totalCompra * (10.0 / 100);
        }
        if(montoPagar >= totalCompra){         
            for(Problema1_Producto p : producto){
                if(productoComprado.getNombre().equalsIgnoreCase(p.getNombre())){     
                    restarCantidad = p.getCantidad() - productoComprado.getCantidad();
                    p.setCantidad(restarCantidad);
                    return true;
                }
            }
        }
        pagoFaltante = totalCompra - montoPagar;
        return false;       
    }

    @Override
    public String toString() {
        return "Producto Comprado: " + productoComprado.getNombre() + "\n" +
               "Cantidad: " + productoComprado.getCantidad() + "\n" +
               "Total a Pagar: " + totalCompra;
    }
    
    
}
