package com.solid.coffee.srp;

public class ConsolePrinter implements Printer {
    @Override
    public void printValue(String value) {
        System.out.println(value);
    }
}