package vehiculos;

import java.util.ArrayList;

public class Fabricante {
    private String nombre;
    private Pais pais;
    public static ArrayList<Fabricante> listado = new ArrayList<Fabricante>();
    public Fabricante(String nombre,Pais pais){
        this.nombre=nombre;
        this.pais=pais;
    }
    public Pais getPais() {
        return pais;
    }
    public String getNombre() {
        return nombre;
    }
    public static Fabricante fabricaMayorVentas(){
        Fabricante f = null;
        int max = 0;
        for(Fabricante e:listado){
            int cont = 0;
            for(Fabricante i:listado){
                if (e.getNombre() == i.getNombre()) {
                    cont++;
                }
            }
            if (cont > max) {
                max = cont;
                f = e;
            }
        }
        return f;
        }
}


