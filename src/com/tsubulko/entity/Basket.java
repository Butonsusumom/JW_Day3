package com.tsubulko.entity;

import org.apache.log4j.Logger;

import java.util.ArrayList;

public class Basket
{
    private ArrayList<Ball> balls;
    private double weight;

    static Logger log = Logger.getLogger(Basket.class.getName());

    public Basket()
    {
        this.balls = new ArrayList<>();
        log.info("Create basket");
    }

    public Basket(ArrayList<Ball> balls)
    {
        if (balls == null)
            throw new NullPointerException();

        this.balls = new ArrayList<>();
        for (Ball ball: balls)
            add(ball);
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
        return "Basket{" +
                "balls=" + balls +
                ", weight=" + weight +
                '}';
    }

    //region Public API

    public void add(Ball newBall)
    {
        if (newBall == null)
            throw new NullPointerException();

        this.balls.add(newBall);
        this.weight += newBall.getWeight();
        log.info("Add ball to basket");
    }

    public void remove(Ball ball){
        balls.remove(ball);
        this.weight -= ball.getWeight();
        log.info("Remove ball from basket");
    }

    public int getColorCount(Color color)
    {
        int numOfBalls = 0;
        for (Ball  ball: balls)
        {
            if (ball.getColor() == color)
                numOfBalls++;
        }
        log.info("Count all "+color.toString()+" balls");
        return numOfBalls;

    }

    //endregion
}