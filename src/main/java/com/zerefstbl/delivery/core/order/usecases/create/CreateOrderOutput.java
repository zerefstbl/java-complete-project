package com.zerefstbl.delivery.core.order.usecases.create;

import com.zerefstbl.delivery.core.Identity;
import com.zerefstbl.delivery.core.order.Order;

public record CreateOrderOutput(
        Identity id
) {

    public static CreateOrderOutput from(final Order order) {
        return new CreateOrderOutput(order.getId());
    }

}
