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
public class HolaMundoNombre
{
    public static void main(String[] args)   
    {      
    // mensaje para el usuario      
    System.out.print("Ingrese su nombre edad altura: \n" );   
    // esta clase permite leer datos por teclado      
    Scanner scanner = new Scanner(System.in);        
    // leemos un valor entero por teclado     
    String nom = scanner.nextLine();      
     // leemos la edad
     int edad= scanner.nextInt();      
     // leemos la altura
     double altura = scanner.nextDouble();      
    // mostramos los datos por consola      
    System.out.println("Nombre: "+nom                       
                      +" Edad: " +edad                       
                      +" Altura : "+altura);  
    }
}
