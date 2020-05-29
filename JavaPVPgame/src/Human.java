
public class Human extends Charactor{
	
//	private int HealthPoint;
	private int Gold;
	Item AllItem;
	Item2 AllItem2;
	
	
	public Item getAllItem() {
		return AllItem;
	}



	public void setAllItem(Item allItem) {
		AllItem = allItem;
	}




	public Item2 getAllItem2() {
		return AllItem2;
	}





	public void setAllItem2(Item2 allItem2) {
		AllItem2 = allItem2;
	}





	public Human(String Name, int HealthPoint, int Gold)
	{
		this.HealthPoint = HealthPoint;
		this.Gold = Gold;
		this.Name = Name;
		this.race = "Human";
		
	}


	
	
	
//	public int getHealthPoint() {
//		return HealthPoint;
//	}
//	
//	public void setHealthPoint(int HealthPoint) {
//		this.HealthPoint = HealthPoint;
//	}
	
	public int getGold() {
		return Gold;
	}
	
	public void setGold(int Gold) {
		this.Gold = Gold;
	}
	
	@Override
	
	public int Attack() {	
		int DMG = 0;
		DMG = AllItem.getWeaponPower();
		return DMG;
	}//end Attack

	@Override
	public void Defence(int DMG) {
		
		HealthPoint = (HealthPoint + AllItem2.getArmorPower()) - DMG;
	}//end Defence
	

//	@Override
	public int FirstBuying() {
		int buyWeapon = Gold - AllItem.getWeaponPrice();		
		return buyWeapon;
	}//end Buy
	
//	@Override
	public void SecondBuying(int buyWeapon) {
		int buyArmor = buyWeapon - AllItem2.getArmorPrice();
		Gold = buyArmor;
	}
	
	
	
}//end class
