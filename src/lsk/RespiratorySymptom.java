package lsk;

public class RespiratorySymptom extends Symptom implements Curable {

	public RespiratorySymptom(String name, int covidImpact, int severityIndex) {
		super(name, covidImpact, severityIndex);
		
	}

	@Override
	public void cure() {
		System.out.println("treatment applied to:"+name);
		
	}
	
}
