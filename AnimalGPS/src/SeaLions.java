
public class SeaLions extends Animal {
	
	
	private int Spots;
	
	public SeaLions(String Species,String Sex,double Weight,int Spots, String GPS)
	{
		this.Sex = Sex;
		this.Species = Species;
		this.Weight = Weight;
		this.Spots = Spots;
		this.gps = new GPS();
		gps.add(GPS);
	}
	
	
	

	public int getSpots() {
		return Spots;
	}

	public void setSpots(int spots) {
		Spots = spots;
	}
	
	@Override
	public String toString() {
		String Oneline = String.format("Species: %s, Sex: %s, Weight: %.2f, Spots: %d, GPS: %s", this.Species, this.Sex, this.Weight, this.Spots, this.gps.get(0));
		Oneline += "\n";
		
		return Oneline;
	}



}//end class

