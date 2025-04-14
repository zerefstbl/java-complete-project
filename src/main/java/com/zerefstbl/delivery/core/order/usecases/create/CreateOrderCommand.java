package com.zerefstbl.delivery.core.order.usecases.create;

import com.zerefstbl.delivery.core.CommandUseCase;
import com.zerefstbl.delivery.core.order.Order;
import com.zerefstbl.delivery.core.order.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
public class CreateOrderCommand extends CommandUseCase {

    private BigDecimal price;
    private OrderStatus status;

    public static CreateOrderCommand with(final BigDecimal price, final OrderStatus status) {
        return new CreateOrderCommand(price, status);
    }

}
