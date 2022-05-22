package atp1;

//Trabalho feito em grupo por ESTEVAN TOMAZINI, LEONARDO RAMOS DA SILVEIRA e MELISSA WUNSCH.

//autor Leonardo 

public class No {
    
  // Variaveis da Classe No
  public int elemento;
  private No proximo;
    
  //Método Construtor
  public No(int elemento){
    this.elemento = elemento;
    this.proximo = null;
  }
  

//Método getter e setter
  public int getElemento(){
  return elemento;
  }
    
  public void setElemento(int elemento){
    this.elemento = elemento;
  }
    
  public No getProximo(){
    return proximo;
  }
    
  public void setProximo(No proximo){
    this.proximo = proximo;
  }
}
