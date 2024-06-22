package com.uni.icecream.strategy;

import com.uni.icecream.IceCream;

public class EatOnTheBeachStrategy implements EatStrategy{

    public String eatIceCream(IceCream iceCream) {
        return iceCream.eatMe() + " on the beach";
    }
}
