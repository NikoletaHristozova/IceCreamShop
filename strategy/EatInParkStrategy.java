package com.uni.icecream.strategy;

import com.uni.icecream.IceCream;

public class EatInParkStrategy implements EatStrategy{

    public String eatIceCream(IceCream iceCream) {
        return iceCream.eatMe() + " in the park";
    }
}
