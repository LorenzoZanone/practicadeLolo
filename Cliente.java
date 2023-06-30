/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lolo
 */
public class Cliente extends Persona {

    private Empresa emp = new Empresa();

    public Cliente(int dni, String nombre, int telefono) {
        super(dni, nombre, telefono);
    }

    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void ComprarPropiedad(Propiedad prop) {

        emp.ComprarPropiedadEmpresa(dni, nombre, telefono, prop);
    }

    public void ConsultarPrecioEmpresa(Propiedad p) {
        emp.ConsultarPrecioEmpresa(dni, nombre, telefono, p);
    }

    public void PropiedasMasBarata() {

        Propiedad array[] = new Propiedad[1];
        emp.PropiedadMasBarata(dni, nombre, telefono);

    }

    public void VerPrecios() {
        emp.VerPrecios();

    }

}
