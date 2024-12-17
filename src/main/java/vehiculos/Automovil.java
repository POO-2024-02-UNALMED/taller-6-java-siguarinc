package vehiculos;

public class Automovil extends Vehiculo {
    private int puestos;
    private static int cont=0;
    Automovil( String placa,String nombre,int precio, Fabricante fabricante,int puestos){
        super(placa,4,100,nombre,precio, "FWD",fabricante);
        this.puestos=puestos;
        cont=+1;
    }
    public static int cantidadAutomoviles(){
        return cont;
    }

    public void setPuestos(int puestos){
        this.puestos=puestos;
    }
    public int getPuestos(){
        return this.puestos;
    }
}
