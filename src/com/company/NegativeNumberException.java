package com.company;

public class NegativeNumberException extends RuntimeException {
    NegativeNumberException() {
        super("Negative numbers not allowed");
    }
}
