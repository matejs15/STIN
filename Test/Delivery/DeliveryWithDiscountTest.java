package Delivery;

import Discount.NoDiscount;
import Discount.PercentageDiscount;
import Shipping.TruckDelivery;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeliveryWithDiscountTest {
    @Test
    public void shouldApplyPercentageDiscount(){
        Delivery d = new Delivery("CZ005", 10, new TruckDelivery(), new PercentageDiscount(10));
        assertEquals(180, d.calculatePrice());
    }

    @Test
    public void shouldNotChangePriceWithNoDiscount(){
        Delivery d = new Delivery("CZ006", 10, new TruckDelivery(), new NoDiscount());
        assertEquals(200, d.calculatePrice());
    }
}