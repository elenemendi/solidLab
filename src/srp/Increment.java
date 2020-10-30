package srp;

import java.util.Map;

public class Increment {

	public double calculateIncrement(int years,	Map<Symptom,Integer> symptoms) {
		double increment =0;
		Afection calAfection = new Afection();
		double afection = calAfection.calculateAfection(symptoms);
		if(years>65) 
			increment=afection*0.5;
		if(years>45 && years<=65) {
			increment=afection*0.3;
		}

		return increment;
	}
}
