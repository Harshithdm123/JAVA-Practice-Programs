package EmpTest;

public class SkilledAsst extends Emp{
private int allowance;
SkilledAsst()
{
super();
allowance=0;
}
public void getdata(String name, int salary, int allowance)
{
super.getdata(name,salary);
this.allowance=allowance;
}
public void dispdata()
{
 super.dispdata();
 System.out.println("Employee's allowance : "+allowance);
}
}