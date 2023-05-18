package com.example;

import java.util.ArrayList;
import java.util.List;

public class RoverField {

    List<Rover> roverList = new ArrayList<>();
    private final int width;
    private final int height;

    public RoverField(Point point) {
        this.width = point.getX();
        this.height = point.getY();
    }

    public void placeRover(Rover rover) {
        if (checkBusy(rover, rover.getPoint())) {
            throw new IllegalStateException("Point is busy");
        }

        roverList.add(rover);
    }

    public boolean checkBusy(Rover activeRover, Point point) {
        if (point.getX() >= width || point.getY() >= height) {
            return true;
        }

        for (Rover rover : roverList) {
            if(rover!=activeRover && rover.getPoint().equals(point)) {
                return true;
            }
        }
        return false;
    }
}
