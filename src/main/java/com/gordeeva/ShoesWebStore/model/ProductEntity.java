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
import java.util.Arrays;
import java.util.Objects;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "product", schema = "public", catalog = "shoes_webstore")
public class ProductEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;
    @Basic
    @Column(name = "product_name")
    private String productName;
    @Basic
    @Column(name = "qty_in_stock")
    private Integer qtyInStock;
    @Basic
    @Column(name = "product_image")
    private byte[] productImage;
    @Basic
    @Column(name = "price")
    private BigDecimal price;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductEntity that = (ProductEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(productName, that.productName) && Objects.equals(qtyInStock, that.qtyInStock) && Arrays.equals(productImage, that.productImage) && Objects.equals(price, that.price);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, productName, qtyInStock, price);
        result = 31 * result + Arrays.hashCode(productImage);
        return result;
    }
}
