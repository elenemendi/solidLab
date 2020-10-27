package OCP;
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
		double afection=0;
		double increment=0;
		double impact;
		//calculate afection
		for(Symptom c:symptoms.keySet())
			afection=afection+c.getSeverityIndex()*symptoms.get(c);
		
		afection=afection/(symptoms.size());
		
		//calculate increment
		if(getYears()>65) 
			increment=afection*0.5;
		
		//calculate impact
		impact=afection+increment;
		return impact;
	}
	
}
