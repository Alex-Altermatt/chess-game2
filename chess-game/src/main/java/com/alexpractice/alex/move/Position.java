package com.alexpractice.alex.move;

public class Position{
    public int row;
    public int col;

    public Position(String input) throws IllegalArgumentException{
        if(input.length()!=2){
            throw new IllegalArgumentException("String inputed is not in move format");
        }
        this.row=Integer.parseInt("" + input.charAt(0));
        this.col=chessNotationToPosition(input.charAt(1));
        if(row>7||row<0){
            throw new IllegalArgumentException("Invalid value for row, must be between 1 and 8 (Inclusive)");
        }
        if(col>7||col<0){
            throw new IllegalArgumentException("Invalid value for col, must be between 1 and 8 (Inclusive)");
        }
    }



    public void setPosition(Position other) {
        this.row = other.row;
        this.col = other.col;
    }

    public static int chessNotationToPosition(char c){
        return (int)(c) - (int)('a');
    }
}