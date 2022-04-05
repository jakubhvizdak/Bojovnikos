package com.company;

import java.util.Random;

public class Kocka {
    private Random random;
    private int pocetSten;

    public Kocka(int pocetSten) {
        pocetSten = 25;
        random = new Random();
    }

    public Kocka() {
        pocetSten = 25;
        random = new Random();
    }


    public int vratPocetStien(){
        return pocetSten;
    }
    public int hod(){
        return random.nextInt(pocetSten) +1;

    }

}