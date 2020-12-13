package refactoringM5;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GestorLlogersLite {
	private static final String Lloguer = null;

	// demostració de construcció d'un vehicle de categoria BASIC
	Vehicle vehicleBasic = new Vehicle("Tata", "Vista", Vehicle.BASIC);

	// demostració de construccuó d'un lloguer amb una data
	SimpleDateFormat dateFormat = new SimpleDateFormat("d/M/yyyy");
	Date date = dateFormat.parse("2/8/2013");
	Lloguer lloguerBasic = new Lloguer(Lloguer, 2, vehicleBasic);

	System.out.println(dateFormat.format(lloguerBasic.getData()));
}
