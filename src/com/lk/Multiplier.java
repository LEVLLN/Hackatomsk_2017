package com.lk;

import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

class Multiplier {
    private static final int RANDOM_MAX_NUMBER = 1000;

    int calc(int x) throws ExecutionException, InterruptedException {

        CompletableFuture<Integer> async = CompletableFuture
                .supplyAsync(() -> {
                            try {
                                Thread.sleep(randomTime());
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            return 0;
                        }
                )
                .thenApply(res -> 2 * x);


        return async.get();
    }

    private int randomTime() {

        Random random = new Random();

        return random.nextInt(RANDOM_MAX_NUMBER);

    }

}
