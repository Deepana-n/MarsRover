import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsRoverTest {

    @Test
    public void checkPositionWhenInstructionIsEmpty(){
        MarsRover marsRoverObject =  new MarsRover(1, 2, "N");
        String instruction = "";
        assertEquals("1 2 N",marsRoverObject.roverInstruction(instruction));
    }

    @Test
    public void checkPositionWhenInstructionIsMRoverFaceN(){
        MarsRover marsRoverObject =  new MarsRover(1, 2, "N");
        String instruction = "M";
        assertEquals("1 3 N",marsRoverObject.roverInstruction(instruction));
    }

    @Test
    public void checkPositionWhenInstructionIsMMRoverFaceN(){
        MarsRover marsRoverObject =  new MarsRover(1, 2, "N");
        String instruction = "MM";
        assertEquals("1 4 N",marsRoverObject.roverInstruction(instruction));
    }

    @Test
    public void checkPositionWhenInstructionIsMRoverFaceS(){
        MarsRover marsRoverObject =  new MarsRover(1, 2, "S");
        String instruction = "M";
        assertEquals("1 1 S",marsRoverObject.roverInstruction(instruction));
    }


}
