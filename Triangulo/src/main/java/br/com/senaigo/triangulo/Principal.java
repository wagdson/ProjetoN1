package br.com.senaigo.triangulo;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;

/**
 * 
 * @author Wagdson
 *
 */
public class Principal {
	private LocalDate localTime = new LocalDate();

	public String getHorario() {

		SimpleDateFormat d = new SimpleDateFormat("HH:mm:ss.SSS");
		DateTime data = localTime.toDateTimeAtCurrentTime();

		String sdf = d.format(data.getMillis());

		return sdf;
	}

}
