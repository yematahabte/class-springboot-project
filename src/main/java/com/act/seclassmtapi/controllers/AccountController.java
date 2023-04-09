package com.act.seclassmtapi.controllers;
import com.act.seclassmtapi.domains.Account;
import com.act.seclassmtapi.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class AccountController {

    @Autowired private AccountService  accountService;

    @PostMapping ("/api/account")
    public ResponseEntity<?> createAccount(@RequestBody Account account){

        try {
            Account savedAccount= accountService.createAccount(account);
            return ResponseEntity.status(HttpStatus.CREATED).body(savedAccount);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{ \"error:\": "+e.getMessage()+"}" ) ;
        }


    }
    @GetMapping("/api/accounts")
    public ResponseEntity<?> getAccounts(){

        try {
            Iterable<Account> savedAccount= accountService.getAccounts();
            return ResponseEntity.status(HttpStatus.CREATED).body(savedAccount);
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{ \"error:\": "+e.getMessage()+"}" ) ;
        }


    }

}
