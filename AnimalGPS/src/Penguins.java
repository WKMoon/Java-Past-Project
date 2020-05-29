
public class Penguins extends Animal {

	private double Blood;
	

	public Penguins(String Species, String Sex, double Weight, double Blood, String GPS)
	{
		this.Sex = Sex;
		this.Species = Species;
		this.Weight = Weight;
		this.Blood = Blood;
		this.gps = new GPS();
		gps.add(GPS);
		
	}


	public double getBlood() {
		return Blood;
	}


	public void setBlood(double blood) {
		Blood = blood;
	}


	@Override
	public String toString() {
		String Oneline = String.format("Species: %s, Sex: %s, Weight: %.2f, Blood Pressure: %.2f, GPS: %s", this.Species, this.Sex, this.Weight, this.Blood, this.gps.get(0));
		System.out.println("int the toString format: "+Oneline);
		Oneline += "\n";
		return Oneline;
	}//end override
	
	
}//end class
