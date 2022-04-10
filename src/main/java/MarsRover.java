public class MarsRover {

    private int x;
    private int y;
    private String directionRoverFacing;

    public MarsRover(int x, int y, String directionRoverFacing) {
        this.x = x;
        this.y = y;
        this.directionRoverFacing = directionRoverFacing;
    }


    public String roverInstruction(String instruction) {
        String originalPosition = String.valueOf(x) + " " + String.valueOf(y) + " " + directionRoverFacing;
        String finalPosition = "";
        return instruction.equals("") ? originalPosition : finalPosition;
    }
}
