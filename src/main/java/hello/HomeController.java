package hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by agup101 on 4/26/2017.
 */
@RestController
public class HomeController {

    @GetMapping("/")
    public String greeting() {
        return "Hello World";
    }

}
