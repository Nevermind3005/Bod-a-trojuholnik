package com.company;

public class Bod {

    private int x;
    private int y;

    public Bod() {
        x = 0;
        y = 0;
    }

    public Bod(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public double vzdialenost(int x, int y) {
        return Math.sqrt(Math.pow((this.x - x), 2) + Math.pow((this.y - y), 2));
    }

    public double vzdialenost(Bod bod) {
        return Math.sqrt(Math.pow((this.x - bod.x), 2) + Math.pow((this.y - bod.y), 2));
    }
}
