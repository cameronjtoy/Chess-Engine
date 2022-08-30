public class Board {
    public static Piece[] board = new Piece[64];

    public Piece getPiece(int coordinate){
        return board[coordinate];
    }

    public void setPiece(int coordinate, Piece piece){
        board[coordinate] = piece;
    }

    public static void loadFenToBoard(String fen){
        int tempPosition = 0;
        for(int i = 0; i < fen.length(); i ++ ){
            switch (fen.charAt(i)) {
                case 'P' -> {
                    board[tempPosition] = new Pawn(tempPosition, true);
                    tempPosition++;
                }
                case 'p' -> {
                    board[tempPosition] = new Pawn(tempPosition, false);
                    tempPosition++;
                }
                case 'R' -> {
                    board[tempPosition] = new Rook(tempPosition, true);
                    tempPosition++;
                }
                case 'r' -> {
                    board[tempPosition] = new Rook(tempPosition, false);
                    tempPosition++;
                }

            }

        }

    }




}
