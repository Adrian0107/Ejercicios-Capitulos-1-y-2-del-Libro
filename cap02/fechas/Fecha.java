/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro.cap02.fechas;

/**
 *
 * @author Usuario
 */
public class Fecha {
   private int dia;
   private int mes;
   private int anio;

   public Fecha(String s) 
   {
       int pos1=s.indexOf('/'); 
       int pos2=s.lastIndexOf('/');        
       String sDia=s.substring(0,pos1);    
       dia = Integer.parseInt(sDia);    
         
       String sMes=s.substring(pos1+1,pos2);   
       mes = Integer.parseInt(sMes);   
      
       String sAnio = s.substring(pos2+1);  
       anio = Integer.parseInt(sAnio);   }
   
   public int getDia() 
   {     
       // retorna el valor de la variable dia
       return dia;   
   }
   public void setDia(int dia) 
   {     
       // asigna el valor del parametro a la variable dia 
       this.dia = dia;    
   }
   public int getMes()   
   {
       return mes;  
   } 
   public void setMes(int mes)  
   {
       this.mes = mes;  
   }
   public int getAnio()  
   {
       return anio;  
   }
   public void setAnio(int anio)   
   {
       this.anio = anio;  
   }
}
