package com.chevan;

/**
 * Created by localadmin on 7/27/16.
 */
public class Room {
    private String name;
    private Floor floor;
    private Paint paint;
    private int length;
    private int width;
    private int height;

    public Room(String name, Floor floor, Paint paint, int length, int width, int height) {
        this.name = name;
        this.floor = floor;
        this.paint = paint;
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Floor getFloor() {
        return floor;
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }

    public Paint getPaint() {
        return paint;
    }

    public void setPaint(Paint paint) {
        this.paint = paint;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double floorCost (){
        return length * width * this.getFloor().getCostPerSqft();
    }

    public double paintCost() {
        double ceilingCost = length * width * this.getPaint().getCostPerSqFt();
        double wallsCost = (length * height * this.getPaint().getCostPerSqFt() * 2) +
                (width * height * this.getPaint().getCostPerSqFt() * 2);
        return ceilingCost + wallsCost;
    }
}
