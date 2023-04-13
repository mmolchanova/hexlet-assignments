package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AppTest {
    static List<Integer> numbers;

    @BeforeEach
    void prepare() {
        numbers = new ArrayList<>();
        int i = 3;

        while (i < 10) {
            numbers.add(i);
            i++;
        }
    }

    @Test
    void testTake() {
        // BEGIN
        List<Integer> result1 = App.take(numbers, 2);
        assertThat(result1.size()).isEqualTo(2);
        assertThat(result1.get(0)).isEqualTo(3);
        assertThat(result1.get(1)).isEqualTo(4);

        List<Integer> result2 = App.take(numbers, 12);
        assertThat(result2.size()).isEqualTo(7);
        assertThat(result2.get(0)).isEqualTo(3);
        assertThat(result2.get(1)).isEqualTo(4);
        assertThat(result2.get(2)).isEqualTo(5);
        assertThat(result2.get(3)).isEqualTo(6);
        assertThat(result2.get(4)).isEqualTo(7);
        assertThat(result2.get(5)).isEqualTo(8);
        assertThat(result2.get(6)).isEqualTo(9);

        List<Integer> result3 = App.take(numbers, 0);
        assertThat(result3.size()).isEqualTo(0);
        // END
    }
}
