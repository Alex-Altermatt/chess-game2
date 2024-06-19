package com.alexpractice.alex.test_piece;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

import com.alexpractice.alex.move.Player;
import com.alexpractice.alex.piece.Piece;
import com.alexpractice.alex.piece.PieceType;

public class TestForPiece {

    @Test
    public void makePieceWithNormalParametersReturnTrue(){
            Piece testPiece=new Piece(PieceType.Knight,Player.Black);
            assertEquals(testPiece.typeOfPiece, PieceType.Knight);
            assertEquals(testPiece.colorPlayer, Player.Black);
    }
}

