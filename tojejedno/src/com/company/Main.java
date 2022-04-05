package com.company;

public class Main {
    public static void main(String[] args) {
        Kocka desatStennakocka = new Kocka(10);
        Bojovnik bojovnik = new Bojovnik("Lakatoš", 100, 20, 10, desatStennakocka);
        System.out.println(bojovnik);
        System.out.println("Naživu: " + bojovnik.nazive());
        System.out.println(bojovnik.grafickyZivot());

    }
}