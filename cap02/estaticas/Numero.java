/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro.cap02.estaticas;

/**
 *
 * @author Usuario
 */
public class Numero 
{
    private double valor;
    
    public Numero sumar(double a)  
            
    {     
        valor+=a;
        return this;  
    }
    public static double sumar(double a, double b)   
    {
        return a + b; 
    }
}
