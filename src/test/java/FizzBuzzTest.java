import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

    @ParameterizedTest
    @ValueSource(ints = {3,6,9,15})
    public void fizz_is_multiple_of(int number) {
        assertThat(FizzBuzz.FIZZ.isMultipleOf(number)).isTrue();
    }

    @ParameterizedTest
    @ValueSource(ints = {1,6,9,12})
    public void fizz_is_not_contained_on(int number) {
        assertThat(FizzBuzz.FIZZ.containsOn(number)).isFalse();
    }

    @ParameterizedTest
    @ValueSource(ints = {3,27,60,81})
    public void fizz_has_to_be_display_on(int number) {
        assertThat(FizzBuzz.FIZZ.isDisplayOn(number)).isTrue();
    }

    @ParameterizedTest
    @ValueSource(ints = {5,10,15,20})
    public void buzz_is_multiple_of(int number) {
        assertThat(FizzBuzz.BUZZ.isMultipleOf(number)).isTrue();
    }

    @ParameterizedTest
    @ValueSource(ints = {21,92,83,64})
    public void buzz_is_not_contained_on(int number) {
        assertThat(FizzBuzz.BUZZ.containsOn(number)).isFalse();
    }

    @ParameterizedTest
    @ValueSource(ints = {1,2,3,4,6})
    public void buzz_has_not_to_be_display_on(int number) {
        assertThat(FizzBuzz.BUZZ.isDisplayOn(number)).isFalse();
    }

    @ParameterizedTest
    @ValueSource(ints = {8,14,22,29})
    public void none_is_contained_on(int number) {
        assertThat(FizzBuzz.NONE.containsOn(number)).isTrue();
    }

    @ParameterizedTest
    @ValueSource(ints = {3,5,15,35,65})
    public void none_has_not_to_be_display_on(int number) {
        assertThat(FizzBuzz.NONE.isDisplayOn(number)).isFalse();
    }

}
