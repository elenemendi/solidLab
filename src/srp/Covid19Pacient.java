package srp;
import java.util.HashMap;
import java.util.Map;

public class Covid19Pacient extends Pacient{
	
	public Covid19Pacient(String name, int years) {
		super(name, years);
			}


	Map<Symptom,Integer> symptoms=new HashMap<Symptom,Integer>();

	
	public void addSymptom(Symptom c, Integer w){
		symptoms.put(c,w);	
	}
	
	
	double calcCovid19Impact() {
		double impact;
		if(getYears()<10) {
			impact=0;
		}else {
		//calculate afection
		Afection calcAfection = new Afection();
		double afection = calcAfection.calculateAfection(symptoms);
		
		//calculate increment
		Increment calcIncrement = new Increment();
		double increment= calcIncrement.calculateIncrement(getYears(), symptoms);
				
		//calculate impact
		impact=afection+increment;
		}
		return impact;
		
	}
	
	int sanatedDays() {
		int max =0;
		for(Symptom c:symptoms.keySet())
			if(c.getAffectedDays()>max)
				max = c.getAffectedDays();
		
		return max;
	}
	
}
