package vehiculos;

import java.util.ArrayList;

public class Automovil extends Vehiculo {
    private int puestos;
    private static ArrayList<Automovil> listado = new ArrayList<Automovil>();
    Automovil( String placa,String nombre,int precio, Fabricante fabricante,int puestos){
        super(placa,4,100,nombre,precio, "FWD",fabricante);
        this.puestos=puestos;
        listado.add(this);
    }
    public static int cantidadAutomoviles(){
        return listado.size();
    }

    public void setPuestos(int puestos){
        this.puestos=puestos;
    }
    public int getPuestos(){
        return this.puestos;
    }
}
