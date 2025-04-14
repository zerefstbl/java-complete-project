package com.zerefstbl.delivery.core.product;

import com.zerefstbl.delivery.core.Identity;

public interface ProductRepository {

    Product persist(Product product);

    Product getById(Identity id);

}
