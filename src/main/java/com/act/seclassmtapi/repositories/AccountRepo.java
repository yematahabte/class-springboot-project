package com.act.seclassmtapi.repositories;
import  com.act.seclassmtapi.domains.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepo extends CrudRepository<Account,Long> {

}
