package com.uni.icecream.factory;

import com.uni.icecream.IceCream;

public abstract class IceCreamFactory {

    public IceCream create() {
        return createIceCream();
    }

    protected abstract IceCream createIceCream();
}
