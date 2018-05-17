
package boletin30;


public class Futbolista extends SeleccionFutbol{
    int dorsal;
    String demarcacion;

    public Futbolista() {
    }


    public Futbolista(int dorsal, String demarcacion, int id, int edade, String nome, String apelidos) {
        super(id, edade, nome, apelidos);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }
    
    public void entrevista(){
        
    }

    @Override
    public void concentrarse() {
        System.out.println("Concéntrase o futbolista");
    }

    @Override
    public void viaxar() {
          System.out.println("Viaxa o futbolista");
    }

    @Override
    public void entrenar() {
       System.out.println("Viaxa o futbolista");
    }

    @Override
    public void xogarPartido() {
       System.out.println("O futbolista xoga");
    }
}
