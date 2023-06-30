/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lolo
 */
public abstract class Propiedad {

    int mtsCuadrados;
    Double precio;
    String direccion;
    int id;

    public Propiedad(int mtsCuadrados, Double precio, String direccion) {
        this.mtsCuadrados = mtsCuadrados;
        this.precio = precio;
        this.direccion = direccion;
        id++;
    }

    public int getMtsCuadrados() {
        return mtsCuadrados;
    }

    public Double getPrecio() {
        return precio;
    }

    public String getDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        return "Propiedad{" + "mtsCuadrados=" + mtsCuadrados + ", precio=" + precio + ", direccion=" + direccion + '}';
    }

    public int getId() {
        return id;
    }

}
