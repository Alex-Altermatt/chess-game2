package com.alexpractice.alex.board;

import com.alexpractice.alex.move.Move;
import com.alexpractice.alex.move.Position;
import com.alexpractice.alex.move.Player;
import com.alexpractice.alex.piece.Piece;

import java.util.Optional;
import java.util.ArrayList;
import java.util.Set;

public class BoardState {
    // Pieces will be stored in here
    private static final int BOARD_WIDTH = 8;
    private static final int BOARD_HEIGHT = 8;

    private ArrayList<ArrayList<Optional<Piece>>> spaces = new ArrayList<ArrayList<Optional<Piece>>>();

    public BoardState() {
        // Initialize the spaces arrays
        // All pieces in original positions
        // TO DO 
    }

    public Optional<Exception> move(Move move) {
        return null; //TO DO
    }

    public Optional<Player> inCheck() {
        // Returns a player (or no one) in check
        return null;
    }

    public Optional<Player> checkMate() {
        // Returns a player (or no one) in check
        return null;
    }
    

    // HELPER METHODS

    public Position[] standardPieceOptions(Position start, Piece piece) {
        // Where could the piece go if nothing was in the way
        return null;
    }

    public Position[] unobstPieceOptions(Position start, Piece piece, Position[] stdOptions) {
        // Subset of standard piece options that don't have any other piece in the way.
        // You can capture enemy pieces here too.
        return null;
    }

    public Position[] checkedMoves(Position start, Piece piece, Position[] unobstOptions) {
        // Subset of unobstructed options where your king isn't left in check.
        return null;
    }

    // Gets the piece at the position
    public Optional<Piece> getAt(Position pos) {
        return spaces.get(pos.row).get(pos.col);
    }

    public void setAt(Position pos, Optional<Piece> newPiece) {
        spaces.get(pos.row).add(pos.col,newPiece);
    }

    public Set<Move> legalMoves(Player toPlay) {
    // Lists all legal moves for a player
    return null;
    }


}
