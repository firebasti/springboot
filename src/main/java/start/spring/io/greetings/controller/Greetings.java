package start.spring.io.greetings.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by user on 10.07.17.
 */

@RestController
public class Greetings {
    public Greetings() {

    }

    @RequestMapping("/")
    public Greeting home() {
        return new Greeting("Sebastian", "Walter");
    }

}
