package atp1;

//Trabalho feito em grupo por ESTEVAN TOMAZINI, LEONARDO RAMOS DA SILVEIRA e MELISSA WUNSCH.

//Autores Leonardo e Melissa

public class Main {

  public static void main(String[] args){
        
  // Objetos    
     Lista lista = new Lista();
     lista.inserePrimeiro(10);
     lista.inserePrimeiro(1);
     lista.inserePrimeiro(45);
     lista.insereUltimo(55);
     System.out.println ("Teste de inserePrimeiro e insereUltimo.\n");
     lista.mostrarLista();
     
     No elemento1 = lista.getPrimeiro();
     System.out.println ("Teste de insereDepois o elemento 15.\n");
     lista.insereDepois(elemento1, 15);
     lista.mostrarLista();
     
     System.out.println ("Teste de removePrimeiro, sendo ele o elemento " + lista.removePrimeiro().getElemento() + "\n");
     lista.mostrarLista();
     
     System.out.println("Está vazia? " + lista.estaVazio());
     System.out.println ("---------\n");
     
     lista.removeUltimo();
     System.out.println ("Teste de removeUltimo\n");
     lista.mostrarLista();
     
     System.out.println("Teste remove(No no).\n");
     lista.remover(lista.getPrimeiro().getProximo());
     lista.mostrarLista();
    }
}