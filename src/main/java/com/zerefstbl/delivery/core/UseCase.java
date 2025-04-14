package com.zerefstbl.delivery.core;

public abstract class UseCase<IN extends CommandUseCase, OUT extends OutputUseCase> {

    public abstract OUT execute(IN in);

}
