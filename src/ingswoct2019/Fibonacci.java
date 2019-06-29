/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ingswoct2019;

/**
 *
 * @author 
 */
public class Fibonacci {
    
    public int tamaño;
        
    public Fibonacci( int tamaño){
        
        this.tamaño = tamaño;
    }

    Fibonacci() {
        
    }

    
    public void mostrarSerie(){
        System.out.println(" Sucesion de tamaño "+this.tamaño+":");
        for (int i = 0; i < tamaño; i++) {
            System.out.print(fibonacci(i)+" ");
        }
        System.out.println();
    }
    
    
    int fibonacci(int n)
    {
        if (n>1){
           return fibonacci(n-1) + fibonacci(n-2); 
        }
        else if (n==1) {
            return 1;
        }
        else if (n==0){
            return 0;
        }
        else{
            System.out.println("Ingresar un numero mayor o igual a 1");
            return -1; 
        }
    }
    
       public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
        
}
