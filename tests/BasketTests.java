import com.tsubulko.balls.entity.Ball;
import com.tsubulko.balls.entity.Basket;
import com.tsubulko.balls.entity.Color;
import com.tsubulko.balls.service.BasketService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class BasketTests {

    BasketService basketService;
    static final Logger log = LogManager.getRootLogger();

    @Before
    public void basketCreatingSetUp() {
         basketService= new BasketService();
    }

    @Test
    public void basketCreatingTestConstructor() {
        ArrayList<Ball> balls = new ArrayList<>(Arrays.asList(
                new Ball(Color.BLUE, 0.2),
                new Ball(Color.BLACK, 0.3),
                new Ball(Color.RED, 0.1),
                new Ball(Color.BLUE, 0.2)
        ));
        Basket basket = new Basket(balls);
        assertEquals(2, basketService.getColorCount(basket, Color.BLUE));
        assertEquals(0.8D, basket.getWeight(), 0.1);
    }

    @Test
    public void basketCreatingTestAddByElement() {
        Basket basket = new Basket();
        basket.add(new Ball(Color.BLUE, 0.2));
        basket.add(new Ball(Color.BLACK, 0.3));
        basket.add(new Ball(Color.RED, 0.1));
        basket.add(new Ball(Color.BLUE, 0.2));
        assertEquals(2, basketService.getColorCount(basket,Color.BLUE));
        assertEquals(0.8D, basket.getWeight(), 0.1);
    }

    @Test
    public void basketCreatingTestRemove() {
        Basket basket = new Basket();
        Ball blueBall = new Ball(Color.BLUE, 0.2);
        Ball redBall = new Ball(Color.RED, 0.2);
        Ball greenBall = new Ball(Color.GREEN, 0.2);
        basket.add(blueBall); basket.add(redBall); basket.add(greenBall);
        basket.remove(redBall);
        assertEquals(0, basketService.getColorCount(basket,Color.RED));
        assertEquals(0.8D, basket.getWeight(), 0.4);
    }
}
