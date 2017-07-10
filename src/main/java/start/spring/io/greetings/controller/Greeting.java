package start.spring.io.greetings.controller;

/**
 * Created by user on 10.07.17.
 */
public class Greeting {
    String vorname;
    String nachname;

    public Greeting(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }
}
