package com.program.factories;

import com.program.items.Item;
import com.program.items.PositiveItem;
import com.program.people.Person;
import com.program.people.PositivePerson;

public class PositiveEncounter extends Encounter {

    @Override
    public Item createItem() {
        return new PositiveItem();
    }

    @Override
    public Person createPerson() {
        return new PositivePerson();
    }
}
