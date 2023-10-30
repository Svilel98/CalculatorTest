package pro.sky.calculator;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalculatorApplicationTests {
    private Integer value1;
    private Integer value2;
    private Integer value3;
    private Integer value4;
    private ServiceCalculator serviceCalculator;

    @BeforeEach
    public void setUp() {
        value1 = 10;
        value2 = 2;
        value3 = 3;
        value4 = 0;
        serviceCalculator = new ServiceCalculator();
    }

    @Test
    public void sum() {
        String sum = serviceCalculator.sum(value1, value2);
        Assertions.assertEquals("10+2=12", sum);
        String sum2 = serviceCalculator.sum(value3, value4);
        Assertions.assertEquals("3+0=3", sum2);
    }

    @Test
    public void minus() {
        String minus = serviceCalculator.minus(value1, value2);
        Assertions.assertEquals("10-2=8", minus);
        String minus2 = serviceCalculator.minus(value3, value4);
        Assertions.assertEquals("3-0=3", minus2);
    }

    @Test
    public void multiply() {
        String multiply = serviceCalculator.multiply(value1, value2);
        Assertions.assertEquals("10*2=20", multiply);
        String multiply2 = serviceCalculator.multiply(value3, value4);
        Assertions.assertEquals("3*0=0", multiply2);
    }

    @Test
    public void divide() {
        String divide = serviceCalculator.divide(value1, value2);
        Assertions.assertEquals("10/2=5", divide);
        String divide2 = serviceCalculator.divide(value1, value1);
        Assertions.assertEquals("10/10=1", divide2);
    }

    @Test
    public void divideOnZero() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> serviceCalculator.divide(value1, value4));
        Assertions.assertThrows(NullPointerException.class, () -> serviceCalculator.divide(value3, null));
    }
}
