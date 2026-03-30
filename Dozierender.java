public class Dozierender {
    private String name; 
    private String fakultaet;
    private String bueronummer;


public Dozierender (String name, String fakultaet, String bueronummer) {
    this.name = name;
    this.fakultaet = fakultaet;
    this.bueronummer = bueronummer;
}
public String frageBeantworten (KlasseStudierender studierender, String antwort){
    return "Antwort von" + name + "an " + studierender.getName() + ": Die Antwort auf Ihre Frage ist: " + antwort;
}
}
