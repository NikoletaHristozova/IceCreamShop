package com.uni.icecream.factory;

import com.uni.icecream.IceCream;
import com.uni.icecream.type.StrawberryIceCream;

public class StrawberryIceCreamFactory extends IceCreamFactory{

    protected IceCream createIceCream() {
        return new StrawberryIceCream();
    }
}
