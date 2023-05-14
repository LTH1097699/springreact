package io.springbootlearn.testreact;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestReactController {

    @GetMapping(value = "/")
    public String getHome(){
        return "ff.html";
    }
}
