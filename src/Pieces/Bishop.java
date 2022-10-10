package Pieces;

import java.util.*;
import BoardGame.*;

public class Bishop extends Piece {
    static int coordinate;
    boolean isWhite;
    boolean firstMove;
    static ArrayList<String> availableMoves;
    public final static int[] CANDIDATE_MOVE_COORDINATES = {-9, -7, 7, 9};

    public Bishop(int coordinate, boolean isWhite){
        Bishop.coordinate = coordinate;
        this.isWhite = isWhite;
    }
}
