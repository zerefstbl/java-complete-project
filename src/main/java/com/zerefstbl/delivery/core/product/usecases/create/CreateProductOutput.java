package com.zerefstbl.delivery.core.product.usecases.create;

import com.zerefstbl.delivery.core.Identity;
import com.zerefstbl.delivery.core.product.Product;

public record CreateProductOutput(
        Identity id
) {

    public static CreateProductOutput from(final Product product) {
        return new CreateProductOutput(product.getId());
    }

}
