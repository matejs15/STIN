package Shipping;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirDeliveryTest {
    @Test
    void shouldCalculatePriceForStandardWeight(){
        AirDelivery air = new AirDelivery();
        assertEquals(425, air.calculateCost(5));
    }

    @Test
    void shouldCalculatePriceForDecimalWeight(){
        AirDelivery air = new AirDelivery();
        assertEquals(362.5, air.calculateCost(2.5));
    }
}