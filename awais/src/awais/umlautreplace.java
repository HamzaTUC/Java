package awais;

import java.util.Scanner;

public class umlautreplace {

	public static void main(String[] args) {
		umlautreplace mycode = new umlautreplace(); // object declaration
		Scanner input = new Scanner(System.in); // get scanner
		// main Functions//
		System.out.print("Input string to encrypt/decrypt then press enter: ");
		String insertText = input.nextLine(); // Input String to encrypt/decrpyt
		String replacedString = mycode.replace(insertText); // Decrypted/Encrypted String Output

		// Printing//
		System.out.println("Text Before:\n" + insertText); // printing the input string
		System.out.println("---"); // divider line
		System.out.println("Text After:\n" + replacedString); // printing output string
	}

	private String replace(String insertText) { // Method to encrypt/decrypt string
		String outputText = ""; // make empty string
		for (int i = 0; i < insertText.length(); i++) {
			char convertedChar = charRot(insertText.charAt(i)); // go through the inputString and then encode each
																// letter
			outputText += convertedChar; // add the character to the above string
		}
		return outputText;
	}

	public char charRot(char charInput) { // Method to encrypt/decrypt a single character
		char[] alphabets = { 'ä', 'ö', 'ü', 'ß', 'a', 'o', 'u', 's' }; // alphabets array to check if the string
																		// contains a character
		char convertedChar = charInput;
		boolean isUppercase = !(convertedChar == (Character.toLowerCase(convertedChar))); // check if the current letter
																							// is uppercase

		for (int i = 0; i < 4; i++) {
			if (Character.toLowerCase(charInput) == alphabets[i]) { // convert charInput into lower case (to match with
																	// the array above)
				int convertedPositionInArray = i + 4; // ROT13 (add 13)

				if (convertedPositionInArray >= 8) { // if its over 'z' in the array, it resets it to 'a'
					convertedPositionInArray -= 8;
				}

				if (isUppercase) { // return character to uppercase
					convertedChar = Character.toUpperCase(alphabets[convertedPositionInArray]); // get character
																								// (uppercase)
				}

				else
					convertedChar = alphabets[convertedPositionInArray]; // get character (lowercase)
			}
		}
		return convertedChar;
	}
}
