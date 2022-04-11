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
                         position.setDirectionRoverFacing("E");
                     }
                     case "L" -> {
                         position.setDirectionRoverFacing("W");
                     }
                 }
             }else if(position.getDirectionRoverFacing().equals("S")){
                 switch (singleInstruction) {
                     case "M" -> position.setY(position.getY() - 1);
                     case "R" -> {
                         position.setDirectionRoverFacing("W");
                     }
                     case "L" -> {
                         position.setDirectionRoverFacing("E");
                     }
                 }
             }else if(position.getDirectionRoverFacing().equals("E")){
                 switch (singleInstruction) {
                     case "M" -> position.setX(position.getX() + 1);
                     case "R" -> {
                         position.setDirectionRoverFacing("S");
                     }
                     case "L" -> {
                         position.setDirectionRoverFacing("N");
                     }
                 }
             }else if(position.getDirectionRoverFacing().equals("W")){
                 switch (singleInstruction) {
                     case "M" -> position.setX(position.getX() - 1);
                     case "R" -> {
                         position.setDirectionRoverFacing("N");
                     }
                     case "L" -> {
                         position.setDirectionRoverFacing("S");
                     }
                 }
             }
         }
         return position.getX() + " " + position.getY() + " " + position.getDirectionRoverFacing();
     }
}
