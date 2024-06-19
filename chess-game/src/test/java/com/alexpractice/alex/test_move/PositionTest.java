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
            Position newPosition= new Position("3a");
            assertEquals(newPosition.row,3);
        }
        catch(IllegalArgumentException except) {
            assertTrue(false);
        }
    }

    @Test
    public void createPositionWithInvalidValues(){
        try {
            Position newPosition= new Position("9z");
        }
        catch(IllegalArgumentException except) {
            assertTrue(true);
        }

    }

    @Test
    public void changeValuesAfterCreationShouldReturnTrue(){
        try {
            Position newPosition= new Position("3a");
            newPosition.setPosition(new Position("4a"));
            assertEquals(newPosition.row,4);
        }
        catch(IllegalArgumentException except) {
            assertTrue(false);
        }
    }

    @Test
    public void changeValueToInvalidParameterShouldReturnFalse(){
        try {
            Position newPosition= new Position("3a");
        }
        catch(IllegalArgumentException except){
            assertFalse(false);
        }
    }
}


