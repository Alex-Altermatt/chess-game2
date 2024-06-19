package com.alexpractice.alex.test_move;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.alexpractice.alex.move.Move;

public class TestForMove{

    @Test
    public void createInstanceOfMoveReturnTrue(){
        try{
            Move testMove=new Move("W 1e 2e");
            assertTrue(true);
        }
        catch(IllegalArgumentException except) {
            assertTrue(false);
        }
    }
    @Test
    public void createInstanceOfMoveWithBadInputReturnFalse(){
        try{
            Move testMove=new Move("Z 1e 2e");
            assertFalse(true);
        }
        catch(IllegalArgumentException except) {
            assertFalse(false);
        }
    }
}