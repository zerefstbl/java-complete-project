package com.zerefstbl.delivery.data.jpa.product;

import com.zerefstbl.delivery.core.Identity;
import com.zerefstbl.delivery.core.product.Product;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "products")
public class JpaProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "price", nullable = false)
    private BigDecimal price;

    @Column(name = "description")
    private String description;

    public static JpaProductEntity from(final Product product) {
        Long productId = product.getId().getValue();
        JpaProductEntity jpaProductEntity = new JpaProductEntity();
        jpaProductEntity.setPrice(product.getPrice());
        jpaProductEntity.setName(product.getName());
        jpaProductEntity.setDescription(product.getDescription());
        jpaProductEntity.setId(productId != Long.MIN_VALUE ? productId : null);
        return jpaProductEntity;
    }

    public Product fromThis() {
        return new Product(new Identity(id), name, price, description);
    }

}
