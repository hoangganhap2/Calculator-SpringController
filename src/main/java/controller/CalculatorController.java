package controller;

import model.Calculator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {

    @GetMapping("/perform")
    public String calculate() {
        return "index";
    }

    @GetMapping("/calculate")
    public String result(@RequestParam float firstNumber, float secondNumber, char operator, Model model) {
        try {
            float rel = Calculator.calculate(firstNumber, secondNumber, operator);
            model.addAttribute("rel", rel);
            return "index";
        } catch (RuntimeException ex) {
            model.addAttribute("error", ex.getMessage());
            return "index";
        }

    }
}
