package vehiculos;

import java.util.ArrayList;

public class Camioneta extends Vehiculo {
    private Boolean volco;
    private static ArrayList<Camioneta> listado = new ArrayList<Camioneta>();
    Camioneta(String placa,int puertas,String nombre,int precio, Fabricante fabricante, boolean volco){
        super(placa,puertas,90,nombre,precio, "4X4", fabricante);
        this.volco=volco;
        listado.add(this);
    }
    public static int cantidadCamionetas(){
        return listado.size();
    }
    public void setVolco(boolean volco){
        this.volco=volco;
    }
    public Boolean isVolco(){
        return this.volco;
    }
}
