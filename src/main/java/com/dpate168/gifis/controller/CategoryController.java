package com.dpate168.gifis.controller;

import com.dpate168.gifis.data.CategoryRepository;
import com.dpate168.gifis.data.GifRepository;
import com.dpate168.gifis.model.Category;
import com.dpate168.gifis.model.Gif;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CategoryController {
    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private GifRepository gifRepository;

    @RequestMapping("/categories")
    public String listCategories(ModelMap modelMap) {
        List<Category> allCategories = categoryRepository.getAllCategories();
        modelMap.put("categories", allCategories);
        return "categories";
    }

    @RequestMapping("/category/{id}")
    public String categoryDetails(@PathVariable int id, ModelMap modelMap) {
        Category category = categoryRepository.findCategoryById(id);
        List<Gif> allGifs = gifRepository.findGifByCategoryId(id);
        modelMap.put("category",category);
        modelMap.put("gifs",allGifs);
        return "category";
    }
}
