package vehiculos;

import java.util.ArrayList;

public class Pais {
    private String nombre;
    public static ArrayList<Pais> listado = new ArrayList<Pais>();
    Pais(String nombre){
       this.nombre=nombre;
    }
    public String getNombre() {
        return this.nombre;
    }
    public static Pais paisMasVendedor(){
        Pais p = null;
        int max = 0;
        for(Pais e:listado){
            int cont = 0;
            for(Pais i:listado){
                if (e.getNombre() == i.getNombre()) {
                    cont++;
                }
            }
            if (cont > max) {
                max = cont;
                p = e;
            }
        }
       return p;
    }

}
