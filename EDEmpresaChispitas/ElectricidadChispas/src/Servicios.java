import java.lang.*;

public class Servicios{

    private int codigoServicio;

    private String nombre;  

    private int precio; 

    private int iva;


    public String getNombre(){return nombre;}

    public void setNombre(String nombre){this.nombre=nombre;}


    public void setPrecio(Int precio){this.precio=precio;}
    public void setIVA(int iva){this.iva=iva;}
    public void setCodigoServicio(int codigoServicio){this.codigoServicio=codigoServicio;}

    public String getPrecio(){return precio;}
    public String getIVA(){return iva;}
    public String getCodigoServicio(){return codigoServicio;}
}