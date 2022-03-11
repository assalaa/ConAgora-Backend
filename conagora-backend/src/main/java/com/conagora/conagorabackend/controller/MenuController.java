package com.conagora.conagorabackend.controller;

import java.util.List;

import com.conagora.conagorabackend.model.Category;
import com.conagora.conagorabackend.service.IMenuService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v2")
public class MenuController {

    @Autowired
    IMenuService service;

    @GetMapping("/menu")
    public List<Category> getAllCategories() {
        return service.getAllCategories();
    }

    @PostMapping(path = "/categories")

    public void addCategory(@RequestBody Category category) {
        service.addCategory(category);

    }

}
