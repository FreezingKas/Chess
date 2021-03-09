public class Queen extends Piece {


    public Queen(String color) {
        super(color);
    }

    @Override
    public int[][] possibleMove() {
        return new int[0][2];
    }

    @Override
    public String toString() {
        return "Q";
    }
}
