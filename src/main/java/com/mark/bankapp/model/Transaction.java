package com.mark.bankapp.model;
import java.time.LocalDateTime;

public class Transaction {
    private Integer id;
    private Integer accountId;
    private Double amount;
    private String type;
    private String status;
    private String description ;
    private LocalDateTime createdAt;

    public Transaction(Integer accountId, Double amount, String type, String description){
        this.accountId = accountId;
        this.amount = amount;
        this.type = type;
        this.description = description;
        this.status = "pending";
        this.createdAt = LocalDateTime.now();
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public Integer getAccountId() { return accountId; }
    public void setAccountId(Integer accountId) { this.accountId = accountId; }

    public Double getAmount() { return amount; }
    public void setAmount(Double amount) { this.amount = amount; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
    
}
