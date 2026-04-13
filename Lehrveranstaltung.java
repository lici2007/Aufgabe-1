public class Lehrveranstaltung {
    private String titel; 
    private String dozierender; 
    private String[] studierende; 
    private String vorlesungsstunden;
    private String praktikumsstunden;

    public Lehrveranstaltung (String titel, Dozierender dozierender, String[] studierende) {
        this.titel = titel;
        this.dozierender = dozierender.getName();
        this.studierende = studierende;
    }


    public String StudierendeHinzufuegen (String name) {
        //Hinzufügen eines neuen Studierenden zur Lehrveranstaltung
        String[] neu = new String[studierende.length + 1];
        
        for (int i = 0; i < studierende.length; i++) {
            neu[i] = studierende[i];
        }
        
        neu[studierende.length] = name;
        studierende = neu;

        //Rückgabe einer Bestätigungsmeldung
        return "Der Studierende " + name + " wurde zur Lehrveranstaltung " + titel + " hinzugefügt.";
    }



    public String StudierendeEntfernen (String name) {
        //Entfernen eines Studierenden aus der Lehrveranstaltung

        int count = 0;
        // zuerst zählen, wie viele Studierende übrig bleiben
        for (int i = 0; i < studierende.length; i++) {
            if (!studierende[i].equals(name)) {
                count++;
            }
        }

        String[] neu = new String[count];
        int index = 0;
        
        for (int i = 0; i < studierende.length; i++) {
            if (!studierende[i].equals(name)) {
                neu[index++] = studierende[i];
                
            }
        }
        
        studierende = neu;
        
        //Rückgabe einer Bestätigungsmeldung
        return "Der Studierende " + name + " wurde von der Lehrveranstaltung " + titel + " entfernt.";
    }
    
    public String VorlesungsstundenHinzufuegen (String vorlesung) {
        this.vorlesungsstunden = vorlesung;
        return "Die Vorlesungsstunden für die Lehrveranstaltung " + titel + " wurden auf " + vorlesung + " gesetzt.";
    }

    public String VorlesungsstundenEntfernen () {
        this.vorlesungsstunden = null;
        return "Die Vorlesungsstunden für die Lehrveranstaltung " + titel + " wurden entfernt.";
    }

    public String PraktikumsstundenHinzufuegen (String praktikum) {
        this.praktikumsstunden = praktikum;
        return "Die Praktikumsstunden für die Lehrveranstaltung " + titel + " wurden auf " + praktikum + " gesetzt.";
    }

    public String PraktikumsstundenEntfernen () {
        this.praktikumsstunden = null;
        return "Die Praktikumsstunden für die Lehrveranstaltung " + titel + " wurden entfernt.";
    }

    public String VeranstaltungsdetailsAnzeigen () {

        String liste = "";
        for (int i = 0; i < studierende.length; i++) {
            liste += studierende[i] + "\n";
        }
        return "Lehrveranstaltung: " + titel + "\nDozierende: " + dozierende + "\nStudierende: " + liste + "\nVorlesungsstunden: " + vorlesungsstunden + "\nPraktikumsstunden: " + praktikumsstunden;
    }
}
