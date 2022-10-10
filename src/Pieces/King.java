package Pieces;

import BoardGame.*;

import java.util.ArrayList;

public class King extends Piece {
    static int coordinate;
    boolean isWhite;
    boolean firstMove;
    static ArrayList<String> availableMoves;
    boolean canCastle;
    public final static int[] CANDIDATE_MOVE_COORDINATES = {-7, -9, 7, 9};

    public King(int coordinate, boolean isWhite){
        King.coordinate = coordinate;
        this.isWhite = isWhite;
    }

    public static void generateLegalMoves(Board board){
        for(int direction: CANDIDATE_MOVE_COORDINATES){
            int tempPosition = coordinate;
            if(tempPosition + direction > 0 && tempPosition + direction < 63 && board.getPiece(tempPosition + direction) != null){
                availableMoves.add("B"+board.getPositionFromCoordinate(tempPosition + direction));
            }
        }
    }




}
