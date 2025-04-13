package com.zerefstbl.delivery.data.jpa.order;

import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaOrderRepository extends JpaRepository<JpaOrderEntity, Long> {
}
