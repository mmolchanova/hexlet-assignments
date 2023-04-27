package exercise;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class ReversedSequenceTest {
    static ReversedSequence sequence1;
    static ReversedSequence sequence2;
    static ReversedSequence sequence3;

    @BeforeEach
    void prepare() {
        sequence1 = new ReversedSequence("abcdef");
        sequence2 = new ReversedSequence("");
        sequence3 = new ReversedSequence("abcba");
    }

    @Test
    void testToString() {
        assertThat(sequence1.toString()).isEqualTo("fedcba");
        assertThat(sequence2.toString()).isEqualTo("");
        assertThat(sequence3.toString()).isEqualTo("abcba");
    }

    @Test
    void testCharAt() {
        assertThat(sequence1.charAt(0)).isEqualTo('f');
        assertThat(sequence1.charAt(1)).isEqualTo('e');
        assertThat(sequence1.charAt(5)).isEqualTo('a');
    }

    @Test
    void testLength() {
        assertThat(sequence1.length()).isEqualTo(6);
        assertThat(sequence2.length()).isEqualTo(0);
    }
}
