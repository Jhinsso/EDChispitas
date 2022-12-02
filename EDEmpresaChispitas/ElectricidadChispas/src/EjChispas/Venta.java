package EjChispas;

public interface Venta {
    public int getCodigoVenta();
    public void setCodigoVenta(int codigoVentas);

    public String getNombre();
    public void setNombre(String nombre);

    public int getPrecio();
    public void setPrecio(int precio);

    public TipoIVA getTipoIVA();
}
