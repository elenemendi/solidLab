package dip;

import java.util.Map;

public class Increment4565 implements calculateIncrement {

	public double calculateIncrement(Map<Symptom,Integer> symptoms) {
		double increment =0;
		Afection calAfection = new Afection();
		double afection = calAfection.calculateAfection(symptoms);
		increment=afection*0.3;
		
		return increment;
	}
}
