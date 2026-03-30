public class KlasseStudierende {
    private String name;
    private int matrikelnummer;
    private String studiengang;

    public studierender (String name, int matrikelnummer, String studiengang){
        this.name = name;
        this.matrikelnummer = matrikelnummer;
        this.studiengang = studiengang;
    }

    public frageStellen (String frage){
        return name + ", " + matrikelnummer + ", " + studiengang + ": " + frage;

    }
}