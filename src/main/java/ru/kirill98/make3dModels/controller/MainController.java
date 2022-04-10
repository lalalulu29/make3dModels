package ru.kirill98.make3dModels.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequiredArgsConstructor
@Log4j
public class MainController {
    private Integer count = 0;

    @GetMapping("/")
    public String index(Model model,
                          HttpServletRequest request) {
        model.addAttribute("count", ++count);
        model.addAttribute("address", request.getRemoteAddr());
        log.info("Was make get request to index from " + request.getRemoteAddr());
        return "index";
    }
}
