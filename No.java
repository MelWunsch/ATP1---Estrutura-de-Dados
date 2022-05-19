/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atp1;

/**
 *
 * @author Leonardo
 */
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
