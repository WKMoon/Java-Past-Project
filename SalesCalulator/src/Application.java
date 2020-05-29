import javax.swing.JOptionPane;
import java.text.NumberFormat;
import java.util.Locale;
public class Application {
	public void start(){
		
		firstCal();
	
	}// end start
	
	public void firstCal(){
		String quest = "y";
		double p1 = 239.99;
		double p2 = 129.75;
		double p3 = 99.95;
		double p4 = 350.89;
		double total = 0;
		double income = 0;
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		double bestSale = 0;
		String name = null;
		String bestSaleName = null;
		double totalsum = 0;
		double average = 0;
		int totalNum = 0;
		int AllTotalNum = 0;
		int totalNum1 = 0;
		int totalNum2 = 0;
		int totalNum3 = 0;
		int totalNum4 = 0;
		String productNumber = null;
		int comparing1 = 0;
		int comparing2 = 0;	
		boolean loop;

		while (quest.equals("y")){
			do{
				name = JOptionPane.showInputDialog("Type your full name");
		        if (letter(name)) //CALL to validate function
		        {
		       
		            break; //or loop = false;
		        }else // if function returns false 
		        {
		            JOptionPane.showMessageDialog(null,"Invalid Type, please try again");
		            loop = true;
		        }
		    }while(loop);
			
		    do{
		        String validateNum1 = JOptionPane.showInputDialog("Type the number of product number 1 sold");
		        if (validate(validateNum1)) //CALL to validate function
		        {
		            num1 = Integer.parseInt(validateNum1);
		            break; //or loop = false;
		        }else // if function returns false 
		        {
		            JOptionPane.showMessageDialog(null,"Invalid Input");
		            loop = true;
		        }
		    }while(loop);
			double pt1 = p1 * num1;
			
			do{
		        String validateNum2 = JOptionPane.showInputDialog("Type the number of product number 2 sold");
		        if (validate(validateNum2)) //CALL to validate function
		        {
		            num2 = Integer.parseInt(validateNum2);
		            break; //or loop = false;
		        }else // if function returns false 
		        {
		            JOptionPane.showMessageDialog(null,"Invalid Input");
		            loop = true;
		        }
		    }while(loop);
			double pt2 = p2 * num2;
			
			do{
		        String validateNum3 = JOptionPane.showInputDialog("Type the number of product number 3 sold");
		        if (validate(validateNum3)) //CALL to validate function
		        {
		            num3 = Integer.parseInt(validateNum3);
		            break; //or loop = false;
		        }else // if function returns false 
		        {
		            JOptionPane.showMessageDialog(null,"Invalid Input");
		            loop = true;
		        }
		    }while(loop);
			double pt3 = p3 * num3;
			
			do{
		        String validateNum4 = JOptionPane.showInputDialog("Type the number of product number 4 sold");
		        
		        if (validate(validateNum4)) //CALL to validate function
		        {
		            num4 = Integer.parseInt(validateNum4);
		            break; //or loop = false;
		        }else // if function returns false 
		        {
		            JOptionPane.showMessageDialog(null,"Invalid Input");
		            loop = true;
		        }
		    }while(loop);
			double pt4 = p4 * num4;
			
			total = pt1 + pt2 + pt3 + pt4;
			
			income = 200 + total*0.09;
			
	        NumberFormat format = NumberFormat.getCurrencyInstance(Locale.CANADA);
	        String totalcurrency = format.format(total);
	        
			JOptionPane.showMessageDialog(null,"Your total amount is "+totalcurrency);
			
	        NumberFormat format1 = NumberFormat.getCurrencyInstance(Locale.CANADA);
	        String incomecurrency = format1.format(income);

			JOptionPane.showMessageDialog(null,"Your net profit amount is "+incomecurrency);
			
			totalsum = totalsum+total;
			
			totalNum = num1+num2+num3+num4;
			
			AllTotalNum = AllTotalNum+totalNum;
			
			average = totalsum/AllTotalNum;
			
			totalNum1 = totalNum1 + num1;
			totalNum2 = totalNum2 + num2;
			totalNum3 = totalNum3 + num3;
			totalNum4 = totalNum4 + num4;
			
			if(bestSale<=total){
				bestSale = total;
				bestSaleName = name;
			}//end sale if
			

				
			if(totalNum1 <= totalNum2){
				comparing1 = totalNum2;
				}
				else if(totalNum2 < totalNum1){
					comparing1 = totalNum1;
					}
			
			if(totalNum3 <= totalNum4){
				comparing2 = totalNum4;
				}
				else if(totalNum4 < totalNum3){
					comparing2 = totalNum3;
					}
			
			if(comparing1 <= comparing2){
				
				if(comparing2 == totalNum3){
					productNumber = "number three";
				}
				else
					productNumber = "number four";}
			if(comparing2 <= comparing1){
				
				if(comparing1 == totalNum1){
					productNumber = "number one";
				}
				else
					productNumber = "number two";}

			
			do{
				quest = JOptionPane.showInputDialog("Would you like to keep going?(y or n)");
			        
		        if (asking(quest)) //CALL to validate function
		        {
			       
			         break; //or loop = false;
			    }else // if function returns false 
			    {
			           JOptionPane.showMessageDialog(null,"Invalid answer, please try again");
			           loop = true;
			    }
			    }while(loop);//validate name			

		}//end while
		
		JOptionPane.showMessageDialog(null,"The best salespreson who most sold item is "+ bestSaleName);
		
        NumberFormat format3 = NumberFormat.getCurrencyInstance(Locale.CANADA);
        String totalsumcurrency = format3.format(totalsum);     
		JOptionPane.showMessageDialog(null,"The sum of sold is "+ totalsumcurrency);
		
        NumberFormat format4 = NumberFormat.getCurrencyInstance(Locale.CANADA);
        String averagecurrency = format4.format(average);
		JOptionPane.showMessageDialog(null,"The average value of a sale "+ averagecurrency );
		
		JOptionPane.showMessageDialog(null,"The product most sold is "+ productNumber + " product.");

	}//end firstCal

		public boolean letter (String s){
			s = s.toLowerCase();
			char testChar;	
			String validChars = "abcdefghijklmnopqrstuvwxyz-'  "; 
				for (int i = 0; i < s.length(); i++)
				{
					testChar = s.charAt(i);
					if (validChars.indexOf(testChar) < 0)
						return false;
						
				}//end for
					return true;
			}
		//end letter
			
			public boolean asking (String a){
				a = a.toLowerCase();
				char testChar;	
				String validChars = "yn"; 
					for (int j = 0; j < a.length(); j++)
					{
						testChar = a.charAt(j);
						if (validChars.indexOf(testChar) < 0)
							return false;
								
					}//end for
					return true;
				}
					
			public boolean validate(String n){
		        boolean valid = true;
		        int i = 0;
		        
		        if (n.length() == 0)  // set valid to 'false' if empty string
		            valid = false;
		              
		        while (i < n.length()) // set valid to 'false' if a character is not a digit
		        {
		            if (!Character.isDigit(n.charAt(i)))//if the character in the array at loc I is not a digit set valid = false
		            {
		                valid = false;
		                break;
		            }
		            i++;
		        }
		        
		        //other tests e.g. length, special characters, etc could go here
		        
		        return valid;
			}	
			
	
	}//end class