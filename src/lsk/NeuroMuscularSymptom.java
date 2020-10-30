package lsk;

public class NeuroMuscularSymptom extends Symptom implements Curable{
	
	
	public NeuroMuscularSymptom(String name,int covidImpact, int severityIndex) {
		super(name, covidImpact, severityIndex);
		
	}

	@Override
	public void cure() {
		System.out.println("treatment applied to:"+name);
		
	}
	

	
}
