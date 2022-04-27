package ru.kirill98.make3dModels.controllers;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.kirill98.make3dModels.services.LogService;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;
import java.util.Objects;

@Controller
@RequiredArgsConstructor
@Log4j
@RequestMapping("log")
public class LogController {
    private final LogService logsService;

    @GetMapping("/get_all_logs")
    public String getAllLogs(Model model,
                             HttpServletRequest request,
                             Principal principal,
                             @RequestParam(value = "level", required = false) String level,
                             @RequestParam(value = "message", required = false) String message,
                             @RequestParam(value = "date", required = false) String date) {

        if(Objects.nonNull(level)) {
            System.out.println(level);
            model.addAttribute("level", level);
        }
        if(Objects.nonNull(message)) {
            System.out.println(message);
            model.addAttribute("message", message);
        }
        if(Objects.nonNull(date)) {
            System.out.println(date);
            model.addAttribute("date", date);
        }

        model.addAttribute("logs", logsService.findAll());
        log.info("Was got logs from " + request.getRemoteAddr());
        return "logs";
    }

    @GetMapping("/get_log_level/{level}")
    public String getLogByLevel(@PathVariable(name = "level") String level,
                                Model model,
                                HttpServletRequest request,
                                Principal principal) {
        model.addAttribute("logs", logsService.findByLevel(level));
        log.info("Was got logs with level: " + level + ", and from address: " + request.getRemoteAddr());

        return "logs";
    }

    @GetMapping("/get_log_message/{message}")
    public String getLogByLikeMessage(@PathVariable(name = "message") String message,
                                      Model model,
                                      HttpServletRequest request,
                                      Principal principal) {
        model.addAttribute("logs", logsService.findByMessageContaining(message));
        log.info("Was got logs with message: \"" + message + "\", and from address: " + request.getRemoteAddr());

        return "logs";
    }

    @GetMapping("/get_log_date/{date}")
    public String getLogByLikeDate(@PathVariable(name = "date") String date,
                                   Model model,
                                   HttpServletRequest request,
                                   Principal principal) {
        model.addAttribute("logs", logsService.findByDateContaining(date));
        log.info("Was got logs with date: " + date + ", and from address: " + request.getRemoteAddr());
        return "logs";
    }
}
