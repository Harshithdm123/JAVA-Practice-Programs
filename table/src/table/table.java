package table;

import java.util.Scanner;

public class table {

	
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		for(int i=5;i<=10;i++) {
			for(int j=0;j<=10;j++) {
			
			System.out.println(n+"*"+j+"="+n*j);
			
			}
			n++;
			System.out.println();
		}
	
		
	}
}
