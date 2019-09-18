package br.com.senaigo.triangulo;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
 
    	
    	Principal principal = new Principal();
    	Date date = new Date();
    
    	
    	SimpleDateFormat d = new SimpleDateFormat("HH:mm:ss.SSS");
    	System.out.println( principal.getHorario() + "     "+d.format(date.getTime() ));
    	System.out.println();
    	
    	
    }
}
