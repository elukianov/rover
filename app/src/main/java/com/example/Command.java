package com.example;

public enum Command {
    L,
    M,
    R;

    static Command parse(String str) {
        try {
            return Command.valueOf(str.toUpperCase());
        } catch (Exception e) {
            throw new IllegalArgumentException("Unknown command: " + str);
        }
    }
}
