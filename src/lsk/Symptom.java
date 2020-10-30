package lsk;

public abstract class Symptom {

	int severityIndex;
	int covidImpact;
	public String name;

	public Symptom(String name, int covidImpact, int severityIndex) {
		this.covidImpact = covidImpact;
		this.severityIndex = severityIndex;
		this.name= name;

	}
	
	public int getSeverityIndex() {
		return severityIndex;
	}

	public void setSeverityIndex(int severityIndex) {
		this.severityIndex = severityIndex;
	}

	public int getCovidImpact() {
		return covidImpact;
	}

	public void setCovidImpact(int covidImpact) {
		this.covidImpact = covidImpact;
	}
	
	public void show(){
		System.out.println("symptom value :"+name+" severityIndex :"+ severityIndex+" covidImpact:"+covidImpact);
		}

}

