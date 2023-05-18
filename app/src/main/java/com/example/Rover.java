package com.example;

public class Rover {

    private Point point;
    private Direction direction;

    public Rover(Point point, Direction direction) {
        this.point = point;
        this.direction = direction;
    }

    public Point getPoint() {
        return point;
    }

    public Direction getDirection() {
        return direction;
    }

    public void command(Command command, RoverField roverField) {
        switch (command) {
            case L:
                direction = direction.turnLeft();
                break;
            case R:
                direction = direction.turnRight();
                break;
            case M:
                Point nextPoint = point.move(direction);
                if(!roverField.checkBusy(this, nextPoint)) {
                    this.point = nextPoint;
                }
                break;

            default:
                throw new IllegalArgumentException();
        }
    }
}
