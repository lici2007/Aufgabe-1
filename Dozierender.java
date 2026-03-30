public class Dozierender {
    private String name; 
    private String fakultaet;
    private String bueronummer;
    private String sprechstunde;
    private String feedback;


public Dozierender (String name, String fakultaet, String bueronummer) {
    this.name = name;
    this.fakultaet = fakultaet;
    this.bueronummer = bueronummer;
}
public String frageBeantworten (KlasseStudierender studierender, String antwort){
    return "Antwort von" + name + "an " + studierender.getName() + ": Die Antwort auf Ihre Frage ist: " + antwort;
}
public String getSprechstunde () {
    return sprechstunde; 
}
public void setSprechstunde (String sprechstunde) {
    this.sprechstunde = sprechstunde;

public String feedbackerhalten (KlasseStudierender studierender, String feedback) {
    return "Feedback von" + studierender.getName() + ": " + feedback;
}


