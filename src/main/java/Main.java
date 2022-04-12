import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter size of Plateau");
        Scanner sc = new Scanner(System.in);
        String plateauSize = sc.nextLine();
        Plateau plateau = new Plateau(Integer.parseInt(String.valueOf(plateauSize.charAt(0))),Integer.parseInt(String.valueOf(plateauSize.charAt(1))));
        System.out.println("Please enter original coordinates of Rover 1");
        String originalCoordinates = sc.nextLine();
        originalCoordinates = originalCoordinates.replaceAll("\\s+","");
        int x = Integer.parseInt(String.valueOf(originalCoordinates.charAt(0)));
        int y = Integer.parseInt(String.valueOf(originalCoordinates.charAt(1)));
        String direction = String.valueOf(originalCoordinates.charAt(2));
        System.out.println("Please enter instructions for Rover");
        String instructions = sc.nextLine();
        MarsRover rover1 = new MarsRover(plateau,new Position(x,y,direction));

        System.out.println("Please enter original coordinates of Rover 2");
        String originalCoordinates2 = sc.nextLine();
        originalCoordinates2 = originalCoordinates2.replaceAll("\\s+","");
        int x2 = Integer.parseInt(String.valueOf(originalCoordinates2.charAt(0)));
        int y2 = Integer.parseInt(String.valueOf(originalCoordinates2.charAt(1)));
        String direction2 = String.valueOf(originalCoordinates2.charAt(2));
        System.out.println("Please enter instructions for Rover 2");
        String instructions2 = sc.nextLine();
        MarsRover rover2 = new MarsRover(plateau,new Position(x2,y2,direction2));
        String rover1FinalPosition = rover1.moveRover(instructions);
        String rover2FinalPosition = rover2.moveRover(instructions2);
        System.out.println("Your rover1 is at position---->" + rover1FinalPosition);
        System.out.println("Your rover2 is at position---->" + rover2FinalPosition);
        setJFrame(plateau,rover1FinalPosition,rover2FinalPosition);

    }

    private static void setJFrame(Plateau plateau, String rover1FinalPosition, String rover2FinalPosition){
        JFrame frame = new JFrame("MarsRover");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new Board(plateau,rover1FinalPosition,rover2FinalPosition));
        frame.pack();
        frame.setSize(800,800);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        JPanel panel = (JPanel) frame.getContentPane();
        panel.setLayout(null);
    }
}
