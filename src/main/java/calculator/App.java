package calculator;
import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class App {

	private static final Logger logger = LogManager.getLogger(App.class);

	public static void main(String[] args){
		Scanner reader = new Scanner(System.in);
		int op, flag=0;
		double num, exp;
		int numm;
		System.out.println("------------Calculator--------------");
		while(flag==0){
			System.out.println("Operations available:");
			logger.info("A user's input !");
            System.out.println("");
            System.out.println("1. Factorial");
            System.out.println("2. Power");
            System.out.println("3. Square Root");
            System.out.println("4. National Log");
            System.out.println("5. Exit");
			System.out.println("");
            System.out.print("Enter the operation(number): ");
			System.out.println("");
			op = reader.nextInt();
			if(op==5) flag = 1;
			else{
				
				if(op == 1) {
					System.out.println("Selected Factorial");
					System.out.println("");
					System.out.print("Enter number: ");
					numm = reader.nextInt();
					factorial(numm);
				}
				else if(op == 2) {
					System.out.println("Selected Power");
					System.out.println("");
					System.out.print("Enter number: ");
					num = reader.nextDouble();
					System.out.print("exponent: ");
					exp = reader.nextDouble();
					power(num,exp);
				}
				else if(op == 3) {
					System.out.println("Selected Square Root");
					System.out.println("");
					System.out.print("Enter number: ");
					num = reader.nextDouble();
					squareRoot(num);
				}
				else if(op == 4) {
					System.out.println("Selected Natural Log");				
					System.out.println("");
					System.out.print("Enter number: ");
					num = reader.nextDouble();
					naturalLog(num);
				}
				else {
					System.out.println("Invalid argument");
				}
				}		
		    }
		}

	public static double squareRoot(double num){
		double c = Math.sqrt(num);
		logger.info("Square root of "+num+" = "+c);
		System.out.println("");
		System.out.println("The Result is "+c);
		System.out.println("");
		return c;
	}

	public static int factorial(int num){
	    int c = num ;
		for(int i=num-1; i>=1; i--) c = c*i;
		logger.info("Factorial of "+num);
       		 logger.info("!"+num+" = "+c);
		System.out.println("");
		System.out.println("The Result is "+c);
		System.out.println("");
		return c;
	}
	public static double naturalLog(double num){
		double c = Math.log(num);
		logger.info("Natural logarithm of"+num);
        	logger.info("log("+num+") = "+c	);	
		System.out.println("");
		System.out.println("The Result is "+ c);
		System.out.println("");
		return c;
	}
	  public static double power(double num, double exp){
		double c = Math.pow(num,exp);
		 logger.info(num+" powers "+exp);
        	logger.info(num+"^"+exp+" = "+c);
		System.out.println("");
		System.out.println("The Result is "+ c);
		System.out.println("");
		return c;
	}

}
