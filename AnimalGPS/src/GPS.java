
import java.util.ArrayList;

public class GPS {

	private ArrayList<String> array;
	
	GPS()
	{
		this.array = new ArrayList<>();
	}
	
	
	public void add(String array)
	{
		this.array.add(array);
	}
	
	public String get(int arrayFinal)
	{
		return this.array.get(arrayFinal);
	}
	
}//end class
