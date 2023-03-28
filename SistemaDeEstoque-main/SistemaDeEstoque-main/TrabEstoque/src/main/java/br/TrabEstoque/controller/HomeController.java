package br.TrabEstoque.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public ModelAndView index(){
        HashMap<String, String> map = new HashMap<>();
        map.put("apelido","valor");
        map.put("nome","ze");
        return new ModelAndView("home/index",map);
    }
    
}
