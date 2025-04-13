package com.zerefstbl.delivery.core.order;

import com.zerefstbl.delivery.core.Identity;
import lombok.*;

import java.math.BigDecimal;
import java.time.Instant;

@Value
public class Order {

    private final Identity id;
    private final BigDecimal price;
    private final OrderStatus status;
    private final Instant createdAt;
    private final Instant updatedAt;

    public static Order newOrder(final BigDecimal price, final OrderStatus status) {
        Identity id = Identity.nothing();
        Instant now = Instant.now();
        return new Order(id, price, status, now, now);
    }

}


//private final Identity id;
//private final Status status;
//private final Customer customer;
//private final Store store;
//private final List<OrderItem> orderItems;
//private final Double total;
//private final Instant createdAt;
//private final Instant updatedAt;
