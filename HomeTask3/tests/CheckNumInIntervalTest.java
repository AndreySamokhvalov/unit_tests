
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class CheckNumInIntervalTest {
    private CheckNumInInterval checkNumInInterval;

    @BeforeEach
    void setUp() {
        checkNumInInterval = new CheckNumInInterval();
    }


    @ParameterizedTest
    @ValueSource(ints = {25, 100, 33})
    void trueIfIntervalPositiveCase(int num) {
        assertThat(checkNumInInterval.numberInInterval(num)).isTrue();
    }


    @ParameterizedTest
    @ValueSource(ints = {24, 101})
    void trueIfOutOfInterval(int num) {
        assertThat(checkNumInInterval.numberInInterval(num)).isFalse();
    }
}
