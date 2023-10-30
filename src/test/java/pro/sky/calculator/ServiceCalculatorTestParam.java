package pro.sky.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.Stream;
@SpringBootTest
class ServiceCalculatorTestParam {
    private static Integer value1 = 1;
    private static Integer value2 = 2;
    private static Integer value3 = 3;
    private static Integer value4 = 4;
    private static String sum1 = "1+2=3";
    private static String sum2 = "3+4=7";
    private static String minus1 = "1-2=-1";
    private static String minus2 = "3-4=-1";
    private static String multiply1 = "1*2=2";
    private static String multiply2 = "3*4=12";
    private static String divide1 = "1/2=0";
    private static String divide2 = "3/4=0";
    private ServiceCalculator serviceCalculator = new ServiceCalculator();

    public static Stream<Arguments> provideParamsSum() {
       return Stream.of(
                Arguments.of(value1, value2, sum1),
                Arguments.of(value3, value4, sum2)
        );
    }
    @ParameterizedTest
    @MethodSource("provideParamsSum")
    public void sum(Integer value1, Integer value2, String sum){
        Assertions.assertEquals(sum,serviceCalculator.sum(value1,value2));
    }
    public static Stream<Arguments> provideParamsMinus() {
        return Stream.of(
                Arguments.of(value1, value2, minus1),
                Arguments.of(value3, value4, minus2)
        );
    }
    @ParameterizedTest
    @MethodSource("provideParamsMinus")
    public void minus(Integer value1, Integer value2, String minus){
        Assertions.assertEquals(minus,serviceCalculator.minus(value1,value2));
    }
    public static Stream<Arguments> provideParamsMultiply() {
        return Stream.of(
                Arguments.of(value1, value2, multiply1),
                Arguments.of(value3, value4, multiply2)
        );
    }
    @ParameterizedTest
    @MethodSource("provideParamsMultiply")
    public void multiply(Integer value1, Integer value2, String multiply){
        Assertions.assertEquals(multiply,serviceCalculator.multiply(value1,value2));
    }
    public static Stream<Arguments> provideParamsDivide() {
        return Stream.of(
                Arguments.of(value1, value2, divide1),
                Arguments.of(value3, value4, divide2)
        );
    }
    @ParameterizedTest
    @MethodSource("provideParamsDivide")
    public void divide(Integer value1, Integer value2, String divide){
        Assertions.assertEquals(divide,serviceCalculator.divide(value1,value2));
    }
}