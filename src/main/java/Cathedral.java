import static systems.utility.Helpers.printOptions;
import static systems.utility.Helpers.simplePrint;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Cathedral {

    private static final Scanner keyboard = new Scanner(System.in);
    /**
     * Represents the phases of the Kagutsuchi. The phases ascend from New (0)
     * to Full (8) before descending back to New (0) and looping. The Cathedral
     * of Shadows allows for Sacrificial Fusions when the Kagutsuchi is full.
     * @see <a href="https://megamitensei.fandom.com/wiki/Kagutsuchi">SMT Nocturne: Kagutsuchi</a>
     * @see <a href="https://megamitensei.fandom.com/wiki/Moon_Phase_System#Shin_Megami_Tensei_III:_Nocturne">SMT Nocturne: Moon Phases</a>
     */
    private static Integer kagutsuchiPhase;
    /**
     * Represents whether the Demi-Fiend has an active curse. The Cathedral of
     * Shadows has unique behavior when visiting while under the effects of a
     * curse.
     */
    private static boolean isCurseActive;

    public static void main(String[] args) {
        boolean running = true;
        isCurseActive = false;
        kagutsuchiPhase = 0;
        welcome();
        while (running) {
            listCommands();
            int input;
            try {
                input = keyboard.nextInt();
            } catch (InputMismatchException ex) {
                simplePrint("Input not valid, please try again.");
                input = -1;
            }
            switch (input) {
                case 1 -> beginDemonLookup();
                case 2 -> beginSkillLookup();
                case 3 -> setKagutsuchiPhase();
                case 4 -> running = false;
                default -> keyboard.next(); //Reset scanner for next input
            }
        }
        exit();
    }

    private static void welcome() {
        simplePrint(System.lineSeparator());
        simplePrint("Greetings user, how may I be of service?" + System.lineSeparator());
    }

    private static void listCommands() {
        List<String> commandList = new ArrayList<>();
        commandList.add("Demon Lookup");
        commandList.add("Skill Lookup");
        commandList.add("Set Kagutsuchi Phase");
        commandList.add("Exit");
        printOptions(commandList);
    }

    private static void beginDemonLookup() {
        //TODO
    }

    private static void beginSkillLookup() {
        //TODO
    }

    private static void setKagutsuchiPhase() {
        //TODO
    }

    private static void exit() {
        System.exit(0);
    }
}
