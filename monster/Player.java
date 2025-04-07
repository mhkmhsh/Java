
import java.util.*;

public class Player {

    private ArrayList<Monster> monsters = new ArrayList<>();

    public Player() {
        Monster one = new Monster("red", 1000, 250);
        Monster two = new Monster("blue", 800, 150);
        Monster three = new Monster("yellow", 1000, 200);

    }

    public void addMonster(Monster m) {
        monsters.add(m);
    }

    public Monster chooseMonster(int index) {
        return monsters.get(index);
    }

    public void showMonsters() {
        System.out.println(monsters);
    }
}
