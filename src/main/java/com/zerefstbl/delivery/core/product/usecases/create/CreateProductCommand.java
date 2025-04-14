package com.zerefstbl.delivery.core.product.usecases.create;

import com.zerefstbl.delivery.core.CommandUseCase;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
public class CreateProductCommand extends CommandUseCase {

    private String name;
    private String description;
    private BigDecimal price;

    public static CreateProductCommand with(final String name, final String description, final BigDecimal price) {
        return new CreateProductCommand(name, description, price);
    }

}
