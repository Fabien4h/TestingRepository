package fr.projet3.main;

import java.util.Scanner;

/**
* This class demonstrates how search a number in an array 1D or 2D.
* <p>
* The texts displayed in the console are in French.
* 
* @author Fabien4h
* @version 1.1 10/15/24
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
	 * @param args It is a String array argument.
	 * @since 0.1
	 */
	public static void main(String[] args) {
		
		//A store of an array with 2 lines and 3 columns.
		int[][] myArray1 = {{1,2,3},{4,5,6}};
		
		//A store of an array with 1 lines and 9 columns.
		int[] myArray2 = {1,2,3,4,5,6,7,8,9};
		
		//A Scanner's instance for keyboard input.
		Scanner readKeyboard = new Scanner(System.in);
		
		System.out.println("Veuillez saisir un nombre à chercher dans les deux"
						   + " tableaux.");
		
		//A store of proposed number by the user formatted in integer.
		int proposedNumber = readKeyboard.nextInt();
		
		browseArray(myArray1,proposedNumber);
		browseArray(myArray2,proposedNumber);
		
	}
	
	/**
	 * The browse method for a 2D array.
	 * 
	 * @param pMyArray It is a 2D array fill in with integer.
	 * @param pProposedNumber It is the proposed integer number by the user.
	 * @since 0.1
	 */
	static void browseArray(int pMyArray[][], int pProposedNumber) {
				
		//A store of line index
		int j = 0;
		
		//A store of a boolean representing the success of the proposed number search.
		boolean isFound = false;
		
		for (int[] subArray:pMyArray) {
			
			//A store of column index
			int i = 0;
			
			for (int cellValue:subArray) {
				if (pProposedNumber == pMyArray[j][i]) {
					System.out.println("Bravo, c'est gagné !");
					System.out.println("La valeur a été trouvée dans le tableau "
									   + "2D à l'indice [" + j + "][" + i + "]" );
					isFound = true;
				}
				i++;
				
			}
			j++;
			
		}
		if (isFound == false) {
			System.out.println("Perdu, cette valeur ne se trouve pas dans le tableau 2D.");
		}
	}
	
	/**
	 * The browse method for a 1D array. Same name but different parameters.
	 * This is an overload of browseArray() method.
	 * 
	 * @param pMyArray It is a 1D array fill in with integer.
	 * @param pProposedNumber It is the proposed integer number by the user.
	 * @since 0.1
	 */
	static void browseArray(int[] pMyArray, int pProposedNumber) {
		
		//A store of line index
		int j = 0;
		
		//A store of a boolean representing the success of the proposed number search.
		boolean isFound = false;

		for (int cellValue:pMyArray) {
			if (pProposedNumber == pMyArray[j]) {
				System.out.println("Bravo, c'est gagné !");
				System.out.println("La valeur a été trouvée dans le tableau "
								   + "1D à l'indice [" + j + "]");
				isFound = true;
			}
			j++;
		}
		if (isFound == false) {
			System.out.println("Perdu, cette valeur ne se trouve pas dans le tableau 1D.");
		}	
	}
	
}
