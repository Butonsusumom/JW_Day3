package com.tsubulko.main;

import com.tsubulko.entity.Ball;
import com.tsubulko.entity.Basket;
import com.tsubulko.entity.Color;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ArrayList<Ball> balls = new ArrayList<>(Arrays.asList(
                new Ball(Color.BLUE, 0.2),
                new Ball(Color.BLACK, 0.3),
                new Ball(Color.RED, 0.1),
                new Ball(Color.BLUE, 0.2)
        ));

        Basket basket = new Basket(balls);
        System.out.println("Balls inside the basket: ");
        for (Ball ball: basket.getBalls()) {
            System.out.println(ball);
        }
        System.out.println(basket.getColorCount(Color.BLUE));

    }
}
