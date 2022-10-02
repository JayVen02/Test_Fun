import javax.swing.JOptionPane;	

public class ForTest_CheckIfEvenOrOdd {

	public static void main(String[] args) {

				String firstNumber; 
				  int number; 

				  firstNumber = JOptionPane.showInputDialog( null, " Enter a number" );
				  number = Integer.parseInt(firstNumber);
				  
				  if ( number%2 == 0 ){
					 System.out.print( " Number is EVEN " );
				  }
				  else 
					 System.out.print("Number is ODD");
				  
				  JOptionPane.showMessageDialog(null, number);

			}

		}



