/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro.cap02.colecciones;

/**
 *
 * @author Usuario
 */
public class MiColeccionT <T> {
    private Object datos[]=null;
    private int len=0;
    public MiColeccionT(int capacidadInicial)
    {      
        datos=new Object[capacidadInicial];
    }
    public void agregar(T elm)  
    {  
        insertar(elm,len);
    }  
    public void insertar(T elm, int i) 
    {
        if( len==datos.length )    
        {      
            Object aux[] = datos;     
            datos = new Object[datos.length*2];
            for(int j=0; j<len; j++)  
            {       
                datos[j]=aux[j]; 
            }        
            aux=null;   
        }
        for( int j=len-1; j>=i; j-- ) 
        {
            datos[j+1]=datos[j];   
        }     
        datos[i]=elm;
        len++;  
    }
    @SuppressWarnings("empty-statement")
    public int buscar(T elm)  
    {
        int i=0;
        for( ;i<len && !datos[i].equals(elm); i++ );
        return i<len?i:-1; 
    }
    @SuppressWarnings ("unchecked")
    public T eliminar(int i)
    {
        Object aux = datos[i];
        for( int j=i; j<len-1; j++ )  
        {
            datos[j]=datos[j+1];   
        }
        len--;return (T)aux;  
    }
    @SuppressWarnings ("unchecked")
    public T obtener(int i)  
    {
        return (T)datos[i]; 
    }

    
    
}
