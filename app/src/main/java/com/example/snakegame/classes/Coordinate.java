package com.example.snakegame.classes;

public class Coordinate {
    private int x;
    private int y;
    public Coordinate(int x, int y){
        this.x=x;
        this.y=y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object o){
        if(this==o)return true;
        if(o==null||getClass()!=o.getClass())return false;
        Coordinate that=(Coordinate)o;
        if(getX()!=that.getX())return false;
        return getY()==that.getY();

    }


}