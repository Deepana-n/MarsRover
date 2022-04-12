public class Plateau {
    private int upperBoundX;
    private int upperBoundY;

    public Plateau(int upperBoundX, int upperBoundY) {
        this.upperBoundX = upperBoundX;
        this.upperBoundY = upperBoundY;
    }

    public int getUpperBoundX() {
        return upperBoundX;
    }

    public void setUpperBoundX(int upperBoundX) {
        this.upperBoundX = upperBoundX;
    }

    public int getUpperBoundY() {
        return upperBoundY;
    }

    public void setUpperBoundY(int upperBoundY) {
        this.upperBoundY = upperBoundY;
    }

    public int getLowerBoundX() {
        return 0;
    }

    public int getLowerBoundY() {
        return 0;
    }

}
