package Game;

import Pieces.*;

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
                    break;
                }
                case 'p' -> {
                    board[tempPosition] = new Pawn(tempPosition, false);
                    tempPosition++;
                    break;
                }
                case 'R' -> {
                    board[tempPosition] = new Rook(tempPosition, true);
                    tempPosition++;
                    break;
                }
                case 'r' -> {
                    board[tempPosition] = new Rook(tempPosition, false);
                    tempPosition++;
                    break;
                }
                case 'N' -> {
                    board[tempPosition] = new Knight(tempPosition, true);
                    tempPosition++;
                    break;
                }
                case 'n' -> {
                    board[tempPosition] = new Knight(tempPosition, false);
                    tempPosition++;
                    break;
                }
                case 'K' -> {
                    board[tempPosition] = new King(tempPosition, true);
                    tempPosition++;
                    break;
                }
                case 'k' -> {
                    board[tempPosition] = new King(tempPosition, false);
                    tempPosition++;
                    break;
                }
                case 'Q' -> {
                    board[tempPosition] = new Queen(tempPosition, true);
                    tempPosition++;
                    break;
                }
                case 'q' -> {
                    board[tempPosition] = new Queen(tempPosition, false);
                    tempPosition++;
                    break;
                }
                case 'B' -> {
                    board[tempPosition] = new Bishop(tempPosition, true);
                    tempPosition++;
                    break;
                }
                case 'b' -> {
                    board[tempPosition] = new Bishop(tempPosition, false);
                    tempPosition++;
                    break;
                }
                default -> {
                    break;
                }
            }

        }

    }




}
