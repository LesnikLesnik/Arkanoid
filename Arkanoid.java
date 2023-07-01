package com.javarush.task.task24.task2413;

import java.util.List;

public class Arkanoid {

    public static void main(String[] args) {

    }

    public void run() {

    }

    //двигаем все что движется (подставка и шарик)
    public void move() {
        ball.move();
        stand.move();
    }

    //отрисовываем шарик, подставку и все кирпичи
    void draw(Canvas canvas) {
        ball.draw(canvas);
        stand.draw(canvas);
        for (int i = 0; i < bricks.size(); i++) {
            bricks.get(i).draw(canvas);
        }
    }

    static Arkanoid game;
    private boolean isGameOver;

    //смотрим не столкнулся ли шарик с кирпичом
    public void checkBricksBump() {
        for (int i = 0; i < bricks.size(); i++) {
            if (ball.intersects(bricks.get(i))) { //если шарик попал в кирпич
                double angle = Math.random() * 360; //отлетает в случайном направлении
                ball.setDirection(angle);
                bricks.remove(i);
            }
        }
    }

    //проверяем ударился ли шарик о платформу
    public void checkStandBump() {
        if (ball.intersects(stand)) { //если ударился, то улетает в случайном направлении вверх
            double angle = 90 + 20 * (Math.random() - 0.5); //тоже был готовый код в условии
            ball.setDirection(angle);
        }
    }

    public void checkEndGame() {
        if (ball.y > height) isGameOver = true;
    }

    private int width;
    private int height;

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

    private Ball ball;

    public Ball getBall() {
        return ball;
    }

    public void setBall(Ball ball) {
        this.ball = ball;
    }

    public Stand getStand() {
        return stand;
    }

    public void setStand(Stand stand) {
        this.stand = stand;
    }

    public List<Brick> getBricks() {
        return bricks;
    }

    public void setBricks(List<Brick> bricks) {
        this.bricks = bricks;
    }

    private Stand stand; //подставка

    private List<Brick> bricks; //список кирпичей

    public Arkanoid(int width, int height) {
        this.width = width;
        this.height = height;
    }
}
