/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atp1;

/**
 *
 * @author Leonardo
 */
public class Lista{
    
    //Variável da Classe Lista
    private No primeiro;
    
    //Método Construtor
    public Lista(){
        primeiro = null;
    }
    
    // Método getter
    public No getPrimeiro(){
        return primeiro;
    }
    
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
    
   
    
    
}
