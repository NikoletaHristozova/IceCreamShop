package com.uni.icecream.decorator;

import com.uni.icecream.IceCream;

public abstract class IceCreamDecorator extends IceCream {

    private final IceCream iceCream;

    public IceCreamDecorator(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    public String eatMe() {
        return iceCream.eatMe();
    }

}
