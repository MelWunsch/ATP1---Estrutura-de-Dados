package atp1;

//Trabalho feito em grupo por ESTEVAN TOMAZINI, LEONARDO RAMOS DA SILVEIRA e MELISSA WUNSCH.

public class Lista{
    
  //Variável da Classe Lista
  private No primeiro;
  private int tamanho;
  private No proximo;


    
  //Método Construtor
  public Lista(){
    primeiro = null;
  }
    
  // Método getter
  public No getPrimeiro(){
    return primeiro;
  }
  public No getUltimo() {
	return proximo;
	}
  public void setUltimo(No proximo) {
		this.proximo = proximo;
	}
  public int getTamanho() {
	return tamanho;
	}
	
  public void setTamanho(int tamanho) {
	this.tamanho = tamanho;
	}
  public No get (int posicao) {
	return null;
	}
  
//@autor Leonardo

//Método para Verificar se a Lista está Vazia
  public boolean estaVazio(){
    if(primeiro == null){
      return true;
    }else{
      return false;
    }
  }
  
  //Método Insere Primeiro
  public void inserePrimeiro(int valor){
    No elemento1 = new No(valor);
    elemento1.setProximo(primeiro);
    primeiro = elemento1;
  }
  
  //autor Melissa
  
  //Mostrar Lista
  public void mostrarLista() {
	  if (estaVazio()) {
		  System.out.println("A lista não tem elementos para mostrar, está vazia.\n");
	  } else {
		  No cursor = primeiro;
		  while (cursor != null) {
			  System.out.println (cursor.getElemento());
			  cursor = cursor.getProximo();
		  }
		  System.out.println ("\n---------\n");
	  }
  }
  
//Método Insere Último
  public void insereUltimo(int valor) {
	  if (estaVazio()) {
		  inserePrimeiro(valor);
	  } else {
		  No cursor = primeiro;
		  while (cursor.getProximo() != null) {
			  cursor = cursor.getProximo();
		  }
		  No elemento1 = new No(valor);
		  cursor.setProximo(elemento1);
	  }
  }
  
  //Método Insere Depois
  public void insereDepois(No no, int valor) {
	  No elemento1 = new No(valor);
	  elemento1.setProximo(no.getProximo());
	  no.setProximo(elemento1);
  }
  
  
  //Método Remove Primeiro
  public No removePrimeiro() {
	  if (estaVazio()) {
		  System.out.println ("Impossível remover de uma lista vazia.");
		  return null;
	  } else {
	  No cursor = primeiro;
	  primeiro = primeiro.getProximo();
	  return cursor;
	  }
  }
  


//autor Leonardo

//Método Remove Ultimo
  public void removeUltimo(){
      
      No iterador;
		iterador = this.primeiro;
		  for(; iterador.getProximo()!= null; iterador = iterador.getProximo()){
			  if(iterador.getProximo().getProximo()==null){
				  iterador.setProximo(null);
				  break;
			  }

		  }
	}
  
  //autor Estevan
  
  public void remover (No valorProcurado) {
      if (estaVazio()) {
    	  System.out.println("A lista está vazia, não tem o que remover.");
      } else {
    	  No anterior = null;
    	  No cursor = primeiro;
    	  while (cursor.getProximo() != null) {
    		  anterior = cursor;
    		  cursor = cursor.getProximo();
    		  if (cursor.equals(valorProcurado)) {
    			  cursor.getElemento();
    			  anterior.setProximo(cursor.getProximo());
    			  
    		  }
    	  }
      }
  
  }
}
