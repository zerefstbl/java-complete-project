package com.zerefstbl.delivery.core.order.usecases.create;

import com.zerefstbl.delivery.core.order.Order;
import com.zerefstbl.delivery.core.order.OrderRepository;

public class DefaultCreateOrderUseCase extends CreateOrderUseCase {

    private final OrderRepository orderRepository;

    public DefaultCreateOrderUseCase(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public CreateOrderOutput execute(CreateOrderCommand aCommand) {
        Order order = createOrder(aCommand);
        return CreateOrderOutput.from(orderRepository.persist(order));
    }

    private Order createOrder(final CreateOrderCommand aCommand) {
        return Order.newOrder(aCommand.price(), aCommand.status());
    }

}
