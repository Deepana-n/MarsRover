public class MarsRover {
    private Position position;

    public MarsRover(Position position){
        this.position = position;
    }

     public String moveRover(String instruction){
         String[] instructionArr = instruction.split("");
         for(String singleInstruction : instructionArr){
             if(position.getDirectionRoverFacing().equals("N")){
                 switch (singleInstruction) {
                     case "M" -> position.setY(position.getY() + 1);
                     case "R" -> {
                         position.setX(position.getX() + 1);
                         position.setDirectionRoverFacing("E");
                     }
                     case "L" -> {
                         position.setX(position.getX() - 1);
                         position.setDirectionRoverFacing("W");
                     }
                 }
             }else if(position.getDirectionRoverFacing().equals("S")){
                 switch (singleInstruction) {
                     case "M" -> position.setY(position.getY() - 1);
                     case "R" -> {
                         position.setX(position.getX() - 1);
                         position.setDirectionRoverFacing("W");
                     }
                     case "L" -> {
                         position.setX(position.getX() + 1);
                         position.setDirectionRoverFacing("E");
                     }
                 }
             }
         }
         return position.getX() + " " + position.getY() + " " + position.getDirectionRoverFacing();
     }
}
