package ex_06;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.IntStream;
import org.junit.jupiter.api.Test;

import static ex_06.InversionCounter.countInversions;
import static org.assertj.core.api.Assertions.assertThat;

public class InversionCounterTest {

    @Test
    void simpleTest() throws URISyntaxException, IOException {
        Path path = Paths.get(InversionCounter.class.getClassLoader().getResource("IntegerArray.txt").toURI());
        IntStream numbers = Files.lines(path).mapToInt(Integer::valueOf);

        int[] array = numbers.toArray();

        long result = countInversions(array);

        assertThat(result).isEqualTo(2407905288L);
    }
}
