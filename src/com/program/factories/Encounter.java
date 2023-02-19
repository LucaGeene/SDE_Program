package com.program.factories;

import com.program.items.Item;
import com.program.people.Person;

public abstract class Encounter {
    public abstract Item createItem();

    public abstract Person createPerson();
}
