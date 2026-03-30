public class KlasseStudierende {
    private String name;
    private int matrikelnummer;
    private String studiengang;
    private String sprechstundenanfrage;

    public studierender (String name, int matrikelnummer, String studiengang){
        this.name = name;
        this.matrikelnummer = matrikelnummer;
        this.studiengang = studiengang;
    }

     public frageStellen (String frage){
        return name + ", " + matrikelnummer + ", " + studiengang + ": " + frage;
    }

    public String Sprechstundenanfrage (Dozierender dozierender, String tag, String uhrzeit, String betreff){
        String anfrage = dozierender + ", " +tag + ", " + uhrzeit + ", " + betreff;
        this.sprechstundenanfrage = anfrage;
        return name + ", " + matrikelnummer + ", " + studiengang + ": " + anfrage;
    }

    public String feedbackSchreiben (Dozierender dozierender, String feedback){
        return name + ", " + matrikelnummer + ", " + studiengang + ": " + dozierender + ", " + feedback;
    }
}