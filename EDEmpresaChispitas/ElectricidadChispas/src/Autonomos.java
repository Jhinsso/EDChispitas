import java.lang.*;

public class Autonomos implements Cliente{
    private int codigoCliente;
    private String nombre;  
    private String apellidos; 
    private String nif;  

    private int codigoPostal; 

    private String poblacion;  
    private String provincia;  
    private String email;  

    private int telefono;

    public String getNombre(){return nombre;}
    public String getApellidos(){return apellidos;}   
    public String getNif(){return nif;}
    public String getPoblacion(){return poblacion;}
    public String getProvincia(){return provincia;}
    public String getEmail(){return email;}

    public void setNombre(String nombre){this.nombre=nombre;}
    public void setApellidos(String apellidos){this.apellidos=apellidos;}   
    public void setNif(String nif){this.nif=nif;}
    public void setPoblacion(String poblacion){this.poblacion=poblacion;}
    public void setProvincia(String provincia){this.provincia=provincia;}
    public void setEmail(String email){this.email=email;}


    public void setCodigoCliente(int codigoCliente){this.codigoCliente=codigoCliente;}
    public void setCodigoPostal(int codigoPostal){this.codigoCliente=codigoPostal;}
    public void setTelefono(int telefono){this.telefono=telefono;}

    public int getCodigoCliente(){return codigoCliente;}
    public int getCodigoPostal(){return codigoPostal;}
    public int getTelefono(){return telefono;}

}