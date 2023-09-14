package com.gordeeva.ShoesWebStore.model;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user_address", schema = "public", catalog = "shoes_webstore")
public class UserAddressEntity {
    @Basic
    @Column(name = "user_id")
    private Long userId;
    @Basic
    @Column(name = "address_id")
    private Long addressId;
    @Basic
    @Column(name = "is_default")
    private Boolean isDefault;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserAddressEntity that = (UserAddressEntity) o;
        return Objects.equals(userId, that.userId) && Objects.equals(addressId, that.addressId) && Objects.equals(isDefault, that.isDefault);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, addressId, isDefault);
    }
}
