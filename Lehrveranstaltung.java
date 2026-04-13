public class Lehrveranstaltung {
    private String Titel; 
    private String Dozierende; 
    private String[] Studierende; 
    private String Vorlesungsstunden;
    private String Praktikumsstunden;

    public Lehrveranstaltung (String Titel, String Dozierende, String Studierende) {
        this.Titel = Titel;
        this.Dozierende = Dozierende;
        this.Studierende = Studierende;
    }


    public String StudierendeHinzufuegen (KlasseStudierende Studierende) {
        //Hinzufügen eines neuen Studierenden zur Lehrveranstaltung
        String[] neueStudierende = new String[this.Studierende.length + 1];
        for (int i = 0; i < this.Studierende.length; i++) {
            neueStudierende[i] = this.Studierende[i];
        }
        neueStudierende[this.Studierende.length] = Studierende;
        this.Studierende = neueStudierende;

        //Rückgabe einer Bestätigungsmeldung
        return "Der Studierende " + Studierende + " wurde zur Lehrveranstaltung " + Titel + " hinzugefügt.";
    }



    public String StudierendeEntfernen (KlasseStudierende Studierende) {
        //Entfernen eines Studierenden aus der Lehrveranstaltung
        String[] neueStudierende = new String[this.Studierende.length - 1];
        int index = 0;
        for (int i = 0; i < this.Studierende.length; i++) {
            if (!this.Studierende[i].equals(Studierende)) {
                neueStudierende[index] = this.Studierende[i];
                index++;
            }
        }
        this.Studierende = neueStudierende;
        //Rückgabe einer Bestätigungsmeldung
        return "Der Studierende " + Studierende + " wurde von der Lehrveranstaltung " + Titel + " entfernt.";
    }
    


    public String VorlesungsstundenHinzufuegen (String Vorlesungsstunden) {
        this.Vorlesungsstunden = Vorlesungsstunden;
        return "Die Vorlesungsstunden für die Lehrveranstaltung " + Titel + " wurden auf " + Vorlesungsstunden + " gesetzt.";
    }

    public String VorlesungsstundenEntfernen () {
        this.Vorlesungsstunden = null;
        return "Die Vorlesungsstunden für die Lehrveranstaltung " + Titel + " wurden entfernt.";
    }

    public String PraktkiumsstundenHinzufuegen (String Praktikumsstunden) {
        this.Praktikumsstunden = Praktikumsstunden;
        return "Die Praktikumsstunden für die Lehrveranstaltung " + Titel + " wurden auf " + Praktikumsstunden + " gesetzt.";
    }

    pubic String PraktikumsstundenEntfernen () {
        this.Praktikumsstunden = null;
        return "Die Praktikumsstunden für die Lehrveranstaltung " + Titel + " wurden entfernt.";
    }

    public String VeranstaltungsdetailsAnzeigen () {
        return "Lehrveranstaltung: " + Titel + "\nDozierende: " + Dozierende + "\nStudierende: " + Studierende + "\nVorlesungsstunden: " + Vorlesungsstunden + "\nPraktikumsstunden: " + Praktikumsstunden;
    }
}
