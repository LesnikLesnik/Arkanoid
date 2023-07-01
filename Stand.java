package com.javarush.task.task24.task2413;

//подставка
public class Stand extends BaseObject {
    public Stand(double x, double y, double radius) {
        super(x, y, radius);
    }

    private double speed; // скорость шарика
    private double direction; //-1 влево, 0 на месте, 1 вправо

    public double getSpeed() {
        return speed;
    }

    public double getDirection() {
        return direction;
    }

    public Stand(double x, double y) {
        super(x, y, 3);
        speed = 1;
        direction = 0;
    }
    //код пишу не я
    @Override
    public void draw(Canvas canvas) {

    }

    @Override
    public void move() {
        this.x = x + speed * direction;
    }
    //движение влево платформы
    void moveLeft() {
        direction = -1;
    }
    //движение платформы вправо
    void moveRight() {
        direction = 1;
    }
}
