package lsk;

import java.util.HashMap;
import java.util.Map;

public class main {

	public static void main(String[] args) {

		Covid19Pacient pazientea = new Covid19Pacient("Elene",20);
		IncurableSymptom tristura = new IncurableSymptom("tristura",1,6);
		IncurableSymptom nekea = new IncurableSymptom("nekea",68,4);
		RespiratorySymptom respSym = new RespiratorySymptom("asma",1,5);

		pazientea.addSymptom(tristura, 2);
		pazientea.addSymptom(nekea, 3);
		pazientea.addSymptom(respSym, 52);

		pazientea.showSymptoms();

		pazientea.cure();

		pazientea.showSymptoms();
	}

}
