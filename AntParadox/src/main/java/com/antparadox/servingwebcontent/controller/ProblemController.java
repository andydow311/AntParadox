package com.antparadox.servingwebcontent.controller;

import com.antparadox.servingwebcontent.service.Calculations;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProblemController {

    @GetMapping("/problem")
    public String greeting(@RequestParam(name="rope_length") float ropeLength,
                           @RequestParam(name="rope_increase") float ropeIncrease,
                           @RequestParam(name="ant_speed") float antSpeed,
                           Model model) {

        Calculations calculations = new Calculations();
        calculations.harmonicSeries(antSpeed,ropeLength,ropeIncrease);
        int seconds = calculations.getSeconds();
        double harmonicValue = calculations.getValue();

        model.addAttribute("rope_length", ropeLength);
        model.addAttribute("rope_increase", ropeIncrease);
        model.addAttribute("ant_speed", antSpeed);
        model.addAttribute("seconds", seconds);
        model.addAttribute("harmonicValue", harmonicValue);

        return "problem";
    }
}