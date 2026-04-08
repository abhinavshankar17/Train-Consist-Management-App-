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

        Optional<Bogie> max = bogies.stream().max(Comparator.comparingInt(b -> b.capacity));
        System.out.println(max.get().type);
    }
}