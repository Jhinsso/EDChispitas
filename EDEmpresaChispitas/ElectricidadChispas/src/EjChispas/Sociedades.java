package EjChispas;

import java.lang.*;

public class Sociedades implements Cliente{

    private int codigoCliente;

    private String razonSocial;  

    private String cif;  

    private int codigoPostal; 

    private String poblacion;  
    private String provincia;  
    private String email;

    private int telefono;

    public String getRazonSocial(){return razonSocial;}
    public String getCif(){return cif;}
    public String getPoblacion(){return poblacion;}
    public String getProvincia(){return provincia;}
    public String getEmail(){return email;}

    public void setRazonSocial(String razonSocial){this.razonSocial=razonSocial;}

    public void setCif(String cif){this.cif=cif;}
    public void setPoblacion(String poblacion){this.poblacion=poblacion;}
    public void setProvincia(String provincia){this.provincia=provincia;}
    public void setEmail(String email){this.email=email;}


    public void setCodigoCliente(int codigoCliente){this.codigoCliente=codigoCliente;}
    public void setCodigoPostal(int codigoPostal){this.codigoPostal=codigoPostal;}
    public void setTelefono(int telefono){this.telefono=telefono;}

    public int getCodigoCliente(){return codigoCliente;}
    public int getCodigoPostal(){return codigoPostal;}
    public int getTelefono(){return telefono;}
}