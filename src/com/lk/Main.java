package com.lk;

import java.util.concurrent.ExecutionException;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Multiplier multiplier = new Multiplier();

        for (int i = 0; i < 10; i++) {
            System.out.println(multiplier.calc(i));
        }
    }

}
