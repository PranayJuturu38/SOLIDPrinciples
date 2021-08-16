package com.solid.coffee.isp;

public class ConsolePrinter implements Printer {
    @Override
    public void printValue(String value) {
        System.out.println(value);
    }
}
