public class MarsRover {
    private final Position position;
    Direction direction;

    public MarsRover(Position position){
        this.position = position;
    }
     public String moveRover(String instruction){
         String[] instructionArr = instruction.split("");
         for(String singleInstruction : instructionArr) {
             direction = Direction.valueOf(position.getDirectionRoverFacing());
             switch (singleInstruction) {
                 case "R":
                     position.setDirectionRoverFacing(String.valueOf(direction.right()));
                     break;
                 case "L":
                     position.setDirectionRoverFacing(String.valueOf(direction.left()));
                     break;
                 case "M":
                     if (position.getDirectionRoverFacing().equals("N") || position.getDirectionRoverFacing().equals("S")) {
                         position.setY(position.getY() + direction.offset());
                     } else {
                         position.setX(position.getX() + direction.offset());
                     }
                     break;
             }
         }
         return position.getX() + " " + position.getY() + " " + position.getDirectionRoverFacing();
     }
}
