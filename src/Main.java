import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{

        Producto p1 = new Producto(15,1, 20000);
        Producto p2 = new Producto(20,2,25000);
        Producto p3 = new Producto(25,3,30009);
        Procesamiento.agregarProducto(p1);
        Procesamiento.agregarProducto(p2);
        Procesamiento.agregarProducto(p3);
        Persistencia.imprimirTxt();
        Procesamiento.pagar();
        Procesamiento.eliminarProducto(3);
        Persistencia.imprimirTxt();
        Procesamiento.pagar();
        Persistencia.scan.close();
    }
}