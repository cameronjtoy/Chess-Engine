package Pieces;

import BoardGame.*;
import java.util.*;

public class Pawn extends Piece {
    static int coordinate;
    boolean isWhite;
    boolean firstMove;
    static ArrayList<String> availableMoves;
    public final static int[] CANDIDATE_MOVE_COORDINATES = {8, 16, 9, 7};

    public Pawn(int coordinate, boolean isWhite){
        this.coordinate = coordinate;
        this.isWhite = isWhite;
    }

    public static void generateLegalMoves(Board board){

        for(int direction: CANDIDATE_MOVE_COORDINATES) {
            int tempPosition = coordinate;
            while (tempPosition + direction > 0 && tempPosition + direction < 63 && board.getPiece(tempPosition + direction) == null) {
                availableMoves.add("B" + board.getPositionFromCoordinate(tempPosition + direction));
                tempPosition += direction;
            }
            if (tempPosition + direction > 0 && tempPosition + direction < 63 && board.getPiece(tempPosition + direction) != null) {
                availableMoves.add("B" + board.getPositionFromCoordinate(tempPosition + direction));
            }
        }
    }




}
