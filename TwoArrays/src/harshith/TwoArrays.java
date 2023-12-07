package harshith;

public class TwoArrays {

	public static void main(String[] args) {
		int[][] worldpopulation = {
				{1,2,3,5,6,7},
				
				{	12,21,332,212,21,21,12}
				
		};

		System.out.println("worldpopulation is "+worldpopulation+"and length is:"+worldpopulation.length);
		System.out.println("worldpopulation[0] is "+worldpopulation[0]+"and length is:"+worldpopulation[0].length);
		System.out.println("worldpopulation[1] is "+worldpopulation[1]+"and length is:"+worldpopulation[1].length);
		
		System.out.println("worldpopulation[0][0] "+worldpopulation[1][2]);
		worldpopulation[1][2]=7777;
		System.out.println("==Re Reading==");
		System.out.println("worldpopulation[1][2]:"+worldpopulation[1][2]);
		System.out.println();
		for(int i=0;i<worldpopulation.length;i++)
		{
			for(int j=0;j<worldpopulation.length;j++) {
				System.out.println(worldpopulation[i][j]+"");
				
				
				
			}
			
			System.out.println();
			
			
			
		}
		int[][] arr=new int[3][5];
		System.out.println();
		for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length;j++){
			
			System.out.println(arr[i][j]+"");
			
			
			
		}
		
		System.out.println();
		}
		
		
	}

}
