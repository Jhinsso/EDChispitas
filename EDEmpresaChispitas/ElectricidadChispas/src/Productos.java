import java.lang.*;

public class Productos{

    private int codigoProducto;

    private String nombre;  

    private String marca;  

    private String modelo; 

    private int precio;  
    private int iva;  


    public String getNombre(){return nombre;}
    public String getMarca(){return marca;}
    public String getModelo(){return modelo;}


    public void setNombre(String nombre){this.nombre=nombre;}
    public void setMarca(String marca){this.marca=marca;}
    public void setModelo(String modelo){this.modelo=modelo;}
 

    public void setPrecio(Int precio){this.precio=precio;}
    public void setIVA(int iva){this.iva=iva;}
    public void setCodigoProducto(int codigoProducto){this.codigoProducto=codigoProducto;}

    public String getPrecio(){return precio;}
    public String getIVA(){return iva;}
    public String getCodigoProducto(){return codigoProducto;}
}