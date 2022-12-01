package EjChispas;

import java.lang.*;

public class ImpresionFactura{

    private int codigoFactura;

    private String fechaFactura;  

    private String nif;  

    private String nombreCliente; 
    private String direccionCliente;
    private String poblacionCliente; 
    private String provinciaCliente; 
   
    private ventas[] ventas;

    private int baseImponible;  
    private int total; 

    public void print(Facturas invoice){}
    public String getFechaFactura(){return fechaFactura;}
    public String getNombreCliente(){return nombreCliente;}
    public String getNif(){return nif;}
    public String getDireccionCliente(){return direccionCliente;}
    public String getPoblacionCliente(){return poblacionCliente;}
    public String getProvinciaCliente(){return provinciaCliente;}

    public int getCodigoFactura(){return codigoFactura;}
    public int getBaseImponible(){return baseImponible;}
    public int getTotal(){return total;}

    public ventas[] getVentas(){return ventas;}

    public void setNombreCliente(String nombreCliente){this.nombreCliente=nombreCliente;}
    public void setDireccionCliente(String direccionCliente){this.direccionCliente=direccionCliente;}
    public void setNif(String nif){this.nif=nif;}
    public void setPoblacionCliente(String poblacionCliente){this.poblacionCliente=poblacionCliente;}
    public void setProvinciaCliente(String provinciaCliente){this.provinciaCliente=provinciaCliente;}
    public void setVentas(ventas[] ventas){this.ventas=ventas;}
    public void setFechaFactura(String fechaFactura){this.fechaFactura=fechaFactura;}

    public void setCodigoFactura(int codigoFactura){this.codigoFactura=codigoFactura;}
    public void setBaseImponible(int baseImponible){this.baseImponible=baseImponible;}
    public void setTotal(int total){this.total=total;}


}