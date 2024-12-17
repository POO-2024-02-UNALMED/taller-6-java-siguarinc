package vehiculos;

import java.util.ArrayList;

public class Pais {
    private String nombre;
    private static ArrayList<Pais> listado = new ArrayList<Pais>();
    Pais(String nombre){
        if (listado.contains(nombre)) { 
            return;
        } 
        else { 
            this.nombre=nombre;
            listado.add(this);
        }
        
    }
    public static ArrayList<Pais> getListado() {
        return listado;
    }

}
