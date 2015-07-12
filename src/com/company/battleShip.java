package com.company;

/**
 * Created by mine on 11/7/15.
 */
public class battleShip {
    private int Size;
    private String[] PositionX;
    private int[] PositionY;
    battleShip(int Size,String[] PositionX,int[] PositionY)
    {
        this.Size = Size;
        this.PositionX = PositionX;
        this.PositionY = PositionY;
    }

    public int getLength() {
        return Size;
    }
}
