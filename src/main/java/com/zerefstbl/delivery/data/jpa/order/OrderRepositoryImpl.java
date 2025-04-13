package com.zerefstbl.delivery.data.jpa.order;

import com.zerefstbl.delivery.core.Identity;
import com.zerefstbl.delivery.core.order.Order;
import com.zerefstbl.delivery.core.order.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@RequiredArgsConstructor
@Repository
public class OrderRepositoryImpl implements OrderRepository {

    private final JpaOrderRepository jpaOrderRepository;

    @Override
    public Order persist(Order order) {
        return jpaOrderRepository.save(JpaOrderEntity.from(order)).fromThis();
    }

    @Override
    public Optional<Order> getById(Identity id) {
        return Optional.empty();
    }
}
