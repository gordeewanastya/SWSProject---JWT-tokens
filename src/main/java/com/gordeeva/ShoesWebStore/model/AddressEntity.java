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
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "address", schema = "public", catalog = "shoes_webstore")
public class AddressEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private Long id;

    @Basic
    @Column(name = "address_line")
    private String addressLine;

    @Basic
    @Column(name = "postal_code")
    private String postalCode;

    @Basic
    @Column(name = "city")
    private String city;

    @ManyToOne(optional = false)
    @JoinColumn(name = "country_id", referencedColumnName = "id")
    private CountryEntity countryEntity;
}
