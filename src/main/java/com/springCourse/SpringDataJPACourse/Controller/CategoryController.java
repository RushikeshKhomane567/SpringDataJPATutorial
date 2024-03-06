package com.springCourse.SpringDataJPACourse.Controller;


import com.springCourse.SpringDataJPACourse.ConstantAPI.ConnectConstant;
import com.springCourse.SpringDataJPACourse.Entity.Category;
import com.springCourse.SpringDataJPACourse.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/hotel")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @PostMapping(ConnectConstant.connectPath+ConnectConstant.API.entityName+ConnectConstant.connectPath+ConnectConstant.API.CategoryAPI.saveCategory)
    public ResponseEntity<String> saveCategory(@RequestBody Category category){
        Boolean isCreated=categoryService.saveCategory(category);
        if(isCreated)
            return new ResponseEntity<>(" Category Added SuccessFully!!!", HttpStatus.CREATED);
        return new ResponseEntity<>(" Category Added Not SuccessFully!!!", HttpStatus.NOT_FOUND);
    }

    @GetMapping(ConnectConstant.connectPath+ConnectConstant.API.entityName+ConnectConstant.connectPath+ConnectConstant.API.CategoryAPI.findAllCategory)
    public ResponseEntity<List<Category>> findAllCategory(){
        List<Category> listOfCategory=categoryService.findAllCategory();
        if(!listOfCategory.isEmpty())
           return new ResponseEntity<>(listOfCategory,HttpStatus.OK);
        return new ResponseEntity<>(new ArrayList<>(),HttpStatus.NO_CONTENT);
    }


}
