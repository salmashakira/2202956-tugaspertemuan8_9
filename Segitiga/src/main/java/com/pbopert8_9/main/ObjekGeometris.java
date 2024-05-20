/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pbopert8_9.main;

/**
 *
 * @author A S U S
 */
public class ObjekGeometris {
    private String color = "white";
    private boolean filled;

    public ObjekGeometris() {
    }

    public ObjekGeometris(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Warna: " + color + " Diisi: " + filled;
    }
}