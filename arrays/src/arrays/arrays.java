package arrays;

import java.util.Scanner;

public class arrays {
	public static void update(int mark[],int nonchangable )
	{
		nonchangable=10;
		
		for(int i=0;i<mark.length;i++) {
			mark[i]=mark[i]+1;
			
		}
	}

	public static void main(String[] args) {
		
int marks[]=new int [100];
int nmbers[]= {4,5,6,7};
int morenumbers[]= {5,7,8,9};
String fruit[]= {"apple","orange"};
System.out.println(marks[2]+""+fruit[0]);		
		
		Scanner s=new Scanner(System.in);
		marks[0]=s.nextInt();
		marks[1]=s.nextInt();
		marks[2]=s.nextInt();
		marks[3]=s.nextInt();
		System.out.println("phy " +marks[0]);
		System.out.println("dfgd "+marks[1]);
		System.out.println("phycfg "+marks[2]);
		
		System.out.println("fd "+marks[3]);
		marks[3]=200;
		//marks[3]=marks+1;
		
		System.out.println("phycfg"+marks[3]);
		
		int percentage= (marks[0]+marks[1]+marks[2]+marks[3]+marks[4])/4;
		System.out.println("percentage"+percentage+"%");
		
		System.out.println("array of length"+marks.length);
		{
		int mark[]= {98,89,67,87};
		int nonchangable=5;
		System.out.println(nonchangable);
		update(mark,nonchangable);
		for(int i=0;i<mark.length;i++)
			System.out.println(mark[i]+"");
		
		
		
		}
		System.out.println();
		
	}


}
