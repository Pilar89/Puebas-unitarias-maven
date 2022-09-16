package co.com.sofka.app.calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;


class BasicCalculatorTest {


    private final BasicCalculator basicCalculator = new BasicCalculator();

    @Test
    @DisplayName("Testing suma: 1+1=2")
    public void sum() {
        // Arrange
        Long number1 = 1L;
        Long number2 = 1L;
        Long expectedValue = 2L;

        // Act
        Long result = basicCalculator.suma(number1, number2);
        // Assert

        // Assert
        assertEquals(expectedValue, result);

    }

    @DisplayName("Testing several sums")
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0,    1,   1",
            "1,    2,   3",
            "49,  51, 100",
            "1,  100, 101"
    })
    public void severalSums(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.suma(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }




    @DisplayName("Testing several subtractions")
    @ParameterizedTest(name = "{1} - {0} = {1}")
    @CsvSource({
            "1,    1,   0",
            "2,    1,   1",
            "51,  49, 2",
            "100,  1, 99"
    })

    public void severalSubtractions(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.resta(first, second),
                () -> first + " - " + second + " should equal " + expectedResult);
    }


    @DisplayName("Testing several multiplications")
    @ParameterizedTest(name = "{1} * {0} = {0}")
    @CsvSource({
            "1,    1,   1",
            "2,    2,   4",
            "51,  49, 2499",
            "100,  3, 300"
    })

    public void severalmultiplications(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.mutiplicacion(first, second),
                () -> first + " * " + second + " should equal " + expectedResult);
    }

    @DisplayName("Testing several divisions")
    @ParameterizedTest(name = "{2} / {2} = {1}")
    @CsvSource({
            "1,    1,   1",
            "2,    2,   1",
            "100,  10, 10",
            "99,  3, 33"
    })

    public void severaldivisions(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.division(first, second),
                () -> first + " / " + second + " should equal " + expectedResult);
    }






}