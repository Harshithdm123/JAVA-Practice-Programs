package EmpTest;

public class Manager extends SkilledAsst {
private int bonus;
Manager ()
{
super();
bonus=0;
}
public void getdata(String name, int salary, int allowance, int bonus)
{
super.getdata(name,salary,allowance);
this.bonus=bonus;
}
public void dispdata()
{
 super.dispdata();
 System.out.println("Employee's bonus : "+bonus);
}
}
 
