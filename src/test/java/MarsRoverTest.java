import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MarsRoverTest {
    private MarsRover marsRoverObject;

    @BeforeEach
    void setUp() {
        marsRoverObject = new MarsRover(1, 2, "N");
    }

    @Test
    public void checkPositionWhenInstructionIsEmpty(){
        String instruction = "";
        assertEquals("1 2 N",marsRoverObject.roverInstruction(instruction));
    }

    @Test
    public void checkPositionWhenInstructionIsM(){
        String instruction = "M";
        assertEquals("1 3 N",marsRoverObject.roverInstruction(instruction));
    }

}
