public class Secretary extends Employee{
 public secretary(){
    super(0);
 }
    public void takeDictation(String text){
        System.out.println("Dictating text:" + text);
    }
}