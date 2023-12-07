package Demo;
class mobile{
	String brand;
	int price;
	String name;
	public void show()
	{
		
		System.out.println(brand+" "+price+" "+name);
	}
	
	
}


public class Demo {

	public static void main(String[] args) {
	
String name=new String("naveen");
System.out.println("hello " + name);
System.out.println(name.charAt(1));
System.out.println(name.concat(" reddy"));
{
String name1="naveesh";

name=name+"ha";
System.out.println("hello"+ name1);
String name2="naveesh";

System.out.println(name1==name2);
StringBuffer sb=new StringBuffer("naveen");
System.out.println(sb.capacity());

System.out.println(sb.length());
sb.append("  ha");
System.out.println(sb);
mobile obj1=new mobile();
obj1.brand="apple";
obj1.price=123;
obj1.name="smartphone";

mobile obj2=new mobile();
obj2.brand="apple";
obj2.price=123;
obj2.name="smartphone";

obj1.show();
obj2.show();

       }

	}

}
