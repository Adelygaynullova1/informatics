package ru.itis.informatics.lab07.vector;

public class Segment {
    public Point a;

    public Point b;

    public Segment(Point a, Point b) {
        this.a = a;
        this.b = b;
    }
    public Point seredina() {
        Point p = new Point((a.x+b.x)/2,(a.y+b.y)/2);
        return p;
    }
    public void smeshenie(int peremPoX, int peremPoY) {
        a.x = a.x + peremPoX;
        a.y = a.y + peremPoY;
        b.x = b.x + peremPoX;
        b.y = b.y + peremPoY;
    }
}
