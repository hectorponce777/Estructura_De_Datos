/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author starg
 */
import java.util.Scanner;
public class Arreglo_001 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lee = new Scanner (System.in);

        //Creamos nuestro array
        int arreglo[]=new int[20]; //Arreglo de 20 valores

        //valores para los bucles
        int c,i,o;

        System.out.println("Tamaño del array");
        i=lee.nextInt();

        //capturamos los valores en el arreglo-
        for (c=0;c<i;c++)
        {

            System.out.println("Arreglo["+(c+1)+"]= ");
            arreglo[c]=lee.nextInt();
        }

        //imprimimos los valores del arreglo
        for (c=0;c<i;c++)
        {
            System.out.println(arreglo[c]+", ");

        }
        //comienza la modificación de un valor dentro del arreglo
        System.out.println("¿Qué posición deseas modificar? ");
        o=lee.nextInt();
        
        System.out.println("Introduce el nuevo valor de la posición ");
        arreglo[o-1]=lee.nextInt();
        
        //imprimimos los valores del arreglo
        for (c=0;c<i;c++)
        {
            System.out.println(arreglo[c]+", ");

        }
        
        //ahora va a sumar todos los valores dentro del array
        //inicializo la variable o a cero
        o=0;
        for (c=0;c<i;c++)
        {
            o=o+arreglo[c];
        }
        //imprimo la suma total
            System.out.println("La suma total es de: "+ o);
        
    }
    
}
