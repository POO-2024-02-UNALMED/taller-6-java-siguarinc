package vehiculos;

public class Camion extends Vehiculo {
    private int ejes;
    private static int contca=0;
    public Camion(String placa,String nombre,int precio, Fabricante fabricante, int ejes){
        super(placa, 2,80,nombre,precio, "4X2",fabricante);
        this.ejes=ejes;
        contca=+1;
    }
    public static int cantidadCamiones(){
        return contca;
    }
    public void setEjes(int ejes){
        this.ejes=ejes;
    }
    public int getEjes(){
        return this.ejes;
    }
}
