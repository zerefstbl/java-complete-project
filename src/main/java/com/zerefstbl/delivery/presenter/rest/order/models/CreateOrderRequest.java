package com.zerefstbl.delivery.presenter.rest.order.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.zerefstbl.delivery.core.order.OrderStatus;

import java.math.BigDecimal;

public record CreateOrderRequest(
    @JsonProperty("price") BigDecimal price,
    @JsonProperty("status") OrderStatus status
) {
}
