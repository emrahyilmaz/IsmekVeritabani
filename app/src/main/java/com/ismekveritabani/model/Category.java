package com.ismekveritabani.model;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

import java.util.List;

@Table(name = "tbl_category")
public class Category extends Model {

    @Column(name = "name",unique = true)
    private String name;

    public List<Product> items() {
        return getMany(Product.class, "category");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                '}';
    }
}
