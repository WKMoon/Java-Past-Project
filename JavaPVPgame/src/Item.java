
public class Item {
	

	
	private int WeaponPower;
//	private int ArmorPower;
	private int WeaponPrice;
//	private int ArmorPrice;
	private String WeaponName;
//	private String ArmorName;
	
	
	public Item(String WeaponName, int WeaponPower, int WeaponPrice)
	{
		this.WeaponPower = WeaponPower;
		this.WeaponPrice = WeaponPrice;
		this.WeaponName = WeaponName;
	}
	
//	public Item2(String ArmorName, int ArmorPower, int ArmorPrice)
//	{
//		this.ArmorPower = ArmorPower;
//		this.ArmorPrice = ArmorPrice;
//		this.ArmorName = ArmorName;
//		
//	}
	
	
	
	public String getWeaponName() {
		return WeaponName;
	}
	public void setWeaponName(String WeaponName) {
		this.WeaponName = WeaponName;
	}
	
//	public String getArmorName() {
//		return ArmorName;
//	}
//	public void setArmorName(String ArmorName) {
//		this.ArmorName = ArmorName;
//	}
	
	public int getWeaponPower() {
		return WeaponPower;
	}
	public void setWeaponPower(int WeaponPower) {
		this.WeaponPower = WeaponPower;
	}
	
//	public int getArmorPower() {
//		return ArmorPower;
//	}
//	public void setArmorPower(int ArmorPower) {
//		this.ArmorPower = ArmorPower;
//	}
	
	public int getWeaponPrice() {
		return WeaponPrice;
	}
	public void setWeaponPrice(int WeaponPrice) {
		this.WeaponPrice = WeaponPrice;
	}

//	public int getArmorPrice() {
//		return ArmorPrice;
//	}
//	public void setArmorPrice(int ArmorPrice) {
//		this.ArmorPrice = ArmorPrice;
//	}


}
