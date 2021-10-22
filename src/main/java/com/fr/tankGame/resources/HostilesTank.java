package com.fr.tankGame.resources;

import java.awt.*;

/**
 * @Author: F
 * @DateTime: 2021/10/18 11:26
 * @Description: TODO
 */
public class HostilesTank extends Tank {

    public HostilesTank(int x,int y) {
        super(x,y,3,2,Color.cyan);
        this.setColor(Color.CYAN);
    }

}
