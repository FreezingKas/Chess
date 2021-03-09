public abstract class Piece {

    private final String color;

    public Piece(String color) {
        if(color.equals("black") || color.equals("white")) {
            this.color = color;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public abstract int[][] possibleMove();

    public abstract String toString();

    public String getColor() {
        return color;
    }
}
