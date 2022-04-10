public class Position {

    private int x;
    private int y;
    private String directionRoverFacing;

    public Position(int x, int y, String directionRoverFacing) {
        this.x = x;
        this.y = y;
        this.directionRoverFacing = directionRoverFacing;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getDirectionRoverFacing() {
        return directionRoverFacing;
    }

    public void setDirectionRoverFacing(String directionRoverFacing) {
        this.directionRoverFacing = directionRoverFacing;
    }

}
