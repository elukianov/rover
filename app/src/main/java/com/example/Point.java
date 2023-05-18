package com.example;

import java.util.Objects;

public class Point {
    private final int x;
    private final int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Point(int x, int y) {
        if (x < 0 || y < 0) {
            throw new IllegalArgumentException("X and Y must be > 0");
        }
        this.x = x;
        this.y = y;
    }

    public Point move(Direction direction) {
        try {
            switch (direction) {
                case E:
                    return new Point(x + 1, y);
                case W:
                    return new Point(x - 1, y);
                case N:
                    return new Point(x, y + 1);
                case S:
                    return new Point(x, y - 1);
                default:
                    throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            return this;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
