
package boletin30;

public class Masajista extends SeleccionFutbol{
    String titulacion;
    int anosExperiencia;

    public Masajista() {
    }


    public Masajista(String nome, String apelidos, int id, int edade, String titulacion, int anosExperiencia ) {
        super(nome, apelidos, id, edade);
        this.titulacion = titulacion;
        this.anosExperiencia = anosExperiencia;
    }


    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

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
    @Override
    public String toString() {
        return "Entrenador= " + " nome: " + nome+" apelidos: "+apelidos+" id: "+id+" edade: "+edade+" titulacion: "+titulacion+" anosExaperiencia: "+anosExperiencia;
    }
}
