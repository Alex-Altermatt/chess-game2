package com.alexpractice.alex.test_move;

import com.alexpractice.alex.move.Position;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;


public class PositionTest {

    @Test
    public void createPositionObjectAndCheckRowValueShouldReturnTrue(){
        try {
            Position newPosition= new Position(3,4);
            assertEquals(newPosition.row,3);
        }
        catch(Exception except) {
            assertTrue(false);
        }
    }

    @Test
    public void createPositionWithInvalidValues(){
        try {
            Position newPosition= new Position(9,4);
        }
        catch(Exception except) {
            assertTrue(true);
        }

    }

    @Test
    public void changeValuesAfterCreationShouldReturnTrue(){
        try {
            Position newPosition= new Position(3,4);
            newPosition.setPosition(5,7);
            assertEquals(newPosition.row,5);
        }
        catch(Exception except) {
            assertTrue(false);
        }
    }

    @Test
    public void changeValueToInvalidParameterShouldReturnFalse(){
        try {
            Position newPosition= new Position(3,4);
            assertFalse(newPosition.setPosition(9,7));
        }
        catch(Exception except){
            assertFalse(false);
        }
    }
}


