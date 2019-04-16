package com.zipcodewilmington.bakery.services;

import com.zipcodewilmington.bakery.models.Account;
import com.zipcodewilmington.bakery.repositories.AccountRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    private AccountRepositary repositary;
    @Autowired
    public AccountService(AccountRepositary repositary) {
        this.repositary = repositary;
    }

    public Account  create(Account account){ return repositary.save(account);
                                           }

    public Account show(Long id){ return  repositary.findById(id).get();
                                }

    public Boolean delete(Long id){
        repositary.deleteById(id);
        return true;
    }
    public Account update(Long id, Account newAccountData){
        Account originalAccount = repositary.findById(id).get();
        originalAccount.setName(newAccountData.getName());
        originalAccount.setBalance(newAccountData.getBalance());
        return  repositary.save(originalAccount);
    }
}
