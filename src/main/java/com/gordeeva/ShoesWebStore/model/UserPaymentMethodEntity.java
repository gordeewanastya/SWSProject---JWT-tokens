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

import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user_payment_method", schema = "public", catalog = "shoes_webstore")
public class UserPaymentMethodEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private UserEntity userEntity;

    @ManyToOne(optional = false)
    @JoinColumn(name = "payment_type_id", referencedColumnName = "id")
    private PaymentTypeEntity paymentTypeEntity;

    @Basic
    @Column(name = "provider")
    private String provider;

    @Basic
    @Column(name = "account_number")
    private String accountNumber;

    @Basic
    @Column(name = "expiry_date")
    private Timestamp expiryDate;

    @Basic
    @Column(name = "is_default")
    private Boolean isDefault;
}
