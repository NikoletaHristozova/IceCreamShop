package com.uni.icecream;

import com.uni.icecream.factory.ChocolateIceCreamFactory;
import com.uni.icecream.factory.IceCreamFactory;
import com.uni.icecream.factory.StrawberryIceCreamFactory;
import com.uni.icecream.factory.VanillaIceCreamFactory;

public enum Store {
    INSTANCE;

    public IceCream sellIceCream(String type) {

        IceCreamFactory iceCreamFactory;

        switch (type) {
            case "Chocolate" :
                iceCreamFactory = new ChocolateIceCreamFactory();
                break;
            case "Strawberry" :
                iceCreamFactory = new StrawberryIceCreamFactory();
                break;
            default :
                iceCreamFactory = new VanillaIceCreamFactory();
        }

        return iceCreamFactory.create();
    }
}
