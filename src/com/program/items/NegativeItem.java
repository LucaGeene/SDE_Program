package com.program.items;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class NegativeItem implements Item{
    private String[] names = {"spikes", "a splinter", ""};
    private int[] damages = {1, 2, 100, 50, 20, 10, 5, 7};
    private String side = "negative";

    private Random random = new Random();
    @Override
    public List<? extends Serializable> createItem() {
        int magicName = random.nextInt(names.length);
        int magicDamage = random.nextInt(damages.length);
        String name = names[magicName];
        int damage = damages[magicDamage];
        return Arrays.asList(side, name, damage);

    }
}
