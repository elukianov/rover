package com.example;

public enum Direction {


    N("W", "E"),
    S("E", "W"),
    W("S", "N"),
    E("N", "S");

    private String  left;
    private String right;

    Direction(String left, String right) {
        this.left = left;
        this.right = right;
    }

    public static Direction parse(String str) {
        try {
            return Direction.valueOf(str.toUpperCase());
        } catch (Exception e) {
            throw new IllegalArgumentException("Unknown direction: " + str);
        }

    }

    public Direction turnLeft() {
        return valueOf(this.left);
    }

    public Direction turnRight() {
       return valueOf(this.right);
    }
}
