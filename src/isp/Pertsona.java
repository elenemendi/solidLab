package isp;

public class Pertsona implements Ageable{

	public Pertsona(String name, String adina) {
		super();
		this.name = name;
		this.adina = adina;
	}
	
	public String getAdina() {
		return this.adina;
	}

	String name, adina;

	@Override
	public int getYears() {
		
		return Integer.parseInt(this.getAdina());
	}
}
