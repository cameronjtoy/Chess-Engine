public class Pawn extends Piece{
    int coordinate;
    boolean isWhite;
    int[] availableMoves;
    private final static int[] CANDIDATE_MOVE_COORDINATES = {8, 16, 7, 9};

    public Pawn(int coordinate, boolean isWhite){
        this.coordinate = coordinate;
        this.isWhite = isWhite;
    }

    public static void generateLegalMoves(Board board){






    }




}
