package com.zerefstbl.delivery.presenter.rest.api.controllers;

import com.zerefstbl.delivery.core.UseCaseExecutor;
import com.zerefstbl.delivery.core.order.usecases.create.CreateOrderOutput;
import com.zerefstbl.delivery.core.order.usecases.create.CreateOrderUseCase;
import com.zerefstbl.delivery.presenter.rest.api.OrderAPI;
import com.zerefstbl.delivery.presenter.rest.order.mapper.CreateOrderInputMapper;
import com.zerefstbl.delivery.presenter.rest.order.mapper.CreateOrderOutputMapper;
import com.zerefstbl.delivery.presenter.rest.order.models.CreateOrderRequest;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;

@RestController
public class OrderController implements OrderAPI {

    private final UseCaseExecutor useCaseExecutor;
    private final CreateOrderUseCase createOrderUseCase;


    public OrderController(CreateOrderUseCase createOrderUseCase, UseCaseExecutor useCaseExecutor) {
        this.createOrderUseCase = createOrderUseCase;
        this.useCaseExecutor = useCaseExecutor;
    }

    @Override
    public CompletableFuture<ResponseEntity<CreateOrderOutput>> createOrder(CreateOrderRequest createOrderRequest, HttpServletRequest request) {
        return useCaseExecutor.execute(
                createOrderUseCase,
                CreateOrderInputMapper.map(createOrderRequest),
                (outputValue) -> CreateOrderOutputMapper.map(outputValue, request)
        );
    }

}
