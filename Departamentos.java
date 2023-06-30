/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lolo
 */
public class Departamentos extends Propiedad {

    private int NumeroPiso;
    private int Numero_Depto;

    public Departamentos(int NumeroPiso, int Numero_Depto, int mtsCuadrados, Double precio, String direccion) {
        super(mtsCuadrados, precio, direccion);
        this.NumeroPiso = NumeroPiso;
        this.Numero_Depto = Numero_Depto;
    }

    public int getNumeroPiso() {
        return NumeroPiso;
    }

    public int getNumero_Depto() {
        return Numero_Depto;
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
        return "Departamentos{" + "NumeroPiso=" + NumeroPiso + ", Numero_Depto=" + Numero_Depto + '}';
    }

}
