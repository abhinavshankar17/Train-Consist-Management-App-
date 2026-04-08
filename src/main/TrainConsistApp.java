import java.util.*;

class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String msg) {
        super(msg);
    }
}

class PassengerBogie {
    String type;
    int capacity;

    PassengerBogie(String type, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) throw new InvalidCapacityException("Capacity must be greater than zero");
        this.type = type;
        this.capacity = capacity;
    }
}

public class TrainConsistApp {
    public static void main(String[] args) {
        try {
            new PassengerBogie("Sleeper", -1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}