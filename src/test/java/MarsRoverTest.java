import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsRoverTest {

    @Test
    public void checkPositionWhenInstructionIsEmpty(){
        Position position = new Position(1, 2, "N");
        MarsRover marsRoverObject =  new MarsRover(position);
        String instruction = "";
        assertEquals("1 2 N",marsRoverObject.roverInstruction(instruction));
    }

    @Test
    public void checkPositionWhenInstructionIsMRoverFaceN(){
        Position position = new Position(1, 2, "N");
        MarsRover marsRoverObject =  new MarsRover(position);
        String instruction = "M";
        assertEquals("1 3 N",marsRoverObject.roverInstruction(instruction));
    }

    @Test
    public void checkPositionWhenInstructionIsMMRoverFaceN(){
        Position position = new Position(1, 2, "N");
        MarsRover marsRoverObject =  new MarsRover(position);
        String instruction = "MM";
        assertEquals("1 4 N",marsRoverObject.roverInstruction(instruction));
    }

    @Test
    public void checkPositionWhenInstructionIsMRoverFaceS(){
        Position position = new Position(1, 2, "S");
        MarsRover marsRoverObject =  new MarsRover(position);
        String instruction = "M";
        assertEquals("1 1 S",marsRoverObject.roverInstruction(instruction));
    }


}
