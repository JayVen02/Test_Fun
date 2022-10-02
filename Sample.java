package Rosales_Switch;
import java.util.*;
public class Sample {
	
	public static void main(String [] args) {
		   Scanner sc = new Scanner (System.in);
	         System.out.println("Rate how much you love me? (0 - 10):");
	         int user_loveRate = sc.nextInt();
	         
	         
	 switch (user_loveRate) {
	     case 0: case 1: case 2: case 3: case 4:
	         System.out.println(" She Love you as a friend");
	         break;
	         
	     case 5: case 6: case 7:
	         System.out.println(" She Love you as a brother");
	         break;
	     case 8 : case 9 : case 10 :
	         System.out.println(" She Loved you");
	                 break;
	     default:
	         System.out.println(" dika nya love");
	    
	 }      
	        

	 
	}
	}

