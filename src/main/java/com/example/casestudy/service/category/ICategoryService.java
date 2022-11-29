package com.example.casestudy.service.category;


import com.example.casestudy.model.Category;
import com.example.casestudy.service.IGeneralService;

public interface ICategoryService extends IGeneralService<Category> {
    Category findCategoryByName(String name);
}
