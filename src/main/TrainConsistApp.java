import java.util.*;

public class TrainConsistApp {

    public static boolean searchBogieId(String[] arr, String key) {

        if (arr == null || arr.length == 0) {
            throw new IllegalStateException("No bogies available in the train to perform search");
        }

        for (String id : arr) {
            if (id.equals(key)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        String[] bogieIds = {"BG101","BG205","BG309"};
        String searchKey = "BG205";

        boolean found = searchBogieId(bogieIds, searchKey);

        if (found) {
            System.out.println("Bogie ID found: " + searchKey);
        } else {
            System.out.println("Bogie ID not found: " + searchKey);
        }
    }
}