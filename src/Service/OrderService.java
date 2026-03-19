package Service;

import Shipping.AirDelivery;
import Shipping.ShippingMethod;
import Shipping.TruckDelivery;


import java.time.LocalDate;

public class OrderService {

    public double createOrder(double weight) {
        ShippingMethod method;

        if (LocalDate.now().getDayOfWeek().getValue() >= 6) {
            method = new AirDelivery();
        } else {
            method = new TruckDelivery();
        }

        double price = method.calculateCost(weight);

        System.out.println("Order created, price = " + price);

        return price;
    }
}
