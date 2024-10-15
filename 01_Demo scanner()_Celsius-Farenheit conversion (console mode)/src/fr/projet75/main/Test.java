package fr.projet75.main;

import java.util.Scanner;

/**
* 
* This class demonstrates the Scanner() class for keyboard input in console
* mode.
* <p>
* The texts displayed in the console are in French.
*
* @author Fabien4h
* @version 1.2 10/14/24
*
*/
public class Test {
	
	//Class variable (public, protected, package friendly, private)
	
	//Instance variable (public, protected, package friendly, private)

	//Constructors
	/**
	 * Constructs a new Test().
	 * 
	 * @since 0.1
	 */
	public Test() {}

	//Methods
	/**
	 * The main method.
	 * 
	 * @param args 	It is a String array argument.
	 * @since 0.1
	 */
	public static void main(String[] args) {
	
		//A char indication to know if the user wants to run again.
		char startAgain = 'o';
				
		//A store of keyboard input for the user's answer.
		Scanner readKeyboard = new Scanner(System.in);
		
		while((startAgain == 'O') || (startAgain == 'o')) {
			System.out.println(
				  "------------------------------------------------------------------\n"
				+ "CONVERTISSEUR DEGRES CELSIUS-FARENHEIT ET INVERSEMENT\n"
				+ "------------------------------------------------------------------\n"
				+ "Bonjour, veuillez choisir le type de conversion désiré :\n1."
				+ "Convertir une température en degrés Celsius en degrés Farenheit.\n2."
				+ "Convertir une température en degrés Farenheit en degrés Celsius.");
			
			//A store of conversion chose by the user represented by an integer.
			int conversionAnswer = readKeyboard.nextInt();
			
			System.out.println("Veuillez renseigner la valeur à convertir : ");
			
			//A store of initial value needing to be converted represented by a double.
			double  answerToConvert = readKeyboard.nextDouble();
			
			if (conversionAnswer==1) {
				
				//A store of converted value from Celsius to Farenheit.
				double  convertedAnswer = ((answerToConvert * 1.8) + 32);
				
				System.out.println(answerToConvert + "°C = " + convertedAnswer + "°F.");
			}
			else if(conversionAnswer==2) {
			
				//A store of converted value from Farenheit to Celsius.
				double  convertedAnswer = (answerToConvert - 32) / 1.8;
				
				System.out.println(answerToConvert + "°F = " + convertedAnswer + "°C.");
			}
			else {
				System.out.println("Vous n'avez pas renseigné le bon choix");
			}
			
			System.out.println("Voulez-vous recommencer ? (O/N)");
			
			//Past the current line.
			readKeyboard.nextLine();
			
			//Past the current line and returns the first char that was skipped.
			startAgain = readKeyboard.nextLine().charAt(0);
		}
		
		System.out.println("Au revoir.");
	}
	
}