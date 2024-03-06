package com.springCourse.SpringDataJPACourse.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productId;
    private String productName;
    private String productDescription;
    private Integer productQuantity;
    private Double productPrice;

    @ManyToOne
    private Category category;

}
