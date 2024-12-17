package vehiculos;

import java.util.ArrayList;

public class Fabricante {
    private String nombre;
    private String pais;
    private static ArrayList<Fabricante> listado = new ArrayList<Fabricante>();
    Fabricante(String nombre,String pais){
        if (listado.contains(nombre)) { 
            return;
        } 
        else { 
            this.nombre=nombre;
            this.pais=pais;
            listado.add(this);
        }
    }
}


