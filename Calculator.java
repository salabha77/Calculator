/**
* The Calculator program implements an application that
* performs basic calculator operations with user input to the standard output.
*
* @author  Nicholas Auyeung
* @version 1.0
* @since   2020-22-11 
*/

package Calculator;
import java.util.Scanner;
public class Calculator {
	
	private static double result;
	
	//add operation
	static void addition(double firstNum, double secondNum) {
		result = firstNum + secondNum;
		System.out.println("Result: " + result + "\n");
	}
	//subtract operation
	static void subtraction(double firstNum, double secondNum) {
		result = firstNum - secondNum;
		System.out.println("Result: " + result + "\n");
	}
	//multiply operation
	static void multiplication(double firstNum, double secondNum) {
		result = firstNum * secondNum;
		System.out.println("Result: " + result + "\n");
	}
	//divide operation
	static void division(double firstNum, double secondNum) {
		result = firstNum / secondNum;
		System.out.println("Result: " + result + "\n");
	}
	
	public static void main(String[] args) {
		double firstNum, secondNum;
		char operation;
		boolean moreCalc = true;
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to Calculator" + "\n");
		while(moreCalc == true) {
			System.out.println("Enter any letter to exit");
			System.out.println("What operation would you like to perform?" + "\n");
			System.out.println("(1) Addition");
			System.out.println("(2) Subtraction");
			System.out.println("(3) Multiplication");
			System.out.println("(4) Division");
			//takes in user operation input
			operation = scan.next().charAt(0);
			if(Character.isLetter(operation)) {
				System.out.println("Exiting...");
				scan.close();
				break;
			}
			System.out.println("Enter the two numbers: ");
			firstNum = scan.nextDouble();
			secondNum = scan.nextDouble();
			
			//functions on user decided math operation
			switch(operation) {
				case '1':
					addition(firstNum, secondNum);
					break;
				case '2':
					subtraction(firstNum, secondNum);
					break;
				case '3':
					multiplication(firstNum, secondNum);
					break;
				case '4':
					division(firstNum, secondNum);
					break;
				default:
					System.out.println("Exiting...");
					scan.close();
					moreCalc = false;
					break;
			}
		}
		
	}

}
