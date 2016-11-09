package Logic;

import Pieces.Coordinate;
import Pieces.MasterPiece;
/**
 * Board
 *
 * @author Patrick Shinn
 * @version 10/28/16
 */
public class Board {
    private MasterPiece[][] board = new MasterPiece[5][5]; // creates a 2d array that is 5X5
    private int turnCounter = 0;

    public Board(Player player1, Player player2){

        // adding player1 pieces to the board
        MasterPiece[] player1Pieces = player1.getPieces();
        for (MasterPiece piece: player1Pieces){
            Coordinate coords = piece.getCoords();
            board[coords.getCoords()[1]][coords.getCoords()[0]] = piece;
        }

        // adding player2 pieces to the board
        MasterPiece[] player2Pieces = player2.getPieces();
        for (MasterPiece piece: player2Pieces) {
            Coordinate coords = piece.getCoords();
            board[coords.getCoords()[1]][coords.getCoords()[0]] = piece;
        }

        // // TODO: 11/8/16 remove debug
        for (MasterPiece[] Pieces: board){
            for (MasterPiece piece: Pieces){
                if (piece == null) System.out.println("Null");
                else  System.out.println(piece.toString());

            }
        }

    }

    public MasterPiece[][] getBoard(){ // this will be used to feed the AI a Board
        return this.board;
    }


}
