/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro.cap01;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class PrimerosNumeros1 
{
    public static void main(String[] args)   
    {      
    System.out.print("Ingrese un numero: \n");
    Scanner scanner = new Scanner(System.in);
    // leo el valor de n
    int n = scanner.nextInt();
    int i = 1;
    while( i <= n )      
    {         
     // muestro el valor de i         
        System.out.println(i);         
     // incremento el valor de i         
     i++;      
    }
  }
}
    
        
