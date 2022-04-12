import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter size of Plateau");
        Scanner sc = new Scanner(System.in);
        String plateauSize = sc.nextLine();
        plateauSize = plateauSize.replaceAll("\\s+","");
        Plateau plateau = new Plateau(Integer.parseInt(String.valueOf(plateauSize.charAt(0))),Integer.parseInt(String.valueOf(plateauSize.charAt(1))));
        String rover1FinalPosition = roverFinalPosition(sc, plateau);
        String rover2FinalPosition = roverFinalPosition(sc, plateau);
        System.out.println("Your rover1's final position ----> " + rover1FinalPosition);
        System.out.println("Your rover2's final position ---->" + rover2FinalPosition);
        setJFrame(plateau,rover1FinalPosition,rover2FinalPosition);
    }

    private static String roverFinalPosition(Scanner sc, Plateau plateau){
        System.out.println("Please enter starting coordinates of Rover");
        String originalCoordinates = sc.nextLine();
        originalCoordinates = originalCoordinates.replaceAll("\\s+","");
        int x = Integer.parseInt(String.valueOf(originalCoordinates.charAt(0)));
        int y = Integer.parseInt(String.valueOf(originalCoordinates.charAt(1)));
        String direction = String.valueOf(originalCoordinates.charAt(2));
        System.out.println("Please enter instructions to move Rover");
        String instructions = sc.nextLine();
        MarsRover rover = new MarsRover(plateau,new Position(x,y,direction));
        return rover.moveRover(instructions);
    }

    private static void setJFrame(Plateau plateau, String rover1FinalPosition, String rover2FinalPosition){
        JFrame frame = new JFrame("MarsRover");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new Grid(plateau,rover1FinalPosition,rover2FinalPosition));
        frame.setSize(1000, 1000);
        frame.setVisible(true);
    }
}
