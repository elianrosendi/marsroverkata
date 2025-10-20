package org.example.rover;

public class Rover {
    private int startingPointX;
    private int startingPointY;
    private Direction facingDirection;

    public Rover(int startingPointX, int startingPointY, Direction facingDirection) {
        this.startingPointX = startingPointX;
        this.startingPointY = startingPointY;
        this.facingDirection = facingDirection;
    }

    public Coordinates getStartingPoint() {
        return new Coordinates(startingPointX, startingPointY);
    }

    public Direction getFacingDirection() {
        return this.facingDirection;
    }

    public void passCommands(char[] commands) {

        for (int command : commands) {
            if (command == 'f')
            {
                switch (facingDirection) {
                    case N -> this.startingPointY++;
                    case S -> this.startingPointY--;
                    case E -> this.startingPointX++;
                    case W -> this.startingPointX--;
                }
            }
            if (command == 'b')
            {
                switch (facingDirection) {
                    case N -> this.startingPointY--;
                    case S -> this.startingPointY++;
                    case E -> this.startingPointX--;
                    case W -> this.startingPointX++;
                }
            }
            if (command == 'l') {
                switch (facingDirection) {
                    case N -> this.facingDirection = Direction.W;
                    case S -> this.facingDirection = Direction.E;
                    case E -> this.facingDirection = Direction.N;
                    case W -> this.facingDirection = Direction.S;
                }
            }
            if (command == 'r') {
                switch (facingDirection) {
                    case N -> this.facingDirection = Direction.E;
                    case S -> this.facingDirection = Direction.W;
                    case E -> this.facingDirection = Direction.S;
                    case W -> this.facingDirection = Direction.N;
                }
            }
        }

    }
}
