package awais;
		import java.util.Scanner;
		public class Assigone {
			public static void main(String[] args) {
				Assigone hamzaCode = new Assigone(); //object declaration
				Scanner input = new Scanner(System.in); //get scanner
				//main Functions//
				System.out.print("Input string to encrypt/decrypt then press enter: ");
				String insertText = input.nextLine(); //Input String to encrypt/decrpyt
				String rotifiedString = hamzaCode.rotify(insertText); //Decrypted/Encrypted String Output
				
				//Printing//
				System.out.println("Text Before:\n" + insertText); //printing the input string
				System.out.println("---"); //divider line
				System.out.println("Text After:\n" + rotifiedString); //printing output string
			}

			private String rotify( String insertText) { //Method to encrypt/decrypt string
				String outputText = ""; //make empty string
				for (int i = 0; i < insertText.length(); i++) {
					String convertedChar = charRot(insertText.charAt(i)); //go through the inputString and then encode each letter
					outputText += convertedChar; //add the character to the above string
				}
				return outputText;
			}

			public String charRot(String charInput) { //Method to encrypt/decrypt a single character
				char[] alphabets = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
						's', 't', 'u', 'v', 'w', 'x', 'y', 'z' }; //alphabets array to check if the string contains a character
				String convertedChar = charInput;
				boolean isUppercase = !(convertedChar == (Character.toLowerCase(convertedChar))); //check if the current letter is uppercase

				for (int i = 0; i < 26; i++) {
					if (Character.toLowerCase(charInput) == alphabets[i]) { //convert charInput into lower case (to match with the array above)
						int convertedPositionInArray = i + 13; //ROT13 (add 13)

						if (convertedPositionInArray >= 26) { //if its over 'z' in the array, it resets it to 'a'
							convertedPositionInArray -= 26;
						}

						if (isUppercase) { //return character to uppercase
							convertedChar = Character.toUpperCase(alphabets[convertedPositionInArray]); //get character (uppercase)
						} else
							convertedChar = alphabets[convertedPositionInArray]; //get character (lowercase)
					}
				}
				return convertedChar;
			}

		}