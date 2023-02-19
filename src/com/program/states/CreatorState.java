package com.program.states;

import com.program.State;
import com.program.console.ConsoleWriter;
import com.program.console.ConsoleReader;
import com.program.console.Waiter;
import com.program.GameFacade;

import java.util.ArrayList;


public class CreatorState implements State {

    private final ArrayList<String> character = new ArrayList<>();
    /* 0: name DONE
     * 1: age DONE
     * 2: class DONE
     * 3: species DONE
     * 4: height DONE
     * 5: no. of fingers DONE
     * 6: accessory DONE
     * FOR ENCOUNTER
     * 7: current health
     * 8: max health
     */

    private final ArrayList<Integer> characterstats = new ArrayList<>();
    /* 0: kills
     * 1: deaths
     * 2: flees
     * 3: gold collected
     *
     */

    private GameFacade gameFacade;
    private ConsoleWriter writer;
    private ConsoleReader reader;

    public CreatorState(GameFacade gameFacade, ConsoleWriter writer, ConsoleReader reader) {
        this.gameFacade = gameFacade;
        this.writer = writer;
        this.reader = reader;
    }

//    @Override
//    public void startState() {
//        this.character.add("luca");
//        this.gameFacade.menuState(this.character, this.characterstats);
//    }

    //Temp skip to menu, add this back and remove above for full game
    @Override
    public void startState() {
        writer.write("Welcome to this awesome little game!");
        Waiter.waitShort();
        writer.write("In order to get you started, you have to create a character. But don't worry, we got you covered! ");
        writer.write("Are you EXCITED?!?!");
        reader.readLine(); //Doesn't matter what the answer is
        writer.write("I hope you wrote something in the from of 'YESSIR!!' because I maaay not have been paying attention..");
        Waiter.waitMiddle();
        writer.write("Anyways... ");

        this.setName();
    }

    //Name
    private void setName() {
        Waiter.waitMiddle();
        writer.write("Let's start with your name. How can we call you, (hopefully young) adventurer?");
        String name = reader.readLine();
        this.character.add(name);
        writer.write("Welcome, " + this.character.get(0) + ", nice to meet you!");
        writer.write("You should know that, at the end, you get the chance to review your created character. Let's get going, shall we?");
        this.setAge();
    }

    //Age
    private void setAge() {
        while (true) {
            Waiter.waitMiddle();
            writer.write("How old would you like to be?");
            // needs to give an 'else', when string is given
            try {
                int age = Integer.parseInt(reader.readLine());
                if (age < 0) {
                writer.write("I don't think you can go on a quest from inside your mom's womb. How are you even typing?");
            } else if (age >= 0 && age < 9) {
                writer.write("Sorry, no pants-wetters allowed.");
            } else if (age >= 9 && age < 13) {
                writer.write("Aren't you a little young to go on a quest all by yourself?");
                this.character.add(String.valueOf(age));
                break;
            } else if (age >= 13 && age < 20) {
                writer.write("Aw, we've got a baby here!");
                this.character.add(String.valueOf(age));
                break;
            } else if (age >= 20 && age < 50) {
                writer.write("Ah, still in the prime of your life..");
                this.character.add(String.valueOf(age));
                break;
            } else if (age >= 50 && age < 80) {
                writer.write("Might still got some flexibility, but also some old-people-wisdom. Hmm, seems okay, I guess.");
                this.character.add(String.valueOf(age));
                break;
            } else if (age >= 80) {
                    writer.write("Something about old people being wise. We'll see whether or not that proverb is true.");
                    this.character.add(String.valueOf(age));
                    break;
                }
            // catches string, returns message
            } catch (NumberFormatException e) {
                writer.write("I don't think you did what I asked. Just a number, please.");
            }
        }
        this.setClass();
    }

    //Class (mage, barbarian, assassin)
    private void setClass() {
        Waiter.waitMiddle();
        writer.write("Time to choose a class. Let's not make this too hard and give you three options.");
        while (true) {
            writer.write("Do you want to be: A [mage], a [barbarian] or an [assassin]?");
            String characterClass = reader.readLine().toLowerCase();
            switch (characterClass) {
                case "mage" -> {
                    writer.write("Time to focus and hocus-pocus your way out of here.");
                    this.character.add(characterClass);
                    this.setSpecies();
                }
                case "barbarian" -> {
                    writer.write("RAAAH! GRRR. Angry noises, blood, fighting! That's your language, right?");
                    this.character.add(characterClass);
                    this.setSpecies();
                }
                case "assassin" -> {
                    writer.write("Please don't kill me! I'm here to help you complete your quest!");
                    this.character.add(characterClass);
                    this.setSpecies();
                }
                default ->
                    writer.write("It was so easy! I gave you three options to pick from.");
            }
        }
    }

    //Species
    private void setSpecies() {
        Waiter.waitMiddle();
        writer.write("As what type of species would you prefer to finish your quest?");
        while (true) {
            writer.write("You can choose from the following options: A [dwarf], an [elf], a [human], a [dragonborn] or a [tortle].");
            String species = reader.readLine().toLowerCase();
            switch (species) {
                case "dwarf" -> {
                    writer.write("You must be a nice person. Never looking down on anyone.");
                    this.character.add(species);
                    this.setHeight();
                }
                case "elf" -> {
                    writer.write("You'll be hearing more from me.. Got it? Because of your ears? Yeah, no, okay.");
                    this.character.add(species);
                    this.setHeight();
                }
                case "human" -> {
                    writer.write("Kinda boring, don't you think?");
                    this.character.add(species);
                    this.setHeight();
                }
                case "dragonborn" -> {
                    writer.write("Is it me or is it getting hot in here?");
                    this.character.add(species);
                    this.setHeight();
                }
                case "tortle" -> {
                    writer.write("Slow and steady wins the race, they say.");
                    this.character.add(species);
                    this.setHeight();
                }
                default ->
                        writer.write("No making up your own species here. Please pick one of the options I gave you.");
            }
        }

    }

    //Height
    private void setHeight() {
        Waiter.waitMiddle();
        while (true) {
            writer.write("How tall, or short, would you like to be? In centimeters.");
            try {
                int height = Integer.parseInt(reader.readLine());
                if (height <= 0) {
                writer.write("You can't exactly go on a quest if you're, well.. not there.");
            } else if (height > 0 && height < 90) {
                writer.write("Yeah, no, that's not going to work, sorry. Maybe try some growth hormones and come back later.");
            } else if (height >= 90 && height < 165) {
                writer.write("I guess you like sneaking around, huh?");
                this.character.add(String.valueOf(height));
                break;
            } else if (height >= 165 && height < 185) {
                writer.write("Average height.. Couldn't come up with something more exciting?");
                this.character.add(String.valueOf(height));
                break;
            } else if (height >= 185 && height < 215) {
                writer.write("Great choice! ..Quite literally. ");
                this.character.add(String.valueOf(height));
                break;
            } else if (height >= 215 && height < 325) {
                writer.write("How's the weather up there?");
                this.character.add(String.valueOf(height));
                break;
            } else if (height >= 325) {
                    writer.write("Don't you think that's a tad bit too much? You won't fit anywhere.");
                }
            } catch (NumberFormatException e) {
                writer.write("Didn't I already tell you your height was in centimeters? Just input a number without any fancy extras, please.");
            }
        }
        this.setFingers();
    }


    //Fingers
    private void setFingers() {
        Waiter.waitMiddle();
        while (true) {
            writer.write("How many fingers, in total, would make you the happiest?");
            try {
                int fingers = Integer.parseInt(reader.readLine());
                if (fingers < 0) {
                writer.write("What do you think that looks like? It's impossible.");
            } else if (fingers == 0) {
                writer.write("New nickname \"Stumpy\" achieved.");
                this.character.add(String.valueOf(fingers));
                break;
            } else if (fingers > 0 && fingers < 6) {
                writer.write("Just enough fingers for one hand, but hey.. whatever floats your boat.");
                this.character.add(String.valueOf(fingers));
                break;
            } else if (fingers >= 6 && fingers < 11) {
                writer.write("You could fill two hands with that amount of fingers, I presume.");
                this.character.add(String.valueOf(fingers));
                break;
            } else if (fingers >= 11 && fingers < 21) {
                writer.write("There's a limited amount of holes to stick your finger in and also a limited amount of buttons you can push.");
                writer.write("I wonder what you're going to do with those extra fingers.. Extra compared to me, a human, of course.");
                this.character.add(String.valueOf(fingers));
                break;
            } else if (fingers >= 21) {
                    writer.write("That's a crazy amount of fingers.");
                    writer.write("Where are you going to put all those fingers? They're still supposed to fit on your hands.");
                }
            } catch (NumberFormatException e) {
                writer.write("I don't know why you thought that answer was going to work, but I just want a number, please.");
            }
        }
        this.setAccessory();
    }

    //Accessory
    private void setAccessory() {
        Waiter.waitMiddle();
        writer.write("Would you like to have an accessory? [yes] or [no]");
        while (true) {
            String accessoryChoice = reader.readLine().toLowerCase();
            switch (accessoryChoice) {
                case "yes" -> {
                    writer.write("Great! Now you can choose whichever accessory you would like.");
                    String accessory = reader.readLine().toLowerCase();
                    this.character.add(accessory);
                    this.finalConfirmation();
                }
                case "no" -> {
                    writer.write("That's a shame. You could've chosen whatever you would have liked.");
                    String accessory = "No accessory picked.";
                    this.character.add(accessory);
                    this.finalConfirmation();
                }
                default ->
                        writer.write("I gave you a simple task. Just a [yes] or [no], please.");
            }
        }
    }

// TODO create character session with attributes.

    private void finalConfirmation() {
        Waiter.waitMiddle();
        writer.write("Alright, we're done!");
        writer.write("So far, your character is this:");
        writer.write(" ___________________________________ "); // 35 underscores
        writer.write("| Name: " + this.character.get(0));
        writer.write("| Age: " + this.character.get(1));
        writer.write("| Class: " + this.character.get(2));
        writer.write("|                                   |");
        writer.write("| Species: " + this.character.get(3));
        writer.write("| Height: " + this.character.get(4));
        writer.write("| Number of fingers: " + this.character.get(5));
        writer.write("| Accessory: " + this.character.get(6));
        writer.write("|___________________________________|");
        writer.write("");
        Waiter.waitLong();

        writer.write("Are you happy with your character? You will NOT be able to create another one!");
        writer.write("[yes] to continue");
        writer.write("[no] to reset and start over");


        while (true) {
            String decision = reader.readLine().toLowerCase();
            switch (decision) {
                case "yes" -> {
                    writer.write("Alrighty! Time to go.");
                    this.characterstats.add(0);
                    this.characterstats.add(0);
                    this.characterstats.add(0);
                    this.characterstats.add(0);

                    Waiter.waitMiddle();
                    this.gameFacade.menuState(this.character, this.characterstats);
                    //TODO maybe a builder?
                }
                case "no" -> {
                    writer.write("That's too bad. Well, let's start over, shall we?");
                    writer.write("---------------------------------");
                    Waiter.waitShort();
                    this.character.clear();
                    this.setName();
                }
                default -> writer.write("Just a simple 'yes' or 'no' would suffice.");
            }
        }


    }
}
