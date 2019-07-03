/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ingswoct2019;

/**
 *
 * @author 
 */
import java.io.*;
public class Fibonacci {
    File Ffichero=new File("C:/Users/ediso/OneDrive/Documentos/NetBeansProjects/ingSWoct2019/src/Fibonacci.txt");
    public int tamaño;
        
    public static void EcribirFichero(File Ffichero,String SCadena){
        try {
                //Si no Existe el fichero lo crea
                if(!Ffichero.exists()){
                     Ffichero.createNewFile();
                }
               //Abre un Flujo de escritura,sobre el fichero con codificacion utf-8. Ademas   en
               //el pedazo de sentencia "FileOutputStream(Ffichero,true)", true es por si existe el fichero
               //segir añadiendo texto y no borrar lo que tenia 
                BufferedWriter Fescribe=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(Ffichero,true), "utf-8"));
                //Escribe en el fichero la cardena que recibe la funcion. la cadena "\r\n" significa salto de linea
                Fescribe.write(SCadena + "\r");
                //Cierra el flujo de escritura
                Fescribe.close();
            } catch (Exception ex) {
               //Captura un posible error y le imprime en pantalla 
               System.out.println(ex.getMessage());
            }
        
    }
    public Fibonacci( int tamaño){
        
        this.tamaño = tamaño;
    }

    Fibonacci() {
        
    }

    
    public void mostrarSerie(){
        System.out.println(" Sucesion de tamaño "+this.tamaño+"=> ");
        EcribirFichero(Ffichero," Sucesion de tamaño "+this.tamaño+"=> ");
        for (int i = 0; i < tamaño; i++) {
            System.out.print(fibonacci(i)+" ");
            EcribirFichero(Ffichero,fibonacci(i)+" ");
        }
        EcribirFichero(Ffichero,"\n");
        
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
