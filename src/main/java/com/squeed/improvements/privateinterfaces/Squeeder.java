package com.squeed.improvements.privateinterfaces;

public class Squeeder {

    public boolean isMad() {
        return false;
    }

    public String getName() {
        return "Ola";
    }

    public void printMood() {
        if (isMad()) {
            flipTable();
        } else {
            beHappy();
        }
    }

    private void flipTable() {
        System.out.println("╯°□°）╯︵ ┻━┻");
    }

    private void beHappy() {
        System.out.println("ʘ‿ʘ");
    }

}
