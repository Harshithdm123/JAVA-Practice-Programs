package Arrayto;

public class Array1 {

	public static void main(String[] args) {
		int intarr[]= {10,20,40,60,50,};
		System.out.println("integer array "+ Array1.toString(intarr));
		System.out.println("\n new array copy\n");
		System.out.println("integer array"+ Array1.toString(Array1.copyOf(intarr,10)));
		
	}

	private static String toString(Object object) {
		// TODO Auto-generated method stub
		return null;
	}

	private static Object copyOf(int[] intarr, int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
