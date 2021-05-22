
public class MultidArray {
	public static void main(String[] args) {
		
	
	int [][] matr = { 
			          {1,5,11,6},
			          {2,8,3,8},
			          {4,0,23,12},
			          {5,9,6,7} 
			          };
	System.out.println(matr[0][1] );
	System.out.println(matr[1][0]);
	
	
for (int row= 0; row <matr.length;row++) {
		for (int col= 0; col <matr[row].length;col++) {
			System.out.print(matr[row][col] + "\t"); 	
		}
		System.out.println();
}

}}

