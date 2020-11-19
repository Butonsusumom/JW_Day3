package com.tsubulko.balls.service;

import com.tsubulko.balls.entity.Ball;
import com.tsubulko.balls.entity.Basket;
import com.tsubulko.balls.entity.Color;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;


import java.util.ArrayList;

public class BasketService {

    static final Logger log = LogManager.getRootLogger();

    public int getColorCount(Basket basket, Color color) {

        int numOfBalls = 0;
        ArrayList<Ball> balls = basket.getBalls();

        for (Ball ball: balls)
        {
            if (ball.getColor() == color)
                numOfBalls++;
        }

        log.info("Count all "+color.toString()+" balls");
        return numOfBalls;
    }
}
