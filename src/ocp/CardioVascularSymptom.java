package ocp;

public class CardioVascularSymptom extends Symptom {
	
	
	public CardioVascularSymptom(int covidImpact, int severityIndex) {
		super(covidImpact, severityIndex);
		
	}
	public int getCovidImpact() {
		return covidImpact;
	}
	public void setCovidImpact(int covidImpact) {
		this.covidImpact = covidImpact;
	}
	public int getSeverityIndex() {
		return severityIndex;
	}
	public void setSeverityIndex(int severityIndex) {
		this.severityIndex = severityIndex;
	}
	
}