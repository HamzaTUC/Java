import java.util.Scanner;

public class umlaut {

	String text;
	int l;
	String cipher;
	umlaut(){
		
		 text = "";
		 cipher = "";
         l=0;
	}
void input () {
	Scanner scan= new Scanner(System.in);
	System.out.print("enter the plaintext:");	
    text= scan.nextLine() ;
    l= text.length();
}

char change(char ch) {
	
	if (ch=='�') {
			ch='u';  }
	else if (ch=='�') {
		ch= 'o';    }
	if (ch=='�') {
		ch= 'a';  }
else if (ch=='�') {
	ch= 'U';    }
	if (ch=='�') {
		ch= 'O';  }
else if  (ch=='�') {
	ch= 'A';    }
	return ch;
}

void encrypt(){
	char ch;
	int i;
	for (i=0;i <l; i++) {
	ch= text.charAt(i);
	ch= change(ch);
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

