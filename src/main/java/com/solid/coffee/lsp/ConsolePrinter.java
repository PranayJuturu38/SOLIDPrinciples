package com.solid.coffee.lsp;

public class ConsolePrinter implements Printer {
    @Override
    public void printValue(String value) {
        System.out.println(value);
    }
}
