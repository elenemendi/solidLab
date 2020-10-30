package isp;

public abstract class Symptom {

	int severityIndex;
	int covidImpact;
	int affectedDays;
	
	
	public Symptom(int covidImpact, int severityIndex) {
		this.covidImpact = covidImpact;
		this.severityIndex = severityIndex;
		
	}

	public abstract int getCovidImpact();
	
	public abstract void setCovidImpact(int covidImpact);
	
	public abstract int getSeverityIndex();
	
	public abstract void setSeverityIndex(int severityIndex);
	
	public abstract int getAffectedDays();

	public abstract void setAffectedDays(int affectedDays);
	

}

