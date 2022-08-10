package co.com.sofka.app;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;


class BasicCalculatorTest {


    BasicCalculator calculator = new BasicCalculator();

    @Test
    @DisplayName("Testing sum: 5 + 7 = 12")
    void sum() {
        //Arrange
        Long numberOne = 5l;
        Long numberTwo = 7l;
        //Act
        Long result = calculator.sum(numberOne,numberTwo);
        //Assert
        assertThat(result).isEqualTo(12);

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
        assertEquals(expectedResult, calculator.sum(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }


    @Test
    @DisplayName("Testing subtraction: 7 - 5 = 2")
    void subtraction(){
        //Arrange
        Long numberOne = 7l;
        Long numberTwo = 5l;
        //Act
        Long result = calculator.subtract(numberOne,numberTwo);
        //Assert
        assertThat(result).isEqualTo(2);
    }

    @Test
    @DisplayName("Testing multiplication: 7 * 5 = 35")
    void times(){
        //Arrange
        Long numberOne = 7l;
        Long numberTwo = 5l;
        //Act
        Long result = calculator.times(numberOne,numberTwo);
        //Assert
        assertThat(result).isEqualTo(35);
    }

    @Test
    @DisplayName("Testing division: 20 / 4 = 5")
    void division(){
        //Arrange
        Long numberOne = 20l;
        Long numberTwo = 4l;
        //Act
        Long result = calculator.division(numberOne,numberTwo);
        //Assert
        assertThat(result).isEqualTo(5);
    }

    @Test
    @DisplayName("Testing division: 20 / 0. Throws IllegalArgumentException")
    void divisionIntoZeroNotAllowed(){
        //Arrange
        Long numberOne = 20l;
        Long numberTwo = 0l;
        //Act
        //Assert
        assertThrows(IllegalArgumentException.class, () -> calculator.division(numberOne,numberTwo));

    }

}