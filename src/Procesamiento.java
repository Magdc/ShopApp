import java.util.ArrayList;

public class Procesamiento {
    static int total = 0;
    static ArrayList<Producto> productos = new ArrayList<>();


   static public void pagar(){
        System.out.println("Debes pagar: "+total);
    }

   static  public void agregarProducto(Producto agregado){
        productos.add(agregado);
        total += agregado.getPrecio();
    }
    //porReferencia
   public static void eliminarProducto(int ref){
        for(int i = 0; i<productos.size();i++){
            if(ref == productos.get(i).getReferencia()){
                total -= productos.get(i).getPrecio();
                productos.remove(i);
                break;

            }
        }
    }
}
