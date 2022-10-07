public class NotenDemo {
    public static void main(String[] args) {
        int punkte = 92;
        System.out.println("In der Prüfung wurden " + punkte + " erreicht, wodurch diese mit der Note " +
                getNotenText(punkte) + " bewertet wurde.");
    }

    public static String getNotenText(int punkte) {
        String notenText;

        if (punkte >= 90) {
            notenText = "Sehr Gut";
        } else if (punkte >= 78) {
            notenText = "Gut";
        } else if (punkte >= 65) {
            notenText = "Befriedigend";
        } else if (punkte >= 51) {
            notenText = "Genügend";
        } else {
            notenText = "Nicht Genügend";
        }
        return notenText;
    }
}

