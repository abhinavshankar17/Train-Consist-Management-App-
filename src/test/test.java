import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class TrainConsistAppTest {

    @Test
    void testFilterCapacity() {
        List<Bogie> list = Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("AC", 50)
        );

        long count = list.stream().filter(b -> b.capacity > 60).count();
        assertEquals(1, count);
    }
}