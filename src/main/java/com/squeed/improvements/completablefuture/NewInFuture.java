package com.squeed.improvements.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class NewInFuture {

    public CompletableFuture<String> future(int sleep, int timeout) {
        return CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Success";
        }).completeOnTimeout("TimedOut :( ", timeout, TimeUnit.MILLISECONDS);
    }
}
