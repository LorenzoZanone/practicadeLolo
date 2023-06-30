
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author lolo
 */
public class Empresa {

    private ArrayList<Propiedad> propiedad;
   private  String nombre;
    private String direccion;

    public Empresa(ArrayList<Propiedad> propiedad, String nombre, String direccion) {
        this.propiedad = propiedad;
        this.nombre = nombre;
        this.direccion = direccion;
    }


    public Empresa() {
    }

    public ArrayList<Propiedad> getPropiedad() {
        return propiedad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void AgregarPropiedad(Propiedad propiedad1) {

        propiedad.add(propiedad1);

    }

    public void EliminarPropiedad(Propiedad propiedad1) {
        propiedad.remove(propiedad1);

    }

    public void ComprarPropiedadEmpresa(int dni, String nombre, int telefono, Propiedad prop) {
        propiedad.remove(prop);
    }

    public void ConsultarPrecioEmpresa(int dni, String nombre, int telefono, Propiedad propiedad1) {
        JOptionPane.showMessageDialog(null, "Los datos de la propiedad son:" + propiedad1.toString());

    }

    public void PropiedadMasBarata(int dni, String nombre, int telefono) {
        double aux = 0;
        Propiedad array[] = new Propiedad[1];
        for (Propiedad p : propiedad) {
            if (aux < p.getPrecio()) {
                array[0] = p;

            }

        }
        System.out.println("La propiedad mas barata es" + array[0]);
    }

    public void VerPrecios() {
        System.out.println("Datos de las propiedades");

        for (Propiedad pr : propiedad) {
            System.out.println(pr.toString());

        }
    }
}
