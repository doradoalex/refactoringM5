package refactoringM5;

public class Informe {
	public String informe() {
	    double total = 0;
	    int bonificacions = 0;
	    String resultat = "Informe de lloguers del client " +
	        getNom() +
	        " (" + getNif() + ")\n";
	    for (Lloguer lloguer: lloguers) {
	        double quantitat = 0;
	        switch (lloguer.getVehicle().getCategoria()) {
	            case Vehicle.BASIC:
	                quantitat += 3;
	                if (lloguer.getDies() > 3) {
	                    quantitat += (lloguer.getDies() - 3) * 1.5;
	                }
	                break;
	            case Vehicle.GENERAL:
	                quantitat += 4;
	                if (lloguer.getDies() > 2) {
	                    quantitat += (lloguer.getDies() - 2) * 2.5;
	                }
	                break;
	            case Vehicle.LUXE:
	                quantitat += lloguer.getDies() * 6;
	                break;
	        }

	        // afegeix lloguers freq�ents
	        bonificacions ++;

	        // afegeix bonificaci� per dos dies de lloguer de Luxe
	        if (lloguer.getVehicle().getCategoria() == Vehicle.LUXE &&
	                lloguer.getDies()>1 ) {
	            bonificacions ++;
	        }

	        // composa els resultats d'aquest lloguer
	        resultat += "\t" +
	            lloguer.getVehicle().getMarca() +
	            " " +
	            lloguer.getVehicle().getModel() + ": " +
	            (quantitat * 30) + "�" + "\n";
	        total += quantitat * 30;
	    }

	    // afegeix informaci� final
	    resultat += "Import a pagar: " + total + "�\n" +
	        "Punts guanyats: " + bonificacions + "\n";
	    return resultat;
	}
}
