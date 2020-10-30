package lsk;

public class CardioVascularSymptom extends Symptom implements Curable {
	
	
	public CardioVascularSymptom(String name, int covidImpact, int severityIndex) {
		super(name,covidImpact, severityIndex);
		
	}
	
	@Override
	public void cure() {
		System.out.println("treatment applied to:"+name);
		
	}
	
	
	
	
}
