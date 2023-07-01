package com.javarush.task.task24.task2413;

public class Ball extends BaseObject {
    public Ball(double x, double y, double radius) {
        super(x, y, radius);
    }
    private double speed;
    private double direction;
    private double dx;
    private double dy;
    private boolean isFrozen;

    public double getSpeed() {
        return speed;
    }

    public double getDirection() {
        return direction;
    }

    public double getDx() {
        return dx;
    }

    public double getDy() {
        return dy;
    }

    public Ball(double x, double y, double speed, double direction) {
        super(x, y, 1 );
        this.direction = direction;
        this.speed = speed;
        isFrozen = true;

    }

    @Override
    public void draw(Canvas canvas) {

    }

    @Override
    public void move() {

    }
}
