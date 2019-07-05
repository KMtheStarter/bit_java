/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex6;

import java.awt.Color;
import java.io.Serializable;

/**
 *
 * @author bit
 */
public class Data implements Serializable{
    private String chatting;
    private int x, y;
    private Color color;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getChatting() {
        return chatting;
    }

    public void setChatting(String chatting) {
        this.chatting = chatting;
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
