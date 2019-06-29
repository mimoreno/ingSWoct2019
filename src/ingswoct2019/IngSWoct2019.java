/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ingswoct2019;

/**
 *
 * @author 
 */
public class IngSWoct2019 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fibonacci f1 = new Fibonacci(10); //Instanciamos la clase Fibonacci.Enviamos como parametro un numero entero
        f1.mostrarSerie();//Llamamos a la funcion Mostrar de la clase Fibonacci
        
        Fibonacci f2 = new Fibonacci();
        f2.setTamaño(10);
        f2.mostrarSerie();
        
    }
    
}
