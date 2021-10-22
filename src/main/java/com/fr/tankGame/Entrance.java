package com.fr.tankGame;

import com.fr.tankGame.drawing.MyFarme;

/**
 * @Author: F
 * @DateTime: 2021/10/18 10:53
 * @Description: 入口程序
 */
public class Entrance {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        int i = runtime.availableProcessors();
        System.out.println(i);
        MyFarme myFarme = new MyFarme();

    }
}
