package EjChispas;

import java.lang.*;

public class Productos implements Venta{

    private int codigoVenta;

    private String nombre;  

    private String marca;  

    private String modelo; 

    private int precio;  
    private TipoIVA tipoIVA;


    public String getNombre(){return nombre;}
    public String getMarca(){return marca;}
    public String getModelo(){return modelo;}


    public void setNombre(String nombre){this.nombre=nombre;}
    public void setMarca(String marca){this.marca=marca;}
    public void setModelo(String modelo){this.modelo=modelo;}
 

    public void setPrecio(int precio){this.precio=precio;}
    public void setTipoIVA(TipoIVA tipoIVA){this.tipoIVA=tipoIVA;}
    public void setCodigoVenta(int codigoVenta){this.codigoVenta=codigoVenta;}

    public int getPrecio(){return precio;}
    public TipoIVA getTipoIVA(){return tipoIVA;}
    public int getCodigoVenta(){return codigoVenta;}
}