package ArrayL;
import java.util.*;

public class ArrayL {
ArrayList<String>list=new ArrayList<String>();
public void arraydisplay()
{
	list.add("CSE");
	list.add("iSE");
	list.add("ME");
	list.add("MECH");
	System.out.println("array list elements are");
	System.out.println(list);
	System.out.println("");
	
}
public void appendatend()
{
	System.out.println("enter the element to appent at end");
	Scanner sc=new Scanner(System.in);
	String ele=sc.next();
	list.add(ele);
	
	System.out.println(list);
	System.out.println(" ");
	
}
public void insertatpos()
{
	System.out.println("enter the position and element to insert");
	Scanner sc=new Scanner(System.in);
     int pos=sc.nextInt();
     String ele=sc.next();
     list.add(pos,ele);
     System.out.println(list);
     System.out.println(" ");
	
}
public void searchele() 
{
	System.out.println("enter the array elements to be search");
	Scanner sc= new Scanner(System.in);
	String sele=sc.next();
	int in=list.indexOf(sele);
	if(in==-1)
	{
		System.out.println("elements not found");
		
	}
	else
	{
		System.out.println("elements found at"+in);
		
	}
}
void print()
{
	Scanner prin=new Scanner(System.in);
	System.out.println("enter the starting character to print strings");
	char inputc=prin.next().charAt(0);
	String strc=Character.toString(inputc);
	System.out.println("string starting with charater"+strc);
	for(int i=0;i<list.size();i++)
	{
		if(list.get(i).startsWith(strc))
			
		{
			System.out.println(list.get(i));	
		}
	}
	
	
}
public static void main(String[] args)
{
	ArrayL obj=new ArrayL();
	obj.arraydisplay();
	obj.appendatend();
	obj.insertatpos();
	obj.searchele();
	obj.print();
}


}
