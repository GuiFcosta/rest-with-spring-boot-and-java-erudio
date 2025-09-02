package pt.com.GuiFcosta.math;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pt.com.GuiFcosta.exception.UnsupportedMathOperationException;

public class SimpleMath {
    public Double sum(Double a, Double b){
        return a + b;
    }

    public Double sub(Double a, Double b){
        return a - b;
    }

    public Double div(Double a, Double b){
        return a / b;
    }

    public Double mul(Double a, Double b){
        return a * b;
    }

    public Double mean(Double a, Double b){
        return (a + b)/2;
    }

    public Double squareRoot(Double a){
        return Math.sqrt(a);
    }
}
