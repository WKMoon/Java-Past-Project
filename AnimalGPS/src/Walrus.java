
public class Walrus extends Animal{
	
	private String Dental;
	
	public Walrus( String Species, String Sex,double Weight,String Dental,String GPS)
	{
		this.Sex = Sex;
		this.Species = Species;
		this.Weight = Weight;
		this.Dental = Dental;
		this.gps = new GPS();
		gps.add(GPS);
	} 
	
	public String getDental() {
		return Dental;
	}


	public void setDental(String dental) {
		Dental = dental;
	}

	

	@Override
	public String toString() {
		String Oneline = String.format("Species: %s, Sex: %s, Weight: %.2f, Dental Health: %s, GPS: %s", this.Species, this.Sex, this.Weight, this.Dental, this.gps.get(0));
		Oneline += "\n";
		
		return Oneline;
	}
	
}//end class
