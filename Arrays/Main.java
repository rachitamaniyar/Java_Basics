import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //UebungArray01();
        //UebungArray02();
        //UebungArray03();
        //UebungArray04();
        //UebungArray05();
        //UebungArray06();
        //UebungArray07();
        Uebung8910();
    }

    public static void Uebung8910() {
        int[] arr = new int[10];

        Scanner input = new Scanner(System.in);
        //arr durch User befuellen lassen
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Bitte zahl eingeben: ");
            arr[i] = input.nextInt();
        }

        //Uebung 8 - Groesstes Element finden
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("groesste Zahl: " + max);

        //Uebung 9 - Kleinstes Element finden
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Kleinste Zahl: " + min);

        //Uebung 10 - Durchschnitt berechnen
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Durchschnitt: " + (sum / arr.length));

    }

    public static void UebungArray07() {
        String[] arr = {"Dieser", "Tag", "ist", "wettertechnisch", "nicht", "so", "schoen", "YAY"};

        //Userinput fuer Vergleichsstring
        Scanner in = new Scanner(System.in);
        System.out.print("Bitte einen Buchstaben eingeben: ");
        char buchstabe = in.next().toLowerCase().charAt(0);

        //Pruefung was hier benutzt wurde
        System.out.println("Eingegebener Buchstabe: " + buchstabe);

        //Version 1 - Ersten Buchstaben nun vergleichen
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].toLowerCase().charAt(0) == buchstabe) {
                System.out.println(arr[i]);
            }
        }

        System.out.println("-----Version 2 ab hier-----");

        //Version 2
        for (String word : arr) {
            if (word.toLowerCase().charAt(0) == buchstabe) {
                System.out.println(word);
            }
        }
    }

    public static void UebungArray06() {
        int[] arr = new int[20];
        Random random = new Random();

        //Array befuellen
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1, 101);
        }

        //Das gesamte Array aufeinmal ausgeben zur Pruefung
        System.out.println("Array nach Befuellung: " + Arrays.toString(arr));

        //Jede gerade Zahl ausgeben
        for (int zahl : arr) {
            //Hier fuehren wir eine Modulorechnung durch, falls ohne Rest durch 2 Teilbar,
            //dann ist die Zahl eine gerade Zahl
            if (zahl % 2 == 0) {
                System.out.println(zahl);
            }
        }
    }

    public static void UebungArray05() {
        int[] arr = new int[15];
        Random random = new Random();

        //Array befuellen
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1, 101);
        }

        //Das gesamte Array aufeinmal ausgeben - NICHT EINZELN!
        System.out.println("Array nach Befuellung: " + Arrays.toString(arr));

        //Array-Werte EINZELN ausgeben
        for (int i : arr) {
            System.out.println("Einzelner Wert: " + i);
        }
    }

    public static void UebungArray04() {
        int[] arr = new int[12];
        Random random = new Random();

        //Befuellung des Arrays mit Random-Zahlen
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(0, 101);
        }

        //Ausgabe um zu pruefen ob alles richtig lief
        System.out.println(Arrays.toString(arr));

        //Summe berechnen
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Die Summe aller Elemente im Array ist: " + sum);
    }

    public static void UebungArray03() {
        String[] arr = {"Dieser", "Tag", "ist", "wettertechnisch", "nicht", "so", "schoen", "."};
        System.out.println(Arrays.toString(arr));

        //Version 1
        for (String word : arr) {
            System.out.println("Das Wort \"" + word + "\" ist " + word.length() + " Zeichen lang.");
        }

        System.out.println("--------------");

        //Version 2
        int laenge = 0;
        for (String word : arr) {
            for (int i = 0; i < word.length(); i++) {
                laenge += 1;
            }
            System.out.println("Das Wort \"" + word + "\" ist " + laenge + " Zeichen lang.");
            laenge = 0;
        }
    }

    public static void UebungArray02() {
        Random random = new Random();
        float[] arr = new float[5];

        //Befuellen des Arrays mit Random-Float-Zahlen
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextFloat(0, 100);
        }

        //Ausgeben des Arrays als ganzes, nicht als einzelne Werte!
        System.out.println("Nicht sortiert: " + Arrays.toString(arr));

        //Hilfsvariable fuer die manuelle Suche des groessten Wertes
        float max = arr[0];

        //Version 1 mit For:Each
        for (float wert : arr) {
            if (wert > max) { //Hier wird der WERT verglichen
                max = wert;
            }
        }

        //Version 2 mit For-Schleife
        for (int position = 0; position < arr.length; position++) {
            if (arr[position] > max) { //Hier wird der WERT an der POSITION verglichen
                max = arr[position];
            }
        }

        //Version 3 Einfache Loesung
        Arrays.sort(arr);
        //Das Array ist nun sortiert und die groesste Zahl liegt ganz hinten
        max = arr[4];

        //Ausgeben des Arrays als ganzes, nicht als einzelne Werte!
        System.out.println("Groesstes Element im Array: " + max);
    }

    public static void UebungArray01() {
        int[] arr = new int[10];
        Random random = new Random();

        //Befuellung des Arrays mit Random-Zahlen
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(0, 101);
        }

        //Ausgabe des Arrays
        for (int j: arr) {
            System.out.print(j + " ");
        }
    }
}
