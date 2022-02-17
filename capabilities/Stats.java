package com.astro.astrostats.capabilities;

import java.util.HashMap;

public class Stats implements IStats {

    private final HashMap<Attributes, Integer> attributes = new HashMap<>();


    @Override
    public int getStats(Attributes type) {
        return attributes.getOrDefault(type, 0);
    }

    @Override
    public void setStats(Attributes type, int value) {
        attributes.put(type, value);
    }
}
