package ocp;

import java.util.HashMap;
import java.util.Map;

public class main {


	public static void main(String[] args) {
		
		Covid19Pacient pazientea = new Covid19Pacient("Elene",20);
		RespiratorySymptom respSym = new RespiratorySymptom(1,5);
		NeuroMuscularSymptom neurSym = new NeuroMuscularSymptom(2,10);
		CardioVascularSymptom cardSym = new CardioVascularSymptom(2,6);
		
		respSym.setAffectedDays(10);
		neurSym.setAffectedDays(6);
		cardSym.setAffectedDays(12);
		
		
		pazientea.addSymptom(respSym, 2);
		pazientea.addSymptom(neurSym, 3);
		pazientea.addSymptom(cardSym, 1);
		
		double emaitza = pazientea.calcCovid19Impact();
		System.out.println("Covid Impact: "+emaitza);
		
		// 12 itzuli behar du
		int daysEmaitza = pazientea.sanatedDays();
		System.out.println("Sendatzkeo "+daysEmaitza+" egun beharko ditu");
		

	}

}
