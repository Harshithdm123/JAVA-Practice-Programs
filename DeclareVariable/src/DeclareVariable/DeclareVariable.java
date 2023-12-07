package DeclareVariable;
public class DeclareVariable {  
	// static method in class DeclareVariable
static void display(int student_id, String student_name,double numbers,boolean shows,float nan)
	{
	        System.out.println( "Name:" +student_name+ "\n Age:" +student_id);  
	        System.out.println( "Number:" +numbers+ "\n Boolean:" +shows);  
	        System.out.println( "float:"  +nan);  
	}
	    // main method 
	    public static void main(String[] args) {  
	        int student_id;  
	        
	        String student_name;  
	        double numbers;  
	        boolean shows;  
	        float nan;  
	        student_id = 21;  
	        student_name = "java programmer";  
	        numbers = 45.22;  
	        shows = false;  
	        nan= 6.8f;  
	       display(student_id, student_name,numbers,shows,nan);

	    }  
	}  
