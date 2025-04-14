package com.zerefstbl.delivery.presenter.rest.product.mapper;

import com.zerefstbl.delivery.core.product.usecases.create.CreateProductOutput;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

public class CreateProductOutputMapper {

    public static ResponseEntity<CreateProductOutput> map(CreateProductOutput createProductOutput, HttpServletRequest request) {
        URI location = ServletUriComponentsBuilder
                .fromContextPath(request)
                .path("/products/{id}")
                .buildAndExpand(createProductOutput.getId().getValue())
                .toUri();
        return ResponseEntity.created(location).body(createProductOutput);
    }

}
