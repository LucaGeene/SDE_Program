package com.program.people;

import java.util.ArrayList;
import java.util.Random;

public class PositivePerson implements Person {
    private String[] names = {"Dragon", "Giant", "Cyclops"};
    private int[] health = {80, 200, 170, 300, 110};

    private String[] atkNames = {"arm swipe", "stomp", "sting", "scratch"};
    private int[] atkDamage = {11, 20, 15, 9, 27};

    private String[] spNames = {"firebreath", "huge attack", "chomp"};
    private int[] spDamage = {80, 99, 50, 72};

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
