
package boletin30;

public class Masajista extends SeleccionFutbol{
    String titulacion;
    int anosExperiencia;

    @Override
    public void concentrarse() {
       System.out.println("Concemtrase o masaxista");
    }

    @Override
    public void viaxar() {
        System.out.println("Viaxa o masaxista");
    }

    @Override
    public void entrenar() {
         System.out.println("Entrena o masaxista");
    }


    @Override
    public void xogarPartido() {
       System.out.println("Asiste ao partido o masaxista");
    }
}
