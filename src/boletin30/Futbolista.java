
package boletin30;


public class Futbolista extends SeleccionFutbol{
    int dorsal;
    String demarcacion;

    public Futbolista() {
    }

    public Futbolista(String nome, String apelidos, int id, int edade,int dorsal, String demarcacion) {
        super(nome, apelidos, id, edade);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }


 
    
    public void entrevista(){
        
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
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
    @Override
    public String toString() {
        return "Futbolista= " + " nome: " + nome+" apelidos: "+apelidos+" id: "+id+" edade: "+edade+" dorsal: "+dorsal+" demarcacion: "+demarcacion;
    }

}
