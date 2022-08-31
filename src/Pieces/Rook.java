package Pieces;

import Game.*;

public class Rook extends Piece {
    int coordinate;
    boolean isWhite;
    boolean firstMove;
    int[] availableMoves;
    private final static int[] CANDIDATE_MOVE_COORDINATES = {8, 16, 7, 9};

    public Rook(int coordinate, boolean isWhite){
        this.coordinate = coordinate;
        this.isWhite = isWhite;
    }

    public static void generateLegalMoves(Board board){






    }




}
