package com.aksys;

public class App {
    public String greeting() {
        return "Hello world!!";
    }

    public static void main(String[] args) {
        System.out.println(new App().greeting());
    }
}
