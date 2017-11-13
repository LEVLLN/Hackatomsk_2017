package com.lk;

import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

class Multiplier {

    private static final int RANDOM_MAX_NUMBER = 1000;
    private Random random = new Random();

    int calc(int x) throws ExecutionException, InterruptedException {

        CompletableFuture<Integer> async = CompletableFuture
                .supplyAsync(() -> {
                            try {
                                Thread.sleep(getRandomTime());
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            return 0;
                        }
                )
                .thenApply(res -> 2 * x);


        return async.get();
    }

    private int getRandomTime() {

        return random.nextInt(RANDOM_MAX_NUMBER);

    }

}
