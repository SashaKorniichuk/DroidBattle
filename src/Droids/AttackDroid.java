package Droids;

import Colors.ConsoleColors;
import Printer.Printer;

import java.util.Random;

public class AttackDroid extends Droid{
    private int criticalAttack;
    private int chanceCriticalAttack;
    public AttackDroid()
    {
        super("Attack Droid",70,25);
        criticalAttack=30;
        chanceCriticalAttack=25;
    }
    @Override
    public int attack()
    {
        Random r = new Random();
        int value = r.nextInt(100 - 0) + 0;
        if (value > chanceCriticalAttack) {

            return r.nextInt(damage-1)+1;
        }else{
            Printer.print(ConsoleColors.GREEN_BRIGHT+"Critical attack");
            return criticalAttack;
        }

    }

}
