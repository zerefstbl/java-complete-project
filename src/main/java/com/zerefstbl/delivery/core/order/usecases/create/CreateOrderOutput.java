package com.zerefstbl.delivery.core.order.usecases.create;

import com.zerefstbl.delivery.core.Identity;
import com.zerefstbl.delivery.core.OutputUseCase;
import com.zerefstbl.delivery.core.order.Order;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CreateOrderOutput extends OutputUseCase<Order> {

    private Identity id;

    public static CreateOrderOutput from(final Order order) {
        return new CreateOrderOutput(order.getId());
    }

}
