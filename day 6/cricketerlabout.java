public class cricketerlabout {

    public static void main(String[] args) {

        
        Cricketer c1 = new Cricketer("MS dhoni", 10800, 52.8);

        System.out.println("Player Name : " + c1.name);
        System.out.println("Runs : " + c1.runs);
        System.out.println("Average : " + c1.average);
    }
}

class Cricketer {

    String name;
    int runs;
    double average;

    // parameterized constructor
    Cricketer(String name, int runs, double average) {
        this.name = name;
        this.runs = runs;
        this.average = average;
    }
}

