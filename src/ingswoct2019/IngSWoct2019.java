/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ingswoct2019;

import java.util.Scanner;

/**
 *
 * @author 
 */
public class IngSWoct2019 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String tamaño;
        System.out.print("Ingrese el tamaño de la serie \n");
        Scanner teclado = new Scanner(System.in);
        tamaño = teclado.nextLine();
        Fibonacci f1 = new Fibonacci(tamaño); //Instanciamos la clase Fibonacci.
        f1.mostrarSerie();//Llamamos a la funcion Mostrar de la clase Fibonacci
                
    }
    
}
