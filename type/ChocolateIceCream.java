package com.uni.icecream.type;

import com.uni.icecream.IceCream;

import java.math.BigDecimal;

public class ChocolateIceCream extends IceCream {

    public ChocolateIceCream() {
        this.name = "Chocolate";
        this.price = new BigDecimal("2.80");
    }

}
