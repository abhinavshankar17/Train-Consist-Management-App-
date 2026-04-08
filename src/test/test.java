import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class TrainConsistAppTest {

    @Test
    void testTotalCapacity() {
        List<Bogie> list = Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("AC", 50)
        );

        int total = list.stream().mapToInt(b -> b.capacity).sum();
        assertEquals(122, total);
    }
}