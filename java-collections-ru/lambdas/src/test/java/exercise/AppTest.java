package exercise;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

// BEGIN
class AppTest {
    @Test
    void testEmpty() {
        String[][] img = {};
        String[][] increasedImg = App.enlargeArrayImage(img);
        String[][] expected = {};
        assertThat(increasedImg).isEqualTo(expected);
    }

    @Test
    void testSymmetric() {
        String[][] img = {
            {"*", "*", "*", "*"},
            {"*", " ", " ", "*"},
            {"*", " ", " ", "*"},
            {"*", "*", "*", "*"},
        };
        String[][] increasedImg = App.enlargeArrayImage(img);
        String[][] expected = {
            {"*", "*", "*", "*", "*", "*", "*", "*"},
            {"*", "*", "*", "*", "*", "*", "*", "*"},
            {"*", "*", " ", " ", " ", " ", "*", "*"},
            {"*", "*", " ", " ", " ", " ", "*", "*"},
            {"*", "*", " ", " ", " ", " ", "*", "*"},
            {"*", "*", " ", " ", " ", " ", "*", "*"},
            {"*", "*", "*", "*", "*", "*", "*", "*"},
            {"*", "*", "*", "*", "*", "*", "*", "*"},
        };
        assertThat(increasedImg).isEqualTo(expected);
    }

    @Test
    void testAsymmetric() {
        String[][] img = {
            {"*", ",", "*", "*"},
            {"*", ",", " ", "*"},
            {",", "*", "*", "@"},
        };
        String[][] increasedImg = App.enlargeArrayImage(img);
        String[][] expected = {
            {"*", "*", ",", ",", "*", "*", "*", "*"},
            {"*", "*", ",", ",", "*", "*", "*", "*"},
            {"*", "*", ",", ",", " ", " ", "*", "*"},
            {"*", "*", ",", ",", " ", " ", "*", "*"},
            {",", ",", "*", "*", "*", "*", "@", "@"},
            {",", ",", "*", "*", "*", "*", "@", "@"},
        };
        assertThat(increasedImg).isEqualTo(expected);
    }
}
// END
