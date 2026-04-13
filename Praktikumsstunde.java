public class Praktikumsstunde {
    private String Thema; 
    private String Datum; 
    private String Uhrzeit; 
    private String Raum; 
    private String Aufgaben; 

    public Praktikumsstunde (String Thema, String Datum, String Uhrzeit, String Raum, String Aufgaben) {
        this.Thema = Thema;
        this.Datum = Datum;
        this.Uhrzeit = Uhrzeit;
        this.Raum = Raum;
        this.Aufgaben = Aufgaben;
    }

    public String PraktikumsdetailsAnzeigen () {
        return "Praktikumsstunde: " + Thema + "\nDatum: " + Datum + "\nUhrzeit: " + Uhrzeit + "\nRaum: " + Raum + "\nAufgaben: " + Aufgaben;
    }

}
