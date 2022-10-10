package Rosales_Switch;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		char operator;
		int num1, num2, result;
		
		Scanner input = new Scanner (System.in);
		
				System.out.println("Choose an Operator: +, -, *, /");
				operator = input.next().charAt(0);
				
				System.out.println("Choose Number: ");
				num1 = input.nextInt();
				
				System.out.println("Choose Number: ");
				num2 = input.nextInt();
				
				switch(operator) {
				
				case '+':
			        result = num1 + num2;
			        System.out.println(num1 + " + " + num2 + " = " + result);
			        break;

			      case '-':
			        result = num1 - num2;
			        System.out.println(num1 + " - " + num2 + " = " + result);
			        break;

			      case '*':
			        result = num1 * num2;
			        System.out.println(num1 + " * " + num2 + " = " + result);
			        break;
			        
			      case '/':
			          result = num1 / num2;
			          System.out.println(num1 + " / " + num2 + " = " + result);
			          break;
			          
			          default:
			        	  System.out.println("Invalid");
			        	  break;
				}
			        			  input.close();

				
				
				
				}
				}

