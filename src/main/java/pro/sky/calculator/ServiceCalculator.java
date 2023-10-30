package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class ServiceCalculator {
    public String sum(Integer value1, Integer value2) {
        if (value1 == null || value2 == null){
            throw new  NullPointerException();
        }
        int sum = value1 + value2;
        return value1 + "+" + value2 + "=" + sum;
    }
    public String minus(Integer value1, Integer value2){
        if (value1 == null || value2 == null){
            throw new  NullPointerException();
        }
        int minus = value1 - value2;
        return value1 + "-" + value2 + "=" + minus;
    }
    public String multiply(Integer value1, Integer value2) {
        if (value1 == null || value2 == null){
            throw new  NullPointerException();
        }
        int multiply = value1 * value2;
        return value1 + "*" + value2 + "=" + multiply;
    }
    public String divide(Integer value1, Integer value2){
        if (value1 == null || value2 == null){
            throw new  NullPointerException("Укажите оба значения");
        }
        if (value2 == 0){
            try {
                throw new IllegalArgumentException("Деление на ноль невозможно");
            } catch (Exception e) {
                throw new IllegalArgumentException(e);
            }
        }
        int divide = value1 / value2;
        return value1 + "/" + value2 + "=" + divide;
    }
}
