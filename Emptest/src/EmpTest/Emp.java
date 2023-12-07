package EmpTest;
public class Emp {
private String name;
private int salary;
Emp()
{
name=" ";
salary=0;
}
public void getdata(String name, int salary)
{
this.name=name;
this.salary=salary;
}
public void dispdata()
{
 System.out.println("Employee name : "+name);
 System.out.println("Employee salary : "+salary);
}
}