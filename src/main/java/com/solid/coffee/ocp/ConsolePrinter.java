package com.solid.coffee.ocp;

public class ConsolePrinter implements Printer {
    @Override
    public void printValue(String value) {
        System.out.println(value);
    }
}
