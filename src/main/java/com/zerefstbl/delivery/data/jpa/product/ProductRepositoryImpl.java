package com.zerefstbl.delivery.data.jpa.product;

import com.zerefstbl.delivery.core.Identity;
import com.zerefstbl.delivery.core.product.Product;
import com.zerefstbl.delivery.core.product.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class ProductRepositoryImpl implements ProductRepository {

    private final JpaProductRepository productRepository;

    @Override
    public Product persist(Product product) {
        return productRepository.save(JpaProductEntity.from(product)).fromThis();
    }

    @Override
    public Product getById(Identity id) {
        return productRepository.findById(id.getValue()).orElseThrow(IllegalArgumentException::new).fromThis();
    }
}
