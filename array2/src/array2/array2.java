package array2;
import java.util.Scanner;
public class array2 {
	public static void main(String[] args) {
		
		int n,i;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size of array");
		n=sc.nextInt();
		System.out.println("enter the  array elements");
		int []array= new int[n];
		for(i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		System.out.println(" the  array elements are:");
		for(i=0;i<n;i++)
			
		{
	System.out.println(array[i]);
}
}
}