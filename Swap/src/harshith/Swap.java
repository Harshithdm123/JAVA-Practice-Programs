package harshith;
import java.util.Scanner;
public class Swap {

	public static void main(String[] args) {
	
int a,b,t;
Scanner sc=new Scanner(System.in);
	System.out.println("enter the value of a");
	a= sc.nextInt();
	System.out.println("enter the value of b");
	b= sc.nextInt();
	System.out.println("before swap of 2 number :"+a+","+b);
	t=a;
	a=b;
	b=t;
	System.out.println("\n\n after swap of 2 number :");
	System.out.println("first number :"+a);
	System.out.println("first number :"+b);
	}
	}
