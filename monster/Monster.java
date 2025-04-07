
public class Monster {

    private String name;
    private int health;
    private int attackPower;
    private static int totalMonsters;

    public Monster(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        totalMonsters++;
    }

    public void attack(Monster otherMonster) {
        return;
    }

    public Boolean isDefeated() {
        if (health <= 0) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return "monster " + name + " is at " + health " health, and " + attackPower + " attack power!";
    }

    public static int getTotalMonsters() {
        return totalMonsters;
    }
  
}
