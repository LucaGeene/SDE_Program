package com.program.states;

import com.program.GameFacade;
import com.program.State;
import com.program.console.ConsoleReader;
import com.program.console.ConsoleWriter;

import java.util.ArrayList;

public class EncounterEndState implements State {
    private ArrayList<String> character;
    private ArrayList<Integer> characterstats;
    private String reason;

    private final GameFacade gameFacade;
    private final ConsoleWriter writer;
    private final ConsoleReader reader;

    public EncounterEndState(GameFacade gameFacade, ArrayList<String> character, ArrayList<Integer> characterstats, ConsoleWriter writer, ConsoleReader reader, String reason) {
        this.gameFacade = gameFacade;
        this.character = character;
        this.characterstats = characterstats;
        this.writer = writer;
        this.reader = reader;
        this.reason = reason;
    }

    @Override
    public void startState() {

    }
}
