package com.uni.icecream.decorator;

import com.uni.icecream.IceCream;

public class ChocolateSticksDecorator extends IceCreamDecorator {

    public ChocolateSticksDecorator(IceCream iceCream) {
        super(iceCream);
    }

    public String eatMe() {
        return super.eatMe() + decorate();
    }

    private String decorate() {
        return " with chocolate sticks";
    }
}
