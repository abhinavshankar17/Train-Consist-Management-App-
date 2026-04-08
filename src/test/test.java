import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class TrainConsistAppTest {

    @Test
    void testMaxCapacity() {
        List<Bogie> list = Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("AC", 50)
        );

        Bogie max = list.stream().max(Comparator.comparingInt(b -> b.capacity)).get();
        assertEquals("Sleeper", max.type);
    }
}