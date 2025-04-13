package com.zerefstbl.delivery.core.order;

import com.zerefstbl.delivery.core.Identity;

import java.util.Optional;

public interface OrderRepository {

    Order persist(final Order order);

    Optional<Order> getById(final Identity id);

}
