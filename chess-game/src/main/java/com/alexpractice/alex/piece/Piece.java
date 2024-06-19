package com.alexpractice.alex.piece;
import com.alexpractice.alex.piece.PieceType;
import com.alexpractice.alex.move.Player;
public class Piece {
    public PieceType typeOfPiece;
    public Player colorPlayer;


    public Piece(PieceType typeOfPiece, Player colorPlayer){
        this.typeOfPiece=typeOfPiece;
        this.colorPlayer=colorPlayer;
    }
}
 