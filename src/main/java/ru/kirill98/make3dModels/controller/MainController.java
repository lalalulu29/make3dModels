package ru.kirill98.make3dModels.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@Slf4j
public class MainController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", "name");
        return "greeting";
    }
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("name", "Какоетоимя");
        model.addAttribute("age", 23);
        return "index";
    }
}
