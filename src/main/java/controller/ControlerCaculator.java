package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControlerCaculator {

    @GetMapping("/caculator")
    public String caculator(@RequestParam(defaultValue = "0") String firstNumber,
                            @RequestParam(defaultValue = "0") String secondNumber,
                            @RequestParam(defaultValue = "") String math,
                            Model model) {
        double result=0;
        double num1=Float.parseFloat(firstNumber);
        double num2=Float.parseFloat(secondNumber);

        switch (math){
            case "Addition":
                result=num1+num2;
                break;
            case "Subtraction":
                result=num1-num2;
                break;
            case "Multiplication":
                result=num1*num2;
                break;
            case "Division":
                result=num1/num2;
                break;
            default:
                break;
        }

        model.addAttribute("result",result);
        return "home";
    }
}
