package com.fr.tankGame.resources;

import java.awt.*;

/**
 * @Author: F
 * @DateTime: 2021/10/18 10:29
 * @Description: 坦克类
 */
public class Tank {

    private int x;
    private int y;
    private int speed = 1;//速度
    private int direction = 0;//方向0上1右2下3左
    private Color color = Color.CYAN;

    //上移动
    public void moveUp() {
        y -= speed;
    }
    //右移动
    public void moveRright() {
        x += speed;
    }
    //向下移动
    public void moveDown() {
        y += speed;
    }
    //向左移动
    public void moveLeft() {
        x -= speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Tank(int x, int y, int speed, int direction, Color color) {
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.direction = direction;
        this.color = color;
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
}
