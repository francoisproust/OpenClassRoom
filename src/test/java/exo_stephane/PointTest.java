package exo_stephane;


import org.junit.Test;
import static org.junit.Assert.*;

public class PointTest {
    @Test
    public void distanceAxAyBxBy(){
        Point a = new Point(4,4);
        Point b = new Point(0,0);
        //System.out.println("point A =" + a.toString() + " point B = " + b.toString());
        Point calcul = new Point();
        assertEquals(Math.sqrt(32),calcul.Distance(a.getX(),a.getY(),b.getX(),b.getX()),0);
    }

    @Test
    public void deplacerPoint(){
        Point a = new Point();
        a.setX(4);
        a.setY(4);
        a.DeplacerPoint(4,0);
        assertEquals("Point{x=8.0, y=4.0}", a.toString());
    }

    @Test
    public void translation(){
        Point a = new Point();
        a.setX(3);
        a.setY(5);
        a.Translate(4,4);
        assertEquals("Point{x=7.0, y=9.0}", a.toString());
    }

    @Test
    public void distanceBxBy(){
        Point a = new Point();
        a.setX(0);
        a.setY(0);
        assertEquals(Math.sqrt(32),a.Distance(4,4),0);
    }

    @Test
    public void distancePoint(){
        Point a = new Point();
        a.setX(0);
        a.setY(0);
        Point b = new Point(4,4);
        assertEquals(Math.sqrt(32),a.Distance(b),0);
    }
}
