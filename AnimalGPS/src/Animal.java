
public abstract class Animal {
	
	
	public String Sex;
	public String Species;
	public double Weight;
	public String GPS;
	public GPS gps = new GPS();//aggregation
	

	


	public String getGPS() {
		return GPS;
	}

	public void setGPS(String gPS) {
		GPS = gPS;
	}

	public String getSex() {
		return Sex;
	}

	public void setSex(String sex) {
		Sex = sex;
	}

	public String getSpecies() {
		return Species;
	}

	public void setSpecies(String species) {
		Species = species;
	}

	public double getWeight() {
		return Weight;
	}

	public void setWeight(double weight) {
		Weight = weight;
	}

	public abstract String toString();

}//end class
