import java.util.*;

public class TrainConsistApp {

    public static void sortBogieNames(String[] arr) {
        Arrays.sort(arr);
    }

    public static void main(String[] args) {

        String[] bogieNames = {"Sleeper","AC Chair","First Class","General","Luxury"};

        sortBogieNames(bogieNames);

        System.out.println("Sorted Bogie Names:");
        System.out.println(Arrays.toString(bogieNames));
    }
}