package com.act.seclassmtapi;

import com.act.seclassmtapi.utils.AgeCalculator;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;


public class AgeCalculatorTest {
    @Test
    void  ShouldReturnErrorIfDateOfBrithIsNull(){
        LocalDate dateOfBirth = null;
        LocalDate currentDate = LocalDate.of(2023,4, 7);

        AgeCalculator ageCalculator= new AgeCalculator();
        Integer result = ageCalculator.CalculateDiffernce(currentDate,dateOfBirth );
        assertNull(result);
    }

    @Test
    void  ShouldReturnErrorIfCurrentDateIsNull(){
        LocalDate dateOfBirth = LocalDate.of(1992,1, 23);
        LocalDate currentDate = null;

        Integer result = AgeCalculator.CalculateDiffernce(currentDate,dateOfBirth );

        assertNull(result);
    }

    @Test
    void  ShouldReturnCorrectDiffernceBetweenCurrentDateAndDateOfBrith(){
        LocalDate dateOfBirth = LocalDate.of(1992,1, 23);
        LocalDate currentDate = LocalDate.of(2023,4, 7);


        Integer result = AgeCalculator.CalculateDiffernce(currentDate,dateOfBirth );

        assertEquals(31, result);
    }


}
