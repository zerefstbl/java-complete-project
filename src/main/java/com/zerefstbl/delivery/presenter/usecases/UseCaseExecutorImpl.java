package com.zerefstbl.delivery.presenter.usecases;

import com.zerefstbl.delivery.core.CommandUseCase;
import com.zerefstbl.delivery.core.OutputUseCase;
import com.zerefstbl.delivery.core.UseCase;
import com.zerefstbl.delivery.core.UseCaseExecutor;
import com.zerefstbl.delivery.core.order.usecases.create.CreateOrderCommand;
import com.zerefstbl.delivery.core.order.usecases.create.CreateOrderOutput;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

@Service
public class UseCaseExecutorImpl extends UseCaseExecutor {

    @Override
    public <RX, IN extends CommandUseCase, OUT extends OutputUseCase> CompletableFuture<RX> execute(UseCase<IN, OUT> useCase, IN input, Function<OUT, RX> outputMapper) {
        return CompletableFuture
                .supplyAsync(() -> input)
                .thenApplyAsync(useCase::execute)
                .thenApplyAsync(outputMapper);
    }
}
