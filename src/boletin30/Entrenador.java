
package boletin30;

public class Entrenador extends SeleccionFutbol{
int idFederacion;

    public Entrenador(String nome, String apelidos, int id, int edade,int idFederacion) {
        super(nome, apelidos, id, edade);
        this.idFederacion = idFederacion;
    }

   
   

   
    
    public void planificarEntrenamiento(){        
    } 

    public int getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(int idFederacion) {
        this.idFederacion = idFederacion;
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

    @Override
    public String toString() {
        return "Entrenador= " + " nome: " + nome+" apelidos: "+apelidos+" id: "+id+" edade: "+edade+" idFederacion: "+idFederacion;
    }

   

 

}
