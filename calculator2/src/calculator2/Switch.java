package calculator2;
import java.util.*;
public class Switch 
{
	public static void main(String[] args)
	{
		{
			Scanner inp = new Scanner(System.in);
			System.out.println("enter the operators(+, -, *, / )");
			char operator = inp.next().charAt(0);
			System.out.println("enter the first operand");
			double first = inp.nextDouble();
			System.out.println("enter the second operand");
			double second = inp.nextDouble();
			double result =0;
			switch(operator) {
			
			case '+' :
				result = first+second;
				System.out.println("the result is:"+first+""+operator+""+second+"="+result);
				break;
				
			case '-' :
				result = first-second;
				System.out.println("the result is:"+first+""+operator+""+second+"="+result);
				break;
			case '*' :
				result = first*second;
				System.out.println("the result is:"+first+""+operator+""+second+"="+result);
				break;
			case '/' :
				result = first/second;
				System.out.println("the result is:"+first+""+operator+""+second+"="+result);
				break;
			}
		}
	}
}
		
