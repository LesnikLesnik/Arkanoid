package com.javarush.task.task24.task2413;

import java.util.List;

public class Arkanoid {

    public static void main(String[] args) {

    }

    public void run() {

    }

    public void move() {

    }

    static Arkanoid game;


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
