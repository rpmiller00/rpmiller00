package com.techelevator.tenmo.model;

import java.math.BigDecimal;

public class Transfer {
    private BigDecimal amount;
    private int transferId;
    private int transferTypeId;
    private int transferStatusId;
    private int accountFrom;
    private int accountTo;

    private String transferType;
    private String transferStatus;

    private String usernameTo;
    private String usernameFrom;


    public String getTransferType() {
        return transferType;
    }

    public void setTransferType(String transferType) {
        this.transferType = transferType;
    }

    public String getTransferStatus() {
        return transferStatus;
    }

    public void setTransferStatus(String transferStatus) {
        this.transferStatus = transferStatus;
    }

    public String getUsernameTo() {
        return usernameTo;
    }

    public void setUsernameTo(String usernameTo) {
        this.usernameTo = usernameTo;
    }

    public String getUsernameFrom() {
        return usernameFrom;
    }

    public void setUsernameFrom(String usernameFrom) {
        this.usernameFrom = usernameFrom;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public int getTransferId() {
        return transferId;
    }

    public int getTransferTypeId() {
        return transferTypeId;
    }

    public int getTransferStatusId() {
        return transferStatusId;
    }

    public int getAccountFrom() {
        return accountFrom;
    }

    public int getAccountTo() {
        return accountTo;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public void setTransferId(int transferId) {
        this.transferId = transferId;
    }

    public void setTransferTypeId(int transferTypeId) {
        this.transferTypeId = transferTypeId;
    }

    public void setTransferStatusId(int transferStatusId) {
        this.transferStatusId = transferStatusId;
    }

    public void setAccountFrom(int accountFrom) {
        this.accountFrom = accountFrom;
    }

    public void setAccountTo(int accountTo) {
        this.accountTo = accountTo;
    }

    public Transfer(BigDecimal amount, int transferTypeId, int transferStatusId, int accountFrom, int accountTo) {
        this.amount = amount;
        this.transferTypeId = transferTypeId;
        this.transferStatusId = transferStatusId;
        this.accountFrom = accountFrom;
        this.accountTo = accountTo;
    }

    public Transfer() {
    }

    @Override
    public String toString() {
        return  "ID: " + transferId + "\n"+
                "From: " + usernameFrom + "\n"+
                "To: " + usernameTo + "\n"+
                "Type: " + transferType + "\n"+
                "Status: " + transferStatus + "\n"+
                "Amount: $" + amount;
    }
}
