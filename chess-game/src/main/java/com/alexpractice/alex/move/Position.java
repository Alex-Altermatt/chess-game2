package com.alexpractice.alex.move;

public class Position{
     public int row;
    public int col;
    public Position(int row, int col) throws Exception{
        this.row=row;
        this.col=col;
        if(row>8||row<1){
            throw new Exception("Invalid value for row, must be between 1 and 8 (Inclusive)");
        }
        if(col>8||col<1){
            throw new Exception("Invalid value for col, must be between 1 and 8 (Inclusive)");
        }
    }

    public boolean setPosition(int newRow,int newCol){
        if (newRow>8||newRow<1||newCol>8||newCol<1) {
            return false;
        }
        row=newRow;
        col=newCol;
        return true;
    }
}