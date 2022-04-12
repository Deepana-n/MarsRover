import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsRoverTest {

    @Test
    public void checkPositionWhenInstructionIsEmpty(){
        Position position = new Position(1, 2, "N");
        MarsRover marsRoverObject =  new MarsRover(new Plateau(5,5),position);
        String instruction = "";
        assertEquals("1 2 N",marsRoverObject.moveRover(instruction));
    }

    @Test
    public void checkPositionWhenInstructionIsMMRoverFaceN(){
        Position position = new Position(1, 2, "N");
        MarsRover marsRoverObject =  new MarsRover(new Plateau(5,5),position);
        String instruction = "MM";
        assertEquals("1 4 N",marsRoverObject.moveRover(instruction));
    }

    @Test
    public void checkPositionWhenInstructionIsMRoverFaceS(){
        Position position = new Position(1, 2, "S");
        MarsRover marsRoverObject =  new MarsRover(new Plateau(5,5),position);
        String instruction = "M";
        assertEquals("1 1 S",marsRoverObject.moveRover(instruction));
    }

    @Test
    public void checkPositionWhenInstructionIsMRoverFaceSS(){
        Position position = new Position(1, 2, "S");
        MarsRover marsRoverObject =  new MarsRover(new Plateau(5,5),position);
        String instruction = "MM";
        assertEquals("1 0 S",marsRoverObject.moveRover(instruction));
    }

    @Test
    public void checkPositionWhenInstructionIsLRoverFaceN(){
        Position position = new Position(1, 2, "N");
        MarsRover marsRoverObject =  new MarsRover(new Plateau(5,5),position);
        String instruction = "L";
        assertEquals("1 2 W",marsRoverObject.moveRover(instruction));
    }

    @Test
    public void checkPositionWhenInstructionIsRMRoverFaceN(){
        Position position = new Position(0, 0, "N");
        MarsRover marsRoverObject =  new MarsRover(new Plateau(5,5),position);
        String instruction = "RM";
        assertEquals("1 0 E",marsRoverObject.moveRover(instruction));
    }

    @Test
    public void checkPositionWhenInstructionIsRRRRoverFaceN(){
        Position position = new Position(0, 0, "N");
        MarsRover marsRoverObject =  new MarsRover(new Plateau(5,5),position);
        String instruction = "RRR";
        assertEquals("0 0 W",marsRoverObject.moveRover(instruction));
    }

    @Test
    public void checkPositionWhenInstructionIsLMLMLMLMMRoverFaceN(){
        Position position = new Position(1, 2, "N");
        MarsRover marsRoverObject =  new MarsRover(new Plateau(5,5),position);
        String instruction = "LMLMLMLMM";
        assertEquals("1 3 N",marsRoverObject.moveRover(instruction));
    }

    @Test
    public void checkPositionWhenInstructionIsMMRMMRMRRMRoverFaceE(){
        Position position = new Position(3, 3, "E");
        MarsRover marsRoverObject =  new MarsRover(new Plateau(5,5),position);
        String instruction = "MMRMMRMRRM";
        assertEquals("5 1 E",marsRoverObject.moveRover(instruction));
    }

    @Test
    public void checkPositionWhenExceedBoundary(){
        Position position = new Position(5, 5, "E");
        MarsRover marsRoverObject =  new MarsRover(new Plateau(5,5),position);
        String instruction = "MMRMMRMRRM";
        assertEquals("Exceed Boundary",marsRoverObject.moveRover(instruction));
    }

    @Test
    public void checkPositionWhenExceedBoundary2(){
        Position position = new Position(0, 0, "S");
        MarsRover marsRoverObject =  new MarsRover(new Plateau(5,5),position);
        String instruction = "MMMM";
        assertEquals("Exceed Boundary",marsRoverObject.moveRover(instruction));
    }


}
