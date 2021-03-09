public class Pawn extends Piece {
    public Pawn(String color) {
        super(color);
    }

    @Override
    public int[][] possibleMove() {
        return new int[0][];
    }

    @Override
    public String toString() {
        return "P";
    }
}
