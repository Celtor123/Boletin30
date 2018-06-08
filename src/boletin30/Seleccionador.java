
package boletin30;

public class Seleccionador{
Futbolista futbolista;
  
String nome, apelidos;
int id, edade;
    public Seleccionador(String nome, String apelidos, int id, int edade) {
        super();
    }

  


    
    public void SeleccionarXogador(Futbolista futbolista) {
      this.futbolista= futbolista;
    }
   @Override
    public String toString() {
        return "Seleccionado= " + " nome: " + nome+" apelidos: "+apelidos+" id: "+id+" edade: "+edade;
    }
}

//Engádelle unha clase seleccionador  cos atributos nombre, id, apellidos, edad . E, ademais, o método seleccionarXogador() : void
