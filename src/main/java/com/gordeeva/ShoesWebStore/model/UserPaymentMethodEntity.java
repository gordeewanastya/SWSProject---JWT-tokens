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
    @Basic
    @Column(name = "user_id")
    private Long userId;
    @Basic
    @Column(name = "payment_type_id")
    private Long paymentTypeId;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserPaymentMethodEntity that = (UserPaymentMethodEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(userId, that.userId) && Objects.equals(paymentTypeId, that.paymentTypeId) && Objects.equals(provider, that.provider) && Objects.equals(accountNumber, that.accountNumber) && Objects.equals(expiryDate, that.expiryDate) && Objects.equals(isDefault, that.isDefault);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, paymentTypeId, provider, accountNumber, expiryDate, isDefault);
    }
}
