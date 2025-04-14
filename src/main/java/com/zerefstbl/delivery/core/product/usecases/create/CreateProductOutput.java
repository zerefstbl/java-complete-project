package com.zerefstbl.delivery.core.product.usecases.create;

import com.zerefstbl.delivery.core.Identity;
import com.zerefstbl.delivery.core.OutputUseCase;
import com.zerefstbl.delivery.core.product.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CreateProductOutput extends OutputUseCase<Product> {

    private Identity id;

    public static CreateProductOutput from(final Product product) {
        return new CreateProductOutput(product.getId());
    }

}
