package com.zerefstbl.delivery.presenter.config;

import com.zerefstbl.delivery.core.order.OrderRepository;
import com.zerefstbl.delivery.core.order.usecases.create.CreateOrderUseCase;
import com.zerefstbl.delivery.core.order.usecases.create.DefaultCreateOrderUseCase;
import com.zerefstbl.delivery.core.product.ProductRepository;
import com.zerefstbl.delivery.core.product.usecases.create.CreateProductUseCase;
import com.zerefstbl.delivery.core.product.usecases.create.DefaultCreateProductUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfiguration {

    private final OrderRepository orderRepository;

    private final ProductRepository productRepository;

    public UseCaseConfiguration(OrderRepository orderRepository, ProductRepository productRepository) {
        this.orderRepository = orderRepository;
        this.productRepository = productRepository;
    }

    @Bean
    public CreateOrderUseCase createOrderUseCase() {
        return new DefaultCreateOrderUseCase(orderRepository);
    }

    @Bean
    public CreateProductUseCase createProductUseCase() {
        return new DefaultCreateProductUseCase(productRepository);
    }
}
