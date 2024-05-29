package com.aksys;

public class App {
    public String helloWorld() {
        return "Hello world!!!";
    }

    public static void main(String[] args) {
        System.out.println(new App().helloWorld());
    }
}
