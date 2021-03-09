public class Bishop extends Piece {
    public Bishop(String color) {
        super(color);
    }

    @Override
    public int[][] possibleMove() {
        return new int[0][];
    }

    @Override
    public String toString() {
        return "B";
    }
}
