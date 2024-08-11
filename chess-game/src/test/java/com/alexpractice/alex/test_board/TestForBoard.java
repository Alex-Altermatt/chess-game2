package com.alexpractice.alex.test_board;
import com.alexpractice.alex.board.BoardState;
import com.alexpractice.alex.move.Player;
import com.alexpractice.alex.move.Position;
import com.alexpractice.alex.piece.Piece;
import com.alexpractice.alex.piece.PieceType;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Optional;

import org.junit.Test;

public class TestForBoard {
    
    @Test
    public void testingTheEmptyBoardShouldReturnTrue(){
        BoardState testBoard=new BoardState();
        assertFalse(testBoard.spaces.get(7).get(7).isPresent());
    }
    @Test
    public void testSetAt(){
        BoardState testBoard=new BoardState();
        Piece testPiece= new Piece(PieceType.Pawn, Player.White);
        Optional<Piece> testOptional = Optional.of(testPiece);
        testBoard.setAt(new Position("1e"), testOptional);
        assertEquals(testBoard.getAt(new Position("1e")), testOptional);
    }
    @Test
    public void testingStandardPieceOptionsUsingPawnShouldReturnTrue(){
        BoardState testBoard=new BoardState();
        Piece testPiece= new Piece(PieceType.Pawn, Player.White);
        Optional<Piece> testOptional = Optional.of(testPiece);
        Position testPosition=new Position("1e");
        testBoard.setAt(testPosition, testOptional);
        Position[] testPossibleMoves=testBoard.standardPieceOptions(testPosition, testPiece);
        Position testPossiblePosition= new Position(testPosition.row+1,testPosition.col);
        assertEquals(testPossibleMoves[0].row, testPossiblePosition.row);
    }
}
