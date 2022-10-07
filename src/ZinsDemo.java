public class ZinsDemo {

    public static void main(String[] args) {
        double kontostand = 1000;
        double zinsen = 2.25;

        System.out.println(berechneZinsen(1000, 2.25));
    }

    public static double berechneZinsen(double kontostand, double zinsen){
    return kontostand * zinsen / 100;
    }
}
