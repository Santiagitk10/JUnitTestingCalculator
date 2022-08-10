package co.com.sofka.app;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasicCalculator {

    private static final Logger logger = LoggerFactory.getLogger(BasicCalculator.class);
    public Long sum(Long numberOne, Long numberTwo) {
        logger.info( "Summing {} + {}", numberOne, numberTwo );
        return numberOne + numberTwo;
    }


    public Long subtract(Long numberOne, Long numberTwo) {
        logger.info( "Subtracting {} - {}", numberOne, numberTwo );
        return numberOne - numberTwo;
    }


    public Long times(Long numberOne, Long numberTwo) {
        logger.info( "Multiplying {} * {}", numberOne, numberTwo );
        return numberOne * numberTwo;
    }

    public Long division(Long numberOne, Long numberTwo) {
        logger.info( "Dividing {} / {}", numberOne, numberTwo );
        if(numberTwo == 0){
            throw new IllegalArgumentException("Division into 0 is not possible");
        }
        return numberOne / numberTwo;
    }
}
