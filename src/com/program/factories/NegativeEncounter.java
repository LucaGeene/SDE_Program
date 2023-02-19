package com.program.factories;

import com.program.items.Item;
import com.program.items.NegativeItem;
import com.program.people.NegativePerson;
import com.program.people.Person;

public class NegativeEncounter extends Encounter{

    @Override
    public Item createItem() {
        return new NegativeItem();
    }

    @Override
    public Person createPerson() {
        return new NegativePerson();
    }
}
