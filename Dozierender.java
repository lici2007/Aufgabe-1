public class Dozierender {
    private String name; 
    private String fakultaet;
    private String bueronummer;
    private String sprechstunde;
    private String feedback;


    private String feedbackListe = new String();

    public Dozierender (String name, String fakultaet, String bueronummer) {
    this.name = name;
    this.fakultaet = fakultaet;
    this.bueronummer = bueronummer;
}
public String frageBeantworten (KlasseStudierende studierende, String antwort){
    return "Antwort von" + name + "an " + studierende.getName() + ": Die Antwort auf Ihre Frage ist: " + antwort;
}
public String getSprechstunde () {
    return sprechstunde; 
}
public void setSprechstunde (String sprechstunde) {
    this.sprechstunde = sprechstunde;

public String feedbackErhalten (KlasseStudierende studierende, String feedback) {
    return "Feedback von" + studierende.getName() + ": " + feedback;
}

public void zeigeFeedback () {
    for (String feedback : feedbackListe) {
        System.out.println("Feedback für " + name + ": " + feedback);
    }
}
public String getName() {
    return name;
}
}
