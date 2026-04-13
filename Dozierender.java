public class Dozierender {
    private String name; 
    private String fakultaet;
    private String bueronummer;
    private String sprechstunde;
    private String feedback;


    private String[] feedbackListe = new String[0];

    public Dozierender (String name, String fakultaet, String bueronummer) {
    this.name = name;
    this.fakultaet = fakultaet;
    this.bueronummer = bueronummer;
}
public String frageBeantworten (KlasseStudierende studierende, String antwort){
    return "Antwort von " + name + " an " + studierende.getName() + ": Die Antwort auf Ihre Frage ist: " + antwort;
}
public String getSprechstunde () {
    return sprechstunde; 
}
public void setSprechstunde (String sprechstunde) {
    this.sprechstunde = sprechstunde;
}
public void feedbackErhalten (KlasseStudierende studierende, String feedback) {
    String eintrag = studierende.getName() + ": " + feedback;

        String[] neu = new String[feedbackListe.length + 1];

        for (int i = 0; i < feedbackListe.length; i++) {
            neu[i] = feedbackListe[i];
        }

        neu[feedbackListe.length] = eintrag;
        feedbackListe = neu;
}

public void zeigeFeedback () {
    for (int i = 0; i < feedbackListe.length; i++) {
            System.out.println(feedbackListe[i]);
    }
}
public String getName() {
    return name;
}

public Lehrveranstaltung erstelleLehrveranstaltung (String titel, String[] studierende) {
    return new Lehrveranstaltung(titel, this, studierende);
}


public void verwalteTeilnehmer(Lehrveranstaltung lehrveranstaltung) {
        System.out.println("Teilnehmerliste:");
        System.out.println(lehrveranstaltung.VeranstaltungsdetailsAnzeigen());
}
}