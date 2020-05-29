import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Controller {


	Animal animal;
	public Controller() {};
	
	public void Object(String species, String sex, double weight, double blood, String gps)
	{
		Penguins penguin = new Penguins(species,sex,weight,blood,gps);
		animal = penguin;
	}//end
	
	public void Object( String species, String sex, double weight, int spots, String gps)
	{
		SeaLions sealion = new SeaLions(species, sex,weight,spots,gps);
		animal = sealion;
	}//end
	
	public void Object( String species, String sex, double weight, String dental, String gps)
	{
		Walrus walrus = new Walrus(species,sex,weight,dental,gps);
		animal = walrus;
	}//end
	
	
	public void doWrite(String data) {
		ClassLoader classLoader = getClass().getClassLoader();
		File file = new File("resources/report.txt");
		FileWriter fr = null;
		try {
			fr = new FileWriter(file,true);
			fr.write(data);
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		finally{

				try {
					fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

		}
		
	
	}//end doWrite
	
	public String doRead() {
		String info="";
		try {
			
//			ClassLoader classLoader = getClass().getClassLoader();
//			File file = new File(classLoader.getResource(fileName).getFile());
			
			BufferedReader br = new BufferedReader(new FileReader("./resources/report.txt"));
			String s ="";
			while((s=br.readLine()) != null)//while stuff to read
			{
				
				info += s+"\n";
				System.out.println(s);
			}
			br.close();
		}catch(IOException e) //specific ie "close" to error
		{
			System.out.println(e.getMessage());
			}
		
		catch(Exception e) //generic - catchs ANY error
		{
			System.out.println(e.getMessage());
			}
		
		return info;
		
	}//end doRead
}//end class
