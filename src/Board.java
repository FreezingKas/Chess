public class Board {

    /** Array à deux dimensions contenant toutes les pièces du jeu */
    private Piece[][] board;

    /** Constructeur initialisant tout le tableau */
    public Board() {
        board = new Piece[8][8];
    }

    /**  */
    public void setBeginGame() {
        for(int i = 0; i<8; i++) {
            this.setBoardPiece(1, i, new Pawn("white"));
            this.setBoardPiece(6, i, new Pawn("black"));

            switch (i) {
                case 0 -> {
                    this.setBoardPiece(0, i, new Rook("white"));
                    this.setBoardPiece(7, i, new Rook("black"));
                    this.setBoardPiece(0, board.length - i - 1, new Rook("white"));
                    this.setBoardPiece(7, board.length - i - 1, new Rook("black"));
                }
                case 1 -> {
                    this.setBoardPiece(0, i, new Knight("white"));
                    this.setBoardPiece(7, i, new Knight("black"));
                    this.setBoardPiece(0, board.length - i - 1, new Knight("white"));
                    this.setBoardPiece(7, board.length - i - 1, new Knight("black"));
                }
                case 2 -> {
                    this.setBoardPiece(0, i, new Bishop("white"));
                    this.setBoardPiece(7, i, new Bishop("black"));
                    this.setBoardPiece(0, board.length - i - 1, new Bishop("white"));
                    this.setBoardPiece(7, board.length - i - 1, new Bishop("black"));
                }
                case 3 -> {
                    this.setBoardPiece(0, i, new Queen("white"));
                    this.setBoardPiece(7, i, new Queen("black"));
                }
                case 4 -> {
                    this.setBoardPiece(0, i, new King("white"));
                    this.setBoardPiece(7, i, new King("black"));
                }
            }
        }
    }

    public void setBoardPiece(int x, int y, Piece p) {
        this.board[x][y] = p;
    }

    public Piece getBoardPiece(int x, int y) {
        return this.board[x][y];
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        Piece tmp;

        for(int i = 0; i<8;i++) {
            s.append("\n");
            for(int j = 0; j<8; j++) {
                tmp = getBoardPiece(i,j);

                if(tmp == null) {
                    s.append("  ");
                } else {
                    s.append(" ").append(tmp);
                }
            }
        }
        return s.toString();
    }
}
