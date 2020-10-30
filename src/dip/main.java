package dip;

import java.util.HashMap;
import java.util.Map;

public class main {

	public static void main(String[] args) {
		
		Covid19Pacient pazientea1 = new Covid19Pacient("Elene",70);
		Covid19Pacient pazientea2 = new Covid19Pacient("Elene",56);
		Covid19Pacient pazientea3 = new Covid19Pacient("Elene",8);
		
		RespiratorySymptom respSym = new RespiratorySymptom(80,5);
		NeuroMuscularSymptom neurSym = new NeuroMuscularSymptom(70,10);
		CardioVascularSymptom cardSym = new CardioVascularSymptom(22,6);
		
		respSym.setAffectedDays(10);
		neurSym.setAffectedDays(6);
		cardSym.setAffectedDays(12);
		
		Increment65 incr70 = new Increment65();
		Increment4565 incr56 = new Increment4565();
		Increment10 incr8 = new Increment10();
		
		Afection afection = new Afection();
		
		
		pazientea1.addSymptom(respSym, 2);
		pazientea1.addSymptom(neurSym, 3);
		pazientea1.addSymptom(cardSym, 1);
		
		pazientea2.addSymptom(respSym, 2);
		pazientea2.addSymptom(neurSym, 3);
		pazientea2.addSymptom(cardSym, 1);
		
		pazientea3.addSymptom(respSym, 2);
		pazientea3.addSymptom(neurSym, 3);
		pazientea3.addSymptom(cardSym, 1);
		
		double emaitza1 = pazientea1.calcCovid19Impact(afection,incr70);
		double emaitza2 = pazientea2.calcCovid19Impact(afection,incr56);
		double emaitza3 = pazientea3.calcCovid19Impact(afection,incr8);
		System.out.println("Covid Impact paziente1: "+emaitza1);
		System.out.println("Covid Impact paziente2: "+emaitza2);
		System.out.println("Covid Impact paziente3: "+emaitza3);

	}

}
