package task26.task01;

import java.util.ArrayList;

public class Okul {

   private String okulAd;
    private int maxOgrenciSayisi;

    private ArrayList<Ogrenci> ogrenciList;


    public Okul(String okulAd, int maxOgrenciSayisi) {
        this.okulAd = okulAd;
        this.maxOgrenciSayisi = maxOgrenciSayisi;
        this.ogrenciList = new ArrayList<>();
    }

    public int getMaxOgrenciSayisi() {
        return maxOgrenciSayisi;
    }

    public ArrayList<Ogrenci> getOgrenciList() {
        return ogrenciList;
    }
}