package com.zerefstbl.delivery.presenter.rest.api;

import com.zerefstbl.delivery.core.order.usecases.create.CreateOrderOutput;
import com.zerefstbl.delivery.presenter.rest.order.models.CreateOrderRequest;
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

@RequestMapping(value = "orders")
@Tag(name = "Orders")
public interface OrderAPI {


    @PostMapping
    @Operation(summary = "Create a new order")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Created successfully"),
            @ApiResponse(responseCode = "422", description = "A validation error was thrown"),
            @ApiResponse(responseCode = "500", description = "A internal server error was thrown")
    })
    CompletableFuture<ResponseEntity<CreateOrderOutput>> createOrder(@Valid @RequestBody CreateOrderRequest createOrderRequest, HttpServletRequest request);

}
