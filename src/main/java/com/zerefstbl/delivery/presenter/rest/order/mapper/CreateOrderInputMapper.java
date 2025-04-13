package com.zerefstbl.delivery.presenter.rest.order.mapper;

import com.zerefstbl.delivery.core.order.usecases.create.CreateOrderCommand;
import com.zerefstbl.delivery.presenter.rest.order.models.CreateOrderRequest;

public class CreateOrderInputMapper {

    public static CreateOrderCommand map(CreateOrderRequest request) {
        return CreateOrderCommand.with(request.price(), request.status());
    }

}
