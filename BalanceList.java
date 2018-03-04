package com.example.lokesh.bittrexcryptoexchange;

/**
 * Created by Karan on 04/03/2018.
 */


public class BalanceList {
    private String head;
    private String description;

    public BalanceList(String head, String description) {
        this.head = head;
        this.description = description;
    }

    public String getHead() {
        return head;
    }

    public String getDescription() {
        return description;
    }
}
