package com.zerefstbl.delivery.presenter.rest.order.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.zerefstbl.delivery.core.order.OrderStatus;

import java.math.BigDecimal;
import java.time.Instant;

public record OrderResponse(
        @JsonProperty("id") Long id,
        @JsonProperty("price") BigDecimal price,
        @JsonProperty("status") OrderStatus status,
        @JsonProperty("created_at") Instant createdAt,
        @JsonProperty("updated_at") Instant updatedAt
) {
}
