package com.zerefstbl.delivery.presenter.config;

import com.zerefstbl.delivery.core.order.OrderRepository;
import com.zerefstbl.delivery.core.order.usecases.create.CreateOrderUseCase;
import com.zerefstbl.delivery.core.order.usecases.create.DefaultCreateOrderUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfiguration {

    private final OrderRepository orderRepository;

    public UseCaseConfiguration(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Bean
    public CreateOrderUseCase createOrderUseCase() {
        return new DefaultCreateOrderUseCase(orderRepository);
    }

}
