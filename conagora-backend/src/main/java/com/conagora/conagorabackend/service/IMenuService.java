package com.conagora.conagorabackend.service;

import java.util.List;

import com.conagora.conagorabackend.model.Category;

public interface IMenuService {
    List<Category> getAllCategories();

    void addCategory(Category category);

}
