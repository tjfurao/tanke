package com.fr.tankGame.drawing;

import com.fr.tankGame.resources.HostilesTank;
import com.fr.tankGame.resources.PlayerTank;
import com.fr.tankGame.resources.Tank;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

/**
 * @Author: F
 * @DateTime: 2021/10/18 10:33
 * @Description: 绘图
 */
public class MyPanel extends JPanel implements KeyListener {


    private Tank tank = null;
    private Vector<HostilesTank> hostilesTanks = new Vector<HostilesTank>();
    int hostilesNum = 3;
    public MyPanel() {
        tank = new PlayerTank(500,500);//初始化
        for (int i = 0; i < hostilesNum; i++) {

            hostilesTanks.add(new HostilesTank(100 * (i + 1) ,0));
        }
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0,0,1000,750);//绘制画布
        drawTank(tank,g);
        for (int i = 0; i < hostilesTanks.size(); i++) {
            drawTank(hostilesTanks.get(i),g);
        }

    }

    //绘制坦克
    public void drawTank(Tank t,Graphics g) {
        g.setColor(t.getColor());//设置颜色
        switch (t.getDirection()){
            case 0 :
                g.fill3DRect(t.getX(),t.getY(),10,60,false);
                g.fill3DRect(t.getX() + 30,t.getY(),10,60,false);
                g.fill3DRect(t.getX() + 10,t.getY() + 10,20,40,false);
                g.fillOval(t.getX() + 10,t.getY() + 20,20,20);
                g.drawLine(t.getX() + 20,t.getY() + 20,t.getX() + 20,t.getY());
                break;
            case 1 :
                g.fill3DRect(t.getX(),t.getY(),60,10,false);
                g.fill3DRect(t.getX(),t.getY() + 30,60,10,false);
                g.fill3DRect(t.getX() + 10,t.getY() + 10,40,20,false);
                g.fillOval(t.getX() + 20,t.getY() + 10,20,20);
                g.drawLine(t.getX() + 40,t.getY() + 20,t.getX() + 60,t.getY() + 20);
                break;
            case 2 :
                g.fill3DRect(t.getX(),t.getY(),10,60,false);
                g.fill3DRect(t.getX() + 30,t.getY(),10,60,false);
                g.fill3DRect(t.getX() + 10,t.getY() + 10,20,40,false);
                g.fillOval(t.getX() + 10,t.getY() + 20,20,20);
                g.drawLine(t.getX() + 20,t.getY() + 40,t.getX() + 20,t.getY() + 60);
                break;
            case 3 :
                g.fill3DRect(t.getX(),t.getY(),60,10,false);
                g.fill3DRect(t.getX(),t.getY() + 30,60,10,false);
                g.fill3DRect(t.getX() + 10,t.getY() + 10,40,20,false);
                g.fillOval(t.getX() + 20,t.getY() + 10,20,20);
                g.drawLine(t.getX() + 20,t.getY() + 20,t.getX(),t.getY() + 20);
                break;
        }

    }


    public void keyTyped(KeyEvent e) {

    }

    //键盘按下事件
    public void keyPressed(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_W){
            tank.setDirection(0);
            tank.moveUp();
        }
        else if (e.getKeyCode() == KeyEvent.VK_D){
            tank.setDirection(1);
            tank.moveRright();
        }
        else if (e.getKeyCode() == KeyEvent.VK_S){
            tank.setDirection(2);
            tank.moveDown();
        }
        else if (e.getKeyCode() == KeyEvent.VK_A){
            tank.setDirection(3);
            tank.moveLeft();
        }

        this.repaint();//从新绘制
    }

    //键盘松开事件
    public void keyReleased(KeyEvent e) {

    }
}
