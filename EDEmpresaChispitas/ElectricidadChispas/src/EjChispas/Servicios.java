package EjChispas;

import java.lang.*;

public class Servicios implements Venta{

    private int codigoVenta;

    private String nombre;  

    private int precio; 

    private int iva;


    public String getNombre(){return nombre;}

    public void setNombre(String nombre){this.nombre=nombre;}


    public void setPrecio(int precio){this.precio=precio;}
    public void setIVA(int iva){this.iva=iva;}
    public void setCodigoVenta(int codigoServicio){this.codigoVenta=codigoVenta;}

    public int getPrecio(){return precio;}
    public int getIVA(){return iva;}
    public int getCodigoVenta(){return codigoVenta;}
}