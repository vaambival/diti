package ex_04;

import java.util.Set;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AnagramHelperTest {

    @Test
    void simpleTest() {
        Set<String> result = AnagramHelper.doAnagram("cats");
        assertThat(result).containsExactlyInAnyOrder("cats", "cast", "ctsa", "ctas", "csat", "csta",
            "atsc", "atcs", "asct", "astc", "acts", "acst",
            "tsca", "tsac", "tcas", "tcsa", "tasc", "tacs",
            "scat", "scta", "satc", "sact", "stca", "stac");
    }
}
