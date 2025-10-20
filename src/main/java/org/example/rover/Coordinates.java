package org.example.rover;

public class Coordinates {

    int startingPointX;
    int startingPointY;

    public Coordinates(int startingPointX, int startingPointY) {
        this.startingPointX = startingPointX;
        this.startingPointY = startingPointY;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null)
            return false;

        if (o instanceof Coordinates)
        {
            return (startingPointX == ((Coordinates) o).startingPointX) &&
                    startingPointY == ((Coordinates) o).startingPointY;
        }

        return false;
    }
}
