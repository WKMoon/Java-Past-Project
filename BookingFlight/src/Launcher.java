
public class Launcher {

	public static void main(String[] args) {
		try{
		Application app = new Application();
		app.start();
		}//end try
		catch(Exception e){
			System.out.println("This is error");
		}//end catch
	}

}//end Launcher
