package com.company;

import junit.framework.Assert;
import org.junit.Test;


/**
 * Created by mine on 11/7/15.
 */
public class battle {

    @Test
    public void addShipToTheBattleField(){
        String[] PositionX = {"a", "a", "a", "a", "a" };
        int[] PositionY = {0, 1, 2, 3, 4 };
        battleShip ship1 = new battleShip(5,PositionX,PositionY);
        Assert.assertEquals(5,ship1.getLength());
    }

}

