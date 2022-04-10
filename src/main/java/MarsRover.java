public class MarsRover {

    private static int x;
    private static int y;
    private String directionRoverFacing;

    public MarsRover(int x, int y, String directionRoverFacing) {
        this.x = x;
        this.y = y;
        this.directionRoverFacing = directionRoverFacing;
    }


    public String roverInstruction(String instruction) {
        String originalPosition = String.valueOf(x) + " " + String.valueOf(y) + " " + directionRoverFacing;
        String finalPosition = "";
        String[] instructionArr = instruction.split("");
        for(String singleInstruction : instructionArr){
           if(singleInstruction.equals("M")){
               if(directionRoverFacing.equals("N")){
                   y+=1;
                   finalPosition = String.valueOf(x) + " " + String.valueOf(y) + " " + directionRoverFacing;
               }else if(directionRoverFacing.equals("S")){
                   y-=1;
                   finalPosition = String.valueOf(x) + " " + String.valueOf(y) + " " + directionRoverFacing;}
           }
        }
        return instruction.equals("") ? originalPosition : finalPosition;
    }
}
