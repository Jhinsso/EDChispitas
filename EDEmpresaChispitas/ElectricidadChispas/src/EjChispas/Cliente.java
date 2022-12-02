package EjChispas;

public interface Cliente {
    public int getCodigoCliente();
    public void setCodigoCliente(int codigoCliente);

    public String getNombreCliente();
    public void setNombreCliente (String nombreCliente);

    public String getDireccion();
    public void setDireccion(String direccion);

    public String getPoblacion();
    public void setPoblacion(String poblacion);

    public String getProvincia();
    public void setProvincia(String provincia);

    public String getEmail();
    public void setEmail(String email);
    public int getTelefono();
    public void setTelefono(int telefono);
}
