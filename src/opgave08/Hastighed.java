package opgave08;

public class Hastighed {

    public static void main(String[] args) {

        int kilometer = 15;
        double miles = kilometer/1.6;
        double fart;
        double tid = 50.5/60;

        System.out.print("Gennemsnits hastigheden er = ");
        System.out.print(miles/tid);
        System.out.print(" m/h ");
    }
}
