package com.program.states;

import com.program.GameFacade;
import com.program.State;
import com.program.console.ConsoleReader;
import com.program.console.ConsoleWriter;
import com.program.console.Waiter;

import java.util.ArrayList;

public class InfoState implements State {

    private final ArrayList<String> character;
    private final ArrayList<Integer> characterstats;

    private final GameFacade gameFacade;
    private final ConsoleWriter writer;
    private final ConsoleReader reader;

    public InfoState(GameFacade gameFacade, ArrayList<String> character, ArrayList<Integer> characterstats, ConsoleWriter writer, ConsoleReader reader) {
        this.gameFacade = gameFacade;
        this.character = character;
        this.characterstats = characterstats;
        this.writer = writer;
        this.reader = reader;
    }


    @Override
    public void startState() {
        writer.write("Here they are.");
        writer.write(" ___________________________________ "); // 35 underscores
        writer.write("|          Your adventurer          |");
        writer.write("| Name: " + this.character.get(0));
        writer.write("| Age: " + this.character.get(1));
        writer.write("| Class: " + this.character.get(2));
        writer.write("|                              |");
        writer.write("| Species: " + this.character.get(3));
        writer.write("| Height: " + this.character.get(4));
        writer.write("| Number of fingers: " + this.character.get(5));
        writer.write("| Accessory: " + this.character.get(6));
        writer.write("|___________________________________|");
        writer.write("|            Statistics             |");
        writer.write("| Enemies killed: " + this.characterstats.get(0));
        writer.write("| Times died: " + this.characterstats.get(1));
        writer.write("| Times fled(weak): " + this.characterstats.get(2));
        writer.write("|___________________________________|");
        writer.write("");

        Waiter.waitLong();
        this.returnToMenu();

    }

    private void returnToMenu() {
        writer.write("Type anything to go back to the menu.");
        reader.readLine();
        this.gameFacade.menuState(this.character, this.characterstats);
    }

}
