
public class Secretary extends Employee {

    public Secretary() {
        super(0);
    }

    public void takeDictation(String text) {
        System.out.println("Dictating text:" + text);
    }
    public int getSeniorityBonus(){
        return 0;
    }
}
