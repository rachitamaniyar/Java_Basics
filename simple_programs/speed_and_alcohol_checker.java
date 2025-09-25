public class speed_checker {

    public static void main(String[] args) {
        Uebung4_1();
    }

    public static void Uebung4_1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gib jetzt die Gemessene Geschwindigkeit ein: ");
        int gemesseneGeschwindigkeit = scanner.nextInt();
        int ueberschreitung = 0;

        if(gemesseneGeschwindigkeit > 50){
            ueberschreitung = gemesseneGeschwindigkeit - 50;
        } else {
            System.out.println("Alles Gut, sie duerfen weiterfahren");
        }

        int geschStrafe = 0;

        //Ab hier Uebung 4-2
        if(ueberschreitung <= 10 && ueberschreitung > 0){
            System.out.println("Schriftliche Verwarnung");

        } else if(ueberschreitung <= 20){
            System.out.println("30€ Strafe");
            geschStrafe = 30;
        } else if (ueberschreitung <= 30){
            System.out.println("50€ Strafe");
            geschStrafe = 50;
        } else if (ueberschreitung <= 50){
            System.out.println("100€ Strafe");
            geschStrafe = 100;
        } else if (ueberschreitung <= 100){
            System.out.println("500€ Strafe");
            geschStrafe = 500;
        } else if (ueberschreitung > 100){
            System.out.printf("1500€ Strafe");
            geschStrafe = 1500;
        }
       //Uebung 4-3
        System.out.println("Bitte geben Sie den gemessenen Alkoholpegel ein: ");
        double alkoPegel = scanner.nextDouble();
        int alkoPegelStrafe = 0;

        if(alkoPegel <= 0.5 && alkoPegel > 0){
            System.out.println("Alles i.O.");
        } else if(alkoPegel > 0.5 && alkoPegel <= 1.0){
            System.out.println("Strafe 50€");
            alkoPegelStrafe = 50;
        } else if(alkoPegel >= 1.1 && alkoPegel < 2.0){
            System.out.println("Strafe 100€");
            alkoPegelStrafe = 100;
        } else if(alkoPegel > 2.0){
            System.out.println("Strafe 2500€");
            alkoPegelStrafe = 2500;
        }

        //Ausgabe der Gesammelten Strafen
        System.out.println("Gesamtstrafe = "+(alkoPegelStrafe+geschStrafe));

    }
}
