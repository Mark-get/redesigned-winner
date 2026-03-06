package com.mark.bankapp.model;

import java.time.LocalDateTime;

public class Account {

    private String accountNumber;
    private Double balance;
    private Integer id;
    private Integer ownerId;
    private String currency;
    private String status;
    private LocalDateTime createdAt;


    public Account(String accountNumber, Double balance, Integer id, Integer ownerId) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.id= id;
        this.ownerId = ownerId;

    }

    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Integer getId (){
        return id;
    }

    public void setId(Integer id){
         this.id = id;
    }

    public Integer getOwnerId (){
        return ownerId;
    }

    public void setOwnerId(Integer ownerId){
        this.ownerId = ownerId;
    }

    public String getCurrency() { return currency; }
    public void setCurrency(String currency) { this.currency = currency; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }


}