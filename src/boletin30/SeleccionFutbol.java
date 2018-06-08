
package boletin30;

public abstract class SeleccionFutbol implements IntegranteSeleccionFutbol{

String nome;
   String apelidos;
int id,edade;
    public SeleccionFutbol() {
    }

    public SeleccionFutbol(String nome, String apelidos,int id, int edade ) {
        this.id = id;
        this.edade = edade;
        this.nome = nome;
        this.apelidos = apelidos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdade() {
        return edade;
    }

    public void setEdade(int edade) {
        this.edade = edade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelidos() {
        return apelidos;
    }

    public void setApelidos(String apelidos) {
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

   @Override
    public String toString() {
        return "SeleccionFutbol= " + " nome: " + nome+" apelidos: "+apelidos+" id: "+id+" edade: "+edade;
    }

    
}
