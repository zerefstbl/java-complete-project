package com.zerefstbl.delivery.core.order.usecases.create;

import com.zerefstbl.delivery.core.order.Order;
import com.zerefstbl.delivery.core.order.OrderStatus;

import java.math.BigDecimal;

public record CreateOrderCommand(
    BigDecimal price,
    OrderStatus status
) {

    public static CreateOrderCommand with(final BigDecimal price, final OrderStatus status) {
        return new CreateOrderCommand(price, status);
    }

}
