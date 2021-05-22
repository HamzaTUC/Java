import java.util.*;
public class CesarCipher {
	String text;
	int l;
	String cipher;
	CesarCipher(){
		
		 text = "";
		 cipher = "";
         l=0;
	}
void input () {
	Scanner sc= new Scanner(System.in);
	System.out.print("enter the plaintext:");	
    text= sc.nextLine() ;
    l= text.length();
}

char Rot13(char ch) {
	if (Character.isLowerCase(ch)) {
		if (ch<='m') {
			ch= (char)(ch+13);
	}
	else {	
		ch= (char)(ch-13);		
	}
	}
	else if (Character.isUpperCase(ch)){
		if (ch<='M') {
			ch= (char)(ch+13);
	}
	else {	
		ch= (char)(ch-13);		
	}
		
	}
	return ch;
}

void encrypt(){
	char ch;
	int i;
	for (i=0;i <l; i++) {
	ch= text.charAt(i);
	ch= Rot13(ch);
	cipher += ch ;
	}
}

void display() {
	System.out.print("the cipher text is:"+ cipher);
}

public static void main(String[] args) {
CesarCipher cc= new CesarCipher() ;
cc.input();
 	cc.encrypt();
	cc.display();

	
}
}
