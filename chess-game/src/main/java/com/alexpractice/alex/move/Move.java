package com.alexpractice.alex.move;
import com.alexpractice.alex.move.Player;
import com.alexpractice.alex.move.Position;

public class Move {
    // String theMove;
    private Player colorPlayer;
    private Position oldPosition;
    private Position newPosition;

    public Move(String theMove){
        // this.theMove=theMove;
        String [] theMoves=theMove.split(" ",10);
        if(theMoves[0].charAt(0)=='W'){
            Player colorPlayer=Player.White;
        }
        else if(theMoves[0].charAt(0)=='B'){
            Player colorPlayer=Player.Black;
        }
        else{
            throw new IllegalArgumentException("Invalid player");
        }
        Position oldPosition=new Position(theMoves[1]);
        Position newPosition=new Position(theMoves[2]);
    }

    
}