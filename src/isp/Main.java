package isp;

public class Main {

	public static void main(String[] args) {
		Pertsona pertsonaG = new Pertsona("Elene","20");
		Pertsona pertsonaZ = new Pertsona("Elene","80");
		
		CalcIncrement ci = new CalcIncrement();
		
		double emaitzaG = ci.getIncrementByYear(pertsonaG, 40);
		double emaitzaZ = ci.getIncrementByYear(pertsonaZ, 40);
		
		System.out.println("Pertsona gaztea: "+emaitzaG);
		System.out.println("Pertsona zaharra: "+emaitzaZ);

	}

}
