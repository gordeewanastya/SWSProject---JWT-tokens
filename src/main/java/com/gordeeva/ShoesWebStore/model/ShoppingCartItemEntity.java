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

import java.util.Objects;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "shopping_cart_item", schema = "public", catalog = "shoes_webstore")
public class ShoppingCartItemEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Integer id;
    @Basic
    @Column(name = "cart_id")
    private Integer cartId;
    @Basic
    @Column(name = "product_item_id")
    private Integer productItemId;
    @Basic
    @Column(name = "qty")
    private Integer qty;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShoppingCartItemEntity that = (ShoppingCartItemEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(cartId, that.cartId) && Objects.equals(productItemId, that.productItemId) && Objects.equals(qty, that.qty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cartId, productItemId, qty);
    }
}
