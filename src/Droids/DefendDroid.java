package Droids;

import Colors.ConsoleColors;
import Printer.Printer;

import java.util.Random;

public class DefendDroid extends Droid {


    private int chanceBlock;
    public DefendDroid() {
        super("Defend Droid", 150, 10);
        this.chanceBlock=25;
    }
    public int getChanceBlock() {
        return chanceBlock;
    }

    public void setChanceBlock(int chanceBlock) {
        this.chanceBlock = chanceBlock;
    }
    @Override
    public boolean getHit(int _damage) {
        Random r = new Random();
        int value = r.nextInt(100 - 0) + 0;
        if (value > chanceBlock) {
            this.health -= _damage;
            if (health < 0) {
                health = 0;
                Printer.print(ConsoleColors.RED_BOLD_BRIGHT + "Kill droid");
            }
            return true;
        }else{
            Printer.print(ConsoleColors.RED_BOLD_BRIGHT+"Attack was blocked");
            return false;
        }
    }
}
