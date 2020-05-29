
public abstract class Charactor {

	public int HealthPoint;
	public String Name;
	public String race;
//	public int Gold;
	
	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getHealthPoint() {
		return HealthPoint;
	}
	
	public void setHealthPoint(int HealthPoint) {
		this.HealthPoint = HealthPoint;
	}
	
	

	public abstract int Attack();
	public abstract void Defence(int DMG);
//	public abstract int FirstBuying();
//	public abstract void SecondBuying(int FirstBuying);
	
}//end class
