import java.io.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Persistencia {
    public static PrintWriter scan;

    public static void imprimirTxt()throws IOException{
        scan = new PrintWriter(new File("productos.txt"));
        for(int i = 0; i<Procesamiento.productos.size();i++){
            scan.println("Talla: "+Procesamiento.productos.get(i).getTalla());
            scan.println("Referencia: "+Procesamiento.productos.get(i).getReferencia());
            scan.println("Precio: "+Procesamiento.productos.get(i).getPrecio());
        }

    }

}
