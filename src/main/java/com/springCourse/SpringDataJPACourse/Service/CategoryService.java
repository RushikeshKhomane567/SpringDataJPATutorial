package com.springCourse.SpringDataJPACourse.Service;

import com.springCourse.SpringDataJPACourse.Entity.Category;

import java.util.List;

public interface CategoryService {
    Boolean saveCategory(Category category);
    List<Category> findAllCategory();
}
