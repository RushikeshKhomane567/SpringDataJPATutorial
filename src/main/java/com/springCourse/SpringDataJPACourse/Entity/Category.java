package com.springCourse.SpringDataJPACourse.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "category")
public class Category {


    @Id
    @Column(name = "category_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer categoryId;
    @Column(name = "category_name")
    private String categoryName;
    @Column(name = "category_description")
    private String categoryDescription;
    @Column(name = "display_order")
    private Integer displayOrder;

    @OneToMany(mappedBy = "category")
    private List<Product> product;
}
