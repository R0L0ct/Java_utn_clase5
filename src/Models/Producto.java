package Models;

public class Producto {
   private String nombre;
   private String codigo;
   private float precio;

    public Producto() {}

    public Producto(String nombre, String codigo, float precio ) {
       this.nombre = nombre;
       this.codigo = codigo;
       this.precio = precio;
    }


    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
