package fr.projet2.main;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		char onRecommence = 'O';
		Scanner lectureClavier = new Scanner(System.in);
		while(onRecommence == 'O' || onRecommence == 'o') {
			System.out.println("---------------------------------------------------------------------------\n"
					+"CONVERTISSEUR DEGRE-FARENHEIT ET INVERSEMENT\n"
					+ "---------------------------------------------------------------------------\n"
					+ "Bonjour, veuillez choisir le type de conversion désiré :\n1."
					+ "Convertir une température en degrée Celsius vers des degrés Farenheit.\n2."
					+ "Convertir une température en degrée Farenheit vers des degrés Celsius.");
			int reponseTypeConversion = lectureClavier.nextInt();
			if (reponseTypeConversion==1) {
				System.out.println("Veuillez renseigner la valeur à convertir : ");
				double reponseValeurAConvertir = lectureClavier.nextDouble();
				System.out.println(reponseValeurAConvertir+"°C = "+((9.0/5.0)+reponseValeurAConvertir+32.0)+"°F.");
			}
			else if(reponseTypeConversion==2) {
				System.out.println("Veuillez renseigner la valeur à convertir : ");
				double reponseValeurAConvertir = lectureClavier.nextDouble();
				System.out.println(reponseValeurAConvertir+"°F = "+(5.0*(reponseValeurAConvertir-32.0)/9.0)+"°C.");
			}
			else
			{
				System.out.println("Vous n'avez pas renseigné le bon choix");
			}
			System.out.println("Voulez-vous recommencer ? (O/N)");
			//Scanner lectureClavierString = new Scanner(System.in);
			lectureClavier.nextLine();
			onRecommence = lectureClavier.nextLine().charAt(0);
		}
		System.out.println("Au revoir.");
	//public static double arrondi
		
	}

}
