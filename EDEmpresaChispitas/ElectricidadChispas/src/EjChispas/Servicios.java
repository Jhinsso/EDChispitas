package EjChispas;

import java.lang.*;

public class Servicios implements Venta{

    private int codigoVenta;

    private String nombre;  

    private int precio; 

    private TipoIVA tipoIVA;


    public String getNombre(){return nombre;}

    public void setNombre(String nombre){this.nombre=nombre;}


    public void setPrecio(int precio){this.precio=precio;}
    public void setTipoIVA(TipoIVA TipoIVA){this.tipoIVA=tipoIVA;}
    public void setCodigoVenta(int codigoServicio){this.codigoVenta=codigoVenta;}

    public int getPrecio(){return precio;}
    public TipoIVA getTipoIVA(){return tipoIVA;}
    public int getCodigoVenta(){return codigoVenta;}
}