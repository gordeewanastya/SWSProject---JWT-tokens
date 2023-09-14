package com.gordeeva.ShoesWebStore.model;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "shop_order", schema = "public", catalog = "shoes_webstore")
public class ShopOrderEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;
    @Basic
    @Column(name = "user_id")
    private Integer userId;
    @Basic
    @Column(name = "order_date")
    private Timestamp orderDate;
    @Basic
    @Column(name = "payment_method_id")
    private Integer paymentMethodId;
    @Basic
    @Column(name = "shipping_address_id")
    private Integer shippingAddressId;
    @Basic
    @Column(name = "order_total")
    private BigDecimal orderTotal;
    @Basic
    @Column(name = "order_status")
    private Integer orderStatus;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShopOrderEntity that = (ShopOrderEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(userId, that.userId) && Objects.equals(orderDate, that.orderDate) && Objects.equals(paymentMethodId, that.paymentMethodId) && Objects.equals(shippingAddressId, that.shippingAddressId) && Objects.equals(orderTotal, that.orderTotal) && Objects.equals(orderStatus, that.orderStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, orderDate, paymentMethodId, shippingAddressId, orderTotal, orderStatus);
    }
}
