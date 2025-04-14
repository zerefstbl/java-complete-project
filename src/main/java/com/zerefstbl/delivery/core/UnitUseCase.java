package com.zerefstbl.delivery.core;

public abstract class UnitUseCase<IN extends CommandUseCase> {

    public abstract IN execute();

}
