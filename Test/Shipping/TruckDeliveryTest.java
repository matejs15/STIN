package Shipping;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TruckDeliveryTest {
    @Test
    void shouldCalculatePriceForStandardWeight(){
        TruckDelivery truck = new TruckDelivery();
        assertEquals(200, truck.calculateCost(0));
    }

    @Test
    void shouldCalculatePriceForDecimalWeight(){
        TruckDelivery truck = new TruckDelivery();
        assertEquals(125, truck.calculateCost(2.5));
    }
}