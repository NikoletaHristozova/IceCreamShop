package com.uni.icecream.type;

import com.uni.icecream.IceCream;

import java.math.BigDecimal;

public class StrawberryIceCream extends IceCream {

    public StrawberryIceCream() {
        this.name = "Strawberry";
        this.price = new BigDecimal("2.90");
    }
}
