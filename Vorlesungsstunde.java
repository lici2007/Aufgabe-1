public class Vorlesungsstunde {
    private String Thema;
    private String Datum;
    private String Uhrzeit;
    private String Raum;

    public Vorlesungsstunde (String Thema, String Datum, String Uhrzeit, String Raum) {
        this.Thema = Thema;
        this.Datum = Datum;
        this.Uhrzeit = Uhrzeit;
        this.Raum = Raum;
    }

    public String VorlesungsdetailsAnzeigen () {
        return "Vorlesungsstunde: " + Thema + "\nDatum: " + Datum + "\nUhrzeit: " + Uhrzeit + "\nRaum: " + Raum;
    }
    
}
