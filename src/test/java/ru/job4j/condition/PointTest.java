package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11to11then0() {
        double expected = 0;
        Point a = new Point(1, 1);
        Point b = new Point(1, 1);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenMinus11to1Minus1then2dot83() {
        double expected = 2.83;
        Point a = new Point(-1, 1);
        Point b = new Point(1, -1);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when111to122then23dot26() {
        double expected = 23.26;
        Point a = new Point(11, 1);
        Point b = new Point(1, 22);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}