package com.uni.icecream.factory;

import com.uni.icecream.IceCream;
import com.uni.icecream.type.ChocolateIceCream;

public class ChocolateIceCreamFactory extends IceCreamFactory{

    protected IceCream createIceCream() {
        return new ChocolateIceCream();
    }
}
