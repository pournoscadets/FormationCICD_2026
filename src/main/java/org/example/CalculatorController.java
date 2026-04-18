package org.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculate")
public class CalculatorController {

    private final CalculateOperator calculator = new CalculateImpl();

    @GetMapping("/sum")
    public double sum(@RequestParam double num1, @RequestParam double num2) {
        return calculator.sum(num1, num2);
    }
}
