/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {

    static int numeroPiso = 0;
    static int mtscuadrados = 0;
    static double precio = 0;
    static String direccion = "";
    static int ndeptro = 0;
    static int opc = 0;

    public static void main(String args[]) {

        Cliente cliente = CrearCliente();
        ArrayList<Propiedad> propiedades = CrearPropiedades();
        Empresa emp = CrearEmpresa(propiedades);
        ConsultarOpc(emp, propiedades);
        ConsultarOpcionesCliente(cliente, propiedades);

    }

    public static void ConsultarOpcionesCliente(Cliente cliente, ArrayList<Propiedad> propiedades) {
        opc = Integer.parseInt(JOptionPane.showInputDialog("DIGITE QUE DESEA HACER: 1 -Comprar propiedad 2 -Consultar precio - 3 -Ver propiedad mas barata -4 Ver precios"));
        while (opc < 1 || opc > 4) {
            JOptionPane.showMessageDialog(null, "Error, ingresa de nuevo");

        }

        switch (opc) {
            case 1:
                ComprarPropiedad(cliente, propiedades);
                for (Propiedad p : propiedades) {
                    System.out.println("Id:" + p.getId() + " " + p);

                }
                opc = Integer.parseInt(JOptionPane.showInputDialog("Eliga la propiedad que desee"));
                while (opc > propiedades.size()) {
                    System.out.println("Error, no existe, ingrese de nuevo");
                    opc = Integer.parseInt(JOptionPane.showInputDialog("Eliga la propiedad que desee consultar el precio"));
                }
                cliente.ComprarPropiedad(propiedades.get(opc));
                break;
            case 2:
                ConsultarPrecio(cliente, propiedades);

                break;
            case 3:
                PropiedadMasBarata(cliente);
                break;
            case 4:
                VerPrecios(cliente);

                break;
            default:
                break;
        }
    }

    public static Cliente CrearCliente() {

        int opc = 0;
        String nombre;
        int telefono;
        int dni;
        nombre = JOptionPane.showInputDialog("Digite su nombre");
        telefono = Integer.parseInt(JOptionPane.showInputDialog("Digite su telefono"));
        dni = Integer.parseInt(JOptionPane.showInputDialog("Digite su dni"));
        Cliente cliente = new Cliente(dni, nombre, telefono);
        opc = Integer.parseInt(JOptionPane.showInputDialog("Que desea hacer:  -1 ComprarPropiedad - 2 -Consultar Precio - 3 Ver propiedad mas barata - 4 - Ver precios"));

        return cliente;
    }

    public static ArrayList<Propiedad> CrearPropiedades() {
        ArrayList<Propiedad> propiedad = new ArrayList<Propiedad>();

        int opc = Integer.parseInt(JOptionPane.showInputDialog("cuantas propiedades desea a su empresa"));
        for (int i = 0; i < opc; i++) {
            opc = Integer.parseInt(JOptionPane.showInputDialog("Desea elegir: 1 -Departamentos - 2 Casas"));
            if (opc == 1) {

                numeroPiso = Integer.parseInt(JOptionPane.showInputDialog("que numero de piso es la propiedad"));
                ndeptro = Integer.parseInt(JOptionPane.showInputDialog("que numero de depto es la propiedad"));
                mtscuadrados = Integer.parseInt(JOptionPane.showInputDialog("cuantas metros cuadrados tiene la propiedad"));
                precio = Double.parseDouble(JOptionPane.showInputDialog("Digite el precio de venta de la propiedad"));
                direccion = JOptionPane.showInputDialog("Digite la direccion de la propiedad");
                Departamentos departamentos = new Departamentos(numeroPiso, ndeptro, mtscuadrados, precio, direccion);
                propiedad.add(departamentos);

            } else if (opc == 2) {
                mtscuadrados = Integer.parseInt(JOptionPane.showInputDialog("cuantas metros cuadrados tiene la propiedad"));
                precio = Double.parseDouble(JOptionPane.showInputDialog("Digite el precio de venta de la propiedad"));
                direccion = JOptionPane.showInputDialog("Digite la direccion de la propiedad");
                int cantPiso = Integer.parseInt(JOptionPane.showInputDialog("Cargue la cantidad de pisos de la casa"));
                Casas casa = new Casas(cantPiso, mtscuadrados, precio, direccion);
                propiedad.add(casa);
            }
        }
        return propiedad;

    }

    public static Empresa CrearEmpresa(ArrayList<Propiedad> propiedades) {
        String nombre = "";
        String direccion = "";
        nombre = JOptionPane.showInputDialog("Digite el nombre de su empresa");
        direccion = JOptionPane.showInputDialog("Digite la direccion de su empresa");
        Empresa empresa = new Empresa(propiedades, nombre, direccion);

        return empresa;
    }

    public static void ConsultarOpc(Empresa emp, ArrayList<Propiedad> p) {
        int opc = Integer.parseInt(JOptionPane.showInputDialog("Que desea hacer: 1 - Agregar propiedad - 2 Eliminar propiedad"));
        if (opc == 1) {
            AgregarPropiedad(emp);
        } else if (opc == 2) {

            EliminarPropiedad(emp, p);

        }
    }

    public static void AgregarPropiedad(Empresa empre) {

        opc = Integer.parseInt(JOptionPane.showInputDialog("Desea elegir: 1 -Departamentos - 2 Casas"));
        JOptionPane.showMessageDialog(null, "Digite las caracteristicas basicas de una propiedad");
        mtscuadrados = Integer.parseInt(JOptionPane.showInputDialog("cuantas metros cuadrados tiene la propiedad"));
        precio = Double.parseDouble(JOptionPane.showInputDialog("Digite el precio de venta de la propiedad"));
        direccion = JOptionPane.showInputDialog("Digite la direccion de la propiedad");

        if (opc == 1) {
            JOptionPane.showMessageDialog(null, "Digite las caracteristicas del depto");

            numeroPiso = Integer.parseInt(JOptionPane.showInputDialog("que numero de piso es la propiedad"));
            ndeptro = Integer.parseInt(JOptionPane.showInputDialog("que numero de depto es la propiedad"));

            Departamentos departamentos = new Departamentos(numeroPiso, ndeptro, mtscuadrados, precio, direccion);
            empre.AgregarPropiedad(departamentos);

        } else if (opc == 2) {

            int cantPiso = Integer.parseInt(JOptionPane.showInputDialog("Cargue la cantidad de pisos de la casa"));
            Casas casa = new Casas(cantPiso, mtscuadrados, precio, direccion);
            empre.AgregarPropiedad(casa);

        }
    }

    public static void EliminarPropiedad(Empresa empresa, ArrayList<Propiedad> p) {
        int id = 0;
        id = Integer.parseInt(JOptionPane.showInputDialog("Digite que propiedad desea eliminar"));
        while (id > p.size()) {

            JOptionPane.showMessageDialog(null, "No existe esa propiedad ingresa de nuevo");
            id = Integer.parseInt(JOptionPane.showInputDialog("Digite que propiedad desea eliminar"));

        }

        empresa.EliminarPropiedad(p.get(id));

    }

    public static void ComprarPropiedad(Cliente cliente, ArrayList<Propiedad> propiedades) {
        for (Propiedad p : propiedades) {
            System.out.println("Id:" + p.getId() + " " + p);

        }
        opc = Integer.parseInt(JOptionPane.showInputDialog("Eliga la propiedad que desee"));
        while (opc > propiedades.size()) {
            System.out.println("Error, no existe, ingrese de nuevo");
            opc = Integer.parseInt(JOptionPane.showInputDialog("Eliga la propiedad que desee consultar el precio"));
        }
        cliente.ComprarPropiedad(propiedades.get(opc));
    }

    public static void ConsultarPrecio(Cliente cliente, ArrayList<Propiedad> propiedades) {
        for (Propiedad p : propiedades) {
            System.out.println("Id:" + p.getId() + " " + p);

        }
        opc = Integer.parseInt(JOptionPane.showInputDialog("Eliga la propiedad que desee consultar el precio"));
        while (opc > propiedades.size()) {
            System.out.println("Error, no existe, ingrese de nuevo");
            opc = Integer.parseInt(JOptionPane.showInputDialog("Eliga la propiedad que desee consultar el precio"));
        }
        cliente.ComprarPropiedad(propiedades.get(opc));
    }

    public static void PropiedadMasBarata(Cliente cliente) {
        cliente.PropiedasMasBarata();

    }

    public static void VerPrecios(Cliente cliente) {
        System.out.println("Usted vera los precios");
        cliente.VerPrecios();

    }

}
