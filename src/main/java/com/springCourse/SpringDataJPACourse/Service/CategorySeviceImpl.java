package com.springCourse.SpringDataJPACourse.Service;

import com.springCourse.SpringDataJPACourse.Entity.Category;
import com.springCourse.SpringDataJPACourse.Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategorySeviceImpl implements CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;
    @Override
    public Boolean saveCategory(Category category) {
        Boolean isCreated=false;
        try {

           Category savedCategory= categoryRepository.save(category);
           isCreated=savedCategory.getCategoryId() != 0;
        }catch (Exception ex){
            System.out.println(ex);
        }
        return isCreated;
    }

    @Override
    public List<Category> findAllCategory() {
        return categoryRepository.findAll();
    }
}
