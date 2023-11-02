package com.example.ArrayList;

public class Cauthu {
    private String ten;
    private String mota;
    private int hinh;
    private int quocgia;


    public Cauthu(String ten, String mota, int hinh, int quocgia) {
        this.ten = ten;
        this.mota = mota;
        this.quocgia = quocgia;
        this.hinh = hinh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }

    public int getQuocgia() {
        return quocgia;
    }

    public void setQuocgia(int quocgia) {
        this.quocgia = quocgia;
    }
}
