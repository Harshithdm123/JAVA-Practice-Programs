package aaaaa;

import java.util.*;

public class Student 
{
String usn,name,branch;
long phone;

void insertStudent(String reg , String nm , String br , long ph)
{
	usn = reg;
	name = nm;
	branch = br;
	phone = ph;
}
void displayStudent()
{
	System.out.println("*******");
	System.out.println("usn="+usn);
	System.out.println("name="+name);
	System.out.println("branch="+branch);
	System.out.println("phone="+phone);
	System.out.println("*********");
}
	public static void main(String[] args) {
		Student St[] = new Student[100];
		Scanner ip = new Scanner(System.in);
		System.out.println("enter the number of students");
		int n = ip.nextInt();
		for(int i=0;i<n;i++)
			St[i] =new Student();
		for(int j=0;j<n;j++)
		{
			System.out.println("enter the usn,name,branch,phone number");
			String usn = ip.next();
			String name = ip.next();
			String branch = ip.next();
			long phone = ip.nextLong();
			St[j].insertStudent(usn,name,branch,phone);
		}
		for(int m=0;m<n;m++)
		{
			System.out.format("Student%d details are\n" (m+1));
			St[m].displayStudent();
		}
	}
}
			