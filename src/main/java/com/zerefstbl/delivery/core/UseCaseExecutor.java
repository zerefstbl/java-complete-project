package com.zerefstbl.delivery.core;

import com.zerefstbl.delivery.core.order.usecases.create.CreateOrderCommand;
import com.zerefstbl.delivery.core.order.usecases.create.CreateOrderOutput;

import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

public abstract class UseCaseExecutor {

    public abstract <RX, IN extends CommandUseCase, OUT extends OutputUseCase> CompletableFuture<RX> execute(
            UseCase<IN, OUT> useCase,
            IN input,
            Function<OUT, RX> outputMapper
    );

}
