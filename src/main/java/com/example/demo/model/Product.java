package com.example.demo.model;

import lombok.Data;

@Data
public class Product {

    private Integer id;

    private String name;
    private Integer quantity;
    private Double price;

    public Integer getId(){return this.id;}
    public void setId(Integer id){this.id = id;}
} 


