package hello;

import org.springframework.stereotype.Service;

/**
 * Created by agup101 on 4/26/2017.
 */
@Service
public class GreetingService {
    public String greet() {
        return "Hello World";
    }
}