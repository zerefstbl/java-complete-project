package com.zerefstbl.delivery.core.product.usecases.create;

import com.zerefstbl.delivery.core.product.Product;
import com.zerefstbl.delivery.core.product.ProductRepository;

public class DefaultCreateProductUseCase extends CreateProductUseCase {

    private final ProductRepository productRepository;

    public DefaultCreateProductUseCase(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public CreateProductOutput execute(CreateProductCommand createProductCommand) {
        return CreateProductOutput.from(createProduct(createProductCommand));
    }

    private Product createProduct(final CreateProductCommand aCommand) {
        Product product = Product.newProduct(aCommand.getName(), aCommand.getDescription(), aCommand.getPrice());
        return productRepository.persist(product);
    }
}
