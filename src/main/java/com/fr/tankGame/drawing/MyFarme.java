package com.fr.tankGame.drawing;

import javax.swing.*;

/**
 * @Author: F
 * @DateTime: 2021/10/18 10:50
 * @Description: 画板
 */
public class MyFarme extends JFrame {

    MyPanel mp ;

    public MyFarme() {
        mp = new MyPanel();
        this.add(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置关闭按钮退出程序
        this.setSize(1000,750);//设置画笔大小
        this.addKeyListener(mp);
        this.setVisible(true);//是否显示

    }
}
