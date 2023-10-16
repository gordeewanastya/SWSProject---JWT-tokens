package com.gordeeva.ShoesWebStore.model;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Entity
@Getter
@Setter
@Builder
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

    @ManyToMany
    @JoinTable(
            name = "product_configuration",
            joinColumns = @JoinColumn(name = "product_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "variation_option_id", referencedColumnName = "id")
    )
    private List<VariationOptionEntity> variationOptionEntitiesList;
}
