package com.tsubulko.entity;

import org.apache.log4j.Logger;

public class Ball {
    private Color color;
    private double weight;

    static Logger log = Logger.getLogger(Ball.class.getName());

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Ball(Color color, double weight){
        this.color = color;
        this.weight = weight;
        log.info("Create ball");
    }

    @Override
    public String toString() {
        return "Ball{" +
                "color=" + color +
                ", weight=" + weight +
                '}';
    }
}