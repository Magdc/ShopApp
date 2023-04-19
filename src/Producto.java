public class Producto {
    private int talla;
    private int referencia;
    private  int precio;
    public Producto(int t, int r, int p){
        this.talla = t;
        this.referencia = r;
        this. precio = p;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public int getReferencia() {
        return referencia;
    }

    public void setReferencia(int referencia) {
        this.referencia = referencia;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
