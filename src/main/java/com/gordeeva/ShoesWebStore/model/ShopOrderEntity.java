package com.gordeeva.ShoesWebStore.model;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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

    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private UserEntity userEntity;

    @Basic
    @Column(name = "order_date")
    private Timestamp orderDate;

    @ManyToOne(optional = false)
    @JoinColumn(name = "payment_method_id", referencedColumnName = "id")
    private PaymentTypeEntity paymentTypeEntity;

    @ManyToOne
    @JoinColumn(name = "shipping_address_id", referencedColumnName = "id")
    private AddressEntity shippingAddressEntity;

    @Basic
    @Column(name = "order_total")
    private BigDecimal orderTotal;

    @Basic
    @Column(name = "order_status")
    private Integer orderStatus;
}
