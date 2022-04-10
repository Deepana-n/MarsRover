public class MarsRover {

    private final int x;
    private final int y;
    private final String directionRoverFacing;

    public MarsRover(int x, int y, String directionRoverFacing) {
        this.x = x;
        this.y = y;
        this.directionRoverFacing = directionRoverFacing;
    }


    public String roverInstruction(String instruction) {
        String originalPosition = String.valueOf(x) + " " + String.valueOf(y) + " " + directionRoverFacing;
        String finalPosition = "";
        for(char letter : instruction.toCharArray()){
           if(letter == 'M') finalPosition = String.valueOf(x) + " " + String.valueOf(y+1) + " " + "N";
        }
        return instruction.equals("") ? originalPosition : finalPosition;
    }
}
