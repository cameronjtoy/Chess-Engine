package BoardGame;
import Pieces.*;
import java.util.ArrayList;

public class Board {
    public static Piece[] board = new Piece[64];
    public static boolean whitesTurn;
    public int halfMoveClock;
    public static ArrayList<String> availableMoves;


    public Piece getPiece(int coordinate){
        return board[coordinate];
    }

    public void setPiece(int coordinate, Piece piece){
        board[coordinate] = piece;
    }
    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }

    public String getPositionFromCoordinate(int coordinate){
        String[] rows = {"a", "b ", "c", "d", "e", "f", "g","h"};
        String[] cols = {"1", "2 ", "3", "4", "5", "6", "7","8"};
        String currentRow = rows[coordinate/8];
        String currentCol = cols[coordinate%8];
        return currentRow+currentCol;
    }

    public static void generateLegalMoves(Board board){
        for(int i = 0; i < 64; i ++){
            if(board.getPiece(i) == null){
                continue;
            }
            Piece currentPiece = board.getPiece(i);
            if(currentPiece instanceof Bishop){
                for(int direction: Bishop.CANDIDATE_MOVE_COORDINATES){
                    int tempPosition = i;
                    while(tempPosition + direction > 0 && tempPosition + direction < 63 && board.getPiece(tempPosition + direction) == null){
                        availableMoves.add("B"+board.getPositionFromCoordinate(tempPosition + direction));
                        tempPosition += direction;
                    }
                    if(tempPosition + direction > 0 && tempPosition + direction < 63 && board.getPiece(tempPosition + direction) != null){
                        availableMoves.add("B"+board.getPositionFromCoordinate(tempPosition + direction));
                    }
                }
            }
            else if(currentPiece instanceof Knight){
                for(int direction: Knight.CANDIDATE_MOVE_COORDINATES){
                    int tempPosition = i;
                    while(tempPosition + direction > 0 && tempPosition + direction < 63 && board.getPiece(tempPosition + direction) == null){
                        availableMoves.add("B"+board.getPositionFromCoordinate(tempPosition + direction));
                        tempPosition += direction;
                    }
                    if(tempPosition + direction > 0 && tempPosition + direction < 63 && board.getPiece(tempPosition + direction) != null){
                        availableMoves.add("B"+board.getPositionFromCoordinate(tempPosition + direction));
                    }
                }
            }
            else if(currentPiece instanceof Rook){
                for(int direction: Rook.CANDIDATE_MOVE_COORDINATES){
                    int tempPosition = i;
                    while(tempPosition + direction > 0 && tempPosition + direction < 63 && board.getPiece(tempPosition + direction) == null){
                        availableMoves.add("B"+board.getPositionFromCoordinate(tempPosition + direction));
                        tempPosition += direction;
                    }
                    if(tempPosition + direction > 0 && tempPosition + direction < 63 && board.getPiece(tempPosition + direction) != null){
                        availableMoves.add("B"+board.getPositionFromCoordinate(tempPosition + direction));
                    }
                }
            }
            else if(currentPiece instanceof Queen){
                for(int direction: Queen.CANDIDATE_MOVE_COORDINATES){
                    int tempPosition = i;
                    while(tempPosition + direction > 0 && tempPosition + direction < 63 && board.getPiece(tempPosition + direction) == null){
                        availableMoves.add("B"+board.getPositionFromCoordinate(tempPosition + direction));
                        tempPosition += direction;
                    }
                    if(tempPosition + direction > 0 && tempPosition + direction < 63 && board.getPiece(tempPosition + direction) != null){
                        availableMoves.add("B"+board.getPositionFromCoordinate(tempPosition + direction));
                    }
                }
            }
            else if(currentPiece instanceof Pawn){
                for(int direction: Pawn.CANDIDATE_MOVE_COORDINATES){
                    int tempPosition = i;
                    while(tempPosition + direction > 0 && tempPosition + direction < 63 && board.getPiece(tempPosition + direction) == null){
                        availableMoves.add("B"+board.getPositionFromCoordinate(tempPosition + direction));
                        tempPosition += direction;
                    }
                    if(tempPosition + direction > 0 && tempPosition + direction < 63 && board.getPiece(tempPosition + direction) != null){
                        availableMoves.add("B"+board.getPositionFromCoordinate(tempPosition + direction));
                    }
                }
            }
            else if(currentPiece instanceof King){
                for(int direction: King.CANDIDATE_MOVE_COORDINATES){
                    int tempPosition = i;
                    while(tempPosition + direction > 0 && tempPosition + direction < 63 && board.getPiece(tempPosition + direction) == null){
                        availableMoves.add("B"+board.getPositionFromCoordinate(tempPosition + direction));
                        tempPosition += direction;
                    }
                    if(tempPosition + direction > 0 && tempPosition + direction < 63 && board.getPiece(tempPosition + direction) != null){
                        availableMoves.add("B"+board.getPositionFromCoordinate(tempPosition + direction));
                    }
                }
            }



        }
    }






    public static void loadFenToBoard(String fen){
        int tempPosition = 0;
        String[] splitArray = fen.split(" ");
        if(splitArray.length != 6) {
            System.out.println("Invalid Fen String");
        }else{
            for(int i = 0; i < splitArray[0].length();i ++){
                    if(splitArray[0].charAt(i) == 'P' ){
                        board[tempPosition] = new Pawn(tempPosition, true);
                        tempPosition++;
                    }
                    else if(splitArray[0].charAt(i) == 'p'){
                        board[tempPosition] = new Pawn(tempPosition, false);
                        tempPosition++;
                    }
                    else if (splitArray[0].charAt(i) == 'R'){
                        board[tempPosition] = new Rook(tempPosition, true);
                        tempPosition++;
                    }
                    else if (splitArray[0].charAt(i) == 'r'){
                        board[tempPosition] = new Rook(tempPosition, false);
                        tempPosition++;
                    }
                    else if (splitArray[0].charAt(i) == 'N'){
                        board[tempPosition] = new Knight(tempPosition, true);
                        tempPosition++;
                    }
                    else if (splitArray[0].charAt(i) == 'n'){
                        board[tempPosition] = new Knight(tempPosition, false);
                        tempPosition++;
                    }
                    else if (splitArray[0].charAt(i) == 'K'){
                        board[tempPosition] = new King(tempPosition, true);
                        tempPosition++;
                    }
                    else if (splitArray[0].charAt(i) == 'k'){
                        board[tempPosition] = new King(tempPosition, false);
                        tempPosition++;
                    }
                    else if (splitArray[0].charAt(i) == 'Q'){
                        board[tempPosition] = new Queen(tempPosition, true);
                        tempPosition++;
                    }
                    else if (splitArray[0].charAt(i) == 'q'){
                        board[tempPosition] = new Queen(tempPosition, false);
                        tempPosition++;
                    }
                    else if (splitArray[0].charAt(i) == 'B' ){
                        board[tempPosition] = new Bishop(tempPosition, true);
                        tempPosition++;
                    }
                    else if (splitArray[0].charAt(i) == 'b' ){
                        board[tempPosition] = new Bishop(tempPosition, false);
                        tempPosition++;
                    }
                    else if (Character.isDigit(splitArray[0].charAt(i))){
                        tempPosition += (splitArray[0].charAt(i) - '0');
                    }
                }
            whitesTurn = splitArray[1].equals("w");







            }

    }





}
