package br.edu.usj.ads.lpii.helloworldthymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloWorldThymeleaf {
    
    @GetMapping(value="/")
    public ModelAndView getHelloWorldThymelead() {
        ModelAndView modelAndView = new ModelAndView("hello-world");

        return modelAndView;
    }
    
}
