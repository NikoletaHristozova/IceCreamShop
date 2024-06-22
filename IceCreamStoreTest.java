package com.uni.icecream;

import com.uni.icecream.decorator.ChocolateGlazeDecorator;
import com.uni.icecream.decorator.ChocolateSticksDecorator;
import com.uni.icecream.strategy.EatInParkStrategy;
import com.uni.icecream.strategy.EatInStoreStrategy;
import com.uni.icecream.strategy.EatOnTheBeachStrategy;
import com.uni.icecream.strategy.EatStrategy;

public class IceCreamStoreTest {

    public static void main(String[] args) {

        // Singleton
        Store store = Store.INSTANCE;

        // Factory

        IceCream vanillaIceCream = store.sellIceCream("Vanilla");
        System.out.println("Sell 1 " + vanillaIceCream.getName() + " ice cream for " + vanillaIceCream.getPrice() + " lv");

        IceCream chocolateIceCream = store.sellIceCream("Chocolate");
        System.out.println("Sell 1 " + chocolateIceCream.getName() + " ice cream for " + chocolateIceCream.getPrice() + " lv");

        IceCream strawberryIceCream = store.sellIceCream("Strawberry");
        System.out.println("Sell 1 " + strawberryIceCream.getName() + " ice cream for " + strawberryIceCream.getPrice() + " lv");

        // Decorator

        IceCream glazeDecorator = new ChocolateGlazeDecorator(strawberryIceCream);
        System.out.println(glazeDecorator.eatMe());

        IceCream sticksDecorator = new ChocolateSticksDecorator(strawberryIceCream);
        System.out.println(sticksDecorator.eatMe());

        // Strategy

        EatStrategy eatStrategy;

        eatStrategy = new EatInStoreStrategy();
        System.out.println(eatStrategy.eatIceCream(chocolateIceCream));

        eatStrategy = new EatInParkStrategy();
        System.out.println(eatStrategy.eatIceCream(glazeDecorator));

        eatStrategy = new EatOnTheBeachStrategy();
        System.out.println(eatStrategy.eatIceCream(sticksDecorator));

    }
}
