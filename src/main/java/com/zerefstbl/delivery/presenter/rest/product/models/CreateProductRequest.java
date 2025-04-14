package com.zerefstbl.delivery.presenter.rest.product.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;

public record CreateProductRequest(
        @JsonProperty
        @NotNull
        @Size(max = 255, min = 3)
        String name,

        @NotNull
        @Size(min = 5)
        BigDecimal price,

        String description
) {
}
