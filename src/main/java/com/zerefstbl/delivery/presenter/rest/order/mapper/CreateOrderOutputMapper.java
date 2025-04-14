package com.zerefstbl.delivery.presenter.rest.order.mapper;

import com.zerefstbl.delivery.core.order.usecases.create.CreateOrderOutput;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

public class CreateOrderOutputMapper {

    public static ResponseEntity<CreateOrderOutput> map(CreateOrderOutput output, HttpServletRequest request) {
        URI location = ServletUriComponentsBuilder
                .fromContextPath(request)
                .path("/order/{id}")
                .buildAndExpand(output.getId().getValue())
                .toUri();
        return ResponseEntity.created(location).body(output);
    }
}
