package com.uni.icecream.factory;

import com.uni.icecream.IceCream;
import com.uni.icecream.type.VanillaIceCream;

public class VanillaIceCreamFactory extends IceCreamFactory{

    protected IceCream createIceCream() {
        return new VanillaIceCream();
    }
}
