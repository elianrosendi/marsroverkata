import org.example.rover.Coordinates;
import org.example.rover.Direction;
import org.example.rover.Rover;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MarsRoverTest {

    Rover rover;

    @BeforeEach
    void setUp() {
        int x = 1;
        int y = 1;

        Direction direction = Direction.N;

        this.rover = new Rover(x, y, direction);
    }

    @Test
    void testCreateRover(){
        Coordinates startingPoint = rover.getStartingPoint();
        Assertions.assertEquals(new Coordinates(1, 1),startingPoint);
        Assertions.assertEquals(Direction.N, rover.getFacingDirection());
    }

    @Test
    void testCommandRoverMoveForward(){
        char[] commands = {'f'};

        rover.passCommands(commands);

        Coordinates coordinates = new Coordinates(1, 2);

        Assertions.assertEquals(coordinates, rover.getStartingPoint());
    }

    @Test
    void testCommandRoverMoveBackwards(){
        char[] commands = {'b'};

        rover.passCommands(commands);

        Coordinates coordinates = new Coordinates(1, 0);

        Assertions.assertEquals(coordinates, rover.getStartingPoint());
    }

    @Test
    void testCommandRoverTurnLeft(){
        char[] commands = {'l', 'l'};

        rover.passCommands(commands);

        Assertions.assertEquals(Direction.S, rover.getFacingDirection());
    }

    @Test
    void testCommandRoverTurnRight(){
        char[] commands = {'r', 'r'};

        rover.passCommands(commands);

        Assertions.assertEquals(Direction.S, rover.getFacingDirection());
    }


    @Test
    void testCommandRoverMoveAround(){
        char[] commands = {'r', 'f', 'f', 'l', 'f','f','f'};

        rover.passCommands(commands);

        Coordinates coordinates = new Coordinates(3, 4);

        Assertions.assertEquals(coordinates, rover.getStartingPoint());

        Assertions.assertEquals(Direction.N, rover.getFacingDirection());
    }


}
