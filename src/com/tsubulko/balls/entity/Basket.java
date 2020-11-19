package com.tsubulko.balls.entity;


import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.text.MessageFormat;
import java.util.ArrayList;

public class Basket
{
    static final Logger log = LogManager.getRootLogger();

    private ArrayList<Ball> balls;
    private double weight;

    public void add(Ball newBall) {
        if (newBall == null)
            throw new NullPointerException();

        this.balls.add(newBall);
        this.weight += newBall.getWeight();
        log.info("Add ball to basket");
    }

    public void remove(Ball ball) {
        balls.remove(ball);
        this.weight -= ball.getWeight();
        log.info("Remove ball from basket");
    }

    public Basket() {
        this.balls = new ArrayList<>();
        log.info("Create basket");
    }

    public Basket(ArrayList<Ball> balls) {
        if (balls == null) {
            log.error("Null pointer");
        }

        this.balls = new ArrayList<>();
        for (Ball ball: balls) {
            add(ball);
        }
            log.info("Create basket");
    }

    public ArrayList<Ball> getBalls() {
        return balls;
    }

    public void setBalls(ArrayList<Ball> balls) {
        this.balls = balls;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return MessageFormat.format("Basket'{'balls=, weight={0}{1}'}'", balls, weight);
    }
}