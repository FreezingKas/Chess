public class Rook extends Piece {
    public Rook(String color) {
        super(color);
    }

    @Override
    public int[][] possibleMove() {
        return new int[0][];
    }

    @Override
    public String toString() {
        return "R";
    }
}
