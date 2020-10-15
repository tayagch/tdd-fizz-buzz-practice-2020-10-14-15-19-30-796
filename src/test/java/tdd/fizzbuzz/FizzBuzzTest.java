package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    public void should_return_1_given_count_off_order_number_1() {
        // Given
        int orderNumber = 1;
        FizzBuzz fizzBuzzWhizz = new FizzBuzz();

        // When
        String actual = fizzBuzzWhizz.countOff(orderNumber);

        // Then
        assertEquals("1",actual);
    }
}
