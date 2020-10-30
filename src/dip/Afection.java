package dip;

import java.util.Map;

public class Afection implements calculateAfection {


	public double calculateAfection(Map<Symptom, Integer> symptoms) {
		double afection=0;
		int elems=0;
		for(Symptom s:symptoms.keySet())
			if(s.getCovidImpact()>50) {
				afection=afection+s.getSeverityIndex()*symptoms.get(s);
				elems++;
			}
		if(elems!=0)
			afection=afection/elems;
		return afection;

	}
	
}
