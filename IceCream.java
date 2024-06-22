package com.uni.icecream;

import java.math.BigDecimal;

public abstract class IceCream {

    protected String name;
    protected BigDecimal price;

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String eatMe() {
        return "Eat " + name + " ice cream";
    }
}
