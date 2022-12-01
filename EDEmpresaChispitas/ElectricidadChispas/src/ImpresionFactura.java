import java.lang.*;
import ventas;
public class ImpresionFactura{

    private int codigoFactura;

    private String fechaFactura;  

    private String nif;  

    private String nombreCliente; 
    private String direcionCliente;  
    private String poblacionCliente; 
    private String provinciaCliente; 
   
    private ventas[] ventas;

    private int baseImponible;  
    private int total; 

    public void print(Facturas invoice){}

 

    public void setNombre(String nombre){this.nombre=nombre;}
    public void setApellidos(String apellidos){this.apellidos=apellidos;}   
    public void setNif(String nif){this.nif=nif;}
    public void setPoblacion(String poblacion){this.poblacio=poblacion;}
    public void setProvincia(String provincia){this.provincia=provincia;}
    public void setEmail(String email){this.email=email;}


    public void setCodigoCliente(int codigoCliente){this.codigoCliente=codigoCliente;}
    public void setCodigoPostal(int codigoPostal){this.codigoCliente=codigoPostal;}
    public void setTelefono(int telefono){this.telefono=telefono;}


}