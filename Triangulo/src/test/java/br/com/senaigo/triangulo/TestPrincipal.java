package br.com.senaigo.triangulo;
/**
 * 
 * @author Wagdson
 *
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import junit.framework.TestCase;

public class TestPrincipal extends TestCase {

	@Test
	public void testGetHorario() throws ParseException {

		SimpleDateFormat d = new SimpleDateFormat("HH:mm:ss.SSS");
		Principal principal = new Principal();
	   	Date date = new Date();

		
	String dtprinci = principal.getHorario();
	String dat = d.format(date);
	
	Date data1 = (Date)d.parse(dtprinci);
	Date data2 = (Date)d.parse(dat);

	assertTrue(data1.getTime() <= (data2.getTime()+100) && data1.getTime() >= (data2.getTime()-100) );
		
	}

}
