package vehiculos;

import java.util.ArrayList;

public class Camion extends Vehiculo {
    private int ejes;
    private static ArrayList<Camion> listado = new ArrayList<Camion>();
    Camion(String placa,String nombre,int precio, Fabricante fabricante, int ejes){
        super(placa, 2,80,nombre,precio, "4X2",fabricante);
        this.ejes=ejes;
        listado.add(this);
    }
    public static int cantidadCamiones(){
        return listado.size();
    }
    public void setEjes(int ejes){
        this.ejes=ejes;
    }
    public int getEjes(){
        return this.ejes;
    }
}
