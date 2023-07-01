package com.javarush.task.task24.task2413;



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

    //определение направления движения шарика
    //P.S. код был в условии задания, написал не сам :(
    void setDirection(double direction) {
        this.direction = direction;
        double angle = Math.toRadians(direction);
        dx = Math.cos(angle) * speed;
        dy = -Math.sin(angle) * speed;
    }
    //отскок шарика в случае удара о стену, в условии сказано просто создать метод
    //а его наполнение хз буду ли писать сам
    void checkRebound(int minx, int maxx, int miny, int maxy) {

    }
}
