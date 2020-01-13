package com.monggopesen.dto;

import com.monggopesen.domain.Product;

import java.math.BigDecimal;
import java.util.UUID;

public class ProductDto {

    private String id;
    private String name;
    private BigDecimal price;

    public ProductDto() {
    }

    public ProductDto(String id, String name, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Product toProduct() {
        return new Product(UUID.randomUUID().toString(), this.name, this.price);
    }
}
