/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro.cap02.figuras;

/**
 *
 * @author Usuario
 */
public abstract class FiguraGeometrica {
    
    private String nombre;
    public abstract double area();
    public static double areaPromedio(FiguraGeometrica arr[])
            {int sum=0;for( int i=0; i<arr.length; i++ )      {         sum += arr[i].area();      }return sum/arr.length;   }
    
   
}
