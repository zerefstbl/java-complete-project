package com.zerefstbl.delivery.core.product;

import com.zerefstbl.delivery.core.Identity;
import lombok.Value;

import java.math.BigDecimal;

@Value
public class Product {

    private Identity id;
    private String name;
    private BigDecimal price;
    private String description;

    public static Product newProduct(final String name, final String description, final BigDecimal price) {
        final Identity id = Identity.nothing();
        return new Product(id, name, price, description);
    }

}
