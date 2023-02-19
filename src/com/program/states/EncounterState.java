package com.program.states;

import com.program.GameFacade;
import com.program.State;
import com.program.console.ConsoleReader;
import com.program.console.ConsoleWriter;
import com.program.console.Waiter;
import com.program.factories.Encounter;

import com.program.items.Item;
import com.program.people.Person;

import java.util.ArrayList;

public class EncounterState implements State {
    private ArrayList<String> character;
    private ArrayList<Integer> characterstats;
    private String reason = "";

    private final GameFacade gameFacade;
    private final ConsoleWriter writer;
    private final ConsoleReader reader;

    private Person person;
    public EncounterState(GameFacade gameFacade, ArrayList<String> character, ArrayList<Integer> characterstats, ConsoleWriter writer, ConsoleReader reader) {
        this.gameFacade = gameFacade;
        this.character = character;
        this.characterstats = characterstats;
        this.writer = writer;
        this.reader = reader;
    }

    @Override
    public void startState() {
        //Clear screen
        System.out.print("\033[H\033[2J");
        System.out.flush();

        Waiter.waitMiddle();
        writer.write("To be honest, this sadly doesn't work quite yet. I won't implement a (I know, MAIN) feature that could only be slightly functional.");
        Waiter.waitLong();
        writer.write("Sooo.. back to the menu you go. :(");

        this.gameFacade.menuState(character, characterstats);

    }

    private void positiveItem(Encounter encounter) {

    }

    private void negativeItem(Encounter encounter) {

    }

    private void positivePerson(Encounter encounter) {

    }

    private void negativePerson(Encounter encounter) {

    }



    private void getEncounter(){

    }
}
