package com.squeed;

import com.squeed.improvements.completablefuture.NewInFuture;

public class App
{
    public static void main( String[] args ) throws InterruptedException {
        new NewInFuture().future(2000, 1000).thenAccept(System.out::println);
        new NewInFuture().future(1000, 2000).thenAccept(System.out::println);

        new NewInFuture().future(1000, 2000);

        Thread.sleep(20000);
    }
}
