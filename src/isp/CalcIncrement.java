package isp;

import java.util.Map;

public class CalcIncrement implements CalculateIncrement{
	
	//adin eta afection indize bat emanda, afekzioindizea adinaren arabera inkrementatzen du
	public double getIncrementByYear(Ageable a, double afection){
		if(a.getYears()>65) 
			return afection*0.5;
		else return 0;
		
	}



}
