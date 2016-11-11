package com.fma.web.home;



import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("home")
@Controller
public class HomeController {

   
    @RequestMapping("/")
    @ResponseBody
    ModelAndView test() {
        return new ModelAndView("home");
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(HomeController.class, args);
    }
}
