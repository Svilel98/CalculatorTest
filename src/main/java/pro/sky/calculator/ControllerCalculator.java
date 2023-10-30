package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class ControllerCalculator {
    final ServiceCalculator serviceCalculator;

    public ControllerCalculator(ServiceCalculator serviceCalculator) {
        this.serviceCalculator = serviceCalculator;
    }

    @GetMapping(path = "/sum")
    public String sum(@RequestParam(required = false) int value1,@RequestParam(required = false) int value2){
      return serviceCalculator.sum(value1, value2);
    };
    @GetMapping(path = "/minus")
    public String minus(@RequestParam(required = false) int value1,@RequestParam(required = false) int value2){
        return serviceCalculator.minus(value1, value2);
    };
    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam(required = false) int value1,@RequestParam(required = false) int value2){
        return serviceCalculator.multiply(value1, value2);
    };
    @GetMapping(path = "/divide")
    public String divide(@RequestParam(required = false) Integer value1,@RequestParam(required = false) Integer value2){
        return serviceCalculator.divide(value1, value2);
    };
}
