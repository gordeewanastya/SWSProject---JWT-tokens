package com.gordeeva.ShoesWebStore.model;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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

    @ManyToOne(optional = false)
    @JoinColumn(name = "cart_id", referencedColumnName = "id")
    private ShoppingCartEntity cartId;

    // TODO: 9/27/23 Probably will have to change the type of this relationship
    @ManyToOne(optional = false)
    @JoinColumn(name = "product_item_id", referencedColumnName = "id")
    private ProductEntity productItemId;
    @Basic
    @Column(name = "qty")
    private Integer qty;
}
