import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;


public class Application {
	boolean loop = false;
	Scanner input = new Scanner(System.in); //code for getting input
	boolean looping_condition = true;
	ArrayList<String> passengers = new ArrayList<String>();
	
	boolean[][] seats = {{false,false,false,false},{false,false,false,false},{false,false,false,false},{false,false,false,false}};
	String number = "";
	private int seatClass;
	private String passengerName;
	

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public int getSeatClass() {
		return seatClass;
	}

	public void setSeatClass(int seatClass) {
		this.seatClass = seatClass;
	}

	public void start()
	{		
		
		
//		System.out.println("Do you want to quit? (y/n): ");
//		String quitQuestion = input.next();
		boolean loop;
		String temp = "";

		do{
			if(looping_condition)
			{
				String firstname1 = fname();
				String lastname1 = lname();
				temp = firstname1 + " " + lastname1;
				setPassengerName(temp);
				String number = personalInfo();
				
				printArray(seats);
				
				loop = true;
			}
			else
			{
				break;
			}
						
		}while(planeFull() == false);	
		report();
		
	}//end start
	
	public void report()
	{	Collections.sort(passengers);
		for(int row=0; row<passengers.size() ;row++){
			System.out.println(passengers.get(row));
		}
	}
	
	public boolean planeFull() 
	{
		for(int row=0; row<seats.length ;row++){
			for(int col=0; col<seats[0].length; col++){
				if(seats[row][col] == false)
				{
					return false;
				}
			}
		}
		return true;
	}
	
	public String fname()
	{	
		String firstname1;
		do{
			System.out.println("Please enter first name: ");
			firstname1 = input.nextLine();
			firstname1.toLowerCase();
	        if (letter(firstname1)) //CALL to validate function
	        {
	            break; //or loop = false;
	        }else // if function returns false 
	        {
	        	System.out.println("Invalid Type, please try again");
	            loop = true;
	        }
	    }while(loop);
		return firstname1;
	}

	public String lname()
	{	
		String lastname1;
		do{
			System.out.println("Please enter last name: ");
			lastname1 = input.nextLine();
			lastname1.toLowerCase();
	        if (letter(lastname1)) //CALL to validate function
	        {
	       
	            break; //or loop = false;
	        }else // if function returns false 
	        {
	        	System.out.println("Invalid Type, please try again");
	            loop = true;
	        }
	    }while(loop);
		return lastname1;
	}

	
	public String personalInfo()
	{		
		
		
		

		String rtrn = "";
		int seatClass = numberVali("Please type 1 for First Class or 2 for Economy: ");//////////////number
		
		Scanner newscan = new Scanner(System.in);
		
		
		if((seatClass == 1) && (seats[1][2]) && (seats[1][3]))
		{
			System.out.println("First Class is full. Do you want to get Economy Class? (y/n)");
			String ClassAnswer = newscan.nextLine();
			ClassAnswer.toLowerCase();
			do{
				if(asking(ClassAnswer))
				{
					break;
				}
				else{
					System.out.println("Invalid answer. Please try again.");
					System.out.println("First Class is full. Do you want to get Economy Class? (y/n)");
					ClassAnswer = newscan.nextLine();
					ClassAnswer.toLowerCase();
					loop = true;
				}
			}while(loop);
			
			if (ClassAnswer.equals("y"))
			{
				seatClass = 2;
			}
			else if (ClassAnswer.equals("n"))
			{
				
				
				System.out.println("Next flight leaves in 3hours");
				fname();
				lname();
			}
		}//end else if
		else if((seatClass == 2) && (seats[3][2]) && (seats[3][3]))
		{
			System.out.println("Economy Class is full. Do you want to get First Class? (y/n)");
			String ClassAnswer = newscan.nextLine();
			ClassAnswer.toLowerCase();
			do{
				if(asking(ClassAnswer))
				{
					break;
				}
				else{
					System.out.println("Invalid answer. Please try again.");
					System.out.println("Economy Class is full. Do you want to get First Class? (y/n)");
					ClassAnswer = newscan.nextLine();
					ClassAnswer.toLowerCase();
					loop = true;
				}
			}while(loop);
			if (ClassAnswer.equals("y"))
			{
				seatClass = 1;
			}
			else if (ClassAnswer.equals("n"))
			{
				System.out.println("Next flight leaves in 3hours");
				fname();
				lname();
				
			}
		
		}		
		
		if (seatClass == 1)
			{

			rtrn = firstClass();

			}	
			
		
		if (seatClass == 2)
			{

			rtrn = EconomyClass();

			
			}
	return rtrn;
	}//end personalInfo
	
	public void printArray(boolean[][] seats){ //pass val But really acts like a Ref pass
		for(int row=0; row<seats.length; row++){
			for(int col=0; col<seats[0].length; col++){
				if(col<3)
					if(seats[row][col]==false){
						System.out.print(" Empty "+" ");}
					else{
						System.out.print(" Full"+" ");}
				else
					if(seats[row][col]==false){
						System.out.println(" Empty "+" ");}
					else{
						System.out.println(" Full"+" ");}}}}//outside for

	
	public String firstClass()
	{
		String letter = "", number = "", answer = "";
		int row = 0, col = 0;
		//boolean printArray = false;
		Scanner scan = new Scanner(System.in);
		int seatWay = numberVali("Please type 1 for window and 2 for asile: ");
		boolean booked = false;
	//	int seatWay = input.nextInt(); ////////////////////////number
	
		if(seatWay == 1 && seats[1][3]){
			System.out.println("Window seats are fully booked. If you want an Asile seat, please enter 'y' or 'n': ");
			String ans = scan.nextLine(); 
			ans.toLowerCase();
			do{
				if(asking(ans))
				{
					break;
				}
				else{
					System.out.println("Invalid answer. Please try again.");
					System.out.println("Window seats are fully booked. If you want an Asile seat, please enter 'y' or 'n': ");
					ans = scan.nextLine();
					ans.toLowerCase();
					loop = true;
				}
			}while(loop);
			if(ans.equals("y")){
				seatWay = 2;
			}//end secnod if
			else
			{
				System.out.println("Next flight leaves in 3hours");
	
			}
		}//end second if
		else if(seatWay == 2 && seats[1][2]){
			System.out.println("Asile seats are fully booked. If you want a Window seat, please enter 'y' or 'n': ");
			String ans = scan.nextLine(); 	
			ans.toLowerCase();
			do{
				if(asking(ans))
				{
					break;
				}
				else{
					System.out.println("Invalid answer. Please try again.");
					System.out.println("Asile seats are fully booked. If you want a Window seat, please enter 'y' or 'n': ");
					ans = scan.nextLine();
					ans.toLowerCase();
					loop = true;
				}
			}while(loop);
			if(ans.equals("y")){
				seatWay = 1;
			}//end second if
			else
			{
				System.out.println("Next flight leaves in 3hours");
			}
		}//end first if
	
	
		for(row=0; row<2;row++)
		{
			for(col=0; col<4;col++)
			{
				if(seats[row][col] == false) // checks if seat is vacant
				{
					if(seatWay == 1 && (col == 0 || col == 3))
					{
						booked = true;
						break;
						
					}
					
					else if (seatWay == 2 && (col == 1 || col ==2))
					{	
						booked = true;
						break;
					}
				}
			}
			if(booked == true) {
				seats[row][col] = true;
				break;
			}
		}
									
		if(booked) {
			switch(col)
			{
				case 0: letter = "A"; break;
				case 1: letter = "B"; break;
				case 2: letter = "C"; break;
				case 3: letter = "D"; break;
			}
			number = (row + 1) + letter;
			setSeatClass(1); // first class	
			boarding(number);
		}			
		return number;
		
	}//end firstClass
	
	

	
	
	public String EconomyClass(){
	String letter = "", number = "", answer = "";
	int row = 2, col = 0;
	Scanner scan = new Scanner(System.in);
	int seatWay = numberVali("Please type 1 for window and 2 for asile: ");
	boolean booked = false;
	
	if(seatWay == 1 && seats[3][3]){
		System.out.println("Window seats are fully booked. If you want a asile seat, please enter 'y' or 'n': ");
		String ans = scan.nextLine(); 	
		ans.toLowerCase();
		do{
			if(asking(ans))
			{
				break;
			}
			else{
				System.out.println("Invalid answer. Please try again.");
				System.out.println("Window seats are fully booked. If you want an Asile seat, please enter 'y' or 'n': ");
				ans = scan.nextLine();
				ans.toLowerCase();
				loop = true;
			}
		}while(loop);
		if(ans.equals("y")){
			seatWay = 2;
		}//end second if
		else
		{
			System.out.println("Next flight leaves in 3hours");
		}
	}//end first if
	else if(seatWay == 2 && seats[3][2]){
		System.out.println("Asile seats are fully booked. If you want a window seat, please enter 'y' or 'n': ");
		String ans = scan.nextLine(); 	
		ans.toLowerCase();
		do{
			if(asking(ans))
			{
				break;
			}
			else{
				System.out.println("Invalid answer. Please try again.");
				System.out.println("Asile seats are fully booked. If you want a Window seat, please enter 'y' or 'n': ");
				ans = scan.nextLine();
				ans.toLowerCase();
				loop = true;
			}
		}while(loop);
		if(ans.equals("y")){
			seatWay = 1;
		}//end second if
		else
		{
			System.out.println("Next flight leaves in 3hours");
		}
	}//end first if
	
	
		for(row=2; row<4;row++)
		{
			for(col=0; col<4;col++)
			{
				if(seats[row][col] == false) // checks if seat is vacant
				{
					if(seatWay == 1 && (col == 0 || col == 3))
					{
						booked = true;
						break;
						
					}
					else if (seatWay == 2 && (col == 1 || col ==2))
					{	
						booked = true;
						break;
					}
				}
			}
			if(booked == true) {
				seats[row][col] = true;
				break;
			}
		}
									
		if(booked) {
			switch(col)
			{
				case 0: letter = "A"; break;
				case 1: letter = "B"; break;
				case 2: letter = "C"; break;
				case 3: letter = "D"; break;
			}
			number = (row + 1) + letter;
			setSeatClass(2); // economy class	
			boarding(number);
		}	
			
			
		return number;


	}//end secondClass
	
	

	public String boarding(String number)
	{	
		String strClass = "", strPassengerSeat = "";
		
		
		if(getSeatClass() == 1) {
			strClass = "First Class";
		}
		else {
			strClass = "Economy Class";
		}
		
		String boardingPass = "------------------------------------------------\n";
		boardingPass += "        Name: " + getPassengerName() + "\n";
		boardingPass += "        SeatNumber: " + number + "\n";
		boardingPass += "        Seat Class:" + strClass + "\n";
		boardingPass += "------------------------------------------------";
		
		strPassengerSeat = "Name: " + getPassengerName() + " , Seat#:" + number;
		passengers.add(strPassengerSeat);

		System.out.println(boardingPass);
		return boardingPass;
	}
	
	public String list(String firstname , String lastname , String number)
	{
		String bookList = " " +firstname+ " " +lastname+ " " +number+ " ";
		System.out.println(bookList);
		return bookList;
	}
				
	//----------------------String Validation
	public boolean letter (String s){
		s = s.toLowerCase();
		char testChar;	
		String validChars = "abcdefghijklmnopqrstuvwxyz-'  "; 
		
		if(s.length()== 0 || s.equals(" "))
			return false;
			for (int i = 0; i < s.length(); i++)
			{
				testChar = s.charAt(i);
				if (validChars.indexOf(testChar) < 0)
					return false;
					
			}//end for
				return true;
		}
	//end letter
		//-----------------------------yn validation
		public boolean asking (String a){
			a = a.toLowerCase();
			char testChar;	
			String validChars = "yn-'  "; 
			if(a.length()== 0 || a.equals(" "))
				return false;
				for (int j = 0; j < a.length(); j++)
				{
					testChar = a.charAt(j);
					if (validChars.indexOf(testChar) < 0)
						return false;
							
				}//end for
				return true;
			}
		
		
		
		public int numberVali(String n)
		{
			String numby;
			int num = 0;
			boolean loop;
			String abc = "\\d+";
			do{
				System.out.println(n);
				numby = input.nextLine();
				if(numby.matches(abc)){
					num = Integer.parseInt(numby);
					if(num == 1 || num == 2)
						loop = false;
					else{
						System.out.println("Invalid");
						loop = true;}}
				else{
					System.out.println("Invalid Input");
					loop = true;}}
			while(loop);
				return num;}
		

		
}//end class

