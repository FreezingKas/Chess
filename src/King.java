public class King extends Piece {

    public King(String color) {
        super(color);
    }

    @Override
    public int[][] possibleMove() {
        return new int[0][];
    }

    @Override
    public String toString() {
        return "K";
    }
}
