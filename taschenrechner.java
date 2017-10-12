package taschenrechner;
import java.util.Scanner;
public class taschenrechner {

    public static Double DoubleersteZahl;
    public static String operator;
    public static Double DoublezweiteZahl;
    public static Integer IntegerersteZahl;
    public static Integer IntegerzweiteZahl;
    public static Double ergebnis;
    public static Integer ergebnisInt;
    
    public static void main(String[] args) throws Exception {
	clearAll();
	System.out.println("*** Taschenrechner ***\n");
	
	System.out.println("Möchtest du mit Kommazahlen rechnen? [Ja/Nein]");
	Scanner wantKommaZahl = new Scanner(System.in);
	String isKommaWanted = wantKommaZahl.nextLine();
	
	if (isKommaWanted.equalsIgnoreCase("ja")) {
	    
	mitKomma(); // Weiterleitung zu Rechnung mit Komma
	} else if (isKommaWanted.equalsIgnoreCase("nein")) {
	    
	ohneKomma(); // Weiterleitung zu Rechnung ohne Komma
	} else {
	    main(null);
	}
	
    }
	
	public static void mitKomma() throws Exception {
	    	clearAll();
		System.out.println("Bitte gebe nun deine Rechnung ein (Du musst einen Punkt anstatt Komma verwenden!) [ersteZahl (+/-/*/:) zweiteZahl]\n");
		Thread.sleep(200);
		Scanner gegebeneRechnung = new Scanner(System.in);
		String Rechnung = gegebeneRechnung.nextLine();
		String[] teile = Rechnung.split(" ");
		
		try { // try
		    
		DoubleersteZahl = Double.parseDouble(teile[0]); // Double zuweisen
		operator = teile[1]; // operator zuweisen
		DoublezweiteZahl = Double.parseDouble(teile[2]); // Double zuweisen
		
		} catch (Exception e) {  // Catch - Fehler
		    
		    
		   System.out.println("> Deine Eingabe hat einen Fehler!\n");
		   System.out.println("> Erste Zahl erkannt: " + DoubleersteZahl);
		   System.out.println("> Operator erkannt: " + operator);
		   System.out.println("> Zweite Zahl erkannt: " + DoublezweiteZahl); 
		   System.out.println("\n> Bitte versuche es erneut...\n");
		   Thread.sleep(1500);
		   clearAll();
		   mitKomma();
		   
		}
			clearAll();
			System.out.println("> Deine Eingabe war erfolgreich!\n");
			System.out.println("> Rechnung: " + DoubleersteZahl + " " +  operator + " " + DoublezweiteZahl);
			
			
			if (operator.equals("+")) {
			    
			    ergebnis = DoubleersteZahl + DoublezweiteZahl;
			    
			    
			} else if (operator.equals("-")){
			    
			    ergebnis = DoubleersteZahl - DoublezweiteZahl;
			    
			} else if (operator.equals("*")) {
			    
			    ergebnis = DoubleersteZahl * DoublezweiteZahl;
			    
			} else if (operator.equals(":")) {
			    
			    ergebnis = DoubleersteZahl / DoublezweiteZahl;
			    
			} else {
			    
			    mitKomma();
			}
			
			System.out.println("> Ergebnis: " + ergebnis + "\n");
			Thread.sleep(2000);
			
			neueRechnungQuestion();

	}
	
	public static void ohneKomma() throws Exception {
	    	clearAll();
		System.out.println("Bitte gebe nun deine Rechnung ein [ErsteZahl (+/-/*/:) ZweiteZahl]\n");
		Thread.sleep(200);
		Scanner gegebeneRechnung = new Scanner(System.in);
		String Rechnung = gegebeneRechnung.nextLine();
		String[] teile = Rechnung.split(" ");
		
		try {
		    
		IntegerersteZahl = Integer.parseInt(teile[0]); // Erste Zahl zuweisen
		operator = teile[1]; // Operator zuweisen
		IntegerzweiteZahl = Integer.parseInt(teile[2]); // Zweite Zahl zuweisen
		
		} catch (Exception e) {  // Catch - Fehler
		    
		   System.out.println("> Deine Eingabe hat einen Fehler!\n");
		   System.out.println("> Erste Zahl erkannt: " + IntegerersteZahl);
		   System.out.println("> Operator erkannt: " + operator);
		   System.out.println("> Zweite Zahl erkannt: " + IntegerzweiteZahl);
		   System.out.println("\n> Bitte versuche es erneut...\n");
		   Thread.sleep(1500);
		   clearAll();
		   ohneKomma();
		   
		}
		
		clearAll();
		System.out.println("> Deine Eingabe war erfolgreich!\n");
		System.out.println("> Rechnung: " + IntegerersteZahl + " " +  operator + " " + IntegerzweiteZahl);
		
		
		if (operator.equals("+")) {
		    
		    ergebnisInt = IntegerersteZahl + IntegerzweiteZahl; // Plus rechnen
		    
		} else if (operator.equals("-")){
		    
		    ergebnisInt = IntegerersteZahl - IntegerzweiteZahl; // Minus rechnen
		    
		} else if (operator.equals("*")) {
		    
		    ergebnisInt = IntegerersteZahl * IntegerzweiteZahl; // Mal rechnen
		    
		} else if (operator.equals(":")) {
		    
		    ergebnisInt = IntegerersteZahl / IntegerzweiteZahl; // Geteilt Rechnen
		    
		} else {
		    
		    mitKomma(); // Zurück zum Start der Methode mitKomma
		}
		
		
		System.out.println("> Ergebnis: " + ergebnisInt + "\n");
		Thread.sleep(2000);
		
		neueRechnungQuestion();

	}
	
	
	public static void neueRechnungQuestion() throws Exception {
	    
		System.out.println("> Möchtest du eine neue Rechnung durchführen? [Ja/Nein]");
		Scanner newRechnung = new Scanner(System.in);
		String isNewRechnung = newRechnung.nextLine();
		if (isNewRechnung.equalsIgnoreCase("ja")) {
		    
		    main(null); //Zurück zu main Methode
		    
		} else {
		neueRechnungQuestion();//Ende
		}
	    
	}
	-
    
	public static void clearAll() {
	    
	    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
	    
	}
    
}
