package com.conagora.conagorabackend.service;

import java.util.List;

import com.conagora.conagorabackend.dao.IMenuDao;
import com.conagora.conagorabackend.model.Category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MenuServiceImpl implements IMenuService {

    @Autowired
    IMenuDao Idao;

    @Override
    public List<Category> getAllCategories() {

        return Idao.findAll();
    }

    @Override
    public void addCategory(Category category) {
        System.out.println();
        Idao.save(category);

    }

}
