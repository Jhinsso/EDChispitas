package EjChispas;
import java.lang.*;

public class Facturas{

    private int codigoFactura;

    private String fechaFactura;  

    private String cliente;  

    private String[] produtos; 
    private String[] servicios;  

    private int baseImporte;  
    private int total; 
    private TipoIVA tipoIVA;

    public String getFechaFactura(){return fechaFactura;}
    public String getCliente(){return cliente;}
    public String [] getProdutos(){return produtos;}
    public String [] getServicios(){return servicios;}

    public void setFechaFactura(String fechaFactura){this.fechaFactura=fechaFactura;}
    public void setCliente(String cliente){this.cliente=cliente;}
    public void setServicios(String[] servicios){this.servicios=servicios;}
    public void setProdutos(String[] produtos){this.produtos=produtos;}
    

    public void setCodigoFactura(int codigoFactura){this.codigoFactura=codigoFactura;}
    public void setBaseImporte(int baseImporte){this.baseImporte=baseImporte;}
    public void setTipoIVA(TipoIVA tipoIVA){this.tipoIVA=tipoIVA;}
    public void setTotal(int total){this.total=total;}

    public int getCodigoFactura(){return codigoFactura;}
    public int getBaseImporte(){return baseImporte;}
    public TipoIVA getTipoIVA(){return tipoIVA;}
    public int getTotal(){return total;}

}