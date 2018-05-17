
package boletin30;

public abstract class SeleccionFutbol implements IntegranteSeleccionFutbol{
private int id,edade;
private String nome,apelidos;

    public SeleccionFutbol() {
    }

    public SeleccionFutbol(int id, int edade, String nome, String apelidos) {
        this.id = id;
        this.edade = edade;
        this.nome = nome;
        this.apelidos = apelidos;
    }
@Override
     public void concentrarse(){
        System.out.println("O equipo se concentra");
     }  
@Override
    public void viaxar(){
        System.out.println("O equipo viaxa");
     }  
@Override
    public void entrenar(){
        System.out.println("O equipo entrena");
     }  
@Override
    public void xogarPartido(){
        System.out.println("O equipo xoga");
     }  

    public static void main(String[] args) {
       
    }
    
}
