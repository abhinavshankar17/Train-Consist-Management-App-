import java.util.*;

class Bogie {
    String type;
    int capacity;

    Bogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }
}

public class TrainConsistApp {
    public static void main(String[] args) {
        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("AC", 50)
        );

        bogies.stream()
                .filter(b -> b.capacity > 60)
                .forEach(b -> System.out.println(b.type));
    }
}