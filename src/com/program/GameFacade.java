package com.program;

import com.program.console.ConsoleWriter;
import com.program.console.ConsoleReader;
import com.program.states.CreatorState;
import com.program.states.MenuState;
import com.program.states.InfoState;
import com.program.states.EncounterState;
import com.program.states.EncounterEndState;

import java.util.ArrayList;


/* interface between everything */
public class GameFacade {

    private ConsoleWriter writer = new ConsoleWriter();
    private ConsoleReader reader = new ConsoleReader();

    private State state;

    private ArrayList<String> character;
    private ArrayList<String> characterstats;
    private ArrayList<String> enemy;


    protected void creatorState() {
        this.state = new CreatorState(this, this.writer, this.reader);
            state.startState();
    }

    public void menuState(ArrayList<String> character, ArrayList<Integer> characterstats) {
        this.state = new MenuState(this, character, characterstats, this.writer, this.reader);
        state.startState();
    }


    public void encounterState(ArrayList<String> character, ArrayList<Integer> characterstats) {
        this.state = new EncounterState(this, character, characterstats, this.writer, this.reader);
        state.startState();
    }

    public void encounterEndState(ArrayList<String> character, ArrayList<Integer> characterstats, String reason) {
        this.state = new EncounterEndState(this, character, characterstats, this.writer, this.reader, reason);
        state.startState();
    }
    public void infoState(ArrayList<String> character, ArrayList<Integer> characterstats) {
        this.state = new InfoState(this, character, characterstats, this.writer, this.reader);
        state.startState();
    }


}
