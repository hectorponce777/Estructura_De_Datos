/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author starg
 */
public class Fibonacci 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        System.out.println(fibonacci (5));
    }
    
    public static double fibonacci(double posicion)
    {
        double fibo=0;
        if(posicion==0 || posicion==1)
        {
            fibo=posicion;
        }
        else
        {
            fibo=fibonacci(posicion-1)+fibonacci(posicion-2);
        }
        return fibo;
    }
}
