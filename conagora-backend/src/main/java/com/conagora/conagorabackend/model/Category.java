package com.conagora.conagorabackend.model;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
//import org.springframework.data.mongodb.core.mapping.DocumentReference;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
public class Category implements Serializable {
    @Id
    private String categoryId;
    @Field
    private String categoryName;
    // @DocumentReference(lookup = "{'category':?#{#self._id} }")
    private List<Dish> dishes;

    public Category(String categoryName, List<Dish> dishes) {
        this.categoryName = categoryName;
        this.dishes = dishes;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(List<Dish> dishes) {
        this.dishes = dishes;
    }

}
