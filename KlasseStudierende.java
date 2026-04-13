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

     public String frageStellen (String frage){
        return name + ", " + matrikelnummer + ", " + studiengang + ": " + frage;
    }

    public String sprechstundenanfrage (Dozierender dozierender, String tag, String uhrzeit, String betreff){
        String anfrage = dozierender + ", " +tag + ", " + uhrzeit + ", " + betreff;
        this.sprechstundenanfrage = anfrage;
        return name + ", " + matrikelnummer + ", " + studiengang + ": " + anfrage;
    }

    public String feedbackSchreiben (Dozierender dozierender, String feedback){
        dozierender.feedbackErhalten(this, feedback);
        return "Feedback gesendet an " + dozierender.getName() + ": " + feedback;
    }

    public String getName() {
        return name;
    }

    public void anmeldenLehrveranstaltung (Lehrveranstaltung lehrveranstaltung) {
        System.out.println (lehrveranstaltung.StudierendeHinzufuegen(this.name);
    }

    public void abmeldenLehrveranstaltung (Lehrveranstaltung lehrveranstaltung) {
        System.out.println (lehrveranstaltung.StudierendeEntfernen(this.name);
    }

    public void teilnahmeLehrveranstaltung () {
        System.out.println (name + );
    }
}