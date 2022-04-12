import javax.swing.*;
import java.awt.*;

public class Board extends JPanel {
    private final Plateau plateau;
    private String rover1;
    private String rover2;

    public Board(Plateau plateau,String rover1, String rover2){
        this.plateau = plateau;
        this.rover1 = rover1;
        this.rover2 = rover2;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();
        int lengthUnit = (800 / plateau.getUpperBoundX());
        for (int row = 0; row <= plateau.getUpperBoundX(); row++) {
            g2d.drawLine(row*(800/plateau.getUpperBoundX()), 0, row*(800/plateau.getUpperBoundX()), 800);
            for (int col = 0; col <= plateau.getUpperBoundX(); col++) {
                g2d.drawLine(0,(col*(800/plateau.getUpperBoundX())), 800, (col*(800/plateau.getUpperBoundX())));
            }

        }
        Font font = new Font("Verdana", Font.BOLD, 12);
        g2d.setFont(font);
        displayRover1(g2d,lengthUnit);
        displayRover2(g2d,lengthUnit);


    }

    private void displayRover1(Graphics2D g2d, int lengthUnit) {
        rover1 = rover1.replaceAll("\\s+", "");
        int row = Integer.parseInt(String.valueOf(rover1.charAt(0)));
        int col = Integer.parseInt(String.valueOf(rover1.charAt(1)));
        String direction = String.valueOf(rover1.charAt(2));
        if (row == Integer.parseInt(String.valueOf(rover1.charAt(0))) && col == Integer.parseInt(String.valueOf(rover1.charAt(1)))) {
            g2d.setColor(Color.MAGENTA);
            g2d.drawOval((row) * lengthUnit, (5 - col) * lengthUnit, lengthUnit, lengthUnit);
            switch (direction) {
                case "N" -> g2d.drawString("ROVER1:"+row + "," + col+ " N⬆", row * lengthUnit + 40, (5 - col) * lengthUnit +80);
                case "S" -> g2d.drawString("ROVER1:"+row + "," + col+ " S⬇", row * lengthUnit + 40, (5 - col) * lengthUnit +80);
                case "W" -> g2d.drawString("ROVER1:"+row + "," + col+ " W⬅", row * lengthUnit + 40, (5 - col) * lengthUnit +80);
                case "E" -> g2d.drawString("ROVER1:"+row + "," + col+ " E⮕", row * lengthUnit + 40, (5 - col) * lengthUnit +80);
            }
        }
    }


        private void displayRover2(Graphics2D g2d, int lengthUnit){
            int row2 =0; int col2 =0;
            if (!rover2.matches("Rover cannot be moved! Obstacle at final position(.*)")) {
                rover2 = rover2.replaceAll("\\s+", "");
                row2 = Integer.parseInt(String.valueOf(rover2.charAt(0)));
                col2 = Integer.parseInt(String.valueOf(rover2.charAt(1)));
                g2d.setColor(Color.ORANGE);
                g2d.drawOval((row2) * lengthUnit, (5 - col2) * lengthUnit, lengthUnit, lengthUnit);
                String direction2 = String.valueOf(rover2.charAt(2));
                switch (direction2) {
                    case "N" -> g2d.drawString("ROVER2:"+row2 + "," + col2+ " N⬆", row2 * lengthUnit + 40, (5 - col2) * lengthUnit +80);
                    case "S" -> g2d.drawString("ROVER2:"+row2 + "," + col2+ " S⬇", row2 * lengthUnit + 40, (5 - col2) * lengthUnit +80);
                    case "W" -> g2d.drawString("ROVER2:"+row2 + "," + col2+ " W⬅", row2 * lengthUnit + 40, (5 - col2) * lengthUnit +80);
                    case "E" -> g2d.drawString("ROVER2:"+row2 + "," + col2+ " E⮕", row2 * lengthUnit + 40, (5 - col2) * lengthUnit +80);
                }
            }else {
                Font font2 = new Font("Verdana", Font.BOLD, 18);
                g2d.setFont(font2);
                g2d.setColor(Color.red);
                g2d.drawString("╳╳╳ROVER 2 CANNOT MOVE AS ROVER 1 IS OCCUPYING THE POSITION╳╳╳", 0, lengthUnit);
            }
        }

}
