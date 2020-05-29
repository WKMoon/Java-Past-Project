
public class Item2 {
	
	private int ArmorPower;
	private int ArmorPrice;
	private String ArmorName;

	
	public Item2(String ArmorName, int ArmorPower, int ArmorPrice)
	{
		this.ArmorPower = ArmorPower;
		this.ArmorPrice = ArmorPrice;
		this.ArmorName = ArmorName;
		
	}
	public String getArmorName() {
		return ArmorName;
	}
	public void setArmorName(String ArmorName) {
		this.ArmorName = ArmorName;
	}
	
	public int getArmorPower() {
		return ArmorPower;
	}
	public void setArmorPower(int ArmorPower) {
		this.ArmorPower = ArmorPower;
	}
	
	public int getArmorPrice() {
		return ArmorPrice;
	}
	public void setArmorPrice(int ArmorPrice) {
		this.ArmorPrice = ArmorPrice;
	}
}//end class
