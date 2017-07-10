package start.spring.io.greetings.controller;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * Created by user on 10.07.17.
 */
@Getter
@Setter
@Accessors(chain = true)
public class Greeting {
    String vorname;
    String nachname;

    public Greeting(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }

}
