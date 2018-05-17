
package boletin30;

public class Entrenador extends SeleccionFutbol{
int idFederacion;
    public Entrenador() {
    }
    public void planificarEntrenamiento(){
        
    } 

    @Override
    public void concentrarse() {
        System.out.println("Concentrase o entrenador");
    }

    @Override
    public void viaxar() {
          System.out.println("Viaxa o entrenador");
    }

    @Override
    public void entrenar() {
          System.out.println("O entrenador dirixe o entrenamento");
    }

    @Override
    public void xogarPartido() {
          System.out.println("O entrenador xoga");
    }
}
