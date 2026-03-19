package Service;

import Shipping.ShippingMethod;

import java.time.Clock;
import java.time.LocalDate;

public class OrderService {

    private final Clock clock;
    private final ShippingMethod weekdayMethod;
    private final ShippingMethod weekendMethod;

    public OrderService(Clock clock,
                        ShippingMethod weekdayMethod,
                        ShippingMethod weekendMethod) {
        this.clock = clock;
        this.weekdayMethod = weekdayMethod;
        this.weekendMethod = weekendMethod;
    }

    public double createOrder(double weight) {
        LocalDate today = LocalDate.now(clock);

        ShippingMethod method =
                (today.getDayOfWeek().getValue() >= 6)
                        ? weekendMethod
                        : weekdayMethod;

        return method.calculateCost(weight);
    }
}

