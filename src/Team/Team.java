package Team;

import Droids.AttackDroid;
import Droids.BaseDroid;
import Droids.DefendDroid;
import Droids.Droid;
import Printer.Printer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Team {
    private List<Droid> droidList=new ArrayList<>();
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public Team(int size)
    {

        fillTeam(size);
    }
    public List<Droid> getDroidList() {

        return droidList;
    }
    public void fillTeam(int size)
    {
        for (int i = 0; i < size; i++) {
            Printer.print("Choose droid №" + (i + 1));
            try {
                droidList.add(chooseDroid());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private Droid chooseDroid() throws IOException {
        Printer.print("1. Base Droid\n2. Attack Droid\n3. Defend Droid");
        Droid droid = null;
        String enter = reader.readLine();

        while (!enter.equals("1") && !enter.equals("2")&& !enter.equals("3")) {
            Printer.print("Invalid request");
            enter = reader.readLine();
        }
        if (enter.equals("1")) droid = new BaseDroid();
        if (enter.equals("2")) droid = new AttackDroid();
        if (enter.equals("3")) droid = new DefendDroid();
        Printer.printInputValue(enter);
        return droid;
    }

}
