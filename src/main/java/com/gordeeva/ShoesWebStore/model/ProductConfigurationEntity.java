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
@Table(name = "product_configuration", schema = "public", catalog = "shoes_webstore")
public class ProductConfigurationEntity {
    @Basic
    @Column(name = "product_id")
    private Long productId;
    @Basic
    @Column(name = "variation_option_id")
    private Long variationOptionId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductConfigurationEntity that = (ProductConfigurationEntity) o;
        return Objects.equals(productId, that.productId) && Objects.equals(variationOptionId, that.variationOptionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, variationOptionId);
    }
}
