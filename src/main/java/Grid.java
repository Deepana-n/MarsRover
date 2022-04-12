import javax.swing.*;
import java.awt.*;

public class Grid extends JPanel {
    private final Plateau plateau;
    private String rover1;
    private String rover2;
    private static final int OFFSET =160;

    public Grid(Plateau plateau, String rover1, String rover2){
        this.plateau = plateau;
        this.rover1 = rover1;
        this.rover2 = rover2;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();
        int lengthUnit = (500 / plateau.getUpperBoundX());
        for (int row = 0; row <= plateau.getUpperBoundX(); row++) {
            g2d.drawLine(row*(500/plateau.getUpperBoundX())+OFFSET, OFFSET, row*(500/plateau.getUpperBoundX())+OFFSET, 500+OFFSET);
            for (int col = 0; col <= plateau.getUpperBoundX(); col++) {
                g2d.drawLine(OFFSET,(col*(500/plateau.getUpperBoundX()))+OFFSET, 500+OFFSET, (col*(500/plateau.getUpperBoundX()))+OFFSET);
            }
        }
        Font font = new Font("Verdana", Font.BOLD, 12);
        g2d.setFont(font);
        displayRover1(g2d,lengthUnit);
        displayRover2(g2d,lengthUnit);
    }

    private void displayRover1(Graphics2D g2d, int lengthUnit) {
        int length =plateau.getUpperBoundY();
        rover1 = rover1.replaceAll("\\s+", "");
        int row = Integer.parseInt(String.valueOf(rover1.charAt(0)));
        int col = Integer.parseInt(String.valueOf(rover1.charAt(1)));
        String direction = String.valueOf(rover1.charAt(2));
        if (row == Integer.parseInt(String.valueOf(rover1.charAt(0))) && col == Integer.parseInt(String.valueOf(rover1.charAt(1)))) {
            g2d.setColor(Color.MAGENTA);
            switch (direction) {
                case "N" -> g2d.drawString("🚜ROVER1:"+row + "," + col+ " N⬆", row * lengthUnit + OFFSET -10, (length - col) * lengthUnit + OFFSET);
                case "S" -> g2d.drawString("🚜ROVER1:"+row + "," + col+ " S⬇", row * lengthUnit + OFFSET -10, (length - col) * lengthUnit + OFFSET);
                case "W" -> g2d.drawString("🚜ROVER1:"+row + "," + col+ " W⬅", row * lengthUnit + OFFSET -10, (length - col) * lengthUnit + OFFSET);
                case "E" -> g2d.drawString("🚜ROVER1:"+row + "," + col+ " E⮕", row * lengthUnit + OFFSET -10, (length - col) * lengthUnit + OFFSET);
            }
        }
    }

    private void displayRover2(Graphics2D g2d, int lengthUnit){
        int length =plateau.getUpperBoundY();
        int row2 =0; int col2 =0;
        if (!rover2.matches("Rover cannot be moved! Obstacle at final position(.*)")) {
            rover2 = rover2.replaceAll("\\s+", "");
            row2 = Integer.parseInt(String.valueOf(rover2.charAt(0)));
            col2 = Integer.parseInt(String.valueOf(rover2.charAt(1)));
            g2d.setColor(Color.ORANGE);
            String direction2 = String.valueOf(rover2.charAt(2));
                switch (direction2) {
                    case "N" -> g2d.drawString("🚋ROVER2:"+row2 + "," + col2+ " N⬆", row2 * lengthUnit + OFFSET, (length - col2) * lengthUnit + OFFSET);
                    case "S" -> g2d.drawString("🚋ROVER2:"+row2 + "," + col2+ " S⬇", row2 * lengthUnit + OFFSET, (length - col2) * lengthUnit + OFFSET);
                    case "W" -> g2d.drawString("🚋ROVER2:"+row2 + "," + col2+ " W⬅", row2 * lengthUnit + OFFSET, (length - col2) * lengthUnit + OFFSET);
                    case "E" -> g2d.drawString("🚋ROVER2:"+row2 + "," + col2+ " E⮕", row2 * lengthUnit + OFFSET, (length - col2) * lengthUnit + OFFSET);
                }
        }else{
            Font font2 = new Font("Verdana", Font.BOLD, 18);
            g2d.setFont(font2);
            g2d.setColor(Color.red);
            g2d.drawString("╳╳╳ROVER 2 CANNOT MOVE AS ROVER 1 IS OCCUPYING THE POSITION╳╳╳", OFFSET/2, lengthUnit);//Can be made dynamic
            }
        }
}
