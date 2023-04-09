package com.act.seclassmtapi.services;
import com.act.seclassmtapi.domains.Account;
import com.act.seclassmtapi.repositories.AccountRepo;
import com.act.seclassmtapi.utils.AgeCalculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.UndeclaredThrowableException;
import java.time.LocalDate;
import java.util.logging.Filter;


@Service
public class AccountService {

    @Autowired AccountRepo accountRepo;

    public Account createAccount(Account account) throws Exception {
        Integer age = AgeCalculator.CalculateDiffernce(LocalDate.now(),account.getDateOfBirth() );
        if (age==null ){
            throw new Exception("Date of birth cannot be null!");
        }
        if (age<16){
            throw new Exception("Age should be greater than 16");
        }

        return accountRepo.save(account);
    }
    public Iterable<Account>  getAccounts(){
        return accountRepo.findAll();
    }
}
