package com.program.people;

import java.util.ArrayList;
import java.util.Random;


public class NegativePerson implements Person {
    private String[] names = {"Robber", "Hobo", "Dragon", "Goblin"};
    private int[] health = {95, 110, 80, 30, 10};

    private String[] atkNames = {"swipe", "stomp", "sting", "screech"};
    private int[] atkDamage = {1, 10, 17, 6, 24};

    private String[] spNames = {"slice", "smack", "stab"};
    private int[] spDamage = {0, 60, 44, 72};

    private final Random random = new Random();


    @Override
    public String getName() {
        int magic = random.nextInt(names.length);
        return names[magic];
    }

    @Override
    public int getHealth() {
        int magic = random.nextInt(health.length);
        return health[magic];
    }

    @Override
    public ArrayList<String> getAtk() {
        int magicName = random.nextInt(atkNames.length);
        int magicDamage = random.nextInt(atkDamage.length);
        ArrayList<String> atk = new ArrayList<>();
        atk.add(atkNames[magicName]);
        atk.add(String.valueOf(atkDamage[magicDamage]));
        return atk;
    }

    @Override
    public ArrayList<String> getSp() {
        int magicName = random.nextInt(spNames.length);
        int magicDamage = random.nextInt(spDamage.length);
        ArrayList<String> sp = new ArrayList<>();
        sp.add(spNames[magicName]);
        sp.add(String.valueOf(spDamage[magicDamage]));
        return sp;
    }
}
