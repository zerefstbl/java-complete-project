package com.zerefstbl.delivery.core.product.usecases.create;

import java.math.BigDecimal;

public record CreateProductCommand(
        String name,
        String description,
        BigDecimal price
) {

    public static CreateProductCommand with(final String name, final String description, final BigDecimal price) {
        return new CreateProductCommand(name, description, price);
    }

}
