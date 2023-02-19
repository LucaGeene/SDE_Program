package com.program.states;

import com.program.State;
import com.program.console.ConsoleWriter;
import com.program.console.ConsoleReader;
import com.program.GameFacade;

import java.util.ArrayList;

public class MenuState implements State{

    private ArrayList<String> character;
    private ArrayList<Integer> characterstats;

    private final GameFacade gameFacade;
    private final ConsoleWriter writer;
    private final ConsoleReader reader;



    public MenuState(GameFacade gameFacade, ArrayList<String> character, ArrayList<Integer> characterstats, ConsoleWriter writer, ConsoleReader reader) {
        this.gameFacade = gameFacade;
        this.character = character;
        this.characterstats = characterstats;
        this.writer = writer;
        this.reader = reader;
    }

    public void startState() {
        // Display ASCII 'MENU'
        writer.write("");
        writer.write("  __  __  ");
        writer.write(" |  \\/  | ___ _ __  _   _ ");
        writer.write(" | |\\/| |/ _ \\ '_ \\| | | |");
        writer.write(" | |  | |  __/ | | | |_| |");
        writer.write(" |_|  |_|\\___|_| |_|\\__,_|");
        writer.write("");

        writer.write("Select one of the following options:");
        writer.write("[fight]: starts a battle.");
        writer.write("[info]: displays information about your character and statistics you've done so far.");
        writer.write("[exit]: exits the game (NOTE: this will reset your progress and character (maybe someday it won't, who knows ¯\\_(ツ)_/¯ ))");

        while(true) {
            String choice = reader.readLine().toLowerCase();
            switch(choice) {
                case"fight":
                    this.gameFacade.encounterState(this.character, this.characterstats);
                case"info":
                    this.gameFacade.infoState(this.character, this.characterstats);
                case"exit":
                    writer.write("Thanks for playing!");
                    System.exit(0);
                default:
                    writer.write("The only choices are 'fight', 'info' or 'exit'. You CANNOT mess that up. Try again.");

            }
        }
    }
}
