/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author starg
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Factorial objfact = new Factorial();
        System.out.println ("El Factorial de 3 es " + objfact.fact(3));

    }
 
    public int fact(int n) 
    {

	if (n==0)
	{
		return 1;		
	}
	else
	{
		return n * fact (n-1);
	}

    }
}
