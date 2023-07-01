package com.javarush.task.task24.task2413;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ball extends BaseObject {
    public Ball(double x, double y, double radius) {
        super(x, y, radius);
    }

    private double speed;
    private double direction; //направление в градусах от 0 до 360
    private double dx;
    private double dy;
    //значения вектора движения
    private boolean isFrozen; //заморожен ли объект, или он способен двигаться

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
        super(x, y, 1);
        this.direction = direction;
        this.speed = speed;
        this.isFrozen = true;

    }

    @Override
    public void draw(Canvas canvas) {
        canvas.setPoint(x, y, 'O');
    }

    //размораживаем шарик
    void start() {
        this.isFrozen = false;
    }
    //перемещение шарика если он не заморожен
    @Override
    public void move() {
        if (!isFrozen) {
            x += dx;
            y += dy;
        }
    }
}
