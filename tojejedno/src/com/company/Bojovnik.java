package com.company;

public class Bojovnik {

    private String meno;
    private int zivot;
    private int maxZivot;
    private int utok;
    private int obrana;
    private Kocka Kocka;

    public Bojovnik(String meno, int zivot, int utok, int obrana, Kocka kocka) {
        this.meno = meno;
        this.zivot = zivot/2;
        this.maxZivot = zivot;
        this.utok = utok;
        this.obrana = obrana;
        this.Kocka = Kocka;


    }

    @Override
    public String toString() {
        return meno;
    }

    public boolean nazive() {
        return (zivot > 0);
    }

    public String grafickyZivot() {
        String s = "[";
        int celkom = 20;
        double pocet = Math.round((double) zivot / maxZivot * celkom);

        if (pocet == 0 && nazive()) {
            pocet = 1;
        }

        for (int i = 0; i < pocet; i++) {
            s += "#";
        }




        for (int i = 0; i < celkom - pocet; i++) {
            s += "  ";
        }
        s += "]";
        return s;
    }
}

