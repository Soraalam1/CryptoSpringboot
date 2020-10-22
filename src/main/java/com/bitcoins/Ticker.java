package com.bitcoins;

public class Ticker {
    private Double ask;
    private Double bid;

    public Ticker() {
    }

    public Double getAsk() {
        return ask;
    }

    public void setAsk(Double ask) {
        this.ask = ask;
    }

    public Double getBid() {
        return bid;
    }

    public void setBid(Double bid) {
        this.bid = bid;
    }

    @Override
    public String toString() {
        return "Ticker{" +
                "ask=" + ask +
                ", bid=" + bid +
                '}';
    }
}
