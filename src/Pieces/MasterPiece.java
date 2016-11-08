package Pieces;

import Logic.Board;

/**
 * MasterPiece
 *
 * @author Patrick Shinn
 * @version 11/2/16
 */
public class MasterPiece implements Piece{
    
    private Board board; //// TODO: 11/7/16 each peice will need to somehow deal with the board. 
    private int playerID;
    private Coordinate coords;
    private int arrayIndex;
    
    public MasterPiece(int x, int y, int playerID, int arrayIndex){
        this.coords = new Coordinate(x,y);
        this.playerID = playerID;
        this.arrayIndex = arrayIndex;
    }
    @Override
    public boolean hasAttack() {
        return false;
    }

    @Override
    public boolean hasMove() {
        return false;
    }

    @Override
    public Coordinate makeMove() {
        return new Coordinate(1,1);
    }

    public int getPlayerID(){return playerID;}

    public int getArrayIndex() { // used for managing pieces in the piece array of the player class.
        return arrayIndex;
    }

}
