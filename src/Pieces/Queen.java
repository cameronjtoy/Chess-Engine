package Pieces;

import BoardGame.*;

public class Queen extends Piece {
    int coordinate;
    boolean isWhite;
    boolean firstMove;
    int[] availableMoves;
    public final static int[] CANDIDATE_MOVE_COORDINATES = {-9, -8, -7, -1, 9, 8, 7, 1};

    public Queen(int coordinate, boolean isWhite){
        this.coordinate = coordinate;
        this.isWhite = isWhite;
    }





}
