package Pieces;
import BoardGame.*;
import java.util.ArrayList;

public class Knight extends Piece {
    static int coordinate;
    boolean isWhite;
    boolean firstMove;
    static ArrayList<String> availableMoves;
    public final static int[] CANDIDATE_MOVE_COORDINATES = {-15, -17, -10, -6, 6, 10, 15, 17};

    public Knight(int coordinate, boolean isWhite){
        Knight.coordinate = coordinate;
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
