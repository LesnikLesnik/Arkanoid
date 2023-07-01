package com.javarush.task.task24.task2413;


//базовый класс для переопределения методов draw и move
public abstract class BaseObject {
    protected double x;
    protected   double y;
    protected double radius;

    public BaseObject(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public abstract void draw(Canvas canvas);

    public abstract void move();

    //проверка пересечения объектов (кирпич и шарик)
    boolean intersects (BaseObject o) {
        double distance = Math.hypot(this.getX() - o.getX(), this.getY() - o.getY());
        return distance <= this.radius || distance <= o.radius;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
