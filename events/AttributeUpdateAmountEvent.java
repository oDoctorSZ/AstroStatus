package com.astro.astrostats.events;

import com.astro.astrostats.capabilities.Attributes;

public class AttributeUpdateAmountEvent extends AstroEvent {

    private final Attributes type;
    private int amount;

    public AttributeUpdateAmountEvent(Attributes type, int amount) {
        this.type = type;
        this.amount = amount;
    }

    public Attributes getType() {
        return type;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
