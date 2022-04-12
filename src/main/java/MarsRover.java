import java.util.ArrayList;
import java.util.List;

public class MarsRover {
    private Position position;
    private final Plateau plateau;
    private static List<String> obstacles = new ArrayList<>();
    Direction direction;

    public MarsRover(Plateau plateau, Position position){
        this.position = position;
        this.plateau = plateau;
    }
     public String moveRover(String instruction){
         String[] instructionArr = instruction.split("");
         String finalPosition = "";
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
                     }else if(position.getDirectionRoverFacing().equals("W") || position.getDirectionRoverFacing().equals("E")){
                         position.setX(position.getX() + direction.offset());
                     }
                     break;
             }
         }
         if(validPosition(position.getX(),position.getY())){
             if(noObstacles(position.getX(),position.getY(),position.getDirectionRoverFacing())){
                 finalPosition =  position.getX() + " " + position.getY() + " " + position.getDirectionRoverFacing();
             }else{
                 finalPosition =  "Obstacles";
             }
         }else{
             finalPosition = "Exceed Boundary";
         }

         return finalPosition;
     }

     public boolean validPosition(int x, int y){
        return x <= plateau.getUpperBoundX() && x >= plateau.getLowerBoundX() && y <= plateau.getUpperBoundY() && y >= plateau.getLowerBoundY();
     }

     public boolean noObstacles(int x, int y, String direction){
        String finalPosition = x + " " + y + " " + direction;
        boolean flag = false;
            if(!obstacles.contains(finalPosition)) {
                obstacles.add(finalPosition);
                flag = true;
            }
        return flag;
     }
}
