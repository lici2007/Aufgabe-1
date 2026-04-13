public class Lehrveranstaltung {
    private String titel; 
    private String dozierender; 
    private String[] studierende; 
    private String[] vorlesungsstunden;
    private String[] praktikumsstunden;

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
        String[] neu = new String[vorlesungsstunden.length + 1];
        
        for (int i = 0; i < vorlesungsstunden.length; i++) {
            neu[i] = vorlesungsstunden[i];
        }
        neu[vorlesungsstunden.length] = vorlesung;
        vorlesungsstunden = neu;
        
        return "Die Vorlesungsstunden für die Lehrveranstaltung " + titel + " wurden auf " + vorlesung + " gesetzt.";
    }


    public String VorlesungsstundenEntfernen () {
        //this.vorlesungsstunden = null;
        int count = 0;
        // zuerst zählen, wie viele Studierende übrig bleiben
        for (int i = 0; i < vorlesungsstunden.length; i++) {
            if (!vorlesungsstunden[i].equals(vorlesung)) {
                count++;
            }
        }

        String[] neu = new String[count];
        int index = 0;
        
        for (int i = 0; i < vorlesungsstunden.length; i++) {
            if (!vorlesungsstunden[i].equals(vorlesung)) {
                neu[index++] = vorlesungsstunden[i];
                
            }
        }
        vorlesungsstunden = neu;

        return "Die Vorlesungsstunden für die Lehrveranstaltung " + titel + " wurden entfernt.";
    }

    public String PraktikumsstundenHinzufuegen (String praktikum) {
         String[] neu = new String[praktikumsstunden.length + 1];
        
        for (int i = 0; i < praktikumsstunden.length; i++) {
            neu[i] = praktikumsstunden[i];
        }
        neu[praktikumsstunden.length] = praktikum;
        praktikumsstunden = neu;
        
        return "Die Praktikumsstunden für die Lehrveranstaltung " + titel + " wurden auf " + praktikum + " gesetzt.";
    }

    public String PraktikumsstundenEntfernen () {
         
        int count = 0;
        // zuerst zählen, wie viele Studierende übrig bleiben
        for (int i = 0; i < praktikumsstunden.length; i++) {
            if (!praktikumsstunden[i].equals(praktikum)) {
                count++;
            }
        }

        String[] neu = new String[count];
        int index = 0;
        
        for (int i = 0; i < praktikumsstunden.length; i++) {
            if (!praktikumsstunden[i].equals(praktikum)) {
                neu[index++] = praktikumsstunden[i];
                
            }
        }
        praktikumsstunden = neu;
        return "Die Praktikumsstunden für die Lehrveranstaltung " + titel + " wurden entfernt.";
    }

    public String VeranstaltungsdetailsAnzeigen () {

        String liste = "";
        for (int i = 0; i < studierende.length; i++) {
            liste += studierende[i] + "\n";
        }
        return "Lehrveranstaltung: " + titel + "\nDozierende: " + dozierender + "\nStudierende: " + liste + "\nVorlesungsstunden: " + vorlesungsstunden + "\nPraktikumsstunden: " + praktikumsstunden;
    }
}
