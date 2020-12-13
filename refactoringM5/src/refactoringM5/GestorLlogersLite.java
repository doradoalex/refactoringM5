package refactoringM5;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GestorLlogersLite {
	private static final String Lloguer = null;

	// demostraci� de construcci� d'un vehicle de categoria BASIC
	Vehicle vehicleBasic = new Vehicle("Tata", "Vista", Vehicle.BASIC);

	// demostraci� de construccu� d'un lloguer amb una data
	SimpleDateFormat dateFormat = new SimpleDateFormat("d/M/yyyy");
	Date date = dateFormat.parse("2/8/2013");
	Lloguer lloguerBasic = new Lloguer(Lloguer, 2, vehicleBasic);

	System.out.println(dateFormat.format(lloguerBasic.getData()));
}
