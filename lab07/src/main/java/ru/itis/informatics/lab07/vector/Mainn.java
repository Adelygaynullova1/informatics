package ru.itis.informatics.lab07.vector;

public class Mainn {
    public static void main(String[] args) {
        Segment segment = new Segment(new Point(1, 2), new Point(2, 1));

        System.out.println("Координаты середины отрезка " + segment.seredina());

        System.out.println("Координаты точек отрезка после переноса = ");
        segment.smeshenie(1,1);
        System.out.println(segment.a + "   " + segment.b);
    }
}