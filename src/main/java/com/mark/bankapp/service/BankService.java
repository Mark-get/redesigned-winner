package com.mark.bankapp.service;

import com.mark.bankapp.model.Account;
import org.springframework.stereotype.Service;
import com.mark.bankapp.repository.AccountRepository;

import java.util.List;


@Service
public class BankService {
    private final AccountRepository accountRepository;

    public BankService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public Account findAccount(Integer accNum){
        return accountRepository.findById(accNum).orElse(null);
    }

    public boolean deposit(Integer accountNumber, double amount) {
        Account acc = findAccount(accountNumber);
        if(acc == null){
            return false;
        }
        acc.setBalance(acc.getBalance() + amount);
        accountRepository.save(acc);
        return true;
    }

    public boolean withdraw(Integer accountNumber, double amount) {
        Account acc = findAccount(accountNumber);
        if(acc == null){
            return false;
        }
        if(amount > acc.getBalance()){
            return false;
        }
        acc.setBalance(acc.getBalance() - amount);
        accountRepository.save(acc);
        return true;
    }

    public Account createNewAccount(Account account){
        if(accountRepository.existsById(account.getAccountNumber())){
            return null;
        }
        return accountRepository.save(account);
    }

    public void deleteAccount(Integer accNum){
        accountRepository.deleteById(accNum);
    }

    public List<Account> getAllAccounts(){
        return accountRepository.findAll();
    }
}
