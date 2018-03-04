package com.example.lokesh.bittrexcryptoexchange;

/**
 * Created by lokesh on 3/3/18.
 */

public class Listitem {
    private String CoinName;
    private String price;
    private String change;

    public Listitem(String CoinName, String price,String change) {
        this.CoinName = CoinName;
        this.price = price;
        this.change = change;
    }

    public String getCoinName() {
        return CoinName;
    }

    public String getChange() {
        return change;
    }
    public String getPrice() {
        return price;
    }
}
