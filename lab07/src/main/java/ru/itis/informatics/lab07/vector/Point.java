package ru.itis.informatics.lab07.vector;


public class Point  {

    public int x;
    public int y;

    public Point(int firstCoord, int secondCoord){
        this.x = firstCoord;
        this.y = secondCoord;
    }

    public String toString() {
        return "[" + x + "," + y + "]";
    }
}

