package com.example.calculator.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

    private void calculating(Model model, int znak, double firstNum, double secondNum){
        model.addAttribute("", "");
        switch (znak) {
            case (1) -> model.addAttribute("equals", firstNum + secondNum);
            case (2) -> model.addAttribute("equals", firstNum - secondNum);
            case (3) -> model.addAttribute("equals", firstNum / secondNum);
            case (4) -> model.addAttribute("equals", firstNum * secondNum);

        }
    }

    @PostMapping("/posting")
    public String posting(Model model, @RequestParam(value = "znak") int znak,
                          @RequestParam(value = "first_num") double firstNum,
                          @RequestParam(value = "second_num") double secondNum) {
        calculating(model, znak, firstNum, secondNum);
        return "HomePage";
    }
    @GetMapping("/getting")
    public String getting(Model model, @RequestParam(value = "znak") int znak,
                          @RequestParam(value = "first_num") double firstNum,
                          @RequestParam(value = "second_num") double secondNum) {
        calculating(model, znak, firstNum, secondNum);

        return "HomePage";
    }

}
