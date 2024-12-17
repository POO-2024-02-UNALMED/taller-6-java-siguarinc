package vehiculos;

public class Camioneta extends Vehiculo {
    private Boolean volco;
    private static int conca=0;
    public Camioneta(String placa,int puertas,String nombre,int precio,int peso, Fabricante fabricante, boolean volco){
        super(placa,puertas,90,nombre,precio,peso, "4X4", fabricante);
        this.volco=volco;
        conca=+1;
    }
    public static int cantidadCamionetas(){
        return conca;
    }
    public void setVolco(boolean volco){
        this.volco=volco;
    }
    public Boolean isVolco(){
        return this.volco;
    }
}
