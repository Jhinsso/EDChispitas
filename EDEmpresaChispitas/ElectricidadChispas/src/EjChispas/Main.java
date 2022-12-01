package EjChispas;

import java.lang.*;
import java.util.Scanner;

public class Main{
    public static void main (String [ ] args) {
        Scanner scanner= new Scanner(System.in);
        Autonomos autono= new Autonomos();
        System.out.println("Introduce el Codigo de un cliente AUTONOMO:");
        autono.setCodigoCliente(scanner.nextInt());

        System.out.println("Introduce el NOMBRE de un Autonomo");
        autono.setNombre(scanner.next());

        System.out.println("Introduce una Apellidos del Autonomo");
        autono.setApellidos(scanner.next());

        System.out.println("Introduce el NIF del Autonomo");
        autono.setNif(scanner.next());

        System.out.println("Introduce una Poblacion del Autonomo");
        autono.setPoblacion(scanner.next());

        System.out.println("Introduce una Provincia del genero");
        autono.setProvincia(scanner.next());

        System.out.println("Introduce un Email del Autonomo");
        autono.setEmail(scanner.next());

        autono.setCodigoPostal(Integer.parseInt("05001"));

        System.out.println("Introduce una descripcion del Cliente");
        autono.setTelefono(Integer.parseInt(scanner.next()));

        Sociedades sociedad=new Sociedades();

        System.out.println("Introduce el Codigo de una cliente Sociedad:");
        sociedad.setCodigoCliente(scanner.nextInt());

        System.out.println("Introduce el NOMBRE de una Sociedad");
        sociedad.setRazonSocial(scanner.next());

        System.out.println("Introduce una de");
        sociedad.setEmail(scanner.next());

        System.out.println("Introduce el CIF del Cliente");
        sociedad.setCif(scanner.next());

        System.out.println("Introduce una Poblacion del Cliente");
        sociedad.setPoblacion(scanner.next());

        System.out.println("Introduce una Provincia del Cliente");
        sociedad.setProvincia(scanner.next());

        System.out.println("Introduce un Email del Cliente");
        sociedad.setEmail(scanner.next());

        sociedad.setCodigoPostal(Integer.parseInt("05001"));

        System.out.println("Introduce una descripcion del genero");
        sociedad.setTelefono(Integer.parseInt(scanner.next()));

        Productos produc=new Productos();

        System.out.println("Introduce el Codigo de un producto");
        produc.setCodigoProducto(scanner.nextInt());

        System.out.println("Introduce el NOMBRE de un PPRODUCTO");
        produc.setNombre(scanner.next());

        System.out.println("Introduce el modelo de un producto:");
        produc.setModelo(scanner.next());

        System.out.println("Introduce una Poblacion del Cliente");
        produc.setPrecio(Integer.parseInt(scanner.next()));

        produc.setIVA(Integer.parseInt("21"));

        Servicios serv=new Servicios();

        System.out.println("Introduce el Codigo de un producto");
        serv.setCodigoServicio(scanner.nextInt());

        System.out.println("Introduce el NOMBRE de un PRODUCTO");
        serv.setNombre(scanner.next());

        System.out.println("Introduce una Poblacion del Cliente");
        serv.setPrecio(Integer.parseInt(scanner.next()));

        serv.setIVA(Integer.parseInt("21"));

        Facturas fac=new Facturas();

        System.out.println("Introduce el codigo de la factura:");
        fac.setCodigoFactura(scanner.nextInt());

        System.out.println("Introduce el Cliente");
        fac.setCliente(scanner.next());

        System.out.println("Introduce una de");
        fac.setServicios(new String[]{scanner.next()});

        System.out.println("Introduce el numero y tipo de productos adquiridos");
        fac.setProdutos(new String[]{scanner.next()});

        System.out.println("Introduce la base del importe");
        fac.setBaseImporte(Integer.parseInt(scanner.next()));

        fac.setIVA(Integer.parseInt("21"));

        System.out.println("Introduce el total de la factura");
        fac.setTotal(Integer.parseInt(scanner.next()));

        ventas vent=new ventas();

    }
}