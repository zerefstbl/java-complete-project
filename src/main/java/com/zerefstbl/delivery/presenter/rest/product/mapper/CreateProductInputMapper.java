package com.zerefstbl.delivery.presenter.rest.product.mapper;

import com.zerefstbl.delivery.core.product.usecases.create.CreateProductCommand;
import com.zerefstbl.delivery.presenter.rest.product.models.CreateProductRequest;

public class CreateProductInputMapper {

    public static CreateProductCommand map(final CreateProductRequest request) {
        return CreateProductCommand.with(request.name(), request.description(), request.price());
    }

}
