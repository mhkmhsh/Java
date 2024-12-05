public class BusTester{
    public static void main(String[] args) {


        System.out.println("The output should match the handout:  1 2 3 2 2 2 2 1 all on separate lines");
        Bus bus1 = new Bus(3);
        System.out.println(bus1.getCurrentStop());
        bus1.move();
        System.out.println(bus1.getCurrentStop());
        bus1.move();
        System.out.println(bus1.getCurrentStop());
        bus1.move();
        System.out.println(bus1.getCurrentStop());
        bus1.move();
        bus1.move();
        System.out.println(bus1.getCurrentStop());
        System.out.println(bus1.getCurrentStop());


        Bus bus2 = new Bus(5);
        System.out.println(bus1.getCurrentStop());
        System.out.println(bus2.getCurrentStop());


        System.out.println("__________________________________________\n");
        System.out.println("Moving bus 2 a total of 14 times to see the stop numbers change");
        for(int i = 1; i < 15; i++){
            bus2.move();
            System.out.println(bus2.getCurrentStop());
        }
    }
}

