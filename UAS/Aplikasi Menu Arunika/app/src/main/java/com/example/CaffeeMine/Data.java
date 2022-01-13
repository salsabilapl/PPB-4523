package com.example.CaffeeMine;

public class Data {
    private String no;
    private String pesanan;
    private String key;

    public String toPrint() {
        return this.no +" "+ pesanan;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getPesanan() {
        return pesanan;
    }

    public void setPesanan(String pesanan) {
        this.pesanan = pesanan;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
