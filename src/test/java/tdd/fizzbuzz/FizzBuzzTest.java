package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    public void should_return_1_given_count_off_when_order_number_1() {
        // Given
        int orderNumber = 1;
        FizzBuzz fizzBuzzWhizz = new FizzBuzz();

        // When
        String actual = fizzBuzzWhizz.countOff(orderNumber);

        // Then
        assertEquals("1",actual);
    }

    @Test
    public void should_return_fizz_given_count_off_when_order_number_3() {
        // Given
        int orderNumber = 3;
        FizzBuzz fizzBuzzWhizz = new FizzBuzz();

        // When
        String actual = fizzBuzzWhizz.countOff(orderNumber);

        // Then
        assertEquals("Fizz",actual);
    }

    @Test
    public void should__return_buzz_given_count_off_when_order_number_5() {
        // Given
        int orderNumber = 5;

        // When
        FizzBuzz fizzBuzzWhizz = new FizzBuzz();

        // Then
        String actual = fizzBuzzWhizz.countOff(orderNumber);
        assertEquals("Buzz",actual);
    }

    @Test
    public void should_return_whizz_given_count_off_when_order_number_7() {
        // Given
        int orderNumber = 7;
        FizzBuzz fizzBuzzWhizz = new FizzBuzz();

        // When
        String actual = fizzBuzzWhizz.countOff(orderNumber);

        // Then
        assertEquals("Whizz",actual);
    }

    @Test
    public void should_return_fizzbuzz_given_count_off_when_order_number_15() {
        // Given
        int orderNumber = 15;
        FizzBuzz fizzBuzzWhizz = new FizzBuzz();

        // When
        String actual = fizzBuzzWhizz.countOff(orderNumber);

        // Then
        assertEquals("FizzBuzz",actual);
    }

    @Test
    public void should_return_fizzwhizz_given_count_off_when_order_number_21() {
        // Given
        int orderNumber = 21;
        FizzBuzz fizzBuzzWhizz = new FizzBuzz();

        // When
        String actual = fizzBuzzWhizz.countOff(orderNumber);

        // Then
        assertEquals("FizzWhizz",actual);
    }
}
