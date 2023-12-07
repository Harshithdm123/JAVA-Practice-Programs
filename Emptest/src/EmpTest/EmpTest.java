package EmpTest;

import java.io.*;
public class EmpTest {
 public static void main(String args[]){

 Emp e = new Emp();
 SkilledAsst s = new SkilledAsst();
 Manager m= new Manager();

 System.out.println("Details immediately after declaring objects : ");
 e.dispdata();
 s.dispdata();
 m.dispdata();

 System.out.println("Details after setting the data : ");

 e.getdata("Ram",1200);
 s.getdata("Ravi",1400,1000);

 m.getdata("Raja",1800,1500,2000);
 System.out.println("~~~~~~~~~~~~Employee's details~~~~~~~~~~~~ "); e.dispdata();
 System.out.println("~~~~~~~~~~~~SkilledAsst's details ~~~~~~~~~~~~ "); s.dispdata();
 System.out.println("~~~~~~~~~~~~Manager's details~~~~~~~~~~~~ ");
 m.dispdata();

 }
}