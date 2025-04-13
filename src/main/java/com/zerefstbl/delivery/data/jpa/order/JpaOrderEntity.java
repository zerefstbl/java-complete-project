package com.zerefstbl.delivery.data.jpa.order;

import com.zerefstbl.delivery.core.Identity;
import com.zerefstbl.delivery.core.order.Order;
import com.zerefstbl.delivery.core.order.OrderStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "orders")
@AllArgsConstructor
@NoArgsConstructor
public class JpaOrderEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "price", nullable = false)
    private BigDecimal price;

    @Column(name = "created_at", nullable = false)
    private Instant createdAt;

    @Column(name = "updated_at")
    private Instant updatedAt;

    @Column(name = "status", nullable = false)
    @Enumerated(EnumType.STRING)
    private OrderStatus status;

    public static JpaOrderEntity from(final Order order) {
        JpaOrderEntity jpaOrderEntity = new JpaOrderEntity();
        Long id = order.getId().getValue();
        jpaOrderEntity.setId(id != Long.MIN_VALUE ? id : null);
        jpaOrderEntity.setPrice(order.getPrice());
        jpaOrderEntity.setStatus(order.getStatus());
        jpaOrderEntity.setCreatedAt(order.getCreatedAt());
        jpaOrderEntity.setUpdatedAt(order.getUpdatedAt());
        return jpaOrderEntity;
    }

    public Order fromThis() {
        Order order = new Order(
                new Identity(this.getId()),
                this.getPrice(),
                this.getStatus(),
                this.getCreatedAt(),
                this.getUpdatedAt()
        );
        return order;
    }

}
