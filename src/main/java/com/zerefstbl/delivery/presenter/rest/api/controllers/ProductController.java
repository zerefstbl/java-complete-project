package com.zerefstbl.delivery.presenter.rest.api.controllers;

import com.zerefstbl.delivery.core.UseCaseExecutor;
import com.zerefstbl.delivery.core.product.usecases.create.CreateProductOutput;
import com.zerefstbl.delivery.core.product.usecases.create.CreateProductUseCase;
import com.zerefstbl.delivery.presenter.rest.api.ProductAPI;
import com.zerefstbl.delivery.presenter.rest.product.mapper.CreateProductInputMapper;
import com.zerefstbl.delivery.presenter.rest.product.mapper.CreateProductOutputMapper;
import com.zerefstbl.delivery.presenter.rest.product.models.CreateProductRequest;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletableFuture;

@RestController
public class ProductController implements ProductAPI {

    private final UseCaseExecutor useCaseExecutor;
    private final CreateProductUseCase createProductUseCase;

    public ProductController(final UseCaseExecutor useCaseExecutor, final CreateProductUseCase createProductUseCase) {
        this.useCaseExecutor = useCaseExecutor;
        this.createProductUseCase = createProductUseCase;
    }

    @Override
    public CompletableFuture<ResponseEntity<CreateProductOutput>> createProduct(CreateProductRequest createProductRequest, HttpServletRequest request) {
        return useCaseExecutor.execute(
                createProductUseCase,
                CreateProductInputMapper.map(createProductRequest),
                (outputValue) -> CreateProductOutputMapper.map(outputValue, request)
        );
    }
}
