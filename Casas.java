/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lolo
 */
public class Casas extends Propiedad{

private int cantPiso;

    public Casas(int cantPiso, int mtsCuadrados, Double precio, String direccion) {
        super(mtsCuadrados, precio, direccion);
        this.cantPiso = cantPiso;
    }

    

    public int getCantPiso() {
        return cantPiso;
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
        return "Casas{" + "cantPiso=" + cantPiso + '}';
    }

    public int getId() {
        return id;
    }

    
    
    
}
