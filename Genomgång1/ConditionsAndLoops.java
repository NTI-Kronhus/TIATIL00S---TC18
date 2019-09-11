import java.util.ArrayList;

public class ConditionsAndLoops {

	public static void main(String[] args) {
        
        // Primitiva Datatyper:
		int heltal = 0; // Alla reella heltal mellan -MASSOR och MASSOR, använd long endast om ni behöver
        char tecken = 'c'; // alla tecken i UTF-16 tabellen
        double flyttal = 3.14; // Alla reella flyttal mellan -massor.massor och massor.massor
        boolean sanning = true; // Boolean är en sanningsindikator kan ha värdet 'true' eller 'false'

        // Icke-primitiva Datatyper:
        String text = "Text med flera ord i."; // Inbyggd klass som hanterar strängar uppbygda av flera 'char's.
        Integer heltalExtra = 0; // Inbyggd klass som hanterar heltal med inbyggda metoder för jämförelser etc.
        Double flyttalExtra = 0.0; // Inbyggd klass som hanterar flyttal med inbyggda metoder för jämförelser etc.
        Character teckenExtra = 'c'; //Inbyggd klass som hanterar tecken med inbyggda metoder för jämförelser etc.
        Boolean sanningExtra = true; // Inbyggd klass som hanterar true/false med inbyggda metoder för jämförelser etc.

        // Listor och 'Arrayer'
        ArrayList<Integer> massaHeltal = new ArrayList<Integer>(); // Lista med massa saker i. Datatypen/Objektstypen i listan defineras inom <>
        int[] massaHeltal2 = {}; // En array av heltal
        String[] massaOrd = {}; // en array av strängar


        // Vilkorssatser:

        if (sanning) {
            // Kod som körs om vilkoret är sant
        }
        else if (heltal == 0) {
            // Kod som körs om vilkoret är sant
        }
        else if (heltal != 1) {
            // Kod som körs om vilkoret är sant
        }
        else if (heltal >= 0 && sanning) {
            // Kod som körs om vilkoret är sant
        }
        else if (heltal < 1 || !sanning) {
            // Kod som körs om vilkoret är sant
        }
        else {
            // Kod som körs om vilkoret är sant
        }


        // Loopar:

        for (int tal = 0; tal <= 10; tal++){
            // Kod som körs så länge vilkoret är sant
        }

        for (Integer tal : massaHeltal){
            // Kod som körs för varje entry(sak) i en given lista
        }

        while (sanning)
        {
            // Kod som körs så länge vilkoret är sant
        }
	}

}