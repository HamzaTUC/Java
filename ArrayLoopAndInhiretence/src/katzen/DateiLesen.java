package katzen;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;


public class DateiLesen {

	public static void main(String[] args) throws FileNotFoundException {
		File daten= new File ("daten.txt");
		Scanner sc = new Scanner (daten);
		while (sc.hasNextLine()) {
			System.out.println(sc.nextLine()); 
		}
sc.close();
	}

}
