import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import java.util.stream.*;

public class TrainConsistAppTest {

    @Test
    void testResultsMatch() {
        List<Bogie> list = Arrays.asList(
                new Bogie(70), new Bogie(50), new Bogie(80)
        );

        List<Bogie> loop = new ArrayList<>();
        for (Bogie b : list) if (b.capacity > 60) loop.add(b);

        List<Bogie> stream = list.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        assertEquals(loop.size(), stream.size());
    }
}