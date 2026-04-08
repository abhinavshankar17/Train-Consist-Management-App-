import java.util.*;

public class TrainConsistApp {

    public static boolean binarySearchBogieId(String[] arr, String key) {
        if (arr == null || arr.length == 0) return false;

        Arrays.sort(arr); // ensure sorted

        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = key.compareTo(arr[mid]);

            if (cmp == 0) {
                return true;
            } else if (cmp > 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        String[] bogieIds = {"BG309","BG101","BG550","BG205","BG412"};
        String searchKey = "BG205";

        boolean found = binarySearchBogieId(bogieIds, searchKey);

        if (found) {
            System.out.println("Bogie ID found: " + searchKey);
        } else {
            System.out.println("Bogie ID not found: " + searchKey);
        }
    }
}