public class WinterreifenpflichtDemo {
    public static void main(String[] args) {
        boolean winterreifenPflicht = isWinterreifenPflicht(9, true);

        isWinterreifenPflicht(13, false);

        if(winterreifenPflicht == true) {
            System.out.print("Bitte Winterreifen verwenden");
        } else {
            System.out.println("Winterreifen sind nicht erforderlich");
        }

    }

    public static boolean isWinterreifenPflicht(double temperatur, boolean rutschigeFahrbahn) {
        boolean reifenText;

        if((temperatur < 4) || temperatur < 10 && rutschigeFahrbahn) {
            return true;
        } else return false;
    }
}
