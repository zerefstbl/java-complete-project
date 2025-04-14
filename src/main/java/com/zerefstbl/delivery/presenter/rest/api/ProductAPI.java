package com.zerefstbl.delivery.presenter.rest.api;

import com.zerefstbl.delivery.core.product.usecases.create.CreateProductOutput;
import com.zerefstbl.delivery.presenter.rest.product.models.CreateProductRequest;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.concurrent.CompletableFuture;

@RequestMapping(value = "products")
@Tag(name = "Products")
public interface ProductAPI {

    @PostMapping
    @Operation(summary = "Create a new product")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Create successfully"),
            @ApiResponse(responseCode = "201", description = "A validation error was thrown"),
            @ApiResponse(responseCode = "201", description = "Internal server error was thrown")
    })
    CompletableFuture<ResponseEntity<CreateProductOutput>> createProduct(@Valid @RequestBody CreateProductRequest createProductRequest, HttpServletRequest request);

}
