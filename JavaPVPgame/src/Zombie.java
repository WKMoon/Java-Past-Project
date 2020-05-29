
public class Zombie extends Charactor{

	
//	private int HealthPoint;

	
	public Zombie(String Name, int HealthPoint)
	{
		this.HealthPoint = HealthPoint;
		this.Name = Name;
		this.race = "Zombie";
	}
//
//	
//	public int getHealthPoint() {
//		return HealthPoint;
//	}
//	public void setHealthPoint(int HealthPoint) {
//		this.HealthPoint = HealthPoint;
//	}
	
	@Override
	
	public int Attack() {	
		int ZombieDMG = 20;
//		DMG = AllItem.getWeaponPower();
		return ZombieDMG;
	}//end Attack

	@Override
	public void Defence(int damage) {
		
		HealthPoint = HealthPoint - damage;
	}//end Defence

//	@Override
//	public int FirstBuying() {
//		// TODO Auto-generated method stub
//		return 0;
//	}

//	@Override
//	public void SecondBuying(int FirstBuying) {
//		// TODO Auto-generated method stub
//		
//	}




	
}//end class
