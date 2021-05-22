package awais;

public class ubung6_array {
static void arrayFunction(int array[][], int num_rows, int num_cols) {
	for (int i =0;i <num_rows;i++) {
		for (int j =0;j <num_cols;j++) {
		System.out.print(array[i][j]+ " "); }	
	System.out.println(" \n");}
}	

public static void main (String [] args) {
	int array1[][]= {{2,3},{6,8}};
	int array2[][]= {{465,763,885},{678,999, 111}};
	arrayFunction(array1,2, 2);
	arrayFunction(array2, 2,3);
		
}	
}
