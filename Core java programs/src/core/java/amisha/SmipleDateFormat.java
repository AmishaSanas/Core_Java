package core.java.amisha;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SmipleDateFormat {
	public static void main(String[] args) {
		
		Date d = new Date();

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-YYYY");
		
		System.out.println(sdf.format(d));
		
	}

}
