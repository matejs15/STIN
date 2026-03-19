package Discount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NoDiscountTest {

    @Test
    void shouldReturnSamePrice() {
        NoDiscount discount = new NoDiscount();

        assertEquals(100, discount.applyDiscount(100));
        assertEquals(0, discount.applyDiscount(0));
        assertEquals(999.99, discount.applyDiscount(999.99));
    }
}