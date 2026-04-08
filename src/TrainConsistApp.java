import java.util.*;

// Custom Exception
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

// Passenger Bogie
class PassengerBogie {
    String name;
    int capacity;

    PassengerBogie(String name, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name + " -> Capacity: " + capacity;
    }
}

public class TrainConsistApp {

    public static void main(String[] args) {

        List<PassengerBogie> bogies = new ArrayList<>();

        try {
            bogies.add(new PassengerBogie("Sleeper", 72));
            bogies.add(new PassengerBogie("AC Chair", 56));
            bogies.add(new PassengerBogie("First Class", 24));

            // Invalid cases
            bogies.add(new PassengerBogie("InvalidBogey1", 0));
            bogies.add(new PassengerBogie("InvalidBogey2", -10));

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\nValid Bogies:");
        for (PassengerBogie b : bogies) {
            System.out.println(b);
        }
    }
}