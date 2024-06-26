package deyvis.example.demo_jwt.Demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/helloword")
@RequiredArgsConstructor
public class DemoController {

    @PostMapping()
    public String welcome()
    {
        return "Welcome from secure endpoint waaaa";
    }
}