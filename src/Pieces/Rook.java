package Pieces;

import BoardGame.*;

public class Rook extends Piece {
    int coordinate;
    boolean isWhite;
    boolean firstMove;
    int[] availableMoves;
    public final static int[] CANDIDATE_MOVE_COORDINATES = {-8, -1, 1, 8};

    public Rook(int coordinate, boolean isWhite){
        this.coordinate = coordinate;
        this.isWhite = isWhite;
    }




}
