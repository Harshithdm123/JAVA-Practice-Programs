package elseifloop;
import java.util.Scanner;
public class elseifloop {

	public static void main(String[] args) {
		Scanner kb= new Scanner(System.in);
		System.out.println("enter any integer value");
		int a=kb.nextInt();
		if(a%2==0) {

			System.out.println("even number");
		}
		else
		{
			System.out.println("odd number");
		}
	}

}
