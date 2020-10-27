package OCP;

import java.util.HashMap;
import java.util.Map;

public class main {


	public static void main(String[] args) {
		
		Covid19Pacient pazientea = new Covid19Pacient("Elene",20);
		RespiratorySymptom respSym = new RespiratorySymptom(1,5);
		NeuroMuscularSymptom NeurSym = new NeuroMuscularSymptom(2,10);
		CardioVascularSymptom CardSym = new CardioVascularSymptom(2,6);
		
		pazientea.addSymptom(respSym, 2);
		pazientea.addSymptom(NeurSym, 3);
		pazientea.addSymptom(CardSym, 1);
		
		double emaitza = pazientea.calcCovid19Impact();
		System.out.println("Covid Impact: "+emaitza);
		

	}

}
