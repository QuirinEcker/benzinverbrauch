/*----------------------------------------------------------
 *                 HTL-Leonding / Klasse: 1AHITM
 * ----------------------------------------------------------
 * Übungsnr.:   17
 * Übungstitel: Benzinverbrauch
 * Autoren:     Quirin Ecker
 * Version:     1.0
 * Datum:       29.10.2017
 * ----------------------------------------------------------
 * Kurzbeschreibung:
 * Berechnung des durchschnittlichen Benzinverbrauchs.
 *
 * ----------------------------------------------------------
 * Beschreibung der grundlegenden Lösungsidee:
 * Berechnung des Benzinverbrauches durch hunder.
 *
 * ----------------------------------------------------------
*/

import java.util.Scanner;

public class Ecker_Benzinverbrauch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double durchschnittverbracuh;
        double kilogefahren;
        String ausgabe;

        System.out.print("Anfangskilometerstand            : ");
        double anfangskilostand = scanner.nextDouble();

        System.out.print("Kilometerstand am Ende der Fahrt : ");
        double endkilostand = scanner.nextDouble();

        System.out.print("Wieviel Benzin haben Sie getankt : ");
        double benztank = scanner.nextDouble();

        if (endkilostand > anfangskilostand) {
            kilogefahren = endkilostand - anfangskilostand;
            durchschnittverbracuh = benztank / kilogefahren * 100;
            ausgabe = "Die haben einen durchschnittlichen Verbrauch von " + durchschnittverbracuh + " / 100 km";
        }

        else {
            ausgabe = "Der Anfangskilometerstand muss kleiner als der Endkilometerstand sein.";
        }


        System.out.println(ausgabe);



    }
}

