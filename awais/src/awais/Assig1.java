package awais;
public class Assig1 { 

		public static void main(String[] args) {
		    String s = args[0];
		    for (int i = 0; i < s.length(); i++) {
		        char c = s.charAt(i);
		        if       (c >= 'a' && c <= 'm') c += 13;
		        else if  (c >= 'A' && c <= 'M') c += 13;
		        else if  (c >= 'n' && c <= 'z') c -= 13;
		        else if  (c >= 'N' && c <= 'Z') c -= 13;
		        Assig1.print(c);
		    
		    Assig1.println();
		}
		}
}
