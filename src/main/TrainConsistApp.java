import java.util.*;
import java.util.stream.*;

class Bogie {
    int capacity;

    Bogie(int capacity) {
        this.capacity = capacity;
    }
}

public class TrainConsistApp {
    public static void main(String[] args) {

        List<Bogie> list = new ArrayList<>();
        for (int i = 0; i < 10000; i++) list.add(new Bogie(i));

        long start = System.nanoTime();
        List<Bogie> loopResult = new ArrayList<>();
        for (Bogie b : list) if (b.capacity > 60) loopResult.add(b);
        long end = System.nanoTime();
        System.out.println("Loop Time: " + (end - start));

        start = System.nanoTime();
        List<Bogie> streamResult = list.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());
        end = System.nanoTime();
        System.out.println("Stream Time: " + (end - start));
    }
}