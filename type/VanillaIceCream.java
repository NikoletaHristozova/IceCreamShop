package com.uni.icecream.type;

import com.uni.icecream.IceCream;

import java.math.BigDecimal;

public class VanillaIceCream extends IceCream {

    public VanillaIceCream() {
        this.name = "Vanilla";
        this.price = new BigDecimal("2.50");
    }

}
