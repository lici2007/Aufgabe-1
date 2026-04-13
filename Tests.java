public class Tests {
    public static void main(String[] args) {
        Dozierender dozierender = new Dozierender("Dr. Müller", "Informatik", "Büro 101");
        KlasseStudierende studierender = new KlasseStudierende("Max Mustermann", 123456, "Informatik");

        // Teste die Methoden
        String frage = studierender.frageStellen("Ich würde gerne eine Sprechstunde vereinbaren. Wann haben Sie Zeit?");
        System.out.println(frage);

        String antwort = dozierender.frageBeantworten(studierender, "Gerne. Ich hätte Mittwochs um 10:00 Uhr Zeit.");
        System.out.println(antwort);

        String sprechstundenanfrage = studierender.sprechstundenanfrage(dozierender, "Montag", "10:00", "Fragen zum Projekt");
        System.out.println(sprechstundenanfrage);

        String feedback = studierender.feedbackSchreiben(dozierender, "Vielen Dank, dass sie sich zeit nehmen!");
        System.out.println(feedback);
    }
}
