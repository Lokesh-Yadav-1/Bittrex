package com.example.lokesh.bittrexcryptoexchange;

/**
 * Created by lokesh on 3/3/18.
 */

public class Listitem {
    private String head;
    private String description;

    public Listitem(String head, String description) {
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
