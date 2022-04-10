public class MarsRover {
    private Position position;

    public MarsRover(Position position){
        this.position = position;
    }

    public String roverInstruction(String instruction) {
        String originalPosition = position.getX() + " " + position.getY() + " " + position.getDirectionRoverFacing();
        String finalPosition = "";
        String[] instructionArr = instruction.split("");
        for(String singleInstruction : instructionArr){
           if(singleInstruction.equals("M")){
               if(position.getDirectionRoverFacing().equals("N")){
                   position.setY(position.getY()+1);
                   finalPosition = position.getX() + " " + position.getY() + " " + position.getDirectionRoverFacing();
               }else if(position.getDirectionRoverFacing().equals("S")) {
                   position.setY(position.getY() - 1);
                   finalPosition = position.getX() + " " + position.getY() + " " + position.getDirectionRoverFacing();
               }
           }
        }
        return instruction.equals("") ? originalPosition : finalPosition;
    }
}
