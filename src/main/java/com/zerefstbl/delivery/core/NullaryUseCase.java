package com.zerefstbl.delivery.core;

public abstract class NullaryUseCase<OUT extends OutputUseCase> {

    public abstract OUT execute();

}
