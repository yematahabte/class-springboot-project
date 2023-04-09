package com.act.seclassmtapi.utils;

import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator {

    public static Integer CalculateDiffernce(LocalDate currentDate, LocalDate dateOfBirth){
        if (dateOfBirth==null || currentDate ==null){
            return null;
        }
        else {
            return Period.between(dateOfBirth, currentDate).getYears();
        }

    }
}
