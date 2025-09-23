package pt.com.GuiFcosta.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pt.com.GuiFcosta.exception.ResourceNotFoundException;
import pt.com.GuiFcosta.math.SimpleMath;
import pt.com.GuiFcosta.request.converters.NumberConverter;

@RestController
@RequestMapping ("/math")
public class MathController {
    private final SimpleMath math = new SimpleMath();

    // http://localhost:8080/math/sum/3/5
    @RequestMapping("/sum/{a}/{b}")
    public Double sum(@PathVariable("a") String a, @PathVariable("b") String b) throws Exception{
        isValid(a, b);
        return math.sum(NumberConverter.convertToDouble(a), NumberConverter.convertToDouble(b));
    }

    // http://localhost:8080/math/sub/3/5
    @RequestMapping("/sub/{a}/{b}")
    public Double sub(@PathVariable("a") String a, @PathVariable("b") String b) throws Exception{
        isValid(a, b);
        return math.sub(NumberConverter.convertToDouble(a), NumberConverter.convertToDouble(b));    }

    // http://localhost:8080/math/mul/3/5
    @RequestMapping("/mul/{a}/{b}")
    public Double mul(@PathVariable("a") String a, @PathVariable("b") String b) throws Exception{
        isValid(a, b);
        return math.mul(NumberConverter.convertToDouble(a), NumberConverter.convertToDouble(b));    }

    // http://localhost:8080/math/div/3/5
    @RequestMapping("/div/{a}/{b}")
    public Double div(@PathVariable("a") String a, @PathVariable("b") String b) throws Exception{
        isValid(a, b);
        if(NumberConverter.convertToDouble(b) == 0){
            throw new ResourceNotFoundException("Division by zero");
        }
        return math.div(NumberConverter.convertToDouble(a), NumberConverter.convertToDouble(b));    }

    // http://localhost:8080/math/mean/3/5
    @RequestMapping("/mean/{a}/{b}")
    public Double mean(@PathVariable("a") String a, @PathVariable("b") String b) throws Exception{
        isValid(a, b);
        return math.mean(NumberConverter.convertToDouble(a), NumberConverter.convertToDouble(b));    }

    // http://localhost:8080/math/squareRoot/3/5
    @RequestMapping("/squareRoot/{a}")
    public Double squareRoot(@PathVariable("a") String a) throws Exception{
        if(NumberConverter.isNumeric(a)){
            throw new ResourceNotFoundException("Please set a numeric value");
        }
        return math.squareRoot(NumberConverter.convertToDouble(a));    }

    public void isValid(String a, String b) throws Exception{
        if(NumberConverter.isNumeric(a) || NumberConverter.isNumeric(b)){
            throw new ResourceNotFoundException("Please set a numeric value");
        }
    }
}
