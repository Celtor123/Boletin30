
package boletin30;

import java.util.ArrayList;
import java.util.Iterator;

public class Aplicacion {
    ArrayList <Object> e= new ArrayList<>();
   public void coleccion(){
                
   Entrenador gonzalo= new Entrenador("Gonzalo","Pérez", 26378036, 45,2841786);
   e.add(gonzalo);
   Masajista Paulo= new Masajista("Paulo", "Sánchez Dios", 29572550,55,"Doctorado en Fisioterapia", 28);
   e.add(Paulo);
   SeleccionFutbol Pérez= new SeleccionFutbol("Jaun", "Pérez Domenico",2638035,23 ){};
   e.add(Pérez);
   Seleccionador vicento= new Seleccionador("Vicente", "López Instringe", 34906628, 41);
   e.add(vicento);
   Futbolista casoto= new Futbolista("Casoto","Eletrom",027653, 27,1, "Portero");
   e.add(casoto);
   }
   public void imprimir(){
     
           Iterator it = e.iterator(); 
 while ( it.hasNext() ) { 
     
 Object objeto = it.next(); 

 System.out.println(objeto);
 
       }
 
   }
     public static void main(String[] args) {
 Aplicacion es= new Aplicacion();
 es.coleccion();
 es.imprimir();
}
}
